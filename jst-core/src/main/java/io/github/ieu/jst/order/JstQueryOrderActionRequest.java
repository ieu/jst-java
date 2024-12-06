package io.github.ieu.jst.order;

@lombok.Data
@lombok.Builder
public class JstQueryOrderActionRequest {

    /**
     * 日志结束时间,起始时间和结束时间必须同时存在，时间间隔不能超过1天
     */
    private String modifiedEnd;

    /**
     * 第几页，从1开始
     */
    private Integer pageIndex;

    /**
     * 默认50，最大不超过500
     */
    private Integer pageSize;

    /**
     * 日志起始时间,起始时间和结束时间必须同时存在，时间间隔不能超过1天
     */
    private String modifiedBegin;

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/deab32f3-191d-43c8-b213-343bb82070e1_2161_433.png" target="_blank">内部订单号</a></div>
     */
    private Integer oId;

    /**
     * 操作类型（对应返回数据中的name进行筛选）
     */
    private String actionName;
}
