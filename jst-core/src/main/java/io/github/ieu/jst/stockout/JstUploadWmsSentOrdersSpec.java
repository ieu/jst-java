package io.github.ieu.jst.stockout;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

public class JstUploadWmsSentOrdersSpec {

    private final JstStockOutClient client;

    @Getter
    @Setter
    @Accessors(fluent = true, chain = true)
    private java.util.List<JstUploadWmsSentOrdersRequest> requests;

    public JstUploadWmsSentOrdersSpec(JstStockOutClient client) {
        this.client = client;
    }

    public JstUploadWmsSentOrdersResponse response() {
        return this.client.uploadWmsSentOrders(requests);
    }
}
