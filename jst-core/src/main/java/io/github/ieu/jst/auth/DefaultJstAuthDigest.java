package io.github.ieu.jst.auth;

import io.github.ieu.jst.JstCredential;
import org.apache.commons.codec.digest.DigestUtils;

import java.util.Map;
import java.util.TreeMap;

public class DefaultJstAuthDigest implements JstAuthDigest {
    private final JstCredential credential;

    public DefaultJstAuthDigest(JstCredential credential) {
        this.credential = credential;
    }

    @Override
    public JstAccessTokenRequest sign(JstAccessTokenRequest request) {
        Map<String, String> params = new TreeMap<>();
        params.put("app_key", request.getAppKey());
        params.put("timestamp", request.getTimestamp());
        params.put("grant_type", request.getGrantType());
        params.put("charset", request.getCharset());
        params.put("code", request.getCode());
        String paramString = params.entrySet().stream()
                .collect(
                        () -> new StringBuilder(credential.getAppSecret()),
                        (sb, entry) -> sb.append(entry.getKey()).append(entry.getValue()),
                        StringBuilder::append
                )
                .toString();
        String sign = DigestUtils.md5Hex(paramString);
        request.setSign(sign);
        return request;
    }

    @Override
    public JstRefreshTokenRequest sign(JstRefreshTokenRequest request) {
        Map<String, String> params = new TreeMap<>();
        params.put("app_key", request.getAppKey());
        params.put("timestamp", request.getTimestamp());
        params.put("grant_type", request.getGrantType());
        params.put("charset", request.getCharset());
        params.put("refresh_token", request.getRefreshToken());
        params.put("scope", request.getScope());
        String paramString = params.entrySet().stream()
                .collect(
                        () -> new StringBuilder(credential.getAppSecret()),
                        (sb, entry) -> sb.append(entry.getKey()).append(entry.getValue()),
                        StringBuilder::append
                )
                .toString();
        String sign = DigestUtils.md5Hex(paramString);
        request.setSign(sign);
        return request;
    }
}
