package io.github.ieu.jst.item;

public class JstSaveSupplierSkuSpec {

    private final JstItemClient client;

    private final JstSaveSupplierSkuRequest.JstSaveSupplierSkuRequestBuilder requestBuilder = JstSaveSupplierSkuRequest.builder();

    public JstSaveSupplierSkuSpec(JstItemClient client) {
        this.client = client;
    }

    /**
     * 供应商Id
     */
    public JstSaveSupplierSkuSpec supplierId(Number supplierId) {
        requestBuilder.supplierId(supplierId);
        return this;
    }

    /**
     * 款式编码
     */
    public JstSaveSupplierSkuSpec iId(String iId) {
        requestBuilder.iId(iId);
        return this;
    }

    /**
     * 商品编码
     */
    public JstSaveSupplierSkuSpec skuId(String skuId) {
        requestBuilder.skuId(skuId);
        return this;
    }

    /**
     * 供应商商品编码
     */
    public JstSaveSupplierSkuSpec supplierSkuId(String supplierSkuId) {
        requestBuilder.supplierSkuId(supplierSkuId);
        return this;
    }

    /**
     * 供应商商品款号
     */
    public JstSaveSupplierSkuSpec supplierIId(String supplierIId) {
        requestBuilder.supplierIId(supplierIId);
        return this;
    }

    /**
     * 采购成本价
     */
    public JstSaveSupplierSkuSpec costPrice(Number costPrice) {
        requestBuilder.costPrice(costPrice);
        return this;
    }

    /**
     * 采购链接
     */
    public JstSaveSupplierSkuSpec purchaseUrl(String purchaseUrl) {
        requestBuilder.purchaseUrl(purchaseUrl);
        return this;
    }

    /**
     * 交货天数
     */
    public JstSaveSupplierSkuSpec deliveryDay(Number deliveryDay) {
        requestBuilder.deliveryDay(deliveryDay);
        return this;
    }

    /**
     * 装箱数
     */
    public JstSaveSupplierSkuSpec packQty(Number packQty) {
        requestBuilder.packQty(packQty);
        return this;
    }

    /**
     * 备注
     */
    public JstSaveSupplierSkuSpec remark(String remark) {
        requestBuilder.remark(remark);
        return this;
    }

    /**
     * 是否默认(true false null )true为设置默认 false 为移除 null 为不操作
     */
    public JstSaveSupplierSkuSpec isDefault(Boolean isDefault) {
        requestBuilder.isDefault(isDefault);
        return this;
    }

    public JstSaveSupplierSkuResponse response() {
        return this.client.saveSupplierSku(requestBuilder.build());
    }
}
