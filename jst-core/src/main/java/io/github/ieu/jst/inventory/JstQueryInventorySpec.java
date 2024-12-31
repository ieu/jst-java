package io.github.ieu.jst.inventory;

public class JstQueryInventorySpec {

    private final JstInventoryClient client;

    private final JstQueryInventoryRequest.JstQueryInventoryRequestBuilder requestBuilder = JstQueryInventoryRequest.builder();

    public JstQueryInventorySpec(JstInventoryClient client) {
        this.client = client;
    }

    /**
     * 分仓公司编号，值不传或为0查询所有仓的总库存，传值为指定仓的库存即为库存查询（分仓）界面的数据；编号查询：https://openweb.jushuitan.com/dev-doc?docType=1&docId=3
     */
    public JstQueryInventorySpec wmsCoId(Integer wmsCoId) {
        requestBuilder.wmsCoId(wmsCoId);
        return this;
    }

    /**
     * 第几页，从1开始
     */
    public JstQueryInventorySpec pageIndex(Integer pageIndex) {
        requestBuilder.pageIndex(pageIndex);
        return this;
    }

    /**
     * 默认30，最大不超过100
     */
    public JstQueryInventorySpec pageSize(Integer pageSize) {
        requestBuilder.pageSize(pageSize);
        return this;
    }

    /**
     * 修改起始时间，和结束时间必须同时存在，时间间隔不能超过七天
     */
    public JstQueryInventorySpec modifiedBegin(String modifiedBegin) {
        requestBuilder.modifiedBegin(modifiedBegin);
        return this;
    }

    /**
     * 修改结束时间，和结束时间必须同时存在，时间间隔不能超过七天
     */
    public JstQueryInventorySpec modifiedEnd(String modifiedEnd) {
        requestBuilder.modifiedEnd(modifiedEnd);
        return this;
    }

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/83b57188-e283-4ca3-8456-830dd9255d7e_2175_728.png" target="_blank">商品编码</a></div>多个用逗号分隔，与修改时间不能同时为空,最大不超过100个
     */
    public JstQueryInventorySpec skuIds(String skuIds) {
        requestBuilder.skuIds(skuIds);
        return this;
    }

    /**
     * 是否查询库存锁定数
     */
    public JstQueryInventorySpec hasLockQty(Boolean hasLockQty) {
        requestBuilder.hasLockQty(hasLockQty);
        return this;
    }

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/355cdbcb-0e62-48be-a30d-ea786deb980e_1379_737.png" target="_blank">商品名称</a></div>最多100个，多个商品名称用逗号隔开
     */
    public JstQueryInventorySpec names(String names) {
        requestBuilder.names(names);
        return this;
    }

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/208d1032-aa00-4a10-87f9-82982dda8140_1704_844.png" target="_blank">款式编码</a></div>
     */
    public JstQueryInventorySpec iIds(String iIds) {
        requestBuilder.iIds(iIds);
        return this;
    }

    /**
     * 时间戳，防漏单，如果用ts查询不需要传时间查询条件
     */
    public JstQueryInventorySpec ts(Integer ts) {
        requestBuilder.ts(ts);
        return this;
    }

    public JstQueryInventoryResponse response() {
        return this.client.queryInventory(requestBuilder.build());
    }
}
