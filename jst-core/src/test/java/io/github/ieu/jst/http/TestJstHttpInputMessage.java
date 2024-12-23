package io.github.ieu.jst.http;

import lombok.Getter;
import lombok.Setter;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

@Getter
public class TestJstHttpInputMessage implements JstHttpInputMessage {
    private final ByteArrayOutputStream bufferedBody = new ByteArrayOutputStream(1024);

    @Setter
    private JstHttpHeaders headers;

    private final InputStream body;

    public TestJstHttpInputMessage(InputStream body) {
        this.body = body;
    }

    public TestJstHttpInputMessage(String body) {
        this.body = new ByteArrayInputStream(body.getBytes(StandardCharsets.UTF_8));
    }
}
