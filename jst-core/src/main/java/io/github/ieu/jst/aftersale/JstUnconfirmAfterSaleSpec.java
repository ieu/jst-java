package io.github.ieu.jst.aftersale;

public class JstUnconfirmAfterSaleSpec {

    private final JstAfterSaleClient client;

    private final JstUnconfirmAfterSaleRequest.JstUnconfirmAfterSaleRequestBuilder requestBuilder = JstUnconfirmAfterSaleRequest.builder();

    public JstUnconfirmAfterSaleSpec(JstAfterSaleClient client) {
        this.client = client;
    }

    /**
     * 售后单id数组
     */
    public JstUnconfirmAfterSaleSpec asIds(java.util.List<Number> asIds) {
        requestBuilder.asIds(asIds);
        return this;
    }

    public JstUnconfirmAfterSaleResponse response() {
        return this.client.unconfirmAfterSale(requestBuilder.build());
    }
}
