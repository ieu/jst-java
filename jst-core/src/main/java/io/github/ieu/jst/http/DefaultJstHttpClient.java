package io.github.ieu.jst.http;

import io.github.ieu.jst.JstClientException;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor
public class DefaultJstHttpClient implements JstHttpClient {

    private final List<JstHttpMessageConverter<?>> httpMessageConverters = new ArrayList<>();

    @Setter
    private JstHttpRequestFactory requestFactory;

    public DefaultJstHttpClient(JstHttpRequestFactory requestFactory) {
        this.requestFactory = requestFactory;
    }

    public void addHttpMessageConverter(JstHttpMessageConverter<?> converter) {
        this.httpMessageConverters.add(converter);
    }

    public void addHttpMessageConverter(List<? extends JstHttpMessageConverter<?>> converters) {
        this.httpMessageConverters.addAll(converters);
    }

    @SuppressWarnings("unchecked")
    @Override
    @SneakyThrows
    public <T, U> JstResponseEntity<U> execute(JstRequestEntity<T> requestEntity, Class<U> targetType) {
        JstHttpResponse response = null;
        try {
            JstHttpRequest request = requestFactory.create(requestEntity);

            T requestBody = requestEntity.getBody();
            Class<?> requestBodyType = requestBody.getClass();

            JstHttpMessageConverter<?> outputMessageConverter = determineOutputConverter(requestBodyType, request.getHeaders().getContentType());
            ((JstHttpMessageConverter<T>) outputMessageConverter).write(requestBody, request);

            response = request.execute();
            int statusCode = response.getStatusCode();

            JstHttpMessageConverter<?> inputMessageConverter = determineInputConverter(targetType, response.getHeaders().getContentType());
            U responseBody = ((JstHttpMessageConverter<U>) inputMessageConverter).read(targetType, response);

            return new DefaultJstResponseEntity<U>()
                    .setStatusCode(statusCode)
                    .setBody(responseBody);
        } finally {
            if (response != null) {
                response.close();
            }
        }
    }

    private JstHttpMessageConverter<?> determineInputConverter(Class<?> clazz, JstMediaType contentType) {
        for (JstHttpMessageConverter<?> converter : httpMessageConverters) {
            if (converter.canRead(clazz, contentType)) {
                return converter;
            }
        }

        throw new JstClientException(String.format("No HttpMessageConverter for %s", clazz.getName()));
    }

    private JstHttpMessageConverter<?> determineOutputConverter(Class<?> clazz, JstMediaType contentType) {
        for (JstHttpMessageConverter<?> converter : httpMessageConverters) {
            if (converter.canWrite(clazz, contentType)) {
                return converter;
            }
        }

        throw new JstClientException(String.format("No HttpMessageConverter for %s", clazz.getName()));
    }
}
