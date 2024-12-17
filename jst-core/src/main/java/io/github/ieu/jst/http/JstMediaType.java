package io.github.ieu.jst.http;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

@Data
@AllArgsConstructor
public class JstMediaType {
    public static JstMediaType APPLICATION_FORM_URLENCODED = new JstMediaType("application", "x-www-form-urlencoded");

    public static JstMediaType APPLICATION_JSON = new JstMediaType("application", "json");

    @NonNull
    private final String type;

    @NonNull
    private final String subtype;

    @Override
    public String toString() {
        return String.format("%s/%s", type, subtype);
    }

    public static JstMediaType parse(final String mediaType) {
        if (mediaType == null) {
            return null;
        }
        String[] parts = mediaType.split("/");
        if (parts.length != 2) {
            return null;
        }
        return new JstMediaType(parts[0], parts[1]);
    }
}
