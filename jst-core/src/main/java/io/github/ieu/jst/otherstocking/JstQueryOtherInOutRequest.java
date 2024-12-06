package io.github.ieu.jst.otherstocking;

@lombok.Data
@lombok.Builder
public class JstQueryOtherInOutRequest {

    /**
     * 修改起始时间，和结束时间必须同时存在，时间间隔不能超过七天，与线上单号不能同时为空
     */
    private String modifiedBegin;

    /**
     * 修改结束时间，和起始时间必须同时存在，时间间隔不能超过七天，与线上单号不能同时为空
     */
    private String modifiedEnd;

    /**
     * 指定线上订单号，和时间段不能同时为空，，最多50个
     */
    private java.util.List<String> soIds;

    /**
     * 单据类型:其它退货,其它出库,其它进仓
     */
    private java.util.List<String> types;

    /**
     * 单据状态，Confirmed生效，WaitConfirm待审核，OuterConfirming外部确认中，Cancelled取消（单据生效后的作废），Delete作废（单据生效前的作废）
     */
    private String status;

    /**
     * 第几页，从第一页开始，默认1
     */
    private Integer pageIndex;

    /**
     * 每页多少条，默认30，最大50
     */
    private Integer pageSize;

    /**
     * 分仓编号
     */
    private Integer wmsCoId;

    /**
     * 出仓单号列表，最多50个
     */
    private java.util.List<String> ioIds;

    /**
     * 0:修改时间，modified。 2:出入库时间 io_date，未传入时默认为0
     */
    private Number dateType;

    /**
     * 时间戳，sql server中的行版本号，该字段查询防止分页过程中漏单,如果使用时间戳查询只需要跟分页条件共用 其它条件都不传
     */
    private Integer startTs;
}
