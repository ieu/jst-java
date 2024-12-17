package io.github.ieu.jst.http;

public interface JstHttpEntity<T> {
    JstHttpHeaders getHeaders();

    T getBody();
}
