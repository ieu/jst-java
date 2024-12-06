package io.github.ieu.jst;

import io.github.ieu.jst.auth.*;
import io.github.ieu.jst.http.JstHttpClient;
import lombok.Getter;
import org.apache.commons.lang3.RandomStringUtils;

import java.time.Duration;
import java.util.Optional;

@Getter
public abstract class AbstractJstBizClient {
    protected final InternalJstAuthClient authClient = new InternalJstAuthClient();
    private final JstCredential credential;
    private final JstAuthDigest authDigest;
    private final JstBizDigest bizDigest;
    private final JstHttpClient httpClient;
    private final JstTokenStore tokenStore;
    private final JstJsonSerializer jsonSerializer;

    protected AbstractJstBizClient(JstConfiguration configuration) {
        this.credential = configuration.getCredential();
        this.authDigest = configuration.getAuthDigest();
        this.bizDigest = configuration.getBizDigest();
        this.httpClient = configuration.getHttpClient();
        this.tokenStore = configuration.getTokenStore();
        this.jsonSerializer = configuration.getJsonSerializer();
    }

    protected <T, U> U execute(String path, T params, Class<U> targetClass) {
        String appKey = credential.getAppKey();
        String accessToken = getAccessToken();
        String biz = jsonSerializer.serialize(params);

        JstBizRequest request = new JstBizRequest();
        request.setAccessToken(accessToken);
        request.setAppKey(appKey);
        request.setTimestamp(Long.toString(System.currentTimeMillis() / 1000));
        request.setBiz(biz);

        bizDigest.sign(request);

        return httpClient.execute(path, request, targetClass);
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

            authDigest.sign(request);

            JstTokenResponse response = httpClient.execute("/openWeb/auth/getInitToken", request, JstTokenResponse.class);
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

            authDigest.sign(request);

            JstTokenResponse response = httpClient.execute("/openWeb/auth/refreshToken", request, JstTokenResponse.class);
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

            authDigest.sign(request);

            JstTokenResponse response = httpClient.execute("/openWeb/auth/accessToken", request, JstTokenResponse.class);
            int respCode = response.getCode();
            if (!JstErrorCode.SUCCESS.is(respCode)) {
                String respMsg = response.getMsg();
                throw new JstServerException(String.format("%d %s", respCode, respMsg));
            }

            return response.getData();
        }
    }
}
