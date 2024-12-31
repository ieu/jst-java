package io.github.ieu.jst.item;

public class JstQuerySkuMapSpec {

    private final JstItemClient client;

    private final JstQuerySkuMapRequest.JstQuerySkuMapRequestBuilder requestBuilder = JstQuerySkuMapRequest.builder();

    public JstQuerySkuMapSpec(JstItemClient client) {
        this.client = client;
    }

    /**
     * 第几页，从第一页开始，默认1
     */
    public JstQuerySkuMapSpec pageIndex(Integer pageIndex) {
        requestBuilder.pageIndex(pageIndex);
        return this;
    }

    /**
     * 每页多少条，默认30，最大50
     */
    public JstQuerySkuMapSpec pageSize(Integer pageSize) {
        requestBuilder.pageSize(pageSize);
        return this;
    }

    /**
     * 修改起始时间，和结束时间必须同时存在，时间间隔不能超过七天，与商品编码不能同时为空
     */
    public JstQuerySkuMapSpec modifiedBegin(String modifiedBegin) {
        requestBuilder.modifiedBegin(modifiedBegin);
        return this;
    }

    /**
     * 修改结束时间，和起始时间必须同时存在，时间间隔不能超过七天，与商品编码不能同时为空
     */
    public JstQuerySkuMapSpec modifiedEnd(String modifiedEnd) {
        requestBuilder.modifiedEnd(modifiedEnd);
        return this;
    }

    /**
     * 商品对应关系修改起始时间
     */
    public JstQuerySkuMapSpec linkModifiedBegin(String linkModifiedBegin) {
        requestBuilder.linkModifiedBegin(linkModifiedBegin);
        return this;
    }

    /**
     * 商品对应关系修改结束时间
     */
    public JstQuerySkuMapSpec linkModifiedEnd(String linkModifiedEnd) {
        requestBuilder.linkModifiedEnd(linkModifiedEnd);
        return this;
    }

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/af0e3965-d4ac-43cb-a3b6-04c2122b2376_2384_529.png" target="_blank">商品编码</a></div>（线上商品编码），与修改时间不能同时为空，最多20
     */
    public JstQuerySkuMapSpec skuIds(String skuIds) {
        requestBuilder.skuIds(skuIds);
        return this;
    }

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/ccaa4f9d-b986-4c48-b2d2-1e8b20177658_2166_836.png" target="_blank">店铺编号</a></div>
     */
    public JstQuerySkuMapSpec shopId(Integer shopId) {
        requestBuilder.shopId(shopId);
        return this;
    }

    /**
     * 创建开始时间，与结束时间不能同时为空
     */
    public JstQuerySkuMapSpec createdBegin(String createdBegin) {
        requestBuilder.createdBegin(createdBegin);
        return this;
    }

    /**
     * 创建结束时间，和开始时间不能同时为空
     */
    public JstQuerySkuMapSpec createdEnd(String createdEnd) {
        requestBuilder.createdEnd(createdEnd);
        return this;
    }

    public JstQuerySkuMapResponse response() {
        return this.client.querySkuMap(requestBuilder.build());
    }
}
