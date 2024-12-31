package io.github.ieu.jst.general;

import io.github.ieu.jst.type.TypeReference;

import java.util.Map;

public interface JstGeneralClient {

    <T, R> R request(String path, T params, Class<R> responseType);

    <T, R> R request(String path, T params, TypeReference<R> typeReference);

    <T> JstTypedRequestSpec<T> request(Class<T> paramType);

    Map<String, Object> request(String path, Map<String, Object> params);

    JstMappedRequestSpec request();
}
