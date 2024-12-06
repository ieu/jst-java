package io.github.ieu.jst.jackson2;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import io.github.ieu.jst.JstConvention;

import java.io.IOException;
import java.time.ZonedDateTime;

public class ZonedDateTimeSerializer extends JsonSerializer<ZonedDateTime> {
    @Override
    public void serialize(ZonedDateTime value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeString(
                value
                        .withZoneSameInstant(JstConvention.TIMEZONE)
                        .format(JstConvention.DATE_TIME_FORMATTER)
        );
    }
}
