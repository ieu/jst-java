package io.github.ieu.jst.http.converter;

import io.github.ieu.jst.JstBizRequest;
import io.github.ieu.jst.auth.JstAccessTokenRequest;
import io.github.ieu.jst.auth.JstRefreshTokenRequest;
import io.github.ieu.jst.http.JstMediaType;
import io.github.ieu.jst.http.TestJstHttpOutputMessage;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SimpleUrlEncodedFormJstHttpMessageConverterTest {

    @Test
    void canWrite_shouldReturnTrueWhenJstAccessTokenRequestPassedIn() {
        SimpleUrlEncodedFormJstHttpMessageConverter<Object> converter = new SimpleUrlEncodedFormJstHttpMessageConverter<>();
        assertTrue(converter.canWrite(JstAccessTokenRequest.class, JstMediaType.APPLICATION_FORM_URLENCODED));
    }

    @Test
    void canWrite_shouldReturnTrueWhenJstRefreshTokenRequestPassedIn() {
        SimpleUrlEncodedFormJstHttpMessageConverter<Object> converter = new SimpleUrlEncodedFormJstHttpMessageConverter<>();
        assertTrue(converter.canWrite(JstRefreshTokenRequest.class, JstMediaType.APPLICATION_FORM_URLENCODED));
    }

    @Test
    void canWrite_shouldReturnTrueWhenJstBizRequestPassedIn() {
        SimpleUrlEncodedFormJstHttpMessageConverter<Object> converter = new SimpleUrlEncodedFormJstHttpMessageConverter<>();
        assertTrue(converter.canWrite(JstBizRequest.class, JstMediaType.APPLICATION_FORM_URLENCODED));
    }

    @Test
    @SneakyThrows
    void write_shouldWriteExpectedContentWhenJstAccessTokenRequestPassedIn() {
        JstAccessTokenRequest request = new JstAccessTokenRequest()
                .setAppKey("5b53060f23d84ddf9703056e84fa5a2d")
                .setTimestamp(Long.toString(1639128407))
                .setCode("123456")
                .setSign("05e3a51e19e0883afd1882ccd309e0b9");
        TestJstHttpOutputMessage message = new TestJstHttpOutputMessage();
        SimpleUrlEncodedFormJstHttpMessageConverter<Object> converter = new SimpleUrlEncodedFormJstHttpMessageConverter<>();
        converter.write(request, message);
        assertEquals(
                "charset=utf-8&app_key=5b53060f23d84ddf9703056e84fa5a2d&code=123456&grant_type=authorization_code&sign=05e3a51e19e0883afd1882ccd309e0b9&timestamp=1639128407",
                message.getBufferedBody().toString()
        );
    }

    @Test
    @SneakyThrows
    void write_shouldWriteExpectedContentWhenJstRefreshTokenRequestPassedIn() {
        JstRefreshTokenRequest request = new JstRefreshTokenRequest()
                .setAppKey("0ecde8631431a5ed6b3e7368afbabdadss")
                .setTimestamp(Long.toString(1577771730))
                .setRefreshToken("eb1964a9d142423a9f0de88b97bb38fc")
                .setSign("0ecde8631431a5ed6b3e7368afbabdaoas");
        TestJstHttpOutputMessage message = new TestJstHttpOutputMessage();
        SimpleUrlEncodedFormJstHttpMessageConverter<Object> converter = new SimpleUrlEncodedFormJstHttpMessageConverter<>();
        converter.write(request, message);
        assertEquals(
                "charset=utf-8&refresh_token=eb1964a9d142423a9f0de88b97bb38fc&app_key=0ecde8631431a5ed6b3e7368afbabdadss&grant_type=refresh_token&scope=all&sign=0ecde8631431a5ed6b3e7368afbabdaoas&timestamp=1577771730",
                message.getBufferedBody().toString()
        );
    }

    @Test
    @SneakyThrows
    void write_shouldWriteExpectedContentWhenJstBizRequestPassedIn() {
        JstBizRequest request = new JstBizRequest()
                .setAppKey("5b53060f23d84ddf9703056e84fa5a2d")
                .setAccessToken("d7b01bf0842a4742a9450e21ffd95f60")
                .setTimestamp(Long.toString(1639128407))
                .setSign("395f5a78b446be465ac03a02491296c7")
                .setBiz("{\"page_index\":\"1\",\"page_size\":\"100\",\"nicks\":[\"老板\"]}");

        TestJstHttpOutputMessage message = new TestJstHttpOutputMessage();
        SimpleUrlEncodedFormJstHttpMessageConverter<Object> converter = new SimpleUrlEncodedFormJstHttpMessageConverter<>();
        converter.write(request, message);
        assertEquals(
                "access_token=d7b01bf0842a4742a9450e21ffd95f60&charset=utf-8&biz=%7B%22page_index%22%3A%221%22%2C%22page_size%22%3A%22100%22%2C%22nicks%22%3A%5B%22%E8%80%81%E6%9D%BF%22%5D%7D&app_key=5b53060f23d84ddf9703056e84fa5a2d&sign=395f5a78b446be465ac03a02491296c7&version=2&timestamp=1639128407",
                message.getBufferedBody().toString()
        );
    }
}