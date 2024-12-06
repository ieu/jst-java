package io.github.ieu.jst.http.converter;

import io.github.ieu.jst.JstBizRequest;
import io.github.ieu.jst.http.JstHttpMessageConverter;
import io.github.ieu.jst.http.JstMediaType;

import java.util.HashMap;
import java.util.Map;

public class JstBizRequestJstHttpMessageConverter
        extends AbstractUrlEncodedFormJstHttpMessageConverter<JstBizRequest>
        implements JstHttpMessageConverter<JstBizRequest> {
    @Override
    public boolean canRead(Class<?> clazz, JstMediaType contentType) {
        return false;
    }

    @Override
    protected JstBizRequest readFromMap(Map<String, String> map) {
        JstBizRequest request = new JstBizRequest();
        request.setAccessToken(map.get("access_token"));
        request.setAppKey(map.get("app_key"));
        request.setTimestamp(map.get("timestamp"));
        request.setVersion(map.get("version"));
        request.setCharset(map.get("charset"));
        request.setSign(map.get("sign"));
        request.setBiz(map.get("biz"));
        return request;
    }

    @Override
    public boolean canWrite(Class<?> clazz, JstMediaType contentType) {
        if (!JstMediaType.APPLICATION_FORM_URLENCODED.equals(contentType)) {
            return false;
        }

        return JstBizRequest.class.isAssignableFrom(clazz);
    }

    @Override
    protected Map<String, String> writeToMap(JstBizRequest request) {
        Map<String, String> map = new HashMap<>();
        map.put("access_token", request.getAccessToken());
        map.put("app_key", request.getAppKey());
        map.put("timestamp", request.getTimestamp());
        map.put("version", request.getVersion());
        map.put("charset", request.getCharset());
        map.put("sign", request.getSign());
        map.put("biz", request.getBiz());
        return map;
    }
}
