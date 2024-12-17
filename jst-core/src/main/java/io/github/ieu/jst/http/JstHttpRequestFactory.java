package io.github.ieu.jst.http;

@FunctionalInterface
public interface JstHttpRequestFactory {
    JstHttpRequest create(JstRequestEntity<?> requestEntity);
}
