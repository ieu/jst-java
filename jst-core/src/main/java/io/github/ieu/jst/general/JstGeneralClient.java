package io.github.ieu.jst.general;

import io.github.ieu.jst.type.TypeReference;

import java.util.Map;

public interface JstGeneralClient {

    <T, R> R execute(String path, T request, Class<R> responseType);

    <T, R> R execute(String path, T request, TypeReference<R> typeReference);

    Map<String, Object> execute(String path, Map<String, Object> request);
}
