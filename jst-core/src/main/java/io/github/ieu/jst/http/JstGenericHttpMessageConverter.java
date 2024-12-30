package io.github.ieu.jst.http;

import java.io.IOException;
import java.lang.reflect.Type;

public interface JstGenericHttpMessageConverter<T> extends JstHttpMessageConverter<T> {

    boolean canRead(Type type, JstMediaType contentType);

    T read(Type type, JstHttpInputMessage message) throws IOException;

    boolean canWrite(Type type, JstMediaType contentType);

    void write(Type value, JstHttpOutputMessage message) throws IOException;
}
