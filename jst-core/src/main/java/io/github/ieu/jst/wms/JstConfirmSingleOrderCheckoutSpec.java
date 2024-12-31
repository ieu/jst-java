package io.github.ieu.jst.wms;

public class JstConfirmSingleOrderCheckoutSpec {

    private final JstWmsClient client;

    private final JstConfirmSingleOrderCheckoutRequest.JstConfirmSingleOrderCheckoutRequestBuilder requestBuilder = JstConfirmSingleOrderCheckoutRequest.builder();

    public JstConfirmSingleOrderCheckoutSpec(JstWmsClient client) {
        this.client = client;
    }

    /**
     * 快递公司id
     */
    public JstConfirmSingleOrderCheckoutSpec lcId(String lcId) {
        requestBuilder.lcId(lcId);
        return this;
    }

    /**
     * 是否单件
     */
    public JstConfirmSingleOrderCheckoutSpec isSingle(Boolean isSingle) {
        requestBuilder.isSingle(isSingle);
        return this;
    }

    /**
     * 商品数量
     */
    public JstConfirmSingleOrderCheckoutSpec items(java.util.List<JstConfirmSingleOrderCheckoutRequest.Item> items) {
        requestBuilder.items(items);
        return this;
    }

    public JstConfirmSingleOrderCheckoutResponse response() {
        return this.client.confirmSingleOrderCheckout(requestBuilder.build());
    }
}
