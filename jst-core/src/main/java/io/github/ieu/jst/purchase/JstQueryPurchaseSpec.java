package io.github.ieu.jst.purchase;

public class JstQueryPurchaseSpec {

    private final JstPurchaseClient client;

    private final JstQueryPurchaseRequest.JstQueryPurchaseRequestBuilder requestBuilder = JstQueryPurchaseRequest.builder();

    public JstQueryPurchaseSpec(JstPurchaseClient client) {
        this.client = client;
    }

    /**
     * 第几页，从1开始
     */
    public JstQueryPurchaseSpec pageIndex(Integer pageIndex) {
        requestBuilder.pageIndex(pageIndex);
        return this;
    }

    /**
     * 默认30，最大不超过50
     */
    public JstQueryPurchaseSpec pageSize(Integer pageSize) {
        requestBuilder.pageSize(pageSize);
        return this;
    }

    /**
     * 修改起始时间，和结束时间必须同时存在，时间间隔不能超过七天，与外部单号不能同时为空
     */
    public JstQueryPurchaseSpec modifiedBegin(String modifiedBegin) {
        requestBuilder.modifiedBegin(modifiedBegin);
        return this;
    }

    /**
     * 修改结束时间，和起始时间必须同时存在，时间间隔不能超过七天，与外部单号不能同时为空
     */
    public JstQueryPurchaseSpec modifiedEnd(String modifiedEnd) {
        requestBuilder.modifiedEnd(modifiedEnd);
        return this;
    }

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/1a51bc04-9095-47ae-aecc-5041d275a10b_1572_472.png" target="_blank">外部单号</a></div>对应采购单管理页面外部单号(且对应采购单上传的external_id)，和时间段不能同时为空
     */
    public JstQueryPurchaseSpec soIds(java.util.List<String> soIds) {
        requestBuilder.soIds(soIds);
        return this;
    }

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/a2f83d6e-596b-42d2-8603-9b1b70c591dc_1567_459.png" target="_blank">采购单号</a></div>与时间查询条件不能同时为空
     */
    public JstQueryPurchaseSpec poIds(java.util.List<String> poIds) {
        requestBuilder.poIds(poIds);
        return this;
    }

    /**
     * 是否返回运营云仓信息
     */
    public JstQueryPurchaseSpec isLock(String isLock) {
        requestBuilder.isLock(isLock);
        return this;
    }

    public JstQueryPurchaseResponse response() {
        return this.client.queryPurchase(requestBuilder.build());
    }
}
