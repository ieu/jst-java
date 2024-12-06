package io.github.ieu.jst.crossborder;

@lombok.Data
@lombok.Builder
public class JstSaveCbExpressStatementFeeRequest {

    /**
     * 内部订单号
     */
    private Integer orderId;

    /**
     * 线上单号
     */
    private String saleOrderId;

    /**
     * 币种
     */
    private String currency;

    /**
     * 金额
     */
    private Number amount;

    /**
     * 重量
     */
    private Number outerwmsWeight;
}
