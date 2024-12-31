package io.github.ieu.jst.warehouse;

public class JstCreateOrUpdateLockPurchaseSpec {

    private final JstWarehouseClient client;

    private final JstCreateOrUpdateLockPurchaseRequest.JstCreateOrUpdateLockPurchaseRequestBuilder requestBuilder = JstCreateOrUpdateLockPurchaseRequest.builder();

    public JstCreateOrUpdateLockPurchaseSpec(JstWarehouseClient client) {
        this.client = client;
    }

    /**
     * 虚拟仓采购申请单的id（如果要更新该字段必填）
     */
    public JstCreateOrUpdateLockPurchaseSpec lpId(String lpId) {
        requestBuilder.lpId(lpId);
        return this;
    }

    /**
     * 虚拟仓编码
     */
    public JstCreateOrUpdateLockPurchaseSpec lwhId(String lwhId) {
        requestBuilder.lwhId(lwhId);
        return this;
    }

    /**
     * 分仓编码
     */
    public JstCreateOrUpdateLockPurchaseSpec wmsCoId(String wmsCoId) {
        requestBuilder.wmsCoId(wmsCoId);
        return this;
    }

    /**
     * 备注
     */
    public JstCreateOrUpdateLockPurchaseSpec remarks(String remarks) {
        requestBuilder.remarks(remarks);
        return this;
    }

    /**
     * 商品明细
     */
    public JstCreateOrUpdateLockPurchaseSpec items(java.util.List<JstCreateOrUpdateLockPurchaseRequest.Item> items) {
        requestBuilder.items(items);
        return this;
    }

    public JstCreateOrUpdateLockPurchaseResponse response() {
        return this.client.createOrUpdateLockPurchase(requestBuilder.build());
    }
}
