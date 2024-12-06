package io.github.ieu.jst.http;

public interface JstHttpClient {
    <T, U> U execute(String path, T value, Class<U> clazz);
}
