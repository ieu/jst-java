package io.github.ieu.jst.stockin;

public class JstBatchAddSkusnSimpleSpec {

    private final JstStockInClient client;

    private final JstBatchAddSkusnSimpleRequest.JstBatchAddSkusnSimpleRequestBuilder requestBuilder = JstBatchAddSkusnSimpleRequest.builder();

    public JstBatchAddSkusnSimpleSpec(JstStockInClient client) {
        this.client = client;
    }

    public JstBatchAddSkusnSimpleSpec skuSnList(java.util.List<JstBatchAddSkusnSimpleRequest.SkuSn> skuSnList) {
        requestBuilder.skuSnList(skuSnList);
        return this;
    }

    public JstBatchAddSkusnSimpleResponse response() {
        return this.client.batchAddSkusnSimple(requestBuilder.build());
    }
}
