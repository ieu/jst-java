package io.github.ieu.jst.http;

import lombok.Getter;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

@Getter
public abstract class BufferingJstHttpRequest extends AbstractJstHttpRequest implements JstHttpRequest {
    private final ByteArrayOutputStream bufferedBody = new ByteArrayOutputStream(1024);

    @Override
    public OutputStream getBody() {
        return bufferedBody;
    }

    @Override
    public JstHttpResponse execute() throws IOException {
        return executeInternal(bufferedBody.toByteArray());
    }

    protected abstract JstHttpResponse executeInternal(byte[] body) throws IOException;
}
