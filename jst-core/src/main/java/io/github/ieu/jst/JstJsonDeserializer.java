package io.github.ieu.jst;

public interface JstJsonDeserializer {
    <T> T deserialize(String content, Class<T> targetType);
}
