package io.github.ieu.jst.aftersale;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

public class JstConfirmGoodsBySkusnsSpec {

    private final JstAfterSaleClient client;

    @Getter
    @Setter
    @Accessors(fluent = true, chain = true)
    private java.util.List<JstConfirmGoodsBySkusnsRequest> requests;

    public JstConfirmGoodsBySkusnsSpec(JstAfterSaleClient client) {
        this.client = client;
    }

    public JstConfirmGoodsBySkusnsResponse response() {
        return this.client.confirmGoodsBySkusns(requests);
    }
}
