package io.github.ieu.jst.order;

public class JstQueryOrderActionSpec {

    private final JstOrderClient client;

    private final JstQueryOrderActionRequest.JstQueryOrderActionRequestBuilder requestBuilder = JstQueryOrderActionRequest.builder();

    public JstQueryOrderActionSpec(JstOrderClient client) {
        this.client = client;
    }

    /**
     * 日志结束时间,起始时间和结束时间必须同时存在，时间间隔不能超过1天
     */
    public JstQueryOrderActionSpec modifiedEnd(String modifiedEnd) {
        requestBuilder.modifiedEnd(modifiedEnd);
        return this;
    }

    /**
     * 第几页，从1开始
     */
    public JstQueryOrderActionSpec pageIndex(Integer pageIndex) {
        requestBuilder.pageIndex(pageIndex);
        return this;
    }

    /**
     * 默认50，最大不超过500
     */
    public JstQueryOrderActionSpec pageSize(Integer pageSize) {
        requestBuilder.pageSize(pageSize);
        return this;
    }

    /**
     * 日志起始时间,起始时间和结束时间必须同时存在，时间间隔不能超过1天
     */
    public JstQueryOrderActionSpec modifiedBegin(String modifiedBegin) {
        requestBuilder.modifiedBegin(modifiedBegin);
        return this;
    }

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/deab32f3-191d-43c8-b213-343bb82070e1_2161_433.png" target="_blank">内部订单号</a></div>
     */
    public JstQueryOrderActionSpec oId(Integer oId) {
        requestBuilder.oId(oId);
        return this;
    }

    /**
     * 操作类型（对应返回数据中的name进行筛选）
     */
    public JstQueryOrderActionSpec actionName(String actionName) {
        requestBuilder.actionName(actionName);
        return this;
    }

    public JstQueryOrderActionResponse response() {
        return this.client.queryOrderAction(requestBuilder.build());
    }
}
