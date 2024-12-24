package io.github.ieu.jst.http;

import java.io.Closeable;

public interface JstHttpResponse extends JstHttpInputMessage, Closeable {

    int getStatusCode();
}
