package io.github.ieu.jst.purchase;

public class JstUploadPurchaseLabelSpec {

    private final JstPurchaseClient client;

    private final JstUploadPurchaseLabelRequest.JstUploadPurchaseLabelRequestBuilder requestBuilder = JstUploadPurchaseLabelRequest.builder();

    public JstUploadPurchaseLabelSpec(JstPurchaseClient client) {
        this.client = client;
    }

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/a2f83d6e-596b-42d2-8603-9b1b70c591dc_1567_459.png" target="_blank">采购单号</a>/<div><a href="https://cdn.erp321.cn/jst-fed/2b7a85f3-ffa3-49bf-97f2-26ca65584d0b_1296_226.png" target="_blank">加工单号</a></div>，与线上单号不能同时为空，二者都存在时以采购单号为准
     */
    public JstUploadPurchaseLabelSpec poId(Integer poId) {
        requestBuilder.poId(poId);
        return this;
    }

    /**
     * 线上单号，与采购单号不能同时为空，二者都存在时以采购单号为准
     */
    public JstUploadPurchaseLabelSpec soId(String soId) {
        requestBuilder.soId(soId);
        return this;
    }

    /**
     * 标签列表，数量大于0且小于20，单个标签长度10，不可重复
     */
    public JstUploadPurchaseLabelSpec labels(java.util.List<String> labels) {
        requestBuilder.labels(labels);
        return this;
    }

    /**
     * 操作类型，1=新增，2=移除，默认1
     */
    public JstUploadPurchaseLabelSpec actionType(Integer actionType) {
        requestBuilder.actionType(actionType);
        return this;
    }

    public JstUploadPurchaseLabelResponse response() {
        return this.client.uploadPurchaseLabel(requestBuilder.build());
    }
}
