package io.github.ieu.jst.purchase;

@lombok.Data
@lombok.Builder
public class JstQueryManufactureRequest {

    /**
     * 第几页，从1开始
     */
    private Integer pageIndex;

    /**
     * 每页多少条，默认20条，最大100条
     */
    private Integer pageSize;

    /**
     * 起始时间，和结束时间必须同时存在，时间间隔不能超过七天
     */
    private String startTime;

    /**
     * 结束时间，和起始时间必须同时存在，时间间隔不能超过七天
     */
    private String endTime;

    /**
     * 默认0；0=修改时间，1=创建时间，2=加工日期
     */
    private Integer dateType;

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/f19f6400-d415-4d07-ad45-868a4d32ea19_1631_224.png">外部单号</a></div>列表，最大20，和开始时间，结束时间不能同时为空
     */
    private java.util.List<String> soIds;

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/2b7a85f3-ffa3-49bf-97f2-26ca65584d0b_1296_226.png">加工单号</a></div>列表，最大20，和开始时间，结束时间不能同时为空
     */
    private java.util.List<String> moIds;

    /**
     * 状态:Creating:草拟,WaitConfirm:待审核,Confirmed:已确认,Finished:完成,Cancelled:作废，和开始时间，结束时间不能同时为空
     */
    private java.util.List<String> statuslist;
}
