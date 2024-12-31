package io.github.ieu.jst.stockout;

public class JstQueryPurchaseOutSpec {

    private final JstStockOutClient client;

    private final JstQueryPurchaseOutRequest.JstQueryPurchaseOutRequestBuilder requestBuilder = JstQueryPurchaseOutRequest.builder();

    public JstQueryPurchaseOutSpec(JstStockOutClient client) {
        this.client = client;
    }

    /**
     * 第几页，从第一页开始，默认1
     */
    public JstQueryPurchaseOutSpec pageIndex(Integer pageIndex) {
        requestBuilder.pageIndex(pageIndex);
        return this;
    }

    /**
     * 每页多少条，默认30，最大50
     */
    public JstQueryPurchaseOutSpec pageSize(Integer pageSize) {
        requestBuilder.pageSize(pageSize);
        return this;
    }

    /**
     * 起始时间，和结束时间必须同时存在，时间间隔不能超过七天，与线上单号不能同时为空
     */
    public JstQueryPurchaseOutSpec modifiedBegin(String modifiedBegin) {
        requestBuilder.modifiedBegin(modifiedBegin);
        return this;
    }

    /**
     * 结束时间，和起始时间必须同时存在，时间间隔不能超过七天，与线上单号不能同时为空
     */
    public JstQueryPurchaseOutSpec modifiedEnd(String modifiedEnd) {
        requestBuilder.modifiedEnd(modifiedEnd);
        return this;
    }

    /**
     * 指定线上订单号，和时间段不能同时为空
     */
    public JstQueryPurchaseOutSpec soIds(java.util.List<String> soIds) {
        requestBuilder.soIds(soIds);
        return this;
    }

    /**
     * 单据状态，Confirmed=生效，WaitConfirm待审核，Creating=草拟，Archive=归档，Cancelled=作废，Confirming 已确认
     */
    public JstQueryPurchaseOutSpec status(String status) {
        requestBuilder.status(status);
        return this;
    }

    /**
     * 采购退货单号列表,最大30
     */
    public JstQueryPurchaseOutSpec ioIds(java.util.List<String> ioIds) {
        requestBuilder.ioIds(ioIds);
        return this;
    }

    /**
     * 0:修改时间，modified。 2:出库时间 io_date，未传入时默认为0
     */
    public JstQueryPurchaseOutSpec dateType(Number dateType) {
        requestBuilder.dateType(dateType);
        return this;
    }

    public JstQueryPurchaseOutResponse response() {
        return this.client.queryPurchaseOut(requestBuilder.build());
    }
}
