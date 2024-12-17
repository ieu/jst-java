package io.github.ieu.jst.http;

public interface JstResponseEntity<T> extends JstHttpEntity<T> {

    int getStatusCode();
}
