package io.github.ieu.jst.item;

public class JstGetSkuBomPageListSpec {

    private final JstItemClient client;

    private final JstGetSkuBomPageListRequest.JstGetSkuBomPageListRequestBuilder requestBuilder = JstGetSkuBomPageListRequest.builder();

    public JstGetSkuBomPageListSpec(JstItemClient client) {
        this.client = client;
    }

    /**
     * 修改开始时间
     */
    public JstGetSkuBomPageListSpec modifiedStart(String modifiedStart) {
        requestBuilder.modifiedStart(modifiedStart);
        return this;
    }

    /**
     * 修改结束时间
     */
    public JstGetSkuBomPageListSpec modifiedEnd(String modifiedEnd) {
        requestBuilder.modifiedEnd(modifiedEnd);
        return this;
    }

    /**
     * 商品编码；与修改时间不能同时为空
     */
    public JstGetSkuBomPageListSpec skuIds(java.util.List<String> skuIds) {
        requestBuilder.skuIds(skuIds);
        return this;
    }

    public JstGetSkuBomPageListSpec page(JstGetSkuBomPageListRequest.Page page) {
        requestBuilder.page(page);
        return this;
    }

    public JstGetSkuBomPageListResponse response() {
        return this.client.getSkuBomPageList(requestBuilder.build());
    }
}
