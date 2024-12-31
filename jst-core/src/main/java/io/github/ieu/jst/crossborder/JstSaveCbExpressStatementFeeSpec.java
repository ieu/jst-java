package io.github.ieu.jst.crossborder;

public class JstSaveCbExpressStatementFeeSpec {

    private final JstCrossBorderClient client;

    private final JstSaveCbExpressStatementFeeRequest.JstSaveCbExpressStatementFeeRequestBuilder requestBuilder = JstSaveCbExpressStatementFeeRequest.builder();

    public JstSaveCbExpressStatementFeeSpec(JstCrossBorderClient client) {
        this.client = client;
    }

    /**
     * 内部订单号
     */
    public JstSaveCbExpressStatementFeeSpec orderId(Integer orderId) {
        requestBuilder.orderId(orderId);
        return this;
    }

    /**
     * 线上单号
     */
    public JstSaveCbExpressStatementFeeSpec saleOrderId(String saleOrderId) {
        requestBuilder.saleOrderId(saleOrderId);
        return this;
    }

    /**
     * 币种
     */
    public JstSaveCbExpressStatementFeeSpec currency(String currency) {
        requestBuilder.currency(currency);
        return this;
    }

    /**
     * 金额
     */
    public JstSaveCbExpressStatementFeeSpec amount(Number amount) {
        requestBuilder.amount(amount);
        return this;
    }

    /**
     * 重量
     */
    public JstSaveCbExpressStatementFeeSpec outerwmsWeight(Number outerwmsWeight) {
        requestBuilder.outerwmsWeight(outerwmsWeight);
        return this;
    }

    public JstSaveCbExpressStatementFeeResponse response() {
        return this.client.saveCbExpressStatementFee(requestBuilder.build());
    }
}
