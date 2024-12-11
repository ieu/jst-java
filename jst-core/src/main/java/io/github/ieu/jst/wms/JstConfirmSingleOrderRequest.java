package io.github.ieu.jst.wms;

@lombok.Data
@lombok.Builder
public class JstConfirmSingleOrderRequest {

    /**
     * ERP内部供应商编号
     */
    private Number supplierId;

    /**
     * 外部采购入库单号，唯一
     */
    private String externalId;

    /**
     * 分仓编码
     */
    private Number wmsCoId;

    /**
     * ERP内部采购单号
     */
    private Number poId;

    /**
     * 备注
     */
    private String remark;

    /**
     * 税率
     */
    private Number taxRate;

    /**
     * 货主仓库编码
     */
    private Number coId;

    /**
     * 快递公司代码
     */
    private String lcId;

    /**
     * 商品信息
     */
    private java.util.List<Item> items;

    @lombok.Data
    public static class Item {

        /**
         * SN码或者商品编码
         */
        private String skuId;

        /**
         * 商品数量（不填写默认是1，填写按照填写的为准）
         */
        private Number qty;

        /**
         * sn码
         */
        private java.util.List<String> skuSn;

        /**
         * 单价
         */
        private Number price;

        /**
         * 开启生产批次，批次号必填
         */
        private String batchId;

        /**
         * 开启生产批次，生产日期必填
         */
        private String producedDate;

        /**
         * 开启生产批次，有效期必填
         */
        private String expirationDate;

        /**
         * 备注
         */
        private String remark;
    }
}
