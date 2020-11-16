package io.github.ieu.jst;

import java.time.ZoneId;

public final class DateTimeConversion {
    /**
     * @link https://tools.ietf.org/html/rfc3339
     */
    public static final String DATE_TIME_FORMAT_PATTERN = "yyyy-MM-dd HH:mm:ss";

    public static final ZoneId TIMEZONE = ZoneId.of("Asia/Shanghai");

    public static final java.time.format.DateTimeFormatter DATE_TIME_FORMATTER;

    static {
        DATE_TIME_FORMATTER = java.time.format.DateTimeFormatter.ofPattern(DATE_TIME_FORMAT_PATTERN);
    }

    private DateTimeConversion() {
    }
}