package io.github.ieu.jst.wms;

public class JstGetWaitPickReduceStockSpec {

    private final JstWmsClient client;

    private final JstGetWaitPickReduceStockRequest.JstGetWaitPickReduceStockRequestBuilder requestBuilder = JstGetWaitPickReduceStockRequest.builder();

    public JstGetWaitPickReduceStockSpec(JstWmsClient client) {
        this.client = client;
    }

    public JstGetWaitPickReduceStockResponse response() {
        return this.client.getWaitPickReduceStock(requestBuilder.build());
    }
}
