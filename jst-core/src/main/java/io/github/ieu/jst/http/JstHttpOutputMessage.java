package io.github.ieu.jst.http;

import java.io.OutputStream;

public interface JstHttpOutputMessage {
    JstMediaType getContentType();

    void setContentType(JstMediaType contentType);

    OutputStream getBody();
}
