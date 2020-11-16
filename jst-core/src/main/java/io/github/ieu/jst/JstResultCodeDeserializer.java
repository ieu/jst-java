package io.github.ieu.jst;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;

public class JstResultCodeDeserializer extends JsonDeserializer<JstResultCode> {
    @Override
    public JstResultCode deserialize(JsonParser p, DeserializationContext ctxt) throws IOException,
            JsonProcessingException {
        return JstResultCode.valueOf(p.getIntValue());
    }
}
