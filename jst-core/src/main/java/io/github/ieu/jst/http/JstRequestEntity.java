package io.github.ieu.jst.http;

import java.net.URI;

public interface JstRequestEntity<T> extends JstHttpEntity<T> {

    JstHttpMethod getMethod();

    URI getUri();
}
