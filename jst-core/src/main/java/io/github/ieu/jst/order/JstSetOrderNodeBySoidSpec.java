package io.github.ieu.jst.order;

public class JstSetOrderNodeBySoidSpec {

    private final JstOrderClient client;

    private final JstSetOrderNodeBySoidRequest.JstSetOrderNodeBySoidRequestBuilder requestBuilder = JstSetOrderNodeBySoidRequest.builder();

    public JstSetOrderNodeBySoidSpec(JstOrderClient client) {
        this.client = client;
    }

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/ccaa4f9d-b986-4c48-b2d2-1e8b20177658_2166_836.png" target="_blank">店铺编号</a></div>
     */
    public JstSetOrderNodeBySoidSpec shopId(Number shopId) {
        requestBuilder.shopId(shopId);
        return this;
    }

    public JstSetOrderNodeBySoidSpec items(java.util.List<JstSetOrderNodeBySoidRequest.Item> items) {
        requestBuilder.items(items);
        return this;
    }

    public JstSetOrderNodeBySoidResponse response() {
        return this.client.setOrderNodeBySoid(requestBuilder.build());
    }
}
