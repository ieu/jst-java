package io.github.ieu.jst.aftersale;

public class JstConfirmAfterSaleSpec {

    private final JstAfterSaleClient client;

    private final JstConfirmAfterSaleRequest.JstConfirmAfterSaleRequestBuilder requestBuilder = JstConfirmAfterSaleRequest.builder();

    public JstConfirmAfterSaleSpec(JstAfterSaleClient client) {
        this.client = client;
    }

    /**
     * 售后单id数组
     */
    public JstConfirmAfterSaleSpec asIds(java.util.List<Number> asIds) {
        requestBuilder.asIds(asIds);
        return this;
    }

    /**
     * 换货售后单是否强制确认
     */
    public JstConfirmAfterSaleSpec exchangeForce(Boolean exchangeForce) {
        requestBuilder.exchangeForce(exchangeForce);
        return this;
    }

    /**
     * 是否同步确认退款单
     */
    public JstConfirmAfterSaleSpec confirmRefund(Boolean confirmRefund) {
        requestBuilder.confirmRefund(confirmRefund);
        return this;
    }

    public JstConfirmAfterSaleResponse response() {
        return this.client.confirmAfterSale(requestBuilder.build());
    }
}
