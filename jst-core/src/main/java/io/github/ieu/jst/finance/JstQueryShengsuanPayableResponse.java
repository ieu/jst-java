package io.github.ieu.jst.finance;

@lombok.Data
public class JstQueryShengsuanPayableResponse {

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 错误描述
     */
    private String msg;

    private Pagination data;

    @lombok.Data
    public static class Pagination {

        /**
         * 第几页
         */
        private Number pageIndex;

        /**
         * 多少条
         */
        private Number pageSize;

        /**
         * 是否有下一页
         */
        private Boolean hasNext;

        /**
         * 数据集合
         */
        private java.util.List<Data> datas;

        @lombok.Data
        public static class Data {

            /**
             * 应付单号
             */
            private Number pinvId;

            /**
             * 公司编号
             */
            private Number coId;

            /**
             * 开票类型
             */
            private String invType;

            /**
             * 发票类型
             */
            private String type;

            /**
             * 状态
             */
            private String status;

            /**
             * 支付金额
             */
            private Number paidAmount;

            /**
             * 供应商编号
             */
            private String sellerId;

            /**
             * 创建时间
             */
            private String created;

            /**
             * 创建人编号
             */
            private Number creator;

            /**
             * 最后更新时间
             */
            private String modified;

            /**
             * 最后更新人编号
             */
            private Number modifier;

            /**
             * 创建人名称
             */
            private String creatorName;

            /**
             * 最后修改人名称
             */
            private String modifierName;

            /**
             * 原始单号
             */
            private Number srcPinvId;

            /**
             * 税率
             */
            private String taxRate;

            /**
             * 单据类型
             */
            private String payableType;

            /**
             * 单据日期
             */
            private String payableDate;

            /**
             * 发票日期
             */
            private String pinvDate;

            /**
             * 发票代码
             */
            private String pinvCode;

            /**
             * 发票号码
             */
            private String pinvNumber;

            /**
             * 其他金额
             */
            private Number otherAmount;

            /**
             * 应付总额
             */
            private Number invAmount;

            /**
             * 备注
             */
            private String remark;

            /**
             * 结算状态
             */
            private String paymentStatus;

            /**
             * 总额
             */
            private Number totalInvoiceAmount;

            /**
             * 记录成本
             */
            private String isAdjustCost;

            /**
             * 入库单号
             */
            private Number ioId;

            /**
             * 时间ts
             */
            private Number ts;

            /**
             * 供应商
             */
            private String supplierName;

            /**
             * 应付明细
             */
            private java.util.List<Item> items;

            /**
             * 费用明细
             */
            private java.util.List<FreeItem> freeItems;

            @lombok.Data
            public static class FreeItem {

                /**
                 * 应付费用单号
                 */
                private Number payId;

                /**
                 * 应付单号
                 */
                private Number pinvId;

                /**
                 * 费用金额
                 */
                private Number amount;

                /**
                 * 备注
                 */
                private String remark;

                /**
                 * 费用名称
                 */
                private String seller;
            }

            @lombok.Data
            public static class Item {

                /**
                 * 应付明细单号
                 */
                private Number ipinvId;

                /**
                 * 应付单号
                 */
                private Number pinvId;

                /**
                 * 公司编号
                 */
                private Number coId;

                /**
                 * 采购单号
                 */
                private Number oId;

                /**
                 * 入库单号
                 */
                private Number ioId;

                /**
                 * 入仓明细ID
                 */
                private String ioiId;

                /**
                 * 商品编码
                 */
                private String skuId;

                /**
                 * 核销数量
                 */
                private Number qty;

                /**
                 * 核销金额(含税)
                 */
                private Number amount;

                /**
                 * 应付数量
                 */
                private Number invQty;

                /**
                 * 应付金额（含税）
                 */
                private Number invAmount;

                /**
                 * 调整金额(含税)
                 */
                private Number adjustAmount;
            }
        }
    }
}
