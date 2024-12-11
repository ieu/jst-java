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
    private java.util.List<Datas> datas;

    @lombok.Data
    public static class Datas {

        /**
         * 应付单号
         */
        private Number pinvid;

        /**
         * 公司编号
         */
        private Number coid;

        /**
         * 开票类型
         */
        private String invtype;

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
        private Number paidamount;

        /**
         * 供应商编号
         */
        private String sellerid;

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
        private String creatorname;

        /**
         * 最后修改人名称
         */
        private String modifiername;

        /**
         * 原始单号
         */
        private Number srcpinvid;

        /**
         * 税率
         */
        private Number taxrate;

        /**
         * 单据类型
         */
        private String payabletype;

        /**
         * 单据日期
         */
        private String payabledate;

        /**
         * 发票日期
         */
        private String pinvdate;

        /**
         * 发票代码
         */
        private String pinvcode;

        /**
         * 发票号码
         */
        private String pinvnumber;

        /**
         * 其他金额
         */
        private Number otheramount;

        /**
         * 应付总额
         */
        private Number invamount;

        /**
         * 备注
         */
        private String remark;

        /**
         * 结算状态
         */
        private String paymentstatus;

        /**
         * 总额
         */
        private Number totalinvoiceamount;

        /**
         * 记录成本
         */
        private String isadjustcost;

        /**
         * 入库单号
         */
        private Number ioid;

        /**
         * 时间ts
         */
        private Number ts;

        /**
         * 供应商
         */
        private String suppliername;

        /**
         * 应付明细
         */
        private java.util.List<Items> items;

        /**
         * 费用明细
         */
        private java.util.List<FreeItems> freeItems;

        @lombok.Data
        public static class FreeItems {

            /**
             * 应付费用单号
             */
            private Number payid;

            /**
             * 应付单号
             */
            private Number pinvid;

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
        public static class Items {

            /**
             * 应付明细单号
             */
            private Number ipinvid;

            /**
             * 应付单号
             */
            private Number pinvid;

            /**
             * 公司编号
             */
            private Number coid;

            /**
             * 采购单号
             */
            private Number oid;

            /**
             * 入库单号
             */
            private Number ioid;

            /**
             * 入仓明细ID
             */
            private Number ioiid;

            /**
             * 商品编码
             */
            private String skuid;

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
            private Number invqty;

            /**
             * 应付金额（含税）
             */
            private Number invamount;

            /**
             * 调整金额(含税)
             */
            private Number adjustamount;
        }
    }
}
