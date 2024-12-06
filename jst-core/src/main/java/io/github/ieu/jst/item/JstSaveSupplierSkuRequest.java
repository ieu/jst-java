package io.github.ieu.jst.item;

@lombok.Data
@lombok.Builder
public class JstSaveSupplierSkuRequest {

    /**
     * 供应商Id
     */
    private Number supplierId;

    /**
     * 款式编码
     */
    private String iId;

    /**
     * 商品编码
     */
    private String skuId;

    /**
     * 供应商商品编码
     */
    private String supplierSkuId;

    /**
     * 供应商商品款号
     */
    private String supplierIId;

    /**
     * 采购成本价
     */
    private Number costPrice;

    /**
     * 采购链接
     */
    private String purchaseUrl;

    /**
     * 交货天数
     */
    private Number deliveryDay;

    /**
     * 装箱数
     */
    private Number packQty;

    /**
     * 备注
     */
    private String remark;

    /**
     * 是否默认(true false null )true为设置默认 false 为移除 null 为不操作
     */
    private Boolean isDefault;
}
