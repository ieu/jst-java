package io.github.ieu.jst.http.converter;

import io.github.ieu.jst.auth.JstRefreshTokenRequest;
import io.github.ieu.jst.http.JstHttpMessageConverter;
import io.github.ieu.jst.http.JstMediaType;

import java.util.HashMap;
import java.util.Map;

public class JstRefreshTokenRequestJstHttpMessageConverter
        extends AbstractUrlEncodedFormJstHttpMessageConverter<JstRefreshTokenRequest>
        implements JstHttpMessageConverter<JstRefreshTokenRequest> {
    @Override
    public boolean canRead(Class<?> clazz, JstMediaType contentType) {
        return false;
    }

    @Override
    protected JstRefreshTokenRequest readFromMap(Map<String, String> map) {
        JstRefreshTokenRequest request = new JstRefreshTokenRequest();
        request.setAppKey(map.get("app_key"));
        request.setTimestamp(map.get("timestamp"));
        request.setGrantType(map.get("grant_type"));
        request.setCharset(map.get("charset"));
        request.setRefreshToken(map.get("refresh_token"));
        request.setScope(map.get("scope"));
        request.setSign(map.get("sign"));
        return request;
    }

    @Override
    public boolean canWrite(Class<?> clazz, JstMediaType contentType) {
        if (!JstMediaType.APPLICATION_FORM_URLENCODED.equals(contentType)) {
            return false;
        }

        return JstRefreshTokenRequest.class.isAssignableFrom(clazz);
    }

    @Override
    protected Map<String, String> writeToMap(JstRefreshTokenRequest request) {
        Map<String, String> map = new HashMap<>();
        map.put("app_key", request.getAppKey());
        map.put("timestamp", request.getTimestamp());
        map.put("grant_type", request.getGrantType());
        map.put("charset", request.getCharset());
        map.put("refresh_token", request.getRefreshToken());
        map.put("scope", request.getScope());
        map.put("sign", request.getSign());
        return map;
    }
}
