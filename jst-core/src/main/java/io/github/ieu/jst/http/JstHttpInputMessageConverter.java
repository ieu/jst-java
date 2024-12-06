package io.github.ieu.jst.http;

import java.io.IOException;

public interface JstHttpInputMessageConverter<T> {
    boolean canRead(Class<?> clazz, JstMediaType contentType);

    T read(Class<?> clazz, JstHttpInputMessage message) throws IOException;
}
