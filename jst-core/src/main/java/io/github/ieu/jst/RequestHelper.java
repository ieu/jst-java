package io.github.ieu.jst;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.module.SimpleModule;
import lombok.Setter;
import lombok.SneakyThrows;
import okhttp3.*;
import okio.BufferedSink;
import org.apache.commons.codec.binary.Hex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.time.ZonedDateTime;

public class RequestHelper {
    private final String endpoint;
    private final String partnerId;
    private final String partnerKey;
    private final String token;

    private final ObjectMapper objectMapper;

    @Setter
    private volatile OkHttpClient okHttpClient;

    public RequestHelper(String partnerId, String partnerKey, String token, String endpoint) {
        this.partnerId = partnerId;
        this.partnerKey = partnerKey;
        this.token = token;
        this.endpoint = endpoint;

        SimpleModule simpleModule = new SimpleModule();
        simpleModule.addSerializer(ZonedDateTime.class, new ZonedDateTimeSerializer());
        simpleModule.addDeserializer(ZonedDateTime.class, new ZonedDateTimeDeserializer());
        simpleModule.addDeserializer(JstResultCode.class, new JstResultCodeDeserializer());

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(simpleModule);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        objectMapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);

        this.objectMapper = objectMapper;
    }


    public <R extends BaseResult, P> R request(String method, final P params, Class<R> rClass) {
        return request(method, params, objectMapper.getTypeFactory().constructType(rClass));
    }

    public <R extends BaseResult, P> R request(String method, final P params,
                                               TypeReference<R> typeRef) {
        return request(method, params, objectMapper.getTypeFactory().constructType(typeRef));
    }

    public <R extends BaseResult, P> R request(String method, final P params,
                                               JavaType respType) {
        R r = doRequest(method, params, respType);

        JstResultCode code = r.getCode();
        if (!JstResultCode.SUCCEEDED.equals(code)) {
            throw new JstClientException(String.format("Failed to call remote interface, code=%d, message=%s",
                    code.code(), r.getMsg()));
        }

        return r;
    }

    private <R extends BaseResult, P> R doRequest(String method, final P params,
                                                    JavaType respType) {
        long timestamp = System.currentTimeMillis() / 1000;

        HttpUrl url = HttpUrl.parse(endpoint).newBuilder()
                .addQueryParameter("partnerid", partnerId)
                .addQueryParameter("token", token)
                .addQueryParameter("method", method)
                .addQueryParameter("ts", Long.toString(timestamp))
                .addQueryParameter("sign", calcSignature(method, timestamp))
                .build();


        Request req = new Request.Builder()
                .url(url)
                .post(new RequestBody() {
                    @Nullable
                    @Override
                    public MediaType contentType() {
                        return MediaType.get("application/json");
                    }

                    @Override
                    public void writeTo(@NotNull BufferedSink bufferedSink) throws IOException {
                        String json = objectMapper.writeValueAsString(params);
                        OutputStream outputStream = bufferedSink.outputStream();
                        ObjectWriter objectWriter = objectMapper.writer();
                        JsonGenerator generator = objectWriter.getFactory().createGenerator(outputStream);
                        objectMapper.writeValue(generator, params);
                    }
                }).build();

        try {
            Response response = getOkHttpClient().newCall(req).execute();
            return objectMapper.readValue(response.body().source().inputStream(), respType);
        } catch (JsonProcessingException e) {
            throw new JstClientException("解析响应数据错误", e);
        } catch (IOException e) {
            throw new JstClientException("网络错误", e);
        }
    }

    /**
     * 计算签名
     *
     * @param method    接口名称
     * @param timestamp 当前请求时间，时间戳格式(Unix 纪元到当前时间的秒数)
     * @see <a href="https://open.jushuitan.com/document/8.html">https://open.jushuitan.com/document/8.html</a>
     */
    @SneakyThrows
    private String calcSignature(String method, long timestamp) {
        StringBuilder sb = new StringBuilder()
                .append(method)
                .append(partnerId)
                .append("token")
                .append(token)
                .append("ts")
                .append(timestamp)
                .append(partnerKey);

        MessageDigest md5 = MessageDigest.getInstance("MD5");
        byte[] digest = md5.digest(sb.toString().getBytes());
        return Hex.encodeHexString(digest);
    }

    public OkHttpClient getOkHttpClient() {
        if (okHttpClient == null) {
            synchronized (this) {
                if (okHttpClient == null) {
                    okHttpClient = new OkHttpClient();
                }
            }
        }
        return okHttpClient;
    }
}
