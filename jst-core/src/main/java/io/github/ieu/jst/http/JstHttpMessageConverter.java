package io.github.ieu.jst.http;

import java.io.IOException;

public interface JstHttpMessageConverter<T> {

    boolean canRead(Class<?> clazz, JstMediaType contentType);

    T read(Class<?> clazz, JstHttpInputMessage message) throws IOException;

    boolean canWrite(Class<?> clazz, JstMediaType contentType);

    void write(T value, JstHttpOutputMessage message) throws IOException;
}
