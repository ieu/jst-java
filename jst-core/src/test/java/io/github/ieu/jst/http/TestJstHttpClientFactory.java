package io.github.ieu.jst.http;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ieu.jst.http.converter.Jackson2JsonJstHttpMessageConverter;
import io.github.ieu.jst.http.converter.SimpleUrlEncodedFormJstHttpMessageConverter;
import io.github.ieu.jst.jackson2.DefaultObjectMapperFactory;

public class TestJstHttpClientFactory implements JstHttpClientFactory {

    private final JstHttpRequestFactory requestFactory;

    public TestJstHttpClientFactory(JstHttpRequestFactory requestFactory) {
        this.requestFactory = requestFactory;
    }

    @Override
    public JstHttpClient create() {
        DefaultJstHttpClient client = new DefaultJstHttpClient();

        client.setRequestFactory(requestFactory);

        DefaultObjectMapperFactory objectMapperFactory = new DefaultObjectMapperFactory();
        ObjectMapper objectMapper = objectMapperFactory.create();
        client.addHttpMessageConverter(new Jackson2JsonJstHttpMessageConverter<>(objectMapper));
        client.addHttpMessageConverter(new SimpleUrlEncodedFormJstHttpMessageConverter<>());

        return client;
    }
}
