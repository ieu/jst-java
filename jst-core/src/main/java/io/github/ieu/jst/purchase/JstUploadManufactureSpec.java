package io.github.ieu.jst.purchase;

public class JstUploadManufactureSpec {

    private final JstPurchaseClient client;

    private final JstUploadManufactureRequest.JstUploadManufactureRequestBuilder requestBuilder = JstUploadManufactureRequest.builder();

    public JstUploadManufactureSpec(JstPurchaseClient client) {
        this.client = client;
    }

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/f19f6400-d415-4d07-ad45-868a4d32ea19_1631_224.png"target="_blank">外部单号</a></div>
     */
    public JstUploadManufactureSpec soId(String soId) {
        requestBuilder.soId(soId);
        return this;
    }

    /**
     * 加工单时间
     */
    public JstUploadManufactureSpec poDate(String poDate) {
        requestBuilder.poDate(poDate);
        return this;
    }

    /**
     * 线上单号
     */
    public JstUploadManufactureSpec outerPoId(String outerPoId) {
        requestBuilder.outerPoId(outerPoId);
        return this;
    }

    /**
     * 加工工厂编号（供应商编号）
     */
    public JstUploadManufactureSpec sellerId(Integer sellerId) {
        requestBuilder.sellerId(sellerId);
        return this;
    }

    /**
     * 送货地址
     */
    public JstUploadManufactureSpec sendAddress(String sendAddress) {
        requestBuilder.sendAddress(sendAddress);
        return this;
    }

    /**
     * 合同条款
     */
    public JstUploadManufactureSpec term(String term) {
        requestBuilder.term(term);
        return this;
    }

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/af38b13a-6168-4111-8ecb-47b660e5ab05_1480_224.png"target="_blank">标签</a></div
     */
    public JstUploadManufactureSpec labels(java.util.List<String> labels) {
        requestBuilder.labels(labels);
        return this;
    }

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/31cbbe4c-0139-4461-b925-983cc6fd73d7_1415_221.png"target="_blank">加工仓储方</a></div>
     */
    public JstUploadManufactureSpec wmsCoId(Integer wmsCoId) {
        requestBuilder.wmsCoId(wmsCoId);
        return this;
    }

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/a3d2c327-ff24-4ac7-a0ee-76ebe97159e0_1533_191.png"target="_blank">收货仓储方</a></div>
     */
    public JstUploadManufactureSpec receiptWmsCoId(Integer receiptWmsCoId) {
        requestBuilder.receiptWmsCoId(receiptWmsCoId);
        return this;
    }

    /**
     * 备注
     */
    public JstUploadManufactureSpec remark(String remark) {
        requestBuilder.remark(remark);
        return this;
    }

    /**
     * 成品节点
     */
    public JstUploadManufactureSpec items(java.util.List<JstUploadManufactureRequest.Item> items) {
        requestBuilder.items(items);
        return this;
    }

    /**
     * 是否自动确认单据（默认false待审核）
     */
    public JstUploadManufactureSpec isConfirm(Boolean isConfirm) {
        requestBuilder.isConfirm(isConfirm);
        return this;
    }

    public JstUploadManufactureResponse response() {
        return this.client.uploadManufacture(requestBuilder.build());
    }
}
