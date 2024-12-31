package io.github.ieu.jst.wms;

public class JstAddShippingPackSpec {

    private final JstWmsClient client;

    private final JstAddShippingPackRequest.JstAddShippingPackRequestBuilder requestBuilder = JstAddShippingPackRequest.builder();

    public JstAddShippingPackSpec(JstWmsClient client) {
        this.client = client;
    }

    /**
     * 出库单号，优先查询
     */
    public JstAddShippingPackSpec ioId(Number ioId) {
        requestBuilder.ioId(ioId);
        return this;
    }

    /**
     * 快递单号，出库单号查不到再查快递单号
     */
    public JstAddShippingPackSpec lid(String lid) {
        requestBuilder.lid(lid);
        return this;
    }

    /**
     * 装箱明细
     */
    public JstAddShippingPackSpec detail(java.util.List<JstAddShippingPackRequest.Detail> detail) {
        requestBuilder.detail(detail);
        return this;
    }

    public JstAddShippingPackResponse response() {
        return this.client.addShippingPack(requestBuilder.build());
    }
}
