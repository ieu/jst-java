package io.github.ieu.jst.purchase;

public class JstQueryManufactureSpec {

    private final JstPurchaseClient client;

    private final JstQueryManufactureRequest.JstQueryManufactureRequestBuilder requestBuilder = JstQueryManufactureRequest.builder();

    public JstQueryManufactureSpec(JstPurchaseClient client) {
        this.client = client;
    }


    /**
     * 第几页，从1开始
     */
    public JstQueryManufactureSpec pageIndex(Integer pageIndex) {
        requestBuilder.pageIndex(pageIndex);
        return this;
    }

    /**
     * 每页多少条，默认20条，最大100条
     */
    public JstQueryManufactureSpec pageSize(Integer pageSize) {
        requestBuilder.pageSize(pageSize);
        return this;
    }

    /**
     * 起始时间，和结束时间必须同时存在，时间间隔不能超过七天
     */
    public JstQueryManufactureSpec startTime(String startTime) {
        requestBuilder.startTime(startTime);
        return this;
    }

    /**
     * 结束时间，和起始时间必须同时存在，时间间隔不能超过七天
     */
    public JstQueryManufactureSpec endTime(String endTime) {
        requestBuilder.endTime(endTime);
        return this;
    }

    /**
     * 默认0；0=修改时间，1=创建时间，2=加工日期
     */
    public JstQueryManufactureSpec dateType(Integer dateType) {
        requestBuilder.dateType(dateType);
        return this;
    }

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/f19f6400-d415-4d07-ad45-868a4d32ea19_1631_224.png">外部单号</a></div>列表，最大20，和开始时间，结束时间不能同时为空
     */
    public JstQueryManufactureSpec soIds(java.util.List<String> soIds) {
        requestBuilder.soIds(soIds);
        return this;
    }

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/2b7a85f3-ffa3-49bf-97f2-26ca65584d0b_1296_226.png">加工单号</a></div>列表，最大20，和开始时间，结束时间不能同时为空
     */
    public JstQueryManufactureSpec moIds(java.util.List<String> moIds) {
        requestBuilder.moIds(moIds);
        return this;
    }

    /**
     * 状态:Creating:草拟,WaitConfirm:待审核,Confirmed:已确认,Finished:完成,Cancelled:作废，和开始时间，结束时间不能同时为空
     */
    public JstQueryManufactureSpec statusList(java.util.List<String> statusList) {
        requestBuilder.statusList(statusList);
        return this;
    }

    public JstQueryManufactureResponse response() {
        return this.client.queryManufacture(requestBuilder.build());
    }
}
