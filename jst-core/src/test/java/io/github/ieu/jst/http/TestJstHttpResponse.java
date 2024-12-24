package io.github.ieu.jst.http;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class TestJstHttpResponse implements JstHttpResponse {
    private final String body;

    public TestJstHttpResponse(String body) {
        this.body = body;
    }

    @Override
    public int getStatusCode() {
        return 200;
    }

    @Override
    public InputStream getBody() {
        return new ByteArrayInputStream(body.getBytes(StandardCharsets.UTF_8));
    }

    @Override
    public JstHttpHeaders getHeaders() {
        JstHttpHeaders headers = new JstHttpHeaders();
        headers.setContentType(JstMediaType.APPLICATION_JSON);
        return headers;
    }

    @Override
    public void close() throws IOException {

    }
}
