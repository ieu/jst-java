package io.github.ieu.jst.purchase;

public class JstUploadPurchaseSpec {

    private final JstPurchaseClient client;

    private final JstUploadPurchaseRequest.JstUploadPurchaseRequestBuilder requestBuilder = JstUploadPurchaseRequest.builder();

    public JstUploadPurchaseSpec(JstPurchaseClient client) {
        this.client = client;
    }

    /**
     * 是否自动确认单据
     */
    public JstUploadPurchaseSpec isConfirm(Boolean isConfirm) {
        requestBuilder.isConfirm(isConfirm);
        return this;
    }

    /**
     * 分仓编号
     */
    public JstUploadPurchaseSpec wmsCoId(Integer wmsCoId) {
        requestBuilder.wmsCoId(wmsCoId);
        return this;
    }

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/bf26d89f-d1f7-439e-b773-2f125e57764f_1534_487.png" target="_blank">供应商编码</a></div>
     */
    public JstUploadPurchaseSpec supplierId(Integer supplierId) {
        requestBuilder.supplierId(supplierId);
        return this;
    }

    /**
     * 商品类型:成品/半成品/原材料
     */
    public JstUploadPurchaseSpec itemType(String itemType) {
        requestBuilder.itemType(itemType);
        return this;
    }

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/1a51bc04-9095-47ae-aecc-5041d275a10b_1572_472.png" target="_blank">外部单号</a></div>（单据上传成功之后对应页面外部单号）
     */
    public JstUploadPurchaseSpec externalId(String externalId) {
        requestBuilder.externalId(externalId);
        return this;
    }

    /**
     * 备注（如果不传字段key也不要传）；可更新非作废、非完成状态的采购单
     */
    public JstUploadPurchaseSpec remark(String remark) {
        requestBuilder.remark(remark);
        return this;
    }

    /**
     * 合同条款
     */
    public JstUploadPurchaseSpec term(String term) {
        requestBuilder.term(term);
        return this;
    }

    /**
     * 送货地址
     */
    public JstUploadPurchaseSpec sendAddress(String sendAddress) {
        requestBuilder.sendAddress(sendAddress);
        return this;
    }

    /**
     * 采购员
     */
    public JstUploadPurchaseSpec purchaserName(String purchaserName) {
        requestBuilder.purchaserName(purchaserName);
        return this;
    }

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/30ecd181-6271-4065-bb25-6db156169c21_1525_412.png" target="_blank">税率</a></div>，17%时请传17
     */
    public JstUploadPurchaseSpec taxRate(Integer taxRate) {
        requestBuilder.taxRate(taxRate);
        return this;
    }

    /**
     * 溢装比例，传1就是1%
     */
    public JstUploadPurchaseSpec moreRate(Integer moreRate) {
        requestBuilder.moreRate(moreRate);
        return this;
    }

    /**
     * 采购日期
     */
    public JstUploadPurchaseSpec poDate(String poDate) {
        requestBuilder.poDate(poDate);
        return this;
    }

    /**
     * 明细列表
     */
    public JstUploadPurchaseSpec items(java.util.List<JstUploadPurchaseRequest.Item> items) {
        requestBuilder.items(items);
        return this;
    }

    /**
     * 物流单号；可更新非作废、非完成状态的采购单
     */
    public JstUploadPurchaseSpec lId(String lId) {
        requestBuilder.lId(lId);
        return this;
    }

    /**
     * 物流公司；可更新非作废、非完成状态的采购单
     */
    public JstUploadPurchaseSpec logisticsCompany(String logisticsCompany) {
        requestBuilder.logisticsCompany(logisticsCompany);
        return this;
    }

    /**
     * 省
     */
    public JstUploadPurchaseSpec receiverState(String receiverState) {
        requestBuilder.receiverState(receiverState);
        return this;
    }

    /**
     * 市
     */
    public JstUploadPurchaseSpec receiverCity(String receiverCity) {
        requestBuilder.receiverCity(receiverCity);
        return this;
    }

    /**
     * 区|县（省市区都填写地址默认填写的省市区如不填写取仓库的省市区）
     */
    public JstUploadPurchaseSpec receiverDistrict(String receiverDistrict) {
        requestBuilder.receiverDistrict(receiverDistrict);
        return this;
    }

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/c5da600e-6e7f-4e04-8c4d-63d49b29a08f_1600_555.png" target="_blank">运费</a></div>
     */
    public JstUploadPurchaseSpec freight(Number freight) {
        requestBuilder.freight(freight);
        return this;
    }

    /**
     * 标签
     */
    public JstUploadPurchaseSpec labels(java.util.List<String> labels) {
        requestBuilder.labels(labels);
        return this;
    }

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/5f065926-3029-4e58-aecc-c1954e11a990_1636_291.png" target="_blank">运营云仓编码</a></div>
     */
    public JstUploadPurchaseSpec lockLwhId(Number lockLwhId) {
        requestBuilder.lockLwhId(lockLwhId);
        return this;
    }

    /**
     * 是否更新单据（true才会更新）
     */
    public JstUploadPurchaseSpec isEdit(Boolean isEdit) {
        requestBuilder.isEdit(isEdit);
        return this;
    }

    public JstUploadPurchaseResponse response() {
        return this.client.uploadPurchase(requestBuilder.build());
    }
}
