package io.github.ieu.jst.wms;

@lombok.Data
@lombok.Builder
public class JstConfirmSingleOrderCheckoutRequest {

    /**
     * 快递公司id
     */
    private String lcId;

    /**
     * 是否单件
     */
    private Boolean isSingle;

    /**
     * 商品数量
     */
    private java.util.List<Items> items;

    @lombok.Data
    public static class Items {

        /**
         * 批次号
         */
        private String batchId;

        /**
         * 箱号
         */
        private String packId;

        /**
         * 数量
         */
        private Number qty;

        /**
         * 商品编码
         */
        private String skuId;

        /**
         * 唯一码
         */
        private java.util.List<String> skuSn;

        /**
         * 采购单价
         */
        private Number price;

        /**
         * 预计到货日
         */
        private String planArriveDate;

        /**
         * 生产日期
         */
        private String producedDate;

        /**
         * 备注
         */
        private String remark;

        /**
         * 有效期至
         */
        private String expirationDate;

        /**
         * 税率
         */
        private Number taxRate;
    }
}
