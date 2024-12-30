package io.github.ieu.jst.jackson2.mixin.wms;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ieu.jst.jackson2.DefaultObjectMapperFactory;
import io.github.ieu.jst.wms.JstQuickSaleArrivalResponse;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JstQuickSaleArrivalResponseMixInTest {

    @Test
    @SneakyThrows
    void shouldApplyMixInWhenRead() {
        DefaultObjectMapperFactory objectMapperFactory = new DefaultObjectMapperFactory();
        ObjectMapper objectMapper = objectMapperFactory.create();
        JstQuickSaleArrivalResponse response = objectMapper.readValue(
                "{\"data\":{\"Status\":0,\"Area\":\"A\",\"AreaBin\":\"8-1\",\"PKey\":\"多\",\"ArriveNum\":3,\"UnArriveNum\":0,\"LogisticsCompany\":\"德邦快递\",\"MinPurchaseDate\":null,\"IsArrive\":false},\"code\":0,\"issuccess\":true,\"msg\":\"执行成功\"}",
                JstQuickSaleArrivalResponse.class
        );
        assertNotNull(response);
        assertEquals(0, response.getCode());
        assertEquals("执行成功", response.getMsg());
        assertTrue(response.getIssuccess());
        assertNotNull(response.getData());
        assertEquals(0, response.getData().getStatus());
        assertEquals("A", response.getData().getArea());
        assertEquals("8-1", response.getData().getAreaBin());
        assertEquals("多", response.getData().getpKey());
        assertEquals(3, response.getData().getArriveNum());
        assertEquals(0, response.getData().getUnArriveNum());
        assertEquals("德邦快递", response.getData().getLogisticsCompany());
        assertNull(response.getData().getMinPurchaseDate());
        assertEquals(false, response.getData().getIsArrive());
    }
}
