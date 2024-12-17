package io.github.ieu.jst.http.converter;

import io.github.ieu.jst.JstBizRequest;
import io.github.ieu.jst.http.TestJstHttpOutputMessage;
import io.github.ieu.jst.http.JstMediaType;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class JstBizRequestJstHttpMessageConverterTest {
    @Test
    void canWrite_shouldReturnTrue() {
        JstBizRequestJstHttpMessageConverter converter = new JstBizRequestJstHttpMessageConverter();
        assertTrue(converter.canWrite(JstBizRequest.class, JstMediaType.APPLICATION_FORM_URLENCODED));
    }

    @Test
    @SneakyThrows
    void canRead_shouldReturnTrue() {
        JstBizRequest request = new JstBizRequest()
                .setAppKey("5b53060f23d84ddf9703056e84fa5a2d")
                .setAccessToken("d7b01bf0842a4742a9450e21ffd95f60")
                .setTimestamp(Long.toString(1639128407))
                .setBiz("{\"page_index\":\"1\",\"page_size\":\"100\",\"nicks\":[\"老板\"]}");

        TestJstHttpOutputMessage message = new TestJstHttpOutputMessage();
        JstBizRequestJstHttpMessageConverter converter = new JstBizRequestJstHttpMessageConverter();
        converter.write(request, message);
        assertEquals(message.getBufferedBody().toString(), "access_token=d7b01bf0842a4742a9450e21ffd95f60&charset=utf-8&biz=%7B%22page_index%22%3A%221%22%2C%22page_size%22%3A%22100%22%2C%22nicks%22%3A%5B%22%E8%80%81%E6%9D%BF%22%5D%7D&app_key=5b53060f23d84ddf9703056e84fa5a2d&version=2&timestamp=1639128407");
    }
}