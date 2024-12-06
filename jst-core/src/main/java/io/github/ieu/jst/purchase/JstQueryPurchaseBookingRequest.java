package io.github.ieu.jst.purchase;

@lombok.Data
@lombok.Builder
public class JstQueryPurchaseBookingRequest {

    /**
     * 修改起始时间，和结束时间必须同时存在，时间间隔不能超过七天
     */
    private String startTime;

    /**
     * 修改结束时间，和起始时间必须同时存在，时间间隔不能超过七天
     */
    private String endTime;

    /**
     * 第几页，从1 开始
     */
    private Integer pageIndex;

    /**
     * 每页多少条，最大100条
     */
    private Integer pageSize;
}
