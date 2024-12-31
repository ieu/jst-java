package io.github.ieu.jst.base;

public class JstQueryShopsSpec {

    private final JstBaseClient client;

    private final JstQueryShopsRequest.JstQueryShopsRequestBuilder requestBuilder = JstQueryShopsRequest.builder();

    public JstQueryShopsSpec(JstBaseClient client) {
        this.client = client;
    }

    /**
     * 第几页，默认第一页
     */
    public JstQueryShopsSpec pageIndex(Integer pageIndex) {
        requestBuilder.pageIndex(pageIndex);
        return this;
    }

    /**
     * 每页多少条；默认100条，最大100条
     */
    public JstQueryShopsSpec pageSize(Integer pageSize) {
        requestBuilder.pageSize(pageSize);
        return this;
    }

    /**
     * 店铺编码
     */
    public JstQueryShopsSpec shopIds(java.util.List<Integer> shopIds) {
        requestBuilder.shopIds(shopIds);
        return this;
    }

    public JstQueryShopsResponse response() {
        return this.client.queryShops(requestBuilder.build());
    }
}
