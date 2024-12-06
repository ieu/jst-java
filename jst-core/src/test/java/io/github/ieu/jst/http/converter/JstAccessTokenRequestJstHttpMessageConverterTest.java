package io.github.ieu.jst.http.converter;

import io.github.ieu.jst.TestJstHttpOutputMessage;
import io.github.ieu.jst.auth.JstAccessTokenRequest;
import io.github.ieu.jst.http.JstMediaType;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class JstAccessTokenRequestJstHttpMessageConverterTest {
    @Test
    void canWrite_shouldReturnTrue() {
        JstAccessTokenRequestJstHttpMessageConverter converter = new JstAccessTokenRequestJstHttpMessageConverter();
        assertTrue(converter.canWrite(JstAccessTokenRequest.class, JstMediaType.APPLICATION_FORM_URLENCODED));
    }

    @Test
    @SneakyThrows
    void canRead_shouldReturnTrue() {
        JstAccessTokenRequest request = new JstAccessTokenRequest()
                .setAppKey("5b53060f23d84ddf9703056e84fa5a2d")
                .setTimestamp(Long.toString(1639128407))
                .setCode("123456")
                .setSign("05e3a51e19e0883afd1882ccd309e0b9");

        TestJstHttpOutputMessage message = new TestJstHttpOutputMessage();
        JstAccessTokenRequestJstHttpMessageConverter converter = new JstAccessTokenRequestJstHttpMessageConverter();
        converter.write(request, message);
        assertEquals(message.getBufferedBody().toString(), "charset=utf-8&app_key=5b53060f23d84ddf9703056e84fa5a2d&code=123456&grant_type=authorization_code&sign=05e3a51e19e0883afd1882ccd309e0b9&timestamp=1639128407");
    }

}