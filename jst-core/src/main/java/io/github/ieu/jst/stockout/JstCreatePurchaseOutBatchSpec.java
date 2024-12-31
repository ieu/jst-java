package io.github.ieu.jst.stockout;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

public class JstCreatePurchaseOutBatchSpec {

    private final JstStockOutClient client;

    @Getter
    @Setter
    @Accessors(fluent = true, chain = true)
    private java.util.List<JstCreatePurchaseOutBatchRequest> requests;

    public JstCreatePurchaseOutBatchSpec(JstStockOutClient client) {
        this.client = client;
    }

    public JstCreatePurchaseOutBatchResponse response() {
        return this.client.createPurchaseOutBatch(requests);
    }
}
