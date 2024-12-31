package io.github.ieu.jst.item;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

public class JstSetSkuBinsSpec {

    private final JstItemClient client;

    @Getter
    @Setter
    @Accessors(fluent = true, chain = true)
    private java.util.List<JstSetSkuBinsRequest> requests;

    public JstSetSkuBinsSpec(JstItemClient client) {
        this.client = client;
    }

    public JstSetSkuBinsResponse response() {
        return this.client.setSkuBins(requests);
    }
}
