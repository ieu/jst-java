package io.github.ieu.jst.otherstocking;

public class JstQueryOtherInOutSpec {

    private final JstOtherStockingClient client;

    private final JstQueryOtherInOutRequest.JstQueryOtherInOutRequestBuilder requestBuilder = JstQueryOtherInOutRequest.builder();

    public JstQueryOtherInOutSpec(JstOtherStockingClient client) {
        this.client = client;
    }

    /**
     * 修改起始时间，和结束时间必须同时存在，时间间隔不能超过七天，与线上单号不能同时为空
     */
    public JstQueryOtherInOutSpec modifiedBegin(String modifiedBegin) {
        requestBuilder.modifiedBegin(modifiedBegin);
        return this;
    }

    /**
     * 修改结束时间，和起始时间必须同时存在，时间间隔不能超过七天，与线上单号不能同时为空
     */
    public JstQueryOtherInOutSpec modifiedEnd(String modifiedEnd) {
        requestBuilder.modifiedEnd(modifiedEnd);
        return this;
    }

    /**
     * 指定线上订单号，和时间段不能同时为空，，最多50个
     */
    public JstQueryOtherInOutSpec soIds(java.util.List<String> soIds) {
        requestBuilder.soIds(soIds);
        return this;
    }

    /**
     * 单据类型:其它退货,其它出库,其它进仓
     */
    public JstQueryOtherInOutSpec types(java.util.List<String> types) {
        requestBuilder.types(types);
        return this;
    }

    /**
     * 单据状态，Confirmed生效，WaitConfirm待审核，OuterConfirming外部确认中，Cancelled取消（单据生效后的作废），Delete作废（单据生效前的作废）
     */
    public JstQueryOtherInOutSpec status(String status) {
        requestBuilder.status(status);
        return this;
    }

    /**
     * 第几页，从第一页开始，默认1
     */
    public JstQueryOtherInOutSpec pageIndex(Integer pageIndex) {
        requestBuilder.pageIndex(pageIndex);
        return this;
    }

    /**
     * 每页多少条，默认30，最大50
     */
    public JstQueryOtherInOutSpec pageSize(Integer pageSize) {
        requestBuilder.pageSize(pageSize);
        return this;
    }

    /**
     * 分仓编号
     */
    public JstQueryOtherInOutSpec wmsCoId(Integer wmsCoId) {
        requestBuilder.wmsCoId(wmsCoId);
        return this;
    }

    /**
     * 出仓单号列表，最多50个
     */
    public JstQueryOtherInOutSpec ioIds(java.util.List<String> ioIds) {
        requestBuilder.ioIds(ioIds);
        return this;
    }

    /**
     * 0:修改时间，modified。 2:出入库时间 io_date，未传入时默认为0
     */
    public JstQueryOtherInOutSpec dateType(Number dateType) {
        requestBuilder.dateType(dateType);
        return this;
    }

    /**
     * 时间戳，sql server中的行版本号，该字段查询防止分页过程中漏单,如果使用时间戳查询只需要跟分页条件共用 其它条件都不传
     */
    public JstQueryOtherInOutSpec startTs(Integer startTs) {
        requestBuilder.startTs(startTs);
        return this;
    }

    public JstQueryOtherInOutResponse response() {
        return this.client.queryOtherInOut(requestBuilder.build());
    }
}
