package io.github.ieu.jst.wms;

public class JstCreateSkusnSpec {

    private final JstWmsClient client;

    private final JstCreateSkusnRequest.JstCreateSkusnRequestBuilder requestBuilder = JstCreateSkusnRequest.builder();

    public JstCreateSkusnSpec(JstWmsClient client) {
        this.client = client;
    }

    /**
     * 订单号
     */
    public JstCreateSkusnSpec orderIds(java.util.List<Integer> orderIds) {
        requestBuilder.orderIds(orderIds);
        return this;
    }

    public JstCreateSkusnResponse response() {
        return this.client.createSkusn(requestBuilder.build());
    }
}
