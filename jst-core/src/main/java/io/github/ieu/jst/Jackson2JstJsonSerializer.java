package io.github.ieu.jst;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;

public class Jackson2JstJsonSerializer implements JstJsonSerializer {
    private final ObjectMapper objectMapper;

    public Jackson2JstJsonSerializer(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @Override
    @SneakyThrows
    public <T> String serialize(T value) {
        return objectMapper.writeValueAsString(value);
    }

    @Override
    @SneakyThrows
    public <T> T deserialize(String content, Class<T> targetClass) {
        return objectMapper.readValue(content, targetClass);
    }
}
