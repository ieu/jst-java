package io.github.ieu.jst.purchase;

public class JstEditPurchaseSpec {

    private final JstPurchaseClient client;

    private final JstEditPurchaseRequest.JstEditPurchaseRequestBuilder requestBuilder = JstEditPurchaseRequest.builder();

    public JstEditPurchaseSpec(JstPurchaseClient client) {
        this.client = client;
    }

    /**
     * 外部单号，与内部采购单号必填一项
     */
    public JstEditPurchaseSpec externalId(String externalId) {
        requestBuilder.externalId(externalId);
        return this;
    }

    /**
     * 内部采购单号，与外部单号必填一项
     */
    public JstEditPurchaseSpec poId(Number poId) {
        requestBuilder.poId(poId);
        return this;
    }

    /**
     * 分仓id
     */
    public JstEditPurchaseSpec wmsCoId(Number wmsCoId) {
        requestBuilder.wmsCoId(wmsCoId);
        return this;
    }

    /**
     * 供应商id
     */
    public JstEditPurchaseSpec supplierId(Number supplierId) {
        requestBuilder.supplierId(supplierId);
        return this;
    }

    /**
     * 商品类型:成品/半成品/原材料
     */
    public JstEditPurchaseSpec itemType(String itemType) {
        requestBuilder.itemType(itemType);
        return this;
    }

    /**
     * 备注
     */
    public JstEditPurchaseSpec remark(String remark) {
        requestBuilder.remark(remark);
        return this;
    }

    /**
     * 合同条款
     */
    public JstEditPurchaseSpec term(String term) {
        requestBuilder.term(term);
        return this;
    }

    /**
     * 送货详细地址
     */
    public JstEditPurchaseSpec sendAddress(String sendAddress) {
        requestBuilder.sendAddress(sendAddress);
        return this;
    }

    /**
     * 采购员
     */
    public JstEditPurchaseSpec purchaserName(String purchaserName) {
        requestBuilder.purchaserName(purchaserName);
        return this;
    }

    /**
     * 税率
     */
    public JstEditPurchaseSpec taxRate(Number taxRate) {
        requestBuilder.taxRate(taxRate);
        return this;
    }

    /**
     * 溢装比例
     */
    public JstEditPurchaseSpec moreRate(Number moreRate) {
        requestBuilder.moreRate(moreRate);
        return this;
    }

    /**
     * 采购日期
     */
    public JstEditPurchaseSpec poDate(String poDate) {
        requestBuilder.poDate(poDate);
        return this;
    }

    /**
     * 物流公司
     */
    public JstEditPurchaseSpec logisticsCompany(String logisticsCompany) {
        requestBuilder.logisticsCompany(logisticsCompany);
        return this;
    }

    /**
     * 物流单号
     */
    public JstEditPurchaseSpec lId(String lId) {
        requestBuilder.lId(lId);
        return this;
    }

    /**
     * 多标签字段
     */
    public JstEditPurchaseSpec labels(java.util.List<String> labels) {
        requestBuilder.labels(labels);
        return this;
    }

    /**
     * 运费
     */
    public JstEditPurchaseSpec freight(Number freight) {
        requestBuilder.freight(freight);
        return this;
    }

    /**
     * 收货人姓名
     */
    public JstEditPurchaseSpec receiverName(String receiverName) {
        requestBuilder.receiverName(receiverName);
        return this;
    }

    /**
     * 收货人电话
     */
    public JstEditPurchaseSpec receiverPhone(String receiverPhone) {
        requestBuilder.receiverPhone(receiverPhone);
        return this;
    }

    /**
     * 虚拟仓Id
     */
    public JstEditPurchaseSpec lockLwhId(Number lockLwhId) {
        requestBuilder.lockLwhId(lockLwhId);
        return this;
    }

    /**
     * 采购明细
     */
    public JstEditPurchaseSpec items(java.util.List<JstEditPurchaseRequest.Item> items) {
        requestBuilder.items(items);
        return this;
    }

    public JstEditPurchaseResponse response() {
        return this.client.editPurchase(requestBuilder.build());
    }
}
