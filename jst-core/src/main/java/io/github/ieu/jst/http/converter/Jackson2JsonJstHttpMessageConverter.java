package io.github.ieu.jst.http.converter;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.type.TypeFactory;
import io.github.ieu.jst.http.JstGenericHttpMessageConverter;
import io.github.ieu.jst.http.JstHttpInputMessage;
import io.github.ieu.jst.http.JstHttpOutputMessage;
import io.github.ieu.jst.http.JstMediaType;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Type;

@Getter
@AllArgsConstructor
public class Jackson2JsonJstHttpMessageConverter<T> implements JstGenericHttpMessageConverter<T> {
    private final ObjectMapper objectMapper;

    @SuppressWarnings("deprecation")
    @Override
    public boolean canRead(Class<?> clazz, JstMediaType contentType) {
        if (!JstMediaType.APPLICATION_JSON.equals(contentType)) {
            return false;
        }

        TypeFactory typeFactory = objectMapper.getTypeFactory();
        JavaType javaType = typeFactory.constructType(clazz);
        return objectMapper.canDeserialize(javaType);
    }

    @SuppressWarnings("unchecked")
    @Override
    public T read(Class<?> clazz, JstHttpInputMessage message) throws IOException {
        return (T) objectMapper.readValue(message.getBody(), clazz);
    }

    @SuppressWarnings("unchecked")
    @Override
    public boolean canRead(Type type, JstMediaType contentType) {
        if (!JstMediaType.APPLICATION_JSON.equals(contentType)) {
            return false;
        }

        TypeFactory typeFactory = objectMapper.getTypeFactory();
        JavaType javaType = typeFactory.constructType(type);
        return objectMapper.canDeserialize(javaType);
    }

    @SuppressWarnings("unchecked")
    @Override
    public T read(Type type, JstHttpInputMessage message) throws IOException {
        TypeFactory typeFactory = objectMapper.getTypeFactory();
        JavaType javaType = typeFactory.constructType(type);
        return (T) objectMapper.readValue(message.getBody(), javaType);
    }

    @SuppressWarnings("deprecation")
    @Override
    public boolean canWrite(Class<?> clazz, JstMediaType contentType) {
        if (!JstMediaType.APPLICATION_JSON.equals(contentType)) {
            return false;
        }

        return objectMapper.canSerialize(clazz);
    }

    @Override
    public void write(T value, JstHttpOutputMessage message) throws IOException {
        OutputStream outputStream = message.getBody();
        ObjectWriter objectWriter = objectMapper.writer();
        JsonGenerator generator = objectWriter.getFactory().createGenerator(outputStream);
        objectMapper.writeValue(generator, value);
    }

    @SuppressWarnings("deprecation")
    @Override
    public boolean canWrite(Type type, JstMediaType contentType) {
        if (!JstMediaType.APPLICATION_JSON.equals(contentType)) {
            return false;
        }

        return objectMapper.canSerialize(TypeFactory.rawClass(type));
    }

    @Override
    public void write(Type value, JstHttpOutputMessage message) throws IOException {
        OutputStream outputStream = message.getBody();
        ObjectWriter objectWriter = objectMapper.writer();
        JsonGenerator generator = objectWriter.getFactory().createGenerator(outputStream);
        objectMapper.writeValue(generator, value);
    }
}
