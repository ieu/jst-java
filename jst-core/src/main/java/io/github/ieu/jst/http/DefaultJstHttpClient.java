package io.github.ieu.jst.http;

import io.github.ieu.jst.JstClientException;
import lombok.Getter;
import lombok.Setter;
import lombok.SneakyThrows;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

public class DefaultJstHttpClient implements JstHttpClient {
    @Getter
    private final URI endpoint;
    @Getter
    private final List<JstHttpMessageConverter<?>> converters = new ArrayList<>();
    @Getter
    @Setter
    private JstHttpRequestFactory requestFactory;

    public DefaultJstHttpClient(URI endpoint) {
        this.endpoint = endpoint;
    }

    public DefaultJstHttpClient(String endpoint) {
        this.endpoint = URI.create(endpoint);
    }

    public void addConverter(JstHttpMessageConverter<?> converter) {
        this.converters.add(converter);
    }

    public void addConverter(List<? extends JstHttpMessageConverter<?>> converters) {
        this.converters.addAll(converters);
    }

    @SuppressWarnings("unchecked")
    @Override
    @SneakyThrows
    public <T, U> U execute(String path, T value, Class<U> targetType) {
        URI uri = endpoint.resolve(path);

        JstHttpRequest request = requestFactory.create(uri, JstHttpMethod.POST);
        request.setContentType(JstMediaType.APPLICATION_FORM_URLENCODED);

        Class<?> valueType = value.getClass();

        JstHttpMessageConverter<?> outputMessageConverter = determineOutputConverter(valueType, JstMediaType.APPLICATION_FORM_URLENCODED);
        ((JstHttpMessageConverter<T>) outputMessageConverter).write(value, request);

        JstHttpResponse response = request.execute();

        JstHttpMessageConverter<?> inputMessageConverter = determineInputConverter(valueType, JstMediaType.APPLICATION_JSON);
        return ((JstHttpMessageConverter<U>) inputMessageConverter).read(targetType, response);
    }

    private JstHttpMessageConverter<?> determineInputConverter(Class<?> clazz, JstMediaType contentType) {
        for (JstHttpMessageConverter<?> converter : converters) {
            if (converter.canRead(clazz, contentType)) {
                return converter;
            }
        }

        throw new JstClientException(String.format("No HttpMessageConverter for %s", clazz.getName()));
    }

    private JstHttpMessageConverter<?> determineOutputConverter(Class<?> clazz, JstMediaType contentType) {
        for (JstHttpMessageConverter<?> converter : converters) {
            if (converter.canWrite(clazz, contentType)) {
                return converter;
            }
        }

        throw new JstClientException(String.format("No HttpMessageConverter for %s", clazz.getName()));
    }
}
