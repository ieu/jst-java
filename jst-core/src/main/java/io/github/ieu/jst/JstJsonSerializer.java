package io.github.ieu.jst;

public interface JstJsonSerializer {
    <T> String serialize(T value);

    <T> T deserialize(String content, Class<T> targetType);
}
