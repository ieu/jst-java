package io.github.ieu.jst;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;
import java.time.ZonedDateTime;

public class ZonedDateTimeDeserializer extends JsonDeserializer<ZonedDateTime> {
    @Override
    public ZonedDateTime deserialize(JsonParser p, DeserializationContext ctxt) throws IOException,
            JsonProcessingException {
        return ZonedDateTime.parse(
                p.getText(),
                DateTimeConversion.DATE_TIME_FORMATTER.withZone(DateTimeConversion.TIMEZONE)
        );
    }
}
