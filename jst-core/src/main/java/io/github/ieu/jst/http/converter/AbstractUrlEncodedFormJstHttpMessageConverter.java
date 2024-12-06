package io.github.ieu.jst.http.converter;

import io.github.ieu.jst.JstConvention;
import io.github.ieu.jst.http.JstHttpInputMessage;
import io.github.ieu.jst.http.JstHttpMessageConverter;
import io.github.ieu.jst.http.JstHttpOutputMessage;
import lombok.SneakyThrows;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public abstract class AbstractUrlEncodedFormJstHttpMessageConverter<T> implements JstHttpMessageConverter<T> {
    @Override
    public T read(Class<?> clazz, JstHttpInputMessage message) throws IOException {
        throw new UnsupportedOperationException();
    }

    protected abstract T readFromMap(Map<String, String> map);

    @Override
    public void write(T value, JstHttpOutputMessage message) throws IOException {
        Map<String, String> params = writeToMap(value);
        String encodedParams = params.entrySet()
                .stream()
                .filter(e -> {
                    String v = e.getValue();
                    return v != null;
                })
                .map(new Function<Map.Entry<String, String>, String>() {
                    @Override
                    @SneakyThrows
                    public String apply(Map.Entry<String, String> entry) {
                        String k = entry.getKey();
                        String v = URLEncoder.encode(entry.getValue(), JstConvention.DEFAULT_CHARSET.name());
                        return k + "=" + v;
                    }
                })
                .collect(Collectors.joining("&"));
        message.getBody().write(encodedParams.getBytes(JstConvention.DEFAULT_CHARSET));
    }

    protected abstract Map<String, String> writeToMap(T value);
}
