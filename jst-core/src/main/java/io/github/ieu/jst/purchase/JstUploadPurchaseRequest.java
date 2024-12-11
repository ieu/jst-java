package io.github.ieu.jst.purchase;

@lombok.Data
@lombok.Builder
public class JstUploadPurchaseRequest {

    /**
     * 是否自动确认单据
     */
    private Boolean isConfirm;

    /**
     * 分仓编号
     */
    private Integer wmsCoId;

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/bf26d89f-d1f7-439e-b773-2f125e57764f_1534_487.png" target="_blank">供应商编码</a></div>
     */
    private Integer supplierId;

    /**
     * 商品类型:成品/半成品/原材料
     */
    private String itemType;

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/1a51bc04-9095-47ae-aecc-5041d275a10b_1572_472.png" target="_blank">外部单号</a></div>（单据上传成功之后对应页面外部单号）
     */
    private String externalId;

    /**
     * 备注（如果不传字段key也不要传）；可更新非作废、非完成状态的采购单
     */
    private String remark;

    /**
     * 合同条款
     */
    private String term;

    /**
     * 送货地址
     */
    private String sendAddress;

    /**
     * 采购员
     */
    private String purchaserName;

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/30ecd181-6271-4065-bb25-6db156169c21_1525_412.png" target="_blank">税率</a></div>，17%时请传17
     */
    private Integer taxRate;

    /**
     * 溢装比例，传1就是1%
     */
    private Integer moreRate;

    /**
     * 采购日期
     */
    private String poDate;

    /**
     * 明细列表
     */
    private java.util.List<Item> items;

    /**
     * 物流单号；可更新非作废、非完成状态的采购单
     */
    private String lId;

    /**
     * 物流公司；可更新非作废、非完成状态的采购单
     */
    private String logisticsCompany;

    /**
     * 省
     */
    private String receiverState;

    /**
     * 市
     */
    private String receiverCity;

    /**
     * 区|县（省市区都填写地址默认填写的省市区如不填写取仓库的省市区）
     */
    private String receiverDistrict;

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/c5da600e-6e7f-4e04-8c4d-63d49b29a08f_1600_555.png" target="_blank">运费</a></div>
     */
    private Number freight;

    /**
     * 标签
     */
    private java.util.List<String> labels;

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/5f065926-3029-4e58-aecc-c1954e11a990_1636_291.png" target="_blank">运营云仓编码</a></div>
     */
    private Number lockLwhId;

    /**
     * 是否更新单据（true才会更新）
     */
    private Boolean isEdit;

    @lombok.Data
    public static class Item {

        /**
         * 商品编码
         */
        private String skuId;

        /**
         * 数量
         */
        private Integer qty;

        /**
         * 价格
         */
        private Number price;

        /**
         * 明细备注；可更新非作废、非完成状态的采购单
         */
        private String remark;

        /**
         * 商品明细税率，17%时请传17
         */
        private Integer taxRate;

        /**
         * 协议到货数量
         */
        private Number planArriveQty;

        /**
         * 协议到货时间
         */
        private String planArriveDate;
    }
}
