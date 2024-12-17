package io.github.ieu.jst.http;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.*;

public class JstHttpHeaders implements Iterable<JstHttpHeaders.Entry> {
    public static final String CONTENT_TYPE = "content-type";

    private final Map<String, List<String>> headers = new HashMap<>();

    public void addHeader(final String name, final String value) {
        headers.compute(name, (n, values) -> {
            if (values == null) {
                values = new ArrayList<>();
            }
            values.add(value);
            return values;
        });
    }

    public void addHeader(final String name, final List<String> values) {
        values.forEach(v -> addHeader(name, v));
    }

    public void addHeaders(final Map<? extends String, ? extends List<String>> headers) {
        headers.forEach(this::addHeader);
    }

    public String getHeader(final String key) {
        List<String> values = headers.get(key);
        if (values == null || values.isEmpty()) {
            return null;
        }
        return values.get(0);
    }

    public List<String> getHeaders(final String key) {
        return headers.get(key);
    }

    public JstMediaType getContentType() {
        List<String> contentTypes = headers.get(CONTENT_TYPE);
        if (contentTypes == null || contentTypes.isEmpty()) {
            return null;
        }
        String contentType = contentTypes.get(0);
        String[] parts = contentType.split(";");
        return parts.length > 0 ? JstMediaType.parse(parts[0].trim()) : null;
    }

    public void setContentType(JstMediaType contentType) {
        addHeader(CONTENT_TYPE, contentType.toString());
    }

    @Override
    public Iterator<Entry> iterator() {
        Iterator<Map.Entry<String, List<String>>> internalIterator = headers.entrySet().iterator();
        return new Iterator<Entry>() {
            @Override
            public boolean hasNext() {
                return internalIterator.hasNext();
            }

            @Override
            public Entry next() {
                Map.Entry<String, List<String>> mapEntry = internalIterator.next();
                return new Entry(mapEntry.getKey(), mapEntry.getValue());
            }
        };
    }

    @Getter
    @Setter
    @EqualsAndHashCode
    @AllArgsConstructor
    public static class Entry {
        private String name;
        private List<String> values;
    }
}
