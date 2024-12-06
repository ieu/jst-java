package io.github.ieu.jst.stockout;

@lombok.Data
@lombok.Builder
public class JstQueryPurchaseOutRequest {

    /**
     * 第几页，从第一页开始，默认1
     */
    private Integer pageIndex;

    /**
     * 每页多少条，默认30，最大50
     */
    private Integer pageSize;

    /**
     * 起始时间，和结束时间必须同时存在，时间间隔不能超过七天，与线上单号不能同时为空
     */
    private String modifiedBegin;

    /**
     * 结束时间，和起始时间必须同时存在，时间间隔不能超过七天，与线上单号不能同时为空
     */
    private String modifiedEnd;

    /**
     * 指定线上订单号，和时间段不能同时为空
     */
    private java.util.List<String> soIds;

    /**
     * 单据状态，Confirmed=生效，WaitConfirm待审核，Creating=草拟，Archive=归档，Cancelled=作废，Confirming 已确认
     */
    private String status;

    /**
     * 采购退货单号列表,最大30
     */
    private java.util.List<String> ioIds;

    /**
     * 0:修改时间，modified。 2:出库时间 io_date，未传入时默认为0
     */
    private Number dateType;
}
