package io.github.ieu.jst.base;

import io.github.ieu.jst.JstConfiguration;
import io.github.ieu.jst.auth.TestJstTokenStore;
import io.github.ieu.jst.http.TestJstHttpClientFactory;
import io.github.ieu.jst.http.TestJstHttpRequestFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DefaultJstBaseClientTest {

    @Test
    void queryShops_shouldWorkProperly() {
        DefaultJstBaseClient client = new DefaultJstBaseClient(
                JstConfiguration.builder()
                        .endpoint("https://dev-api.jushuitan.com")
                        .credential("b0b7d1db226d4216a3d58df9ffa2dde5", "99c4cef262f34ca882975a7064de0b87")
                        .tokenStore(new TestJstTokenStore())
                        .httpClientFactory(
                                new TestJstHttpClientFactory(
                                        new TestJstHttpRequestFactory(
                                                "{\n  \"msg\": \"执行成功\",\n  \"code\": 0,\n  \"data\": {\n    \"datas\": [\n      {\n        \"nick\": \"5084\",\n        \"shop_id\": 10178845,\n        \"session_expired\": \"\",\n        \"shop_url\": \"\",\n        \"created\": \"\",\n        \"co_id\": 12252,\n        \"session_uid\": \"\",\n        \"short_name\": \"\",\n        \"shop_site\": \"商家自有商城\",\n        \"shop_name\": \"HIDZMY\"\n      }\n    ],\n    \"page_index\": 1,\n    \"has_next\": true,\n    \"page_size\": 100\n  }\n}"
                                        )
                                )
                        )
                        .build()
        );
        JstQueryShopsRequest request = JstQueryShopsRequest.builder()
                .build();
        JstQueryShopsResponse response = client.queryShops(request);
        Assertions.assertEquals(0, response.getCode());
        Assertions.assertEquals("执行成功", response.getMsg());
        Assertions.assertEquals(1, response.getData().getPageIndex());
        Assertions.assertEquals(100, response.getData().getPageSize());
        Assertions.assertEquals(true, response.getData().getHasNext());
        Assertions.assertEquals("5084", response.getData().getDatas().get(0).getNick());
        Assertions.assertEquals(10178845, response.getData().getDatas().get(0).getShopId());
        Assertions.assertEquals("", response.getData().getDatas().get(0).getSessionExpired());
        Assertions.assertEquals("", response.getData().getDatas().get(0).getShopUrl());
        Assertions.assertEquals("", response.getData().getDatas().get(0).getCreated());
        Assertions.assertEquals(12252, response.getData().getDatas().get(0).getCoId());
        Assertions.assertEquals("", response.getData().getDatas().get(0).getSessionUid());
        Assertions.assertEquals("", response.getData().getDatas().get(0).getShortName());
        Assertions.assertEquals("商家自有商城", response.getData().getDatas().get(0).getShopSite());
        Assertions.assertEquals("HIDZMY", response.getData().getDatas().get(0).getShopName());
    }
}
