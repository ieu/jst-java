package io.github.ieu.jst.http.converter;

import io.github.ieu.jst.auth.JstAccessTokenRequest;
import io.github.ieu.jst.http.JstHttpMessageConverter;
import io.github.ieu.jst.http.JstMediaType;

import java.util.HashMap;
import java.util.Map;

public class JstAccessTokenRequestJstHttpMessageConverter
        extends AbstractUrlEncodedFormJstHttpMessageConverter<JstAccessTokenRequest>
        implements JstHttpMessageConverter<JstAccessTokenRequest> {
    @Override
    public boolean canRead(Class<?> clazz, JstMediaType contentType) {
        return false;
    }

    @Override
    protected JstAccessTokenRequest readFromMap(Map<String, String> map) {
        JstAccessTokenRequest request = new JstAccessTokenRequest();
        request.setAppKey(map.get("app_key"));
        request.setTimestamp(map.get("timestamp"));
        request.setGrantType(map.get("grant_type"));
        request.setCharset(map.get("charset"));
        request.setCode(map.get("code"));
        request.setSign(map.get("sign"));
        return request;
    }

    @Override
    public boolean canWrite(Class<?> clazz, JstMediaType contentType) {
        if (!JstMediaType.APPLICATION_FORM_URLENCODED.equals(contentType)) {
            return false;
        }

        return JstAccessTokenRequest.class.isAssignableFrom(clazz);
    }

    @Override
    protected Map<String, String> writeToMap(JstAccessTokenRequest request) {
        Map<String, String> map = new HashMap<>();
        map.put("app_key", request.getAppKey());
        map.put("timestamp", request.getTimestamp());
        map.put("grant_type", request.getGrantType());
        map.put("charset", request.getCharset());
        map.put("code", request.getCode());
        map.put("sign", request.getSign());
        return map;
    }
}
