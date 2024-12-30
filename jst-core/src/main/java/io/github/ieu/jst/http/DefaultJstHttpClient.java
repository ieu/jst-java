package io.github.ieu.jst.http;

import io.github.ieu.jst.JstClientException;
import io.github.ieu.jst.type.TypeFactory;
import io.github.ieu.jst.type.TypeReference;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.SneakyThrows;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor
public class DefaultJstHttpClient implements JstHttpClient {

    private final List<JstHttpMessageConverter<?>> httpMessageConverters = new ArrayList<>();

    @Setter
    private JstHttpRequestFactory requestFactory;

    public DefaultJstHttpClient(JstHttpRequestFactory requestFactory) {
        this.requestFactory = requestFactory;
    }

    public void addHttpMessageConverter(JstHttpMessageConverter<?> converter) {
        this.httpMessageConverters.add(converter);
    }

    public void addHttpMessageConverter(List<? extends JstHttpMessageConverter<?>> converters) {
        this.httpMessageConverters.addAll(converters);
    }

    @Override
    @SneakyThrows
    public <T, U> JstResponseEntity<U> execute(JstRequestEntity<T> requestEntity, Type targetType) {
        JstHttpResponse response = null;
        try {
            JstHttpRequest request = requestFactory.create(requestEntity);

            T requestBody = requestEntity.getBody();
            writeRequest(request, requestBody);

            response = request.execute();
            int statusCode = response.getStatusCode();

            U responseBody = readResponse(response, targetType);

            return new DefaultJstResponseEntity<U>()
                    .setStatusCode(statusCode)
                    .setBody(responseBody);
        } finally {
            if (response != null) {
                response.close();
            }
        }
    }

    @Override
    public <T, U> JstResponseEntity<U> execute(JstRequestEntity<T> requestEntity, TypeReference<U> typeReference) {
        return execute(requestEntity, typeReference.getType());
    }

    @SuppressWarnings("unchecked")
    private <T> void writeRequest(JstHttpRequest request, T requestBody) throws IOException {
        Class<?> requestBodyType = requestBody.getClass();
        JstMediaType contentType = request.getHeaders().getContentType();
        for (JstHttpMessageConverter<?> converter : httpMessageConverters) {
            if (converter.canWrite(requestBodyType, contentType)) {
                ((JstHttpMessageConverter<T>) converter).write(requestBody, request);
                return;
            }
        }

        throw new JstClientException(String.format("No HttpMessageConverter for %s", requestBodyType.getName()));
    }

    @SuppressWarnings("unchecked")
    private <T> T readResponse(JstHttpResponse response, Type targetType) throws IOException {
        JstMediaType contentType = response.getHeaders().getContentType();
        for (JstHttpMessageConverter<?> converter : httpMessageConverters) {
            if (converter instanceof JstGenericHttpMessageConverter<?>) {
                if (((JstGenericHttpMessageConverter<?>) converter).canRead(targetType, contentType)) {
                    return (T) ((JstGenericHttpMessageConverter<?>) converter).read(targetType, response);
                }
            } else {
                if (converter.canRead(TypeFactory.rawClass(targetType), contentType)) {
                    return (T) converter.read(TypeFactory.rawClass(targetType), response);
                }
            }
        }

        throw new JstClientException(String.format("No HttpMessageConverter for %s", targetType));
    }
}
