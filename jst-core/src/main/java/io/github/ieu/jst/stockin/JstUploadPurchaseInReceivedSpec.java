package io.github.ieu.jst.stockin;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

public class JstUploadPurchaseInReceivedSpec {

    private final JstStockInClient client;

    @Getter
    @Setter
    @Accessors(fluent = true, chain = true)
    private java.util.List<JstUploadPurchaseInReceivedRequest> requests;

    public JstUploadPurchaseInReceivedSpec(JstStockInClient client) {
        this.client = client;
    }

    public JstUploadPurchaseInReceivedResponse response() {
        return this.client.uploadPurchaseInReceived(requests);
    }
}
