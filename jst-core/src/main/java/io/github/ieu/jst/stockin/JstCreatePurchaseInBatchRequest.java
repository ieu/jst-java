package io.github.ieu.jst.stockin;

@lombok.Data
@lombok.Builder
public class JstCreatePurchaseInBatchRequest {

    /**
     * 是否自动确认单据
     */
    private Boolean isConfirm;

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/e3a0f8c6-30a1-4183-b5a9-86ae60e4a23f_1590_231.png" target="_blank">外部采购入库单号</a> </div>唯一
     */
    private String externalId;

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/bf26d89f-d1f7-439e-b773-2f125e57764f_1534_487.png" target="_blank">供应商内部编号</a></div>（供应商内部编号，如果传了po_id,为非必填且取值为po_id单据中的供应商编码）
     */
    private Number supplierId;

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/a2f83d6e-596b-42d2-8603-9b1b70c591dc_1567_459.png" target="_blank">采购单号</a> </div>
     */
    private Number poId;

    /**
     * 货主采购单号
     */
    private Number outerPoId;

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/f616daac-0d48-4df1-bad0-15b81af5503b_1774_232.png"target="_blank">分仓编码</a> </div>
     */
    private Number wmsCoId;

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/e88bb223-69bc-4ad1-ba58-59026b2751b0_1343_271.png"target="_blank">仓库编码</a> </div>主仓=1，销退仓=2，进货仓=3，次品仓=4，自定义1仓=6，自定义2仓=7，自定义3仓=8（对应ERP仓库资料设定页面，剩下的仓以此类推）
     */
    private Number warehouse;

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/e0b30b88-8734-4ceb-9c53-685e4e437f72_1661_238.png" target="_blank">采购单备注</a> </div>
     */
    private String remark;

    /**
     * 税率
     */
    private Number taxRate;

    /**
     * 货主仓库编号
     */
    private String coId;

    /**
     * 虚拟仓名称
     */
    private String lockWhName;

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/d040aec7-a145-4361-b0a1-e7b455150c83_1598_210.png" target="_blank">虚拟仓编码</a> </div>（对应lwh_id）
     */
    private String lockWhId;

    /**
     * 创建人；不填写默认@open
     */
    private String channel;

    /**
     * 是否按箱入库
     */
    private Boolean isInByPack;

    /**
     * 已有箱号（is_in_by_pack 为true有效）必须传系统已存在的箱号
     */
    private String oldPackId;

    /**
     * 是否校验混装，传true时混装会报错，已有箱混装也会报错（is_in_by_pack 为true且非is_bulk_pack有效）
     */
    private Boolean isCheckMixPack;

    /**
     * 是否点数批量装箱（is_in_by_pack 为true有效）
     */
    private Boolean isBulkPack;

    /**
     * 箱数（is_in_by_pack 为true且非is_bulk_pack有效）
     */
    private Number packQty;

    private java.util.List<Item> items;

    @lombok.Data
    public static class Item {

        /**
         * 数量
         */
        private Number qty;

        /**
         * 税率
         */
        private Number taxRate;

        /**
         * 商品编码
         */
        private String skuId;

        /**
         * 序列号
         */
        private java.util.List<String> skuSn;

        /**
         * 上传该数据需要联系我们配置开关
         */
        private java.util.List<SkuSn> skuSnList;

        /**
         * 单价
         */
        private String price;

        /**
         * 批次号，系统中相关业务项需配置
         */
        private String batchId;

        /**
         * 生产日期，系统中相关业务项需配置
         */
        private String producedDate;

        /**
         * 有效期至，系统中相关业务项需配置
         */
        private String expirationDate;

        /**
         * 备注
         */
        private String remark;

        @lombok.Data
        public static class SkuSn {

            /**
             * 唯一码
             */
            private String skuSn;

            /**
             * 唯一码成本价
             */
            private Number costPrice;

            /**
             * 备注
             */
            private String remark;

            /**
             * 重量
             */
            private Number weight;

            /**
             * 证书编号（暂时只有黄金版支持）
             */
            private String certificateNo;

            /**
             * 加工费
             */
            private Number processingCharges;

            /**
             * 加工费单价
             */
            private Number processingPrice;

            /**
             * 原材料单价
             */
            private Number rawMaterialPrice;

            /**
             * 原材料成本
             */
            private Number rawMaterialAmount;

            /**
             * 附加费
             */
            private Number surcharge;

            /**
             * 计价方式，0=固定价格，1=结料结工费，2=结价结工费
             */
            private Integer pricingMethod;

            /**
             * 唯一码入库扩展信息（黄金版专用参数）
             */
            private InExtModel inExtModel;

            /**
             * 唯一码入库扩展信息（黄金版专用参数）
             */
            @lombok.Data
            public static class InExtModel {

                /**
                 * 其它属性1
                 */
                private String other1;

                /**
                 * 其它属性2
                 */
                private String other2;

                /**
                 * 其它属性3
                 */
                private String other3;

                /**
                 * 其它重量1
                 */
                private Number otherWeight1;

                /**
                 * 其它重量2
                 */
                private Number otherWeight2;

                /**
                 * 其它重量3
                 */
                private Number otherWeight3;

                /**
                 * 其它成本1
                 */
                private Number otherCostPrice1;

                /**
                 * 其它成本2
                 */
                private Number otherCostPrice2;

                /**
                 * 其它成本3
                 */
                private Number otherCostPrice3;

                /**
                 * 其它加工费1
                 */
                private Number otherProcessingCharges1;

                /**
                 * 其它加工费2
                 */
                private Number otherProcessingCharges2;

                /**
                 * 其它加工费3
                 */
                private Number otherProcessingCharges3;
            }
        }
    }
}
