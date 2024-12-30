package io.github.ieu.jst.general;

import io.github.ieu.jst.JstConfiguration;
import io.github.ieu.jst.auth.TestJstTokenStore;
import io.github.ieu.jst.base.JstQueryShopsRequest;
import io.github.ieu.jst.http.TestJstHttpClientFactory;
import io.github.ieu.jst.http.TestJstHttpRequestFactory;
import io.github.ieu.jst.type.TypeReference;
import lombok.Getter;
import lombok.Setter;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class DefaultJstGeneralClientTest {

    @Test
    void executeMap_shouldWorkProperly() {
        DefaultJstGeneralClient client = new DefaultJstGeneralClient(
                JstConfiguration.builder()
                        .endpoint("https://dev-api.jushuitan.com")
                        .credential("b0b7d1db226d4216a3d58df9ffa2dde5", "99c4cef262f34ca882975a7064de0b87")
                        .tokenStore(new TestJstTokenStore())
                        .httpClientFactory(
                                new TestJstHttpClientFactory(
                                        new TestJstHttpRequestFactory(
                                                "{\"msg\":\"执行成功\",\"code\":0,\"data\":{\"datas\":[{\"group_name\":\"自有商城\",\"created\":\"2023-01-03 09:43:26.487\",\"co_id\":12252,\"session_uid\":\"4020541464018\",\"shop_site\":\"商家自有商城\",\"shop_name\":\"0103顺祥测试店铺mr.g\",\"nick\":\"self_5018396669216298128\",\"shop_id\":10394533,\"session_expired\":\"------永久授权------\",\"group_id\":707,\"shop_url\":null,\"organization\":null,\"short_name\":\"\"}],\"page_index\":1,\"has_next\":false,\"page_size\":100}}"
                                        )
                                )
                        )
                        .build()
        );
        Map<String, Object> request = new HashMap<>();
        request.put("shop_ids", Collections.singletonList(10394533));
        Map<String, Object> response = client.execute("/open/shops/query", request);
        assertNotNull(response);
        assertEquals("执行成功", response.get("msg"));
        assertEquals(0, response.get("code"));
        assertNotNull(response.get("data"));
        assertInstanceOf(Map.class, response.get("data"));
        assertEquals(1, ((Map<String, Object>) response.get("data")).get("page_index"));
        assertEquals(false, ((Map<String, Object>) response.get("data")).get("has_next"));
        assertEquals(100, ((Map<String, Object>) response.get("data")).get("page_size"));
        assertNotNull(((Map<String, Object>) response.get("data")).get("datas"));
        assertInstanceOf(List.class, ((Map<String, Object>) response.get("data")).get("datas"));
        assertFalse(((List<Map<String, Object>>) ((Map<String, Object>) response.get("data")).get("datas")).isEmpty());
        assertEquals("自有商城", ((List<Map<String, Object>>) ((Map<String, Object>) response.get("data")).get("datas")).get(0).get("group_name"));
        assertEquals("2023-01-03 09:43:26.487", ((List<Map<String, Object>>) ((Map<String, Object>) response.get("data")).get("datas")).get(0).get("created"));
        assertEquals(12252, ((List<Map<String, Object>>) ((Map<String, Object>) response.get("data")).get("datas")).get(0).get("co_id"));
        assertEquals("4020541464018", ((List<Map<String, Object>>) ((Map<String, Object>) response.get("data")).get("datas")).get(0).get("session_uid"));
        assertEquals("商家自有商城", ((List<Map<String, Object>>) ((Map<String, Object>) response.get("data")).get("datas")).get(0).get("shop_site"));
        assertEquals("0103顺祥测试店铺mr.g", ((List<Map<String, Object>>) ((Map<String, Object>) response.get("data")).get("datas")).get(0).get("shop_name"));
        assertEquals("self_5018396669216298128", ((List<Map<String, Object>>) ((Map<String, Object>) response.get("data")).get("datas")).get(0).get("nick"));
        assertEquals(10394533, ((List<Map<String, Object>>) ((Map<String, Object>) response.get("data")).get("datas")).get(0).get("shop_id"));
        assertEquals("------永久授权------", ((List<Map<String, Object>>) ((Map<String, Object>) response.get("data")).get("datas")).get(0).get("session_expired"));
        assertEquals(707, ((List<Map<String, Object>>) ((Map<String, Object>) response.get("data")).get("datas")).get(0).get("group_id"));
        assertNull(((List<Map<String, Object>>) ((Map<String, Object>) response.get("data")).get("datas")).get(0).get("shop_url"));
        assertNull(((List<Map<String, Object>>) ((Map<String, Object>) response.get("data")).get("datas")).get(0).get("organization"));
        assertEquals("", ((List<Map<String, Object>>) ((Map<String, Object>) response.get("data")).get("datas")).get(0).get("short_name"));
    }

    @Test
    void executeTypeReference_shouldWorkProperly() {
        DefaultJstGeneralClient client = new DefaultJstGeneralClient(
                JstConfiguration.builder()
                        .endpoint("https://dev-api.jushuitan.com")
                        .credential("b0b7d1db226d4216a3d58df9ffa2dde5", "99c4cef262f34ca882975a7064de0b87")
                        .tokenStore(new TestJstTokenStore())
                        .httpClientFactory(
                                new TestJstHttpClientFactory(
                                        new TestJstHttpRequestFactory(
                                                "{\"msg\":\"执行成功\",\"code\":0,\"data\":{\"datas\":[{\"group_name\":\"自有商城\",\"created\":\"2023-01-03 09:43:26.487\",\"co_id\":12252,\"session_uid\":\"4020541464018\",\"shop_site\":\"商家自有商城\",\"shop_name\":\"0103顺祥测试店铺mr.g\",\"nick\":\"self_5018396669216298128\",\"shop_id\":10394533,\"session_expired\":\"------永久授权------\",\"group_id\":707,\"shop_url\":null,\"organization\":null,\"short_name\":\"\"}],\"page_index\":1,\"has_next\":false,\"page_size\":100}}"
                                        )
                                )
                        )
                        .build()
        );
        JstQueryShopsRequest request = JstQueryShopsRequest.builder()
                .shopIds(Collections.singletonList(10394533))
                .build();
        Response<Pagination<List<Shop>>> response = client.execute("/open/shops/query", request, new TypeReference<Response<Pagination<List<Shop>>>>() {});
        assertNotNull(response);
        assertEquals("执行成功", response.getMsg());
        assertEquals(0, response.getCode());
        assertNotNull(response.getData());
        assertEquals(1, response.getData().getPageIndex());
        assertEquals(false, response.getData().getHasNext());
        assertEquals(100, response.getData().getPageSize());
        assertNotNull(response.getData().getDatas());
        assertFalse(response.getData().getDatas().isEmpty());
        assertEquals("自有商城", response.getData().getDatas().get(0).getGroupName());
        assertEquals("2023-01-03 09:43:26.487", response.getData().getDatas().get(0).getCreated());
        assertEquals(12252, response.getData().getDatas().get(0).getCoId());
        assertEquals("4020541464018", response.getData().getDatas().get(0).getSessionUid());
        assertEquals("商家自有商城", response.getData().getDatas().get(0).getShopSite());
        assertEquals("0103顺祥测试店铺mr.g", response.getData().getDatas().get(0).getShopName());
        assertEquals("self_5018396669216298128", response.getData().getDatas().get(0).getNick());
        assertEquals(10394533, response.getData().getDatas().get(0).getShopId());
        assertEquals("------永久授权------", response.getData().getDatas().get(0).getSessionExpired());
        assertEquals(707, response.getData().getDatas().get(0).getGroupId());
        assertNull(response.getData().getDatas().get(0).getShopUrl());
        assertEquals("", response.getData().getDatas().get(0).getShortName());
    }

    @Getter
    @Setter
    static class Response<T> {

        private Integer code;

        private String msg;

        private T data;
    }

    @Getter
    @Setter
    static class Pagination<T> {

        private Integer pageIndex;

        private Integer pageSize;

        private Boolean hasNext;

        private T datas;
    }

    @Getter
    @Setter
    static class Shop {

        private Integer shopId;

        private String shopName;

        private Integer coId;

        private String shopSite;

        private String shopUrl;

        private String created;

        private String nick;

        private String sessionExpired;

        private String sessionUid;

        private String shortName;

        private Number groupId;

        private String groupName;
    }
}