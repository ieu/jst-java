package io.github.ieu.jst.item;

public class JstQuerySkuSpec {

    private final JstItemClient client;

    private final JstQuerySkuRequest.JstQuerySkuRequestBuilder requestBuilder = JstQuerySkuRequest.builder();

    public JstQuerySkuSpec(JstItemClient client) {
        this.client = client;
    }

    /**
     * 第几页，从第一页开始，默认1
     */
    public JstQuerySkuSpec pageIndex(Integer pageIndex) {
        requestBuilder.pageIndex(pageIndex);
        return this;
    }

    /**
     * 每页多少条，默认30，最大50
     */
    public JstQuerySkuSpec pageSize(Integer pageSize) {
        requestBuilder.pageSize(pageSize);
        return this;
    }

    /**
     * 修改起始时间，和结束时间必须同时存在，时间间隔不能超过七天，与商品编码不能同时为空；一次请求最大时间范围7天（需要获取全部数据循环多次获取，尽量缩小时间查询范围为一小时，时间范围越小性能越高）
     */
    public JstQuerySkuSpec modifiedBegin(String modifiedBegin) {
        requestBuilder.modifiedBegin(modifiedBegin);
        return this;
    }

    /**
     * 修改结束时间，和起始时间必须同时存在，时间间隔不能超过七天，与商品编码不能同时为空
     */
    public JstQuerySkuSpec modifiedEnd(String modifiedEnd) {
        requestBuilder.modifiedEnd(modifiedEnd);
        return this;
    }

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/ea2950e9-248e-494b-bb6a-68ac71140602_1822_674.png" target="_blank">商品编码</a></div>与修改时间不能同时为空，最多20
     */
    public JstQuerySkuSpec skuIds(String skuIds) {
        requestBuilder.skuIds(skuIds);
        return this;
    }

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/e5046b96-a4ad-44a7-95ff-d492d321b8c1_2195_491.png" target="_blank">商品名称</a></div>与修改时间不能同时为空，仅支持传一个名称（精确搜索）
     */
    public JstQuerySkuSpec exactlyName(String exactlyName) {
        requestBuilder.exactlyName(exactlyName);
        return this;
    }

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/e5046b96-a4ad-44a7-95ff-d492d321b8c1_2195_491.png" target="_blank">商品名称</a></div>与修改时间不能同时为空，仅支持传一个名称（模糊查询）
     */
    public JstQuerySkuSpec name(String name) {
        requestBuilder.name(name);
        return this;
    }

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/5c9139b0-d0b1-404c-a55b-260fef4e4054_2254_763.png" target="_blank">款式编码</a></div>
     */
    public JstQuerySkuSpec iIds(java.util.List<String> iIds) {
        requestBuilder.iIds(iIds);
        return this;
    }

    /**
     * 可传created,modified。默认按照modified查询
     */
    public JstQuerySkuSpec dateField(String dateField) {
        requestBuilder.dateField(dateField);
        return this;
    }

    /**
     * 可传：purchase_price  采购价，多个字段用逗号分开（自定义查询字段）
     */
    public JstQuerySkuSpec flds(String flds) {
        requestBuilder.flds(flds);
        return this;
    }

    /**
     * 辅助码，与修改时间不能同时为空
     */
    public JstQuerySkuSpec skuCodes(String skuCodes) {
        requestBuilder.skuCodes(skuCodes);
        return this;
    }

    public JstQuerySkuResponse response() {
        return this.client.querySku(requestBuilder.build());
    }
}
