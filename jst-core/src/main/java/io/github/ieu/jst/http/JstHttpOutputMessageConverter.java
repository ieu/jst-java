package io.github.ieu.jst.http;

import java.io.IOException;

public interface JstHttpOutputMessageConverter<T> {
    boolean canWrite(Class<?> clazz, JstMediaType contentType);

    void write(T value, JstHttpOutputMessage message) throws IOException;
}
