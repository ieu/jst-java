package io.github.ieu.jst.purchase;

public class JstCancelPurchaseSpec {

    private final JstPurchaseClient client;

    private final JstCancelPurchaseRequest.JstCancelPurchaseRequestBuilder requestBuilder = JstCancelPurchaseRequest.builder();

    public JstCancelPurchaseSpec(JstPurchaseClient client) {
        this.client = client;
    }

    /**
     * 采购单/加工单/预约入库单内部号（与so_ids二选一必填一项都填写以po_ids为准）
     */
    public JstCancelPurchaseSpec poIds(java.util.List<Integer> poIds) {
        requestBuilder.poIds(poIds);
        return this;
    }

    /**
     * 类型（ po：采购单； mo ：加工单；bio：预约入库单 ）
     */
    public JstCancelPurchaseSpec type(String type) {
        requestBuilder.type(type);
        return this;
    }

    /**
     * 采购单/加工单/预约入库单线上单号
     */
    public JstCancelPurchaseSpec soIds(java.util.List<String> soIds) {
        requestBuilder.soIds(soIds);
        return this;
    }

    public JstCancelPurchaseResponse response() {
        return this.client.cancelPurchase(requestBuilder.build());
    }
}
