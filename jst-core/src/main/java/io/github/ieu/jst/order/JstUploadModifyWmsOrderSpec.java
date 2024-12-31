package io.github.ieu.jst.order;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

public class JstUploadModifyWmsOrderSpec {

    private final JstOrderClient client;

    @Getter
    @Setter
    @Accessors(fluent = true, chain = true)
    private java.util.List<JstUploadModifyWmsOrderRequest> requests;

    public JstUploadModifyWmsOrderSpec(JstOrderClient client) {
        this.client = client;
    }

    public JstUploadModifyWmsOrderResponse response() {
        return this.client.uploadModifyWmsOrder(requests);
    }
}
