package io.github.ieu.jst;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ieu.jst.jackson2.DefaultObjectMapperFactory;
import io.github.ieu.jst.jackson2.ObjectMapperFactory;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(fluent = true, chain = true)
public class Jackson2JstJsonSerializerFactory implements JstJsonSerializerFactory {

    private ObjectMapperFactory objectMapperFactory;

    public Jackson2JstJsonSerializerFactory objectMapper(ObjectMapper objectMapper) {
        this.objectMapperFactory = () -> objectMapper;
        return this;
    }

    @Override
    public Jackson2JstJsonSerializer create() {
        ObjectMapperFactory objectMapperFactory = this.objectMapperFactory;
        if (objectMapperFactory == null) {
            objectMapperFactory = new DefaultObjectMapperFactory();
        }
        ObjectMapper objectMapper = objectMapperFactory.create();
        return new Jackson2JstJsonSerializer(objectMapper);
    }
}
