package io.github.ieu.jst.jackson2.mixin.wms;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ieu.jst.jackson2.DefaultObjectMapperFactory;
import io.github.ieu.jst.wms.JstLoadSkusnResponse;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JstLoadSkusnResponseMixInTest {

    @Test
    @SneakyThrows
    void shouldApplyMixInWhenRead() {
        ObjectMapper objectMapper = DefaultObjectMapperFactory.create();
        JstLoadSkusnResponse response = objectMapper.readValue(
                "{\"msg\":\"执行成功\",\"code\":0,\"data\":{\"MaxId\":0,\"Items\":[{\"AreaBin\":\"AreaBin\",\"SourceType\":\"SourceType\",\"ArriveNum\":\"ArriveNum\",\"IsArrive\":\"IsArrive\",\"PKey\":\"PKey\",\"FromOId\":0,\"IsCanceled\":\"IsCanceled\",\"Area\":\"Area\",\"Qty\":0,\"FromOiId\":0,\"MinPurchaseDate\":\"MinPurchaseDate\",\"SkuSn\":\"SkuSn\",\"LogisticsCompany\":\"LogisticsCompany\",\"SkuId\":\"SkuId\"}],\"HasNext\":true},\"issuccess\":\"\"}",
                JstLoadSkusnResponse.class
        );
        assertNotNull(response);
        assertEquals(0, response.getCode());
        assertEquals("执行成功", response.getMsg());
        assertNotNull(response.getData());
        assertEquals(0, response.getData().getMaxId());
        assertTrue(response.getData().getHasNext());
        assertNotNull(response.getData().getItems());
        assertFalse(response.getData().getItems().isEmpty());
        assertEquals("AreaBin", response.getData().getItems().get(0).getAreaBin());
        assertEquals("SourceType", response.getData().getItems().get(0).getSourceType());
        assertEquals("ArriveNum", response.getData().getItems().get(0).getArriveNum());
        assertEquals("IsArrive", response.getData().getItems().get(0).getIsArrive());
        assertEquals("PKey", response.getData().getItems().get(0).getpKey());
        assertEquals(0, response.getData().getItems().get(0).getFromOId());
        assertEquals("IsCanceled", response.getData().getItems().get(0).getIsCanceled());
        assertEquals("Area", response.getData().getItems().get(0).getArea());
        assertEquals(0, response.getData().getItems().get(0).getQty());
        assertEquals(0, response.getData().getItems().get(0).getFromOiId());
        assertEquals("MinPurchaseDate", response.getData().getItems().get(0).getMinPurchaseDate());
        assertEquals("SkuSn", response.getData().getItems().get(0).getSkuSn());
        assertEquals("LogisticsCompany", response.getData().getItems().get(0).getLogisticsCompany());
        assertEquals("SkuId", response.getData().getItems().get(0).getSkuId());
    }
}
