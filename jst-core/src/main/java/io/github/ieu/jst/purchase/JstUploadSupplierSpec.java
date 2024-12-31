package io.github.ieu.jst.purchase;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

public class JstUploadSupplierSpec {

    private final JstPurchaseClient client;

    @Getter
    @Setter
    @Accessors(fluent = true, chain = true)
    private java.util.List<JstUploadSupplierRequest> requests;

    public JstUploadSupplierSpec(JstPurchaseClient client) {
        this.client = client;
    }

    public JstUploadSupplierResponse response() {
        return this.client.uploadSupplier(requests);
    }
}
