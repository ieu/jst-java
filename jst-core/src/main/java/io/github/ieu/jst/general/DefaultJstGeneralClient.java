package io.github.ieu.jst.general;

import io.github.ieu.jst.AbstractJstBizClient;
import io.github.ieu.jst.JstConfiguration;
import io.github.ieu.jst.type.TypeReference;

import java.util.Map;

public class DefaultJstGeneralClient extends AbstractJstBizClient implements JstGeneralClient {

    public DefaultJstGeneralClient(JstConfiguration configuration) {
        super(configuration);
    }

    public <T, R> R request(String path, T params, Class<R> responseType) {
        return super.execute(path, params, responseType);
    }

    @Override
    public <T, R> R request(String path, T params, TypeReference<R> typeReference) {
        return super.execute(path, params, typeReference);
    }

    @Override
    public <T> JstTypedRequestSpec<T> request(Class<T> paramType) {
        return new JstTypedRequestSpec<>(this);
    }

    public Map<String, Object> request(String path, Map<String, Object> params) {
        return super.execute(path, params, new TypeReference<Map<String, Object>>() {
        });
    }

    @Override
    public JstMappedRequestSpec request() {
        return new JstMappedRequestSpec(this);
    }
}
