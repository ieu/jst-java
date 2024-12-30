package io.github.ieu.jst.http;

import io.github.ieu.jst.type.TypeReference;

import java.lang.reflect.Type;

public interface JstHttpClient {
    <T, U> JstResponseEntity<U> execute(JstRequestEntity<T> requestEntity, Type targetType);

    <T, U> JstResponseEntity<U> execute(JstRequestEntity<T> requestEntity, TypeReference<U> typeReference);
}
