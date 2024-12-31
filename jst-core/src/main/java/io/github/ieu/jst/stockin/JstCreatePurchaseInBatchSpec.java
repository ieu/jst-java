package io.github.ieu.jst.stockin;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

public class JstCreatePurchaseInBatchSpec {

    private final JstStockInClient client;

    @Getter
    @Setter
    @Accessors(fluent = true, chain = true)
    private java.util.List<JstCreatePurchaseInBatchRequest> requests;

    public JstCreatePurchaseInBatchSpec(JstStockInClient client) {
        this.client = client;
    }

    public JstCreatePurchaseInBatchResponse response() {
        return this.client.createPurchaseInBatch(requests);
    }
}
