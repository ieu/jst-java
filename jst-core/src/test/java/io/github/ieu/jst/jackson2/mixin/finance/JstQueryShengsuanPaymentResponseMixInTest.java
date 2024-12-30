package io.github.ieu.jst.jackson2.mixin.finance;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ieu.jst.finance.JstQueryShengsuanPaymentResponse;
import io.github.ieu.jst.jackson2.DefaultObjectMapperFactory;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JstQueryShengsuanPaymentResponseMixInTest {

    @Test
    @SneakyThrows
    void shouldApplyMixInWhenRead() {
        DefaultObjectMapperFactory objectMapperFactory = new DefaultObjectMapperFactory();
        ObjectMapper objectMapper = objectMapperFactory.create();
        JstQueryShengsuanPaymentResponse response = objectMapper.readValue(
                "{\"msg\":\"执行成功\",\"code\":0,\"data\":{\"datas\":[{\"Account\":\"\",\"Labs\":null,\"PayAccountName\":\"账户名称\",\"Modified\":\"2022-06-02 17:57:15\",\"PayAccountNumber\":\"银行账号\",\"Creator\":20286,\"Ispaid\":\"True\",\"SellerType\":\"供应商\",\"Remark\":\"【清算-应付生成付款】\",\"Created\":\"2022-06-02 00:00:00\",\"PaidDate\":\"2022-06-02 00:00:00\",\"PayDate\":\"2022-06-02 00:00:00\",\"PayId\":11480,\"SellerId\":53802,\"Modifier\":20286,\"Status\":\"Confirmed\",\"PayAmount\":0,\"CoId\":12252,\"PayProBank\":\"开户银行\",\"Amount\":2475,\"ModifierName\":\"open_test\",\"LessAmount\":0,\"Payway\":\"应付付款\",\"Seller\":\"测试112233\",\"PoId\":0,\"items\":[{\"Type\":\"应付付款\",\"IoId\":4741,\"PayId\":11480,\"CoId\":12252,\"Amount\":2475,\"Autoid\":5547,\"PoId\":0}],\"CreatorName\":\"open_test\",\"TS\":1829392274}],\"page_index\":1,\"has_next\":false,\"page_size\":50}}",
                JstQueryShengsuanPaymentResponse.class
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
        assertEquals("", response.getData().getDatas().get(0).getAccount());
        assertNull(response.getData().getDatas().get(0).getLabs());
        assertEquals("账户名称", response.getData().getDatas().get(0).getPayAccountName());
        assertEquals("2022-06-02 17:57:15", response.getData().getDatas().get(0).getModified());
        assertEquals("银行账号", response.getData().getDatas().get(0).getPayAccountNumber());
        assertEquals(20286, response.getData().getDatas().get(0).getCreator());
        assertEquals("True", response.getData().getDatas().get(0).getIspaid());
        assertEquals("供应商", response.getData().getDatas().get(0).getSellerType());
        assertEquals("【清算-应付生成付款】", response.getData().getDatas().get(0).getRemark());
        assertEquals("2022-06-02 00:00:00", response.getData().getDatas().get(0).getCreated());
        assertEquals("2022-06-02 00:00:00", response.getData().getDatas().get(0).getPaidDate());
        assertEquals("2022-06-02 00:00:00", response.getData().getDatas().get(0).getPayDate());
        assertEquals(11480, response.getData().getDatas().get(0).getPayId());
        assertEquals(53802, response.getData().getDatas().get(0).getSellerId());
        assertEquals(20286, response.getData().getDatas().get(0).getModifier());
        assertEquals("Confirmed", response.getData().getDatas().get(0).getStatus());
        assertEquals(0, response.getData().getDatas().get(0).getPayAmount());
        assertEquals(12252, response.getData().getDatas().get(0).getCoId());
        assertEquals("开户银行", response.getData().getDatas().get(0).getPayProBank());
        assertEquals(2475, response.getData().getDatas().get(0).getAmount());
        assertEquals("open_test", response.getData().getDatas().get(0).getModifierName());
        assertEquals(0, response.getData().getDatas().get(0).getLessAmount());
        assertEquals("应付付款", response.getData().getDatas().get(0).getPayway());
        assertEquals("测试112233", response.getData().getDatas().get(0).getSeller());
        assertEquals(0, response.getData().getDatas().get(0).getPoId());
        assertNotNull(response.getData().getDatas().get(0).getItems());
        assertFalse(response.getData().getDatas().get(0).getItems().isEmpty());
        assertEquals("应付付款", response.getData().getDatas().get(0).getItems().get(0).getType());
        assertEquals(4741, response.getData().getDatas().get(0).getItems().get(0).getIoId());
        assertEquals(11480, response.getData().getDatas().get(0).getItems().get(0).getPayId());
        assertEquals(12252, response.getData().getDatas().get(0).getItems().get(0).getCoId());
        assertEquals(2475, response.getData().getDatas().get(0).getItems().get(0).getAmount());
        assertEquals(5547, response.getData().getDatas().get(0).getItems().get(0).getAutoid());
        assertEquals(0, response.getData().getDatas().get(0).getItems().get(0).getPoId());
        assertEquals("open_test", response.getData().getDatas().get(0).getCreatorName());
        assertEquals(1829392274, response.getData().getDatas().get(0).getTs());
    }

}
