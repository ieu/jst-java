package io.github.ieu.jst;

import io.github.ieu.jst.auth.JstAccessTokenRequest;
import io.github.ieu.jst.auth.JstRefreshTokenRequest;
import org.apache.commons.codec.digest.DigestUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class DefaultJstDigest implements JstDigest {

    private final JstCredential credential;

    protected DefaultJstDigest(JstCredential credential) {
        this.credential = credential;
    }

    @Override
    public String sign(JstAccessTokenRequest request) {
        Map<String, String> params = new TreeMap<>();
        params.put("app_key", request.getAppKey());
        params.put("timestamp", request.getTimestamp());
        params.put("grant_type", request.getGrantType());
        params.put("charset", request.getCharset());
        params.put("code", request.getCode());
        return sign(params);
    }

    @Override
    public String sign(JstRefreshTokenRequest request) {
        Map<String, String> params = new TreeMap<>();
        params.put("app_key", request.getAppKey());
        params.put("timestamp", request.getTimestamp());
        params.put("grant_type", request.getGrantType());
        params.put("charset", request.getCharset());
        params.put("refresh_token", request.getRefreshToken());
        params.put("scope", request.getScope());
        return sign(params);
    }

    @Override
    public String sign(JstBizRequest request) {
        Map<String, String> params = new TreeMap<>();
        params.put("access_token", request.getAccessToken());
        params.put("app_key", request.getAppKey());
        params.put("biz", request.getBiz());
        params.put("charset", request.getCharset());
        params.put("timestamp", request.getTimestamp());
        params.put("version", request.getVersion());
        return sign(params);
    }

    private String sign(Map<String, String> params) {
        Map<String, String> sortedParams = new TreeMap<>(params);
        String paramString = sortedParams.entrySet().stream()
                .collect(
                        () -> new StringBuilder(credential.getAppSecret()),
                        (sb, entry) -> sb.append(entry.getKey()).append(entry.getValue()),
                        StringBuilder::append
                )
                .toString();
        return DigestUtils.md5Hex(paramString);
    }
}
