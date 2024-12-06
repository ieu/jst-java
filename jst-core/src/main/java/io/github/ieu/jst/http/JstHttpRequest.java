package io.github.ieu.jst.http;

import java.io.IOException;
import java.net.URI;

public interface JstHttpRequest extends JstHttpOutputMessage {
    URI getUri();

    JstHttpMethod getMethod();

    JstHttpResponse execute() throws IOException;
}
