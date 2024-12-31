package io.github.ieu.jst.order;

public class JstCancelOrderByOidSpec {

    private final JstOrderClient client;

    private final JstCancelOrderByOidRequest.JstCancelOrderByOidRequestBuilder requestBuilder = JstCancelOrderByOidRequest.builder();

    public JstCancelOrderByOidSpec(JstOrderClient client) {
        this.client = client;
    }

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/deab32f3-191d-43c8-b213-343bb82070e1_2161_433.png" target="_blank">内部订单号</a></div>一次最大支持50条
     */
    public JstCancelOrderByOidSpec oIds(java.util.List<Integer> oIds) {
        requestBuilder.oIds(oIds);
        return this;
    }

    /**
     * 取消类型
     */
    public JstCancelOrderByOidSpec cancelType(String cancelType) {
        requestBuilder.cancelType(cancelType);
        return this;
    }

    /**
     * 备注
     */
    public JstCancelOrderByOidSpec remark(String remark) {
        requestBuilder.remark(remark);
        return this;
    }

    public JstCancelOrderByOidResponse response() {
        return this.client.cancelOrderByOid(requestBuilder.build());
    }
}
