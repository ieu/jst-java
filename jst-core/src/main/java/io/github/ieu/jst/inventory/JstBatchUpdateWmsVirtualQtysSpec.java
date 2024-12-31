package io.github.ieu.jst.inventory;

public class JstBatchUpdateWmsVirtualQtysSpec {

    private final JstInventoryClient client;

    private final JstBatchUpdateWmsVirtualQtysRequest.JstBatchUpdateWmsVirtualQtysRequestBuilder requestBuilder = JstBatchUpdateWmsVirtualQtysRequest.builder();

    public JstBatchUpdateWmsVirtualQtysSpec(JstInventoryClient client) {
        this.client = client;
    }

    /**
     * 分仓编码
     */
    public JstBatchUpdateWmsVirtualQtysSpec wmsCoId(Number wmsCoId) {
        requestBuilder.wmsCoId(wmsCoId);
        return this;
    }

    public JstBatchUpdateWmsVirtualQtysSpec skuAndQty(java.util.List<JstBatchUpdateWmsVirtualQtysRequest.SkuAndQty> skuAndQty) {
        requestBuilder.skuAndQty(skuAndQty);
        return this;
    }

    public JstBatchUpdateWmsVirtualQtysResponse response() {
        return this.client.batchUpdateWmsVirtualQtys(requestBuilder.build());
    }
}
