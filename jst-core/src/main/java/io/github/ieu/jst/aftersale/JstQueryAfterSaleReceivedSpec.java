package io.github.ieu.jst.aftersale;

public class JstQueryAfterSaleReceivedSpec {

    private final JstAfterSaleClient client;

    private final JstQueryAfterSaleReceivedRequest.JstQueryAfterSaleReceivedRequestBuilder requestBuilder = JstQueryAfterSaleReceivedRequest.builder();

    public JstQueryAfterSaleReceivedSpec(JstAfterSaleClient client) {
        this.client = client;
    }

    /**
     * 默认30，最大不超过50
     */
    public JstQueryAfterSaleReceivedSpec pageSize(Integer pageSize) {
        requestBuilder.pageSize(pageSize);
        return this;
    }

    /**
     * 修改开始时间,开始时间和结束时间必须同时存在，时间间隔不能超过七天
     */
    public JstQueryAfterSaleReceivedSpec modifiedBegin(String modifiedBegin) {
        requestBuilder.modifiedBegin(modifiedBegin);
        return this;
    }

    /**
     * 修改结束时间,开始时间和结束时间必须同时存在，时间间隔不能超过七天
     */
    public JstQueryAfterSaleReceivedSpec modifiedEnd(String modifiedEnd) {
        requestBuilder.modifiedEnd(modifiedEnd);
        return this;
    }

    /**
     * 外部订单号列表
     */
    public JstQueryAfterSaleReceivedSpec soIds(java.util.List<String> soIds) {
        requestBuilder.soIds(soIds);
        return this;
    }

    /**
     * 时间戳
     */
    public JstQueryAfterSaleReceivedSpec startTs(Integer startTs) {
        requestBuilder.startTs(startTs);
        return this;
    }

    /**
     * ERP内部订单号，唯一
     */
    public JstQueryAfterSaleReceivedSpec oIds(java.util.List<String> oIds) {
        requestBuilder.oIds(oIds);
        return this;
    }

    /**
     * 第几页，从1开始
     */
    public JstQueryAfterSaleReceivedSpec pageIndex(Integer pageIndex) {
        requestBuilder.pageIndex(pageIndex);
        return this;
    }

    /**
     * 退货店铺
     */
    public JstQueryAfterSaleReceivedSpec shopId(String shopId) {
        requestBuilder.shopId(shopId);
        return this;
    }

    /**
     * 日期类型，0:修改时间，1:创建日期，2:订单日期，4:实际出/入库时间
     */
    public JstQueryAfterSaleReceivedSpec dateType(Integer dateType) {
        requestBuilder.dateType(dateType);
        return this;
    }

    /**
     * 售后单号列表,最大50
     */
    public JstQueryAfterSaleReceivedSpec asIds(java.util.List<Integer> asIds) {
        requestBuilder.asIds(asIds);
        return this;
    }

    /**
     * 退仓单号列表,最大50
     */
    public JstQueryAfterSaleReceivedSpec ioIds(java.util.List<Integer> ioIds) {
        requestBuilder.ioIds(ioIds);
        return this;
    }

    public JstQueryAfterSaleReceivedResponse response() {
        return this.client.queryAfterSaleReceived(requestBuilder.build());
    }
}
