package io.github.ieu.jst.http;

import java.io.InputStream;

public interface JstHttpInputMessage extends JstHttpMessage {
    InputStream getBody();
}
