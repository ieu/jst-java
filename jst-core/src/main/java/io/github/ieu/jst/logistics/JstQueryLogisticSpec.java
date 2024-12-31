package io.github.ieu.jst.logistics;

public class JstQueryLogisticSpec {

    private final JstLogisticsClient client;

    private final JstQueryLogisticRequest.JstQueryLogisticRequestBuilder requestBuilder = JstQueryLogisticRequest.builder();

    public JstQueryLogisticSpec(JstLogisticsClient client) {
        this.client = client;
    }

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/ccaa4f9d-b986-4c48-b2d2-1e8b20177658_2166_836.png" target="_blank">店铺编号</a></div>
     */
    public JstQueryLogisticSpec shopId(Integer shopId) {
        requestBuilder.shopId(shopId);
        return this;
    }

    /**
     * 第几页，从1开始
     */
    public JstQueryLogisticSpec pageIndex(Integer pageIndex) {
        requestBuilder.pageIndex(pageIndex);
        return this;
    }

    /**
     * 默认30，最大不超过50
     */
    public JstQueryLogisticSpec pageSize(Integer pageSize) {
        requestBuilder.pageSize(pageSize);
        return this;
    }

    /**
     * 修改起始时间，和结束时间必须同时存在，时间间隔不能超过七天
     */
    public JstQueryLogisticSpec modifiedBegin(String modifiedBegin) {
        requestBuilder.modifiedBegin(modifiedBegin);
        return this;
    }

    /**
     * 修改起始时间，和结束时间必须同时存在，时间间隔不能超过七天
     */
    public JstQueryLogisticSpec modifiedEnd(String modifiedEnd) {
        requestBuilder.modifiedEnd(modifiedEnd);
        return this;
    }

    /**
     * 日期类型，默认发货时间，0=修改时间，1=制单日期，2=订单日期，3=发货时间
     */
    public JstQueryLogisticSpec dateType(Integer dateType) {
        requestBuilder.dateType(dateType);
        return this;
    }

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/e457dae3-e441-4644-860e-e070d05929df_1924_284.png" target="_blank">平台订单编号</a></div>最多20（如果通过线上单号查询除时间条件外不受其它查询条件限制）
     */
    public JstQueryLogisticSpec soIds(java.util.List<String> soIds) {
        requestBuilder.soIds(soIds);
        return this;
    }

    public JstQueryLogisticResponse response() {
        return this.client.queryLogistic(requestBuilder.build());
    }
}
