package io.github.ieu.jst.aftersale;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

public class JstUploadAfterSaleSpec {

    private final JstAfterSaleClient client;

    @Getter
    @Setter
    @Accessors(fluent = true, chain = true)
    private java.util.List<JstUploadAfterSaleRequest> requests;

    public JstUploadAfterSaleSpec(JstAfterSaleClient client) {
        this.client = client;
    }

    public JstUploadAfterSaleResponse response() {
        return this.client.uploadAfterSale(requests);
    }
}
