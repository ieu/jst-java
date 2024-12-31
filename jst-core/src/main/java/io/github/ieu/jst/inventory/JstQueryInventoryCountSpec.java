package io.github.ieu.jst.inventory;

public class JstQueryInventoryCountSpec {

    private final JstInventoryClient client;

    private final JstQueryInventoryCountRequest.JstQueryInventoryCountRequestBuilder requestBuilder = JstQueryInventoryCountRequest.builder();

    public JstQueryInventoryCountSpec(JstInventoryClient client) {
        this.client = client;
    }

    /**
     * 第几页，从第一页开始，默认1
     */
    public JstQueryInventoryCountSpec pageIndex(Integer pageIndex) {
        requestBuilder.pageIndex(pageIndex);
        return this;
    }

    /**
     * 每页多少条，默认30，最大50
     */
    public JstQueryInventoryCountSpec pageSize(Integer pageSize) {
        requestBuilder.pageSize(pageSize);
        return this;
    }

    /**
     * 修改起始时间，和结束时间必须同时存在，时间间隔不能超过七天，与盘点单号不能同时为空
     */
    public JstQueryInventoryCountSpec modifiedBegin(String modifiedBegin) {
        requestBuilder.modifiedBegin(modifiedBegin);
        return this;
    }

    /**
     * 修改结束时间，和起始时间必须同时存在，时间间隔不能超过七天，与盘点单号不能同时为空
     */
    public JstQueryInventoryCountSpec modifiedEnd(String modifiedEnd) {
        requestBuilder.modifiedEnd(modifiedEnd);
        return this;
    }

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/46b7101a-aa42-4302-9d97-b91ecb68c01c_1614_415.png" target="_blank">指定盘点单号</a></div>多个用逗号分隔，最多50，和时间段不能同时为空
     */
    public JstQueryInventoryCountSpec ioIds(String ioIds) {
        requestBuilder.ioIds(ioIds);
        return this;
    }

    /**
     * 状态;WaitConfirm:待确认,Confirmed:生效,Archive:归档,Cancelled:取消,Delete:作废
     */
    public JstQueryInventoryCountSpec status(String status) {
        requestBuilder.status(status);
        return this;
    }

    public JstQueryInventoryCountResponse response() {
        return this.client.queryInventoryCount(requestBuilder.build());
    }
}
