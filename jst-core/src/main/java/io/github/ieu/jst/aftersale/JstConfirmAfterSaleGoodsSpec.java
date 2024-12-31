package io.github.ieu.jst.aftersale;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

public class JstConfirmAfterSaleGoodsSpec {

    private final JstAfterSaleClient client;

    @Getter
    @Setter
    @Accessors(fluent = true, chain = true)
    private java.util.List<JstConfirmAfterSaleGoodsRequest> requests;

    public JstConfirmAfterSaleGoodsSpec(JstAfterSaleClient client) {
        this.client = client;
    }

    public JstConfirmAfterSaleGoodsResponse response() {
        return this.client.confirmAfterSaleGoods(requests);
    }
}
