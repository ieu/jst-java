package io.github.ieu.jst.http;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ieu.jst.http.converter.Jackson2JsonJstHttpMessageConverter;
import io.github.ieu.jst.http.converter.JstAccessTokenRequestJstHttpMessageConverter;
import io.github.ieu.jst.http.converter.JstBizRequestJstHttpMessageConverter;
import io.github.ieu.jst.http.converter.JstRefreshTokenRequestJstHttpMessageConverter;
import io.github.ieu.jst.http.okhttp3.OkHttp3JstHttpRequestFactory;
import io.github.ieu.jst.jackson2.DefaultObjectMapperFactory;
import lombok.experimental.UtilityClass;

@UtilityClass
public class DefaultJstHttpClientFactory {
    public static JstHttpClient create() {
        DefaultJstHttpClient client = new DefaultJstHttpClient();

        client.setRequestFactory(new OkHttp3JstHttpRequestFactory());

        ObjectMapper objectMapper = DefaultObjectMapperFactory.create();
        client.addConverter(new Jackson2JsonJstHttpMessageConverter<>(objectMapper));

        client.addConverter(new JstAccessTokenRequestJstHttpMessageConverter());
        client.addConverter(new JstRefreshTokenRequestJstHttpMessageConverter());
        client.addConverter(new JstBizRequestJstHttpMessageConverter());

        return client;
    }
}
