package io.github.ieu.jst;

import io.github.ieu.jst.auth.*;
import io.github.ieu.jst.http.*;
import io.github.ieu.jst.type.TypeReference;
import lombok.Getter;
import org.apache.commons.lang3.RandomStringUtils;

import java.lang.reflect.Type;
import java.net.URI;
import java.time.Duration;
import java.util.Optional;

@Getter
public abstract class AbstractJstBizClient {
    protected final InternalJstAuthClient authClient = new InternalJstAuthClient();
    private final URI endpoint;
    private final JstCredential credential;
    private final JstDigest digest;
    private final JstHttpClient httpClient;
    private final JstTokenStore tokenStore;
    private final JstJsonSerializer jsonSerializer;

    protected AbstractJstBizClient(JstConfiguration configuration) {
        this.endpoint = configuration.getEndpoint();
        this.credential = configuration.getCredential();
        this.digest = configuration.getDigest();
        this.httpClient = configuration.getHttpClient();
        this.tokenStore = configuration.getTokenStore();
        this.jsonSerializer = configuration.getJsonSerializer();
    }

    protected <T, U> U execute(String path, T params, TypeReference<U> typeReference) {
        return execute(path, params, typeReference.getType());
    }

    protected <T, U> U execute(String path, T params, Type targetType) {
        String appKey = credential.getAppKey();
        String accessToken = getAccessToken();
        String biz = jsonSerializer.serialize(params);

        JstBizRequest request = new JstBizRequest();
        request.setAccessToken(accessToken);
        request.setAppKey(appKey);
        request.setTimestamp(Long.toString(System.currentTimeMillis() / 1000));
        request.setBiz(biz);

        request.setSign(digest.sign(request));

        return executeInternal(path, request, targetType);
    }

    private <T, U> U executeInternal(String path, T params, Type targetType) {
        JstHttpHeaders requestHeaders = new JstHttpHeaders();
        requestHeaders.setContentType(JstMediaType.APPLICATION_FORM_URLENCODED);
        DefaultJstRequestEntity<Object> requestEntity = new DefaultJstRequestEntity<>()
                .setMethod(JstHttpMethod.POST)
                .setUri(endpoint.resolve(path))
                .setHeaders(requestHeaders)
                .setBody(params);
        JstResponseEntity<U> responseEntity = httpClient.execute(
                requestEntity,
                targetType
        );
        return responseEntity.getBody();
    }

    private String getAccessToken() {
        String appKey = credential.getAppKey();

        Optional<String> cachedAccessToken = tokenStore.getAccessToken(appKey);
        if (!cachedAccessToken.isPresent()) {
            JstToken token = tokenStore.getRefreshToken(appKey)
                    .map(authClient::refreshToken)
                    .orElseGet(authClient::getInitToken);

            String accessToken = token.getAccessToken();
            String refreshToken = token.getRefreshToken();
            Duration expiration = Duration.ofSeconds(token.getExpiresIn());

            tokenStore.setAccessToken(appKey, accessToken, expiration.minusHours(24));
            tokenStore.setRefreshToken(appKey, refreshToken, expiration.minusHours(12));

            cachedAccessToken = Optional.of(accessToken);
        }

        return cachedAccessToken.get();
    }

    protected class InternalJstAuthClient {
        public JstToken getInitToken() {
            String appKey = credential.getAppKey();

            JstAccessTokenRequest request = new JstAccessTokenRequest();
            request.setAppKey(appKey);
            request.setTimestamp(Long.toString(System.currentTimeMillis() / 1000));
            request.setCode(RandomStringUtils.secure().next(6));

            request.setSign(digest.sign(request));

            JstTokenResponse response = executeInternal("/openWeb/auth/getInitToken", request, JstTokenResponse.class);
            int respCode = response.getCode();
            if (!JstErrorCode.SUCCESS.is(respCode)) {
                String respMsg = response.getMsg();
                throw new JstServerException(String.format("%d %s", respCode, respMsg));
            }

            return response.getData();
        }

        public JstToken refreshToken(String refreshToken) {
            String appKey = credential.getAppKey();

            JstRefreshTokenRequest request = new JstRefreshTokenRequest();
            request.setAppKey(appKey);
            request.setTimestamp(Long.toString(System.currentTimeMillis() / 1000));
            request.setRefreshToken(refreshToken);

            request.setSign(digest.sign(request));

            JstTokenResponse response = executeInternal("/openWeb/auth/refreshToken", request, JstTokenResponse.class);
            int respCode = response.getCode();
            if (!JstErrorCode.SUCCESS.is(respCode)) {
                String respMsg = response.getMsg();
                throw new JstServerException(String.format("%d %s", respCode, respMsg));
            }

            return response.getData();
        }

        public JstToken accessToken(String code) {
            String appKey = credential.getAppKey();

            JstAccessTokenRequest request = new JstAccessTokenRequest();
            request.setAppKey(appKey);
            request.setTimestamp(Long.toString(System.currentTimeMillis() / 1000));
            request.setCode(code);

            request.setSign(digest.sign(request));

            JstTokenResponse response = executeInternal("/openWeb/auth/accessToken", request, JstTokenResponse.class);
            int respCode = response.getCode();
            if (!JstErrorCode.SUCCESS.is(respCode)) {
                String respMsg = response.getMsg();
                throw new JstServerException(String.format("%d %s", respCode, respMsg));
            }

            return response.getData();
        }
    }
}
