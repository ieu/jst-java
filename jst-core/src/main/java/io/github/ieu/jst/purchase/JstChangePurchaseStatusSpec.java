package io.github.ieu.jst.purchase;

public class JstChangePurchaseStatusSpec {

    private final JstPurchaseClient client;

    private final JstChangePurchaseStatusRequest.JstChangePurchaseStatusRequestBuilder requestBuilder = JstChangePurchaseStatusRequest.builder();

    public JstChangePurchaseStatusSpec(JstPurchaseClient client) {
        this.client = client;
    }

    /**
     * 外部采购单号,与内部采购单号不能同时为空
     */
    public JstChangePurchaseStatusSpec soIds(java.util.List<String> soIds) {
        requestBuilder.soIds(soIds);
        return this;
    }

    /**
     * 内部采购单号，与外部采购单号不能同时为空
     */
    public JstChangePurchaseStatusSpec poIds(java.util.List<String> poIds) {
        requestBuilder.poIds(poIds);
        return this;
    }

    /**
     * 操作   1:审核生效  2:变更修改  3:作废  4:完成 5:取消已完成
     */
    public JstChangePurchaseStatusSpec option(Number option) {
        requestBuilder.option(option);
        return this;
    }

    public JstChangePurchaseStatusResponse response() {
        return this.client.changePurchaseStatus(requestBuilder.build());
    }
}
