package io.github.ieu.jst.http;

import lombok.Getter;
import lombok.Setter;

import java.io.IOException;
import java.net.URI;

@Getter
@Setter
public class TestJstHttpRequest extends BufferingJstHttpRequest {

    private final JstHttpResponse response;

    private URI uri;

    private JstHttpMethod method;

    public TestJstHttpRequest(JstHttpResponse response) {
        this.response = response;
    }

    @Override
    protected JstHttpResponse executeInternal(byte[] body) throws IOException {
        return response;
    }
}
