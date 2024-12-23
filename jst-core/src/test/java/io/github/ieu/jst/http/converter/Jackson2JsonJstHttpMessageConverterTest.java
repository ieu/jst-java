package io.github.ieu.jst.http.converter;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ieu.jst.auth.JstTokenResponse;
import io.github.ieu.jst.http.JstMediaType;
import io.github.ieu.jst.http.TestJstHttpInputMessage;
import io.github.ieu.jst.jackson2.DefaultObjectMapperFactory;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class Jackson2JsonJstHttpMessageConverterTest {

    @Test
    void canRead_shouldReturnTrueWhenJstTokenResponsePassedIn() {
        ObjectMapper objectMapper = DefaultObjectMapperFactory.create();
        Jackson2JsonJstHttpMessageConverter<JstTokenResponse> converter = new Jackson2JsonJstHttpMessageConverter<>(objectMapper);
        assertTrue(converter.canRead(JstTokenResponse.class, JstMediaType.APPLICATION_JSON));
    }

    @Test
    @SneakyThrows
    void read_shouldReturnJstTokenResponseObjectWhenGetInitTokenResponseGiven() {
        ObjectMapper objectMapper = DefaultObjectMapperFactory.create();
        Jackson2JsonJstHttpMessageConverter<JstTokenResponse> converter = new Jackson2JsonJstHttpMessageConverter<>(objectMapper);
        JstTokenResponse response = converter.read(
                JstTokenResponse.class,
                new TestJstHttpInputMessage(
                        "{\"code\":0,\"data\":{\"access_token\":\"0ecde8631431a5ed6b3e7368afbabdadss\",\"expires_in\":2592000,\"refresh_token\":\"eb1964a9d142423a9f0de88b97bb38fc\",\"scope\":\"all\"}}"
                )
        );
        Assertions.assertNotNull(response);
        Assertions.assertEquals(0, response.getCode());
        Assertions.assertNotNull(response.getData());
        Assertions.assertEquals("0ecde8631431a5ed6b3e7368afbabdadss", response.getData().getAccessToken());
        Assertions.assertEquals(2592000, response.getData().getExpiresIn());
        Assertions.assertEquals("eb1964a9d142423a9f0de88b97bb38fc", response.getData().getRefreshToken());
        Assertions.assertEquals("all", response.getData().getScope());
    }

    @Test
    @SneakyThrows
    void read_shouldReturnJstTokenResponseObjectWhenRefreshTokenResponseGiven() {
        ObjectMapper objectMapper = DefaultObjectMapperFactory.create();
        Jackson2JsonJstHttpMessageConverter<JstTokenResponse> converter = new Jackson2JsonJstHttpMessageConverter<>(objectMapper);
        JstTokenResponse response = converter.read(
                JstTokenResponse.class,
                new TestJstHttpInputMessage(
                        "{\"code\":0,\"data\":{\"access_token\":\"0ecde8631431a5ed6b3e7368afbabdasa1\",\"expires_in\":2592000,\"refresh_token\":\"eb1964a9d142423a9f0de88b97bb3dp3\",\"scope\":\"all\"}}"
                )
        );
        Assertions.assertNotNull(response);
        Assertions.assertEquals(0, response.getCode());
        Assertions.assertNotNull(response.getData());
        Assertions.assertEquals("0ecde8631431a5ed6b3e7368afbabdasa1", response.getData().getAccessToken());
        Assertions.assertEquals(2592000, response.getData().getExpiresIn());
        Assertions.assertEquals("eb1964a9d142423a9f0de88b97bb3dp3", response.getData().getRefreshToken());
        Assertions.assertEquals("all", response.getData().getScope());
    }
}