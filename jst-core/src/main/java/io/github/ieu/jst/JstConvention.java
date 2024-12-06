package io.github.ieu.jst;

import lombok.experimental.UtilityClass;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.ZoneId;

@UtilityClass
public final class JstConvention {
    public final ZoneId TIMEZONE = ZoneId.of("Asia/Shanghai");

    /**
     * @see <a href="https://tools.ietf.org/html/rfc3339">rfc3339</a>
     */
    public final String DATE_TIME_FORMAT_PATTERN = "yyyy-MM-dd HH:mm:ss";

    public final java.time.format.DateTimeFormatter DATE_TIME_FORMATTER = java.time.format.DateTimeFormatter.ofPattern(DATE_TIME_FORMAT_PATTERN);

    public final Charset DEFAULT_CHARSET = StandardCharsets.UTF_8;
}
