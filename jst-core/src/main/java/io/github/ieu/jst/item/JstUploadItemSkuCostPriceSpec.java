package io.github.ieu.jst.item;

public class JstUploadItemSkuCostPriceSpec {

    private final JstItemClient client;

    private final JstUploadItemSkuCostPriceRequest.JstUploadItemSkuCostPriceRequestBuilder requestBuilder = JstUploadItemSkuCostPriceRequest.builder();

    public JstUploadItemSkuCostPriceSpec(JstItemClient client) {
        this.client = client;
    }

    public JstUploadItemSkuCostPriceSpec datas(java.util.List<JstUploadItemSkuCostPriceRequest.Data> datas) {
        requestBuilder.datas(datas);
        return this;
    }

    public JstUploadItemSkuCostPriceResponse response() {
        return this.client.uploadItemSkuCostPrice(requestBuilder.build());
    }
}
