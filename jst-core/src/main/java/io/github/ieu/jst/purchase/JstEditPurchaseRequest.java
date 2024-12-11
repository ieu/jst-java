package io.github.ieu.jst.purchase;

@lombok.Data
@lombok.Builder
public class JstEditPurchaseRequest {

    /**
     * 外部单号，与内部采购单号必填一项
     */
    private String externalId;

    /**
     * 内部采购单号，与外部单号必填一项
     */
    private Number poId;

    /**
     * 分仓id
     */
    private Number wmsCoId;

    /**
     * 供应商id
     */
    private Number supplierId;

    /**
     * 商品类型:成品/半成品/原材料
     */
    private String itemType;

    /**
     * 备注
     */
    private String remark;

    /**
     * 合同条款
     */
    private String term;

    /**
     * 送货详细地址
     */
    private String sendAddress;

    /**
     * 采购员
     */
    private String purchaserName;

    /**
     * 税率
     */
    private Number taxRate;

    /**
     * 溢装比例
     */
    private Number moreRate;

    /**
     * 采购日期
     */
    private String poDate;

    /**
     * 物流公司
     */
    private String logisticsCompany;

    /**
     * 物流单号
     */
    private String lId;

    /**
     * 多标签字段
     */
    private java.util.List<String> labels;

    /**
     * 运费
     */
    private Number freight;

    /**
     * 收货人姓名
     */
    private String receiverName;

    /**
     * 收货人电话
     */
    private String receiverPhone;

    /**
     * 虚拟仓Id
     */
    private Number lockLwhId;

    /**
     * 采购明细
     */
    private java.util.List<Item> items;

    @lombok.Data
    public static class Item {

        /**
         * 商品编码
         */
        private String skuId;

        /**
         * 数量
         */
        private Number qty;

        /**
         * 采购单价格
         */
        private Number price;

        /**
         * 生产批次号
         */
        private String batchId;

        /**
         * 生产日期
         */
        private String producedDate;

        /**
         * 有效期至
         */
        private String expirationDate;

        /**
         * 协议到货日期
         */
        private String deliveryDate;

        /**
         * 协议到货数量
         */
        private Number planArriveQty;

        /**
         * 备注
         */
        private String remark;

        /**
         * 税率
         */
        private Number taxRate;
    }
}
