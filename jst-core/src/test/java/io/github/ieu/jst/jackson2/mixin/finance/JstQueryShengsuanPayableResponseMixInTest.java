package io.github.ieu.jst.jackson2.mixin.finance;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ieu.jst.finance.JstQueryShengsuanPayableResponse;
import io.github.ieu.jst.jackson2.DefaultObjectMapperFactory;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JstQueryShengsuanPayableResponseMixInTest {

    @Test
    @SneakyThrows
    void shouldApplyMixInWhenRead() {
        ObjectMapper objectMapper = DefaultObjectMapperFactory.create();
        JstQueryShengsuanPayableResponse response = objectMapper.readValue(
                "{\"msg\":\"执行成功\",\"code\":0,\"data\":{\"datas\":[{\"TotalInvoiceAmount\":0,\"Modified\":\"2022-06-02 14:00:43\",\"InvAmount\":4934837.55,\"Creator\":20286,\"OtherAmount\":200,\"PinvCode\":null,\"Created\":\"2022-06-02 14:00:42\",\"PinvDate\":\"0001-01-01 08:00:00\",\"Remark\":\"【清算-批量应付生成】\",\"TaxRate\":\"0.00\",\"SellerId\":\"32135\",\"Modifier\":20286,\"SrcPinvId\":0,\"IsAdjustCost\":null,\"PaymentStatus\":\"0\",\"Status\":\"Confirmed\",\"PinvId\":4739,\"PayableDate\":\"2022-06-02 00:00:00\",\"IoId\":0,\"PaymentDate\":\"0001-01-01 08:00:00\",\"CoId\":12252,\"ModifierName\":\"open_test\",\"PayableType\":\"采购应付\",\"InvType\":\"1\",\"PinvNumber\":null,\"PaidAmount\":0,\"free_items\":[{\"PinvId\":4739,\"PayId\":11478,\"CoId\":12252,\"Amount\":200,\"Seller\":\"\",\"Remark\":\"\"}],\"Type\":null,\"SupplierName\":null,\"items\":[{\"PinvId\":4739,\"IoId\":5825697,\"InvQty\":10,\"IpinvId\":10163,\"IoiId\":\"11172311\",\"CoId\":12252,\"Qty\":10,\"Amount\":20000,\"InvAmount\":20000,\"OId\":129420,\"SkuId\":\"rkj001\",\"AdjustAmount\":0}],\"CreatorName\":\"open_test\",\"TS\":1744800394}],\"page_index\":1,\"has_next\":false,\"page_size\":50}}",
                JstQueryShengsuanPayableResponse.class
        );
        assertNotNull(response);
        assertEquals(0, response.getCode());
        assertEquals("执行成功", response.getMsg());
        assertNotNull(response.getData());
        assertEquals(1, response.getData().getPageIndex());
        assertFalse(response.getData().getHasNext());
        assertEquals(50, response.getData().getPageSize());
        assertNotNull(response.getData().getDatas());
        assertFalse(response.getData().getDatas().isEmpty());
        assertEquals(0, response.getData().getDatas().get(0).getTotalInvoiceAmount());
        assertEquals("2022-06-02 14:00:43", response.getData().getDatas().get(0).getModified());
        assertEquals(4934837.55, response.getData().getDatas().get(0).getInvAmount());
        assertEquals(20286, response.getData().getDatas().get(0).getCreator());
        assertEquals(200, response.getData().getDatas().get(0).getOtherAmount());
        assertNull(response.getData().getDatas().get(0).getPinvCode());
        assertEquals("2022-06-02 14:00:42", response.getData().getDatas().get(0).getCreated());
        assertEquals("0001-01-01 08:00:00", response.getData().getDatas().get(0).getPinvDate());
        assertEquals("【清算-批量应付生成】", response.getData().getDatas().get(0).getRemark());
        assertEquals("0.00", response.getData().getDatas().get(0).getTaxRate());
        assertEquals("32135", response.getData().getDatas().get(0).getSellerId());
        assertEquals(20286, response.getData().getDatas().get(0).getModifier());
        assertEquals(0, response.getData().getDatas().get(0).getSrcPinvId());
        assertNull(response.getData().getDatas().get(0).getIsAdjustCost());
        assertEquals("0", response.getData().getDatas().get(0).getPaymentStatus());
        assertEquals("Confirmed", response.getData().getDatas().get(0).getStatus());
        assertEquals(4739, response.getData().getDatas().get(0).getPinvId());
        assertEquals("2022-06-02 00:00:00", response.getData().getDatas().get(0).getPayableDate());
        assertEquals(0, response.getData().getDatas().get(0).getIoId());
        assertEquals(12252, response.getData().getDatas().get(0).getCoId());
        assertEquals("open_test", response.getData().getDatas().get(0).getModifierName());
        assertEquals("采购应付", response.getData().getDatas().get(0).getPayableType());
        assertEquals("1", response.getData().getDatas().get(0).getInvType());
        assertNull(response.getData().getDatas().get(0).getPinvNumber());
        assertEquals(0, response.getData().getDatas().get(0).getPaidAmount());
        assertNotNull(response.getData().getDatas().get(0).getFreeItems());
        assertFalse(response.getData().getDatas().get(0).getFreeItems().isEmpty());
        assertEquals(4739, response.getData().getDatas().get(0).getFreeItems().get(0).getPinvId());
        assertEquals(11478, response.getData().getDatas().get(0).getFreeItems().get(0).getPayId());
        assertEquals(200, response.getData().getDatas().get(0).getFreeItems().get(0).getAmount());
        assertEquals("", response.getData().getDatas().get(0).getFreeItems().get(0).getSeller());
        assertEquals("", response.getData().getDatas().get(0).getFreeItems().get(0).getRemark());
        assertNull(response.getData().getDatas().get(0).getType());
        assertNull(response.getData().getDatas().get(0).getSupplierName());
        assertNotNull(response.getData().getDatas().get(0).getItems());
        assertEquals(4739, response.getData().getDatas().get(0).getItems().get(0).getPinvId());
        assertEquals(5825697, response.getData().getDatas().get(0).getItems().get(0).getIoId());
        assertEquals(10, response.getData().getDatas().get(0).getItems().get(0).getInvQty());
        assertEquals(10163, response.getData().getDatas().get(0).getItems().get(0).getIpinvId());
        assertEquals("11172311", response.getData().getDatas().get(0).getItems().get(0).getIoiId());
        assertEquals(12252, response.getData().getDatas().get(0).getItems().get(0).getCoId());
        assertEquals(10, response.getData().getDatas().get(0).getItems().get(0).getQty());
        assertEquals(20000, response.getData().getDatas().get(0).getItems().get(0).getAmount());
        assertEquals(20000, response.getData().getDatas().get(0).getItems().get(0).getInvAmount());
        assertEquals(129420, response.getData().getDatas().get(0).getItems().get(0).getoId());
        assertEquals("rkj001", response.getData().getDatas().get(0).getItems().get(0).getSkuId());
        assertEquals(0, response.getData().getDatas().get(0).getItems().get(0).getAdjustAmount());
        assertFalse(response.getData().getDatas().get(0).getItems().isEmpty());
        assertEquals("open_test", response.getData().getDatas().get(0).getCreatorName());
        assertEquals(1744800394, response.getData().getDatas().get(0).getTs());
    }
}
