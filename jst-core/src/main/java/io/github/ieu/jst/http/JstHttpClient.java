package io.github.ieu.jst.http;

public interface JstHttpClient {
    <T, U> JstResponseEntity<U> execute(JstRequestEntity<T> requestEntity, Class<U> clazz);
}
