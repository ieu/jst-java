package io.github.ieu.jst.general;

import io.github.ieu.jst.AbstractJstBizClient;
import io.github.ieu.jst.JstConfiguration;
import io.github.ieu.jst.type.TypeReference;

import java.util.Map;

public class DefaultJstGeneralClient extends AbstractJstBizClient implements JstGeneralClient {

    public DefaultJstGeneralClient(JstConfiguration configuration) {
        super(configuration);
    }

    public <T, R> R execute(String path, T request, Class<R> responseType) {
        return super.execute(path, request, responseType);
    }

    @Override
    public <T, R> R execute(String path, T request, TypeReference<R> typeReference) {
        return super.execute(path, request, typeReference);
    }

    public Map<String, Object> execute(String path, Map<String, Object> request) {
        return super.execute(path, request, new TypeReference<Map<String, Object>>() {});
    }
}
