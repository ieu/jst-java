package io.github.ieu.jst.stockin;

@lombok.Data
@lombok.Builder
public class JstQueryPurchaseInRequest {

    /**
     * 第几页，从1开始
     */
    private Integer pageIndex;

    /**
     * 默认30，最大不超过50
     */
    private Integer pageSize;

    /**
     * 修改起始时间,起始时间和结束时间必须同时存在，时间间隔不能超过七天，与采购单号不能同时为空
     */
    private String modifiedBegin;

    /**
     * 修改起始时间,起始时间和结束时间必须同时存在，时间间隔不能超过七天，与采购单号不能同时为空
     */
    private String modifiedEnd;

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/82a8fe9f-44e2-42f3-ab36-4981c811a3b5_1596_411.png" target="_blank">采购单号</a> </div>列表，与修改时间不能同时为空.采购单号最大不能超过30条
     */
    private java.util.List<String> poIds;

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/b3020a08-adc9-4c03-bb19-420ac168a8de_1643_249.png" target="_blank">采购入库单号</a></div>列表，与修改时间不能同时为空.采购入库单号最大不能超过30条
     */
    private java.util.List<Number> ioIds;

    /**
     * 采购单状态;不填写默认查询已入库状态(WaitConfirm待入库;Confirmed已入库;Cancelled取消；Delete作废；Archive 归档；OuterConfirming 外部确认中)
     */
    private java.util.List<String> statuss;

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/e3a0f8c6-30a1-4183-b5a9-86ae60e4a23f_1590_231.png" target="_blank">线上单号</a> </div>与修改时间不能同时为空
     */
    private java.util.List<String> soIds;

    /**
     * 时间戳，sql server中的行版本号，该字段查询防止分页过程中漏单,如果使用时间戳查询只需要跟分页条件共用 其它条件都不传
     */
    private Integer startTs;

    /**
     * 是否查询总条数默认true，如果使用start_ts查询，该值传false否则影响查询效率
     */
    private Boolean isGetTotal;

    /**
     * 0:修改时间，modified。 2:入库时间 io_date，未传入时默认为0
     */
    private Number dateType;
}
