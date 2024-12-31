package io.github.ieu.jst.item;

public class JstQueryMallItemSpec {

    private final JstItemClient client;

    private final JstQueryMallItemRequest.JstQueryMallItemRequestBuilder requestBuilder = JstQueryMallItemRequest.builder();

    public JstQueryMallItemSpec(JstItemClient client) {
        this.client = client;
    }

    /**
     * 修改起始时间，和结束时间必须同时存在，时间间隔不能超过七天，与款式编码不能同时为空
     */
    public JstQueryMallItemSpec modifiedBegin(String modifiedBegin) {
        requestBuilder.modifiedBegin(modifiedBegin);
        return this;
    }

    /**
     * 修改结束时间，和起始时间必须同时存在，时间间隔不能超过七天，与款式编码不能同时为空
     */
    public JstQueryMallItemSpec modifiedEnd(String modifiedEnd) {
        requestBuilder.modifiedEnd(modifiedEnd);
        return this;
    }

    /**
     * 是否只查询款式信息不返回商品明细
     */
    public JstQueryMallItemSpec onlyItem(Boolean onlyItem) {
        requestBuilder.onlyItem(onlyItem);
        return this;
    }

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/d88845e1-d58d-4b4f-be92-d009aa546bd4_1982_679.png" target="_blank">款式编码</a></div>与修改时间不能同时为空，最多20
     */
    public JstQueryMallItemSpec iIds(java.util.List<String> iIds) {
        requestBuilder.iIds(iIds);
        return this;
    }

    /**
     * 第几页，从第一页开始，默认1
     */
    public JstQueryMallItemSpec pageIndex(Integer pageIndex) {
        requestBuilder.pageIndex(pageIndex);
        return this;
    }

    /**
     * 每页多少条，默认30，最大50
     */
    public JstQueryMallItemSpec pageSize(Integer pageSize) {
        requestBuilder.pageSize(pageSize);
        return this;
    }

    /**
     * 查询款字段，用于查询指定需要的字段,传f_json可查询款式的多图
     */
    public JstQueryMallItemSpec itemFlds(java.util.List<String> itemFlds) {
        requestBuilder.itemFlds(itemFlds);
        return this;
    }

    /**
     * 查询商品字段，用于查询指定需要的字段
     */
    public JstQueryMallItemSpec itemskuFlds(java.util.List<String> itemskuFlds) {
        requestBuilder.itemskuFlds(itemskuFlds);
        return this;
    }

    /**
     * 可传created,modified。默认按照modified查询
     */
    public JstQueryMallItemSpec dateField(String dateField) {
        requestBuilder.dateField(dateField);
        return this;
    }

    public JstQueryMallItemResponse response() {
        return this.client.queryMallItem(requestBuilder.build());
    }
}
