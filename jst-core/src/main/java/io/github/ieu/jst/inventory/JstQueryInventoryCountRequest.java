package io.github.ieu.jst.inventory;

@lombok.Data
@lombok.Builder
public class JstQueryInventoryCountRequest {

    /**
     * 第几页，从第一页开始，默认1
     */
    private Integer pageIndex;

    /**
     * 每页多少条，默认30，最大50
     */
    private Integer pageSize;

    /**
     * 修改起始时间，和结束时间必须同时存在，时间间隔不能超过七天，与盘点单号不能同时为空
     */
    private String modifiedBegin;

    /**
     * 修改结束时间，和起始时间必须同时存在，时间间隔不能超过七天，与盘点单号不能同时为空
     */
    private String modifiedEnd;

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/46b7101a-aa42-4302-9d97-b91ecb68c01c_1614_415.png" target="_blank">指定盘点单号</a></div>多个用逗号分隔，最多50，和时间段不能同时为空
     */
    private String ioIds;

    /**
     * 状态;WaitConfirm:待确认,Confirmed:生效,Archive:归档,Cancelled:取消,Delete:作废
     */
    private String status;
}
