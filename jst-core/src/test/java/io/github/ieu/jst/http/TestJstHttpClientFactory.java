package io.github.ieu.jst.http;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ieu.jst.http.converter.Jackson2JsonJstHttpMessageConverter;
import io.github.ieu.jst.http.converter.JstAccessTokenRequestJstHttpMessageConverter;
import io.github.ieu.jst.http.converter.JstBizRequestJstHttpMessageConverter;
import io.github.ieu.jst.http.converter.JstRefreshTokenRequestJstHttpMessageConverter;
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

        ObjectMapper objectMapper = DefaultObjectMapperFactory.create();
        client.addConverter(new Jackson2JsonJstHttpMessageConverter<>(objectMapper));

        client.addConverter(new JstAccessTokenRequestJstHttpMessageConverter());
        client.addConverter(new JstRefreshTokenRequestJstHttpMessageConverter());
        client.addConverter(new JstBizRequestJstHttpMessageConverter());

        return client;
    }
}
