package io.github.ieu.jst;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;

public class Jackson2JstJsonDeserializer implements JstJsonDeserializer {
    private final ObjectMapper objectMapper;

    public Jackson2JstJsonDeserializer(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @Override
    @SneakyThrows
    public <T> T deserialize(String content, Class<T> targetClass) {
        return objectMapper.readValue(content, targetClass);
    }
}
