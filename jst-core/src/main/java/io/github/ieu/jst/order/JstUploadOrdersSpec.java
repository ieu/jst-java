package io.github.ieu.jst.order;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

public class JstUploadOrdersSpec {

    private final JstOrderClient client;

    @Getter
    @Setter
    @Accessors(fluent = true, chain = true)
    private java.util.List<JstUploadOrdersRequest> requests;

    public JstUploadOrdersSpec(JstOrderClient client) {
        this.client = client;
    }

    public JstUploadOrdersResponse response() {
        return this.client.uploadOrders(requests);
    }
}
