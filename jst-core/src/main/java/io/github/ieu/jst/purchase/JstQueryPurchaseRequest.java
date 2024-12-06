package io.github.ieu.jst.purchase;

@lombok.Data
@lombok.Builder
public class JstQueryPurchaseRequest {

    /**
     * 第几页，从1开始
     */
    private Integer pageIndex;

    /**
     * 默认30，最大不超过50
     */
    private Integer pageSize;

    /**
     * 修改起始时间，和结束时间必须同时存在，时间间隔不能超过七天，与外部单号不能同时为空
     */
    private String modifiedBegin;

    /**
     * 修改结束时间，和起始时间必须同时存在，时间间隔不能超过七天，与外部单号不能同时为空
     */
    private String modifiedEnd;

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/1a51bc04-9095-47ae-aecc-5041d275a10b_1572_472.png" target="_blank">外部单号</a></div>对应采购单管理页面外部单号(且对应采购单上传的external_id)，和时间段不能同时为空
     */
    private java.util.List<String> soIds;

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/a2f83d6e-596b-42d2-8603-9b1b70c591dc_1567_459.png" target="_blank">采购单号</a></div>与时间查询条件不能同时为空
     */
    private java.util.List<String> poIds;

    /**
     * 是否返回运营云仓信息
     */
    private String isLock;
}
