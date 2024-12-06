package io.github.ieu.jst.jackson2;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import io.github.ieu.jst.JstConvention;

import java.io.IOException;
import java.time.ZonedDateTime;

public class ZonedDateTimeDeserializer extends JsonDeserializer<ZonedDateTime> {
    @Override
    public ZonedDateTime deserialize(JsonParser p, DeserializationContext ctxt) throws IOException,
            JsonProcessingException {
        return ZonedDateTime.parse(
                p.getText(),
                JstConvention.DATE_TIME_FORMATTER.withZone(JstConvention.TIMEZONE)
        );
    }
}
