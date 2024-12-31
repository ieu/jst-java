package io.github.ieu.jst.warehouse;

public class JstGetWarehouseListSpec {

    private final JstWarehouseClient client;

    private final JstGetWarehouseListRequest.JstGetWarehouseListRequestBuilder requestBuilder = JstGetWarehouseListRequest.builder();

    public JstGetWarehouseListSpec(JstWarehouseClient client) {
        this.client = client;
    }

    public JstGetWarehouseListResponse response() {
        return this.client.getWarehouseList(requestBuilder.build());
    }
}
