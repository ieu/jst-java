package io.github.ieu.jst.aftersale;

@lombok.Data
@lombok.Builder
public class JstConfirmAfterSaleGoodsRequest {

    /**
     * 售后单号
     */
    private Number asId;

    /**
     * 快递公司
     */
    private String logisticsCompany;

    /**
     * 快递单号
     */
    private String lId;

    /**
     * 备注
     */
    private String remark;

    /**
     * 收货明细
     */
    private java.util.List<Items> items;

    /**
     * 收货仓编码
     */
    private Number wmsCoId;

    /**
     * 收货仓位；主仓 = 1, 销退仓 = 2
     */
    private Number whId;

    /**
     * 唯一单号（防止重复调用而误增加库存）
     */
    private String returnId;

    @lombok.Data
    public static class Items {

        /**
         * 商品编码
         */
        private String skuId;

        /**
         * 数量类型(0正品，4次品，6自定义1仓，7自定义2仓，8自定义3仓)不传默认是消退仓
         */
        private Number qtyType;

        /**
         * 数量
         */
        private Number qty;

        /**
         * 批次号
         */
        private String batchId;

        /**
         * 生产日期，格式"2022-01-01"
         */
        private String producedDate;

        /**
         * 到期日，格式"2022-06-01"
         */
        private String expirationDate;
    }
}
