package io.github.ieu.jst.item;

public class JstQueryCombineSkuSpec {

    private final JstItemClient client;

    private final JstQueryCombineSkuRequest.JstQueryCombineSkuRequestBuilder requestBuilder = JstQueryCombineSkuRequest.builder();

    public JstQueryCombineSkuSpec(JstItemClient client) {
        this.client = client;
    }

    /**
     * 第几页，从第一页开始，默认1
     */
    public JstQueryCombineSkuSpec pageIndex(Integer pageIndex) {
        requestBuilder.pageIndex(pageIndex);
        return this;
    }

    /**
     * 每页多少条，默认30，最大50
     */
    public JstQueryCombineSkuSpec pageSize(Integer pageSize) {
        requestBuilder.pageSize(pageSize);
        return this;
    }

    /**
     * 修改起始时间,起始时间和结束时间必须同时存在，时间间隔不能超过七天
     */
    public JstQueryCombineSkuSpec modifiedBegin(String modifiedBegin) {
        requestBuilder.modifiedBegin(modifiedBegin);
        return this;
    }

    /**
     * 修改结束时间,起始时间和结束时间必须同时存在，时间间隔不能超过七天
     */
    public JstQueryCombineSkuSpec modifiedEnd(String modifiedEnd) {
        requestBuilder.modifiedEnd(modifiedEnd);
        return this;
    }

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/c73eef94-c221-404c-a0d8-f5f666a9f943_2002_402.png" target="_blank">组合装商品编码</a></div>与修改时间不能同时为空，最多20
     */
    public JstQueryCombineSkuSpec skuIds(String skuIds) {
        requestBuilder.skuIds(skuIds);
        return this;
    }

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/c5aff92b-99d9-48cc-95ab-bb4a46c986d2_2068_418.png" target="_blank">组合装款式编码</a></div>
     */
    public JstQueryCombineSkuSpec iIds(java.util.List<String> iIds) {
        requestBuilder.iIds(iIds);
        return this;
    }

    /**
     * 自定义返回参数数组，传入传入想要获取的返回参数中的字段名称
     */
    public JstQueryCombineSkuSpec combineItemskuFlds(java.util.List<String> combineItemskuFlds) {
        requestBuilder.combineItemskuFlds(combineItemskuFlds);
        return this;
    }

    public JstQueryCombineSkuResponse response() {
        return this.client.queryCombineSku(requestBuilder.build());
    }
}
