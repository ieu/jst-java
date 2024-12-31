package io.github.ieu.jst.order;

public class JstSplitDrpOrderSpec {

    private final JstOrderClient client;

    private final JstSplitDrpOrderRequest.JstSplitDrpOrderRequestBuilder requestBuilder = JstSplitDrpOrderRequest.builder();

    public JstSplitDrpOrderSpec(JstOrderClient client) {
        this.client = client;
    }

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/deab32f3-191d-43c8-b213-343bb82070e1_2161_433.png" target="_blank">内部订单号</a></div>
     */
    public JstSplitDrpOrderSpec oId(String oId) {
        requestBuilder.oId(oId);
        return this;
    }

    /**
     * 拆分信息
     */
    public JstSplitDrpOrderSpec splitInfos(java.util.List<java.util.List<JstSplitDrpOrderRequest.SplitInfo>> splitInfos) {
        requestBuilder.splitInfos(splitInfos);
        return this;
    }

    public JstSplitDrpOrderResponse response() {
        return this.client.splitDrpOrder(requestBuilder.build());
    }
}
