package io.github.ieu.jst;

import io.github.ieu.jst.http.JstHttpHeaders;
import io.github.ieu.jst.http.JstHttpOutputMessage;
import lombok.Getter;
import lombok.Setter;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

@Getter
public class TestJstHttpOutputMessage implements JstHttpOutputMessage {
    private final ByteArrayOutputStream bufferedBody = new ByteArrayOutputStream(1024);

    @Setter
    private JstHttpHeaders headers;

    @Override
    public OutputStream getBody() {
        return bufferedBody;
    }
}
