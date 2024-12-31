package io.github.ieu.jst.workorder;

public class JstUpdateWorkOrderSpec {

    private final JstWorkOrderClient client;

    private final JstUpdateWorkOrderRequest.JstUpdateWorkOrderRequestBuilder requestBuilder = JstUpdateWorkOrderRequest.builder();

    public JstUpdateWorkOrderSpec(JstWorkOrderClient client) {
        this.client = client;
    }

    public JstUpdateWorkOrderSpec data(JstUpdateWorkOrderRequest.Data data) {
        requestBuilder.data(data);
        return this;
    }

    public JstUpdateWorkOrderResponse response() {
        return this.client.updateWorkOrder(requestBuilder.build());
    }
}
