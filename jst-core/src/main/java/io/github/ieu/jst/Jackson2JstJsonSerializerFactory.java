package io.github.ieu.jst;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ieu.jst.jackson2.DefaultObjectMapperFactory;

public class Jackson2JstJsonSerializerFactory implements JstJsonSerializerFactory {

    @Override
    public Jackson2JstJsonSerializer create() {
        ObjectMapper objectMapper = DefaultObjectMapperFactory.create();
        return new Jackson2JstJsonSerializer(objectMapper);
    }
}
