package io.github.ieu.jst.allocate;

@lombok.Data
@lombok.Builder
public class JstQueryAllocateRequest {

    /**
     * 修改起始时间，和结束时间必须同时存在，时间间隔不能超过七天，与线上单号不能同时为空
     */
    private String modifiedBegin;

    /**
     * 修改结束时间，和起始时间必须同时存在，时间间隔不能超过七天，与线上单号不能同时为空
     */
    private String modifiedEnd;

    /**
     * 指定线上订单号，和时间段不能同时为空
     */
    private java.util.List<String> soIds;

    /**
     * 第几页，从第一页开始，默认1
     */
    private Integer pageIndex;

    /**
     * 每页多少条，默认30，最大50
     */
    private Integer pageSize;

    /**
     * 调拨单号
     */
    private java.util.List<String> ioIds;

    /**
     * 调拨类型（调拨出，调拨入）
     */
    private String type;

    /**
     * 0:修改时间，modified。 2:出入库时间 io_date，未传入时默认为0
     */
    private Number dateType;
}
