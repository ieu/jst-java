package io.github.ieu.jst.wms;

public class JstGetRecommendBinSpec {

    private final JstWmsClient client;

    private final JstGetRecommendBinRequest.JstGetRecommendBinRequestBuilder requestBuilder = JstGetRecommendBinRequest.builder();

    public JstGetRecommendBinSpec(JstWmsClient client) {
        this.client = client;
    }

    /**
     * 商品编码
     */
    public JstGetRecommendBinSpec skuId(String skuId) {
        requestBuilder.skuId(skuId);
        return this;
    }

    public JstGetRecommendBinResponse response() {
        return this.client.getRecommendBin(requestBuilder.build());
    }
}
