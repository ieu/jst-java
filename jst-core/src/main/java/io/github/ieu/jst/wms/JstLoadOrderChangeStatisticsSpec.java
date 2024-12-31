package io.github.ieu.jst.wms;

public class JstLoadOrderChangeStatisticsSpec {

    private final JstWmsClient client;

    private final JstLoadOrderChangeStatisticsRequest.JstLoadOrderChangeStatisticsRequestBuilder requestBuilder = JstLoadOrderChangeStatisticsRequest.builder();

    public JstLoadOrderChangeStatisticsSpec(JstWmsClient client) {
        this.client = client;
    }

    /**
     * 开始时间
     */
    public JstLoadOrderChangeStatisticsSpec startTime(String startTime) {
        requestBuilder.startTime(startTime);
        return this;
    }

    /**
     * 结束时间
     */
    public JstLoadOrderChangeStatisticsSpec endTime(String endTime) {
        requestBuilder.endTime(endTime);
        return this;
    }

    /**
     * 分仓id
     */
    public JstLoadOrderChangeStatisticsSpec wmsCoIds(java.util.List<Number> wmsCoIds) {
        requestBuilder.wmsCoIds(wmsCoIds);
        return this;
    }

    /**
     * 商品编码
     */
    public JstLoadOrderChangeStatisticsSpec srcSkuIds(java.util.List<String> srcSkuIds) {
        requestBuilder.srcSkuIds(srcSkuIds);
        return this;
    }

    /**
     * 商品款号
     */
    public JstLoadOrderChangeStatisticsSpec srcLIds(java.util.List<String> srcLIds) {
        requestBuilder.srcLIds(srcLIds);
        return this;
    }

    /**
     * 供应商id
     */
    public JstLoadOrderChangeStatisticsSpec supplierIds(java.util.List<Number> supplierIds) {
        requestBuilder.supplierIds(supplierIds);
        return this;
    }

    /**
     * 计算方式 0新订单 1重复计算
     */
    public JstLoadOrderChangeStatisticsSpec sourceType(java.util.List<Number> sourceType) {
        requestBuilder.sourceType(sourceType);
        return this;
    }

    /**
     * 当前页默认1
     */
    public JstLoadOrderChangeStatisticsSpec pageIndex(Number pageIndex) {
        requestBuilder.pageIndex(pageIndex);
        return this;
    }

    /**
     * 页大小，默认50最大500
     */
    public JstLoadOrderChangeStatisticsSpec pageSize(Number pageSize) {
        requestBuilder.pageSize(pageSize);
        return this;
    }

    public JstLoadOrderChangeStatisticsResponse response() {
        return this.client.loadOrderChangeStatistics(requestBuilder.build());
    }
}
