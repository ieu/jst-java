package io.github.ieu.jst.http;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ieu.jst.http.converter.Jackson2JsonJstHttpMessageConverter;
import io.github.ieu.jst.http.converter.SimpleUrlEncodedFormJstHttpMessageConverter;
import io.github.ieu.jst.http.httpurlconnection.HttpURLConnectionJstHttpRequestFactory;
import io.github.ieu.jst.jackson2.DefaultObjectMapperFactory;
import io.github.ieu.jst.jackson2.ObjectMapperFactory;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Getter
@Accessors(fluent = true, chain = true)
public class DefaultJstHttpClientFactory implements JstHttpClientFactory {

    @Setter
    private JstHttpRequestFactory httpRequestFactory;

    @Setter
    private ObjectMapperFactory objectMapperFactory;

    private final List<JstHttpMessageConverter<?>> httpMessageConverters = new ArrayList<>();

    public DefaultJstHttpClientFactory objectMapper(ObjectMapper objectMapper) {
        this.objectMapperFactory = () -> objectMapper;
        return this;
    }

    public DefaultJstHttpClientFactory httpMessageConverter(JstHttpMessageConverter<?> httpMessageConverter) {
        this.httpMessageConverters.add(httpMessageConverter);
        return this;
    }

    @Override
    public JstHttpClient create() {
        DefaultJstHttpClient client = new DefaultJstHttpClient();

        JstHttpRequestFactory httpRequestFactory = this.httpRequestFactory;
        if (httpRequestFactory == null) {
            httpRequestFactory = new HttpURLConnectionJstHttpRequestFactory();
        }
        client.setRequestFactory(httpRequestFactory);

        List<JstHttpMessageConverter<?>> httpMessageConverters = this.httpMessageConverters;
        if (httpMessageConverters.isEmpty()) {
            ObjectMapperFactory objectMapperFactory = this.objectMapperFactory;
            if (objectMapperFactory == null) {
                objectMapperFactory = new DefaultObjectMapperFactory();
            }
            ObjectMapper objectMapper = objectMapperFactory.create();
            httpMessageConverters = Arrays.asList(
                    new Jackson2JsonJstHttpMessageConverter<>(objectMapper),
                    new SimpleUrlEncodedFormJstHttpMessageConverter<>()
            );
        }
        for (JstHttpMessageConverter<?> httpMessageConverter : httpMessageConverters) {
            client.addHttpMessageConverter(httpMessageConverter);
        }

        return client;
    }
}
