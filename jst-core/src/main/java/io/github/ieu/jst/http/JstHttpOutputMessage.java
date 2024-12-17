package io.github.ieu.jst.http;

import java.io.OutputStream;

public interface JstHttpOutputMessage extends JstHttpMessage {
    OutputStream getBody();
}
