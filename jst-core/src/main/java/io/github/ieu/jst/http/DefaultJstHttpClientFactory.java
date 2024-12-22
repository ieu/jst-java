package io.github.ieu.jst.http;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ieu.jst.http.converter.Jackson2JsonJstHttpMessageConverter;
import io.github.ieu.jst.http.converter.SimpleUrlEncodedFormJstHttpMessageConverter;
import io.github.ieu.jst.http.okhttp3.OkHttp3JstHttpRequestFactory;
import io.github.ieu.jst.jackson2.DefaultObjectMapperFactory;

public class DefaultJstHttpClientFactory implements JstHttpClientFactory {

    @Override
    public JstHttpClient create() {
        DefaultJstHttpClient client = new DefaultJstHttpClient();

        client.setRequestFactory(new OkHttp3JstHttpRequestFactory());

        ObjectMapper objectMapper = DefaultObjectMapperFactory.create();
        client.addConverter(new Jackson2JsonJstHttpMessageConverter<>(objectMapper));
        client.addConverter(new SimpleUrlEncodedFormJstHttpMessageConverter<>());

        return client;
    }
}
