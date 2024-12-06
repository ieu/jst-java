package io.github.ieu.jst;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ieu.jst.jackson2.DefaultObjectMapperFactory;
import lombok.experimental.UtilityClass;

@UtilityClass
public class Jackson2JstJsonSerializerFactory {
    Jackson2JstJsonSerializer create() {
        ObjectMapper objectMapper = DefaultObjectMapperFactory.create();
        return new Jackson2JstJsonSerializer(objectMapper);
    }
}
