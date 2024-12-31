package io.github.ieu.jst.wms;

public class JstQueryInOutItemSkusnsSpec {

    private final JstWmsClient client;

    private final JstQueryInOutItemSkusnsRequest.JstQueryInOutItemSkusnsRequestBuilder requestBuilder = JstQueryInOutItemSkusnsRequest.builder();

    public JstQueryInOutItemSkusnsSpec(JstWmsClient client) {
        this.client = client;
    }

    /**
     * 指定查询的仓储方
     */
    public JstQueryInOutItemSkusnsSpec wmsCoId(Integer wmsCoId) {
        requestBuilder.wmsCoId(wmsCoId);
        return this;
    }

    /**
     * 页码，从1开始
     */
    public JstQueryInOutItemSkusnsSpec pageIndex(Integer pageIndex) {
        requestBuilder.pageIndex(pageIndex);
        return this;
    }

    /**
     * 每页查询条数，默认1000，最大1000
     */
    public JstQueryInOutItemSkusnsSpec pageSize(Integer pageSize) {
        requestBuilder.pageSize(pageSize);
        return this;
    }

    /**
     * 进出仓单号数组
     */
    public JstQueryInOutItemSkusnsSpec ioIds(java.util.List<Integer> ioIds) {
        requestBuilder.ioIds(ioIds);
        return this;
    }

    /**
     * 内部订单号数组
     */
    public JstQueryInOutItemSkusnsSpec oIds(java.util.List<Integer> oIds) {
        requestBuilder.oIds(oIds);
        return this;
    }

    /**
     * 唯一码数组
     */
    public JstQueryInOutItemSkusnsSpec skuSns(java.util.List<String> skuSns) {
        requestBuilder.skuSns(skuSns);
        return this;
    }

    /**
     * 创建开始时间，io_ids、o_Ids、sku_sns有值时，时间不限，可不填，否则最多查30天
     */
    public JstQueryInOutItemSkusnsSpec createTimeStart(String createTimeStart) {
        requestBuilder.createTimeStart(createTimeStart);
        return this;
    }

    /**
     * 创建结束时间
     */
    public JstQueryInOutItemSkusnsSpec createTimeEnd(String createTimeEnd) {
        requestBuilder.createTimeEnd(createTimeEnd);
        return this;
    }

    public JstQueryInOutItemSkusnsResponse response() {
        return this.client.queryInOutItemSkusns(requestBuilder.build());
    }
}
