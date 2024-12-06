package io.github.ieu.jst;

import io.github.ieu.jst.http.JstHttpOutputMessage;
import io.github.ieu.jst.http.JstMediaType;
import lombok.Getter;
import lombok.Setter;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

@Getter
public class TestJstHttpOutputMessage implements JstHttpOutputMessage {
    private final ByteArrayOutputStream bufferedBody = new ByteArrayOutputStream(1024);
    @Setter
    private JstMediaType contentType;

    @Override
    public OutputStream getBody() {
        return bufferedBody;
    }
}
