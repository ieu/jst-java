package io.github.ieu.jst.wms;

public class JstQuickSaleArrivalSpec {

    private final JstWmsClient client;

    private final JstQuickSaleArrivalRequest.JstQuickSaleArrivalRequestBuilder requestBuilder = JstQuickSaleArrivalRequest.builder();

    public JstQuickSaleArrivalSpec(JstWmsClient client) {
        this.client = client;
    }

    /**
     * 唯一码
     */
    public JstQuickSaleArrivalSpec skuSn(String skuSn) {
        requestBuilder.skuSn(skuSn);
        return this;
    }

    public JstQuickSaleArrivalResponse response() {
        return this.client.quickSaleArrival(requestBuilder.build());
    }
}
