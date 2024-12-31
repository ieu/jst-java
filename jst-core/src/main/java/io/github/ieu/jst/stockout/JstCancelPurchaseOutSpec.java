package io.github.ieu.jst.stockout;

public class JstCancelPurchaseOutSpec {

    private final JstStockOutClient client;

    private final JstCancelPurchaseOutRequest.JstCancelPurchaseOutRequestBuilder requestBuilder = JstCancelPurchaseOutRequest.builder();

    public JstCancelPurchaseOutSpec(JstStockOutClient client) {
        this.client = client;
    }

    /**
     * 出仓单号，与线上单号不能同时为空，两者都存在时取io_ids，最多20个
     */
    public JstCancelPurchaseOutSpec ioIds(java.util.List<Integer> ioIds) {
        requestBuilder.ioIds(ioIds);
        return this;
    }

    /**
     * 线上单号，与出仓单号不能同时为空，两者都存在时取io_ids，最多20个
     */
    public JstCancelPurchaseOutSpec soIds(java.util.List<String> soIds) {
        requestBuilder.soIds(soIds);
        return this;
    }

    public JstCancelPurchaseOutResponse response() {
        return this.client.cancelPurchaseOut(requestBuilder.build());
    }
}
