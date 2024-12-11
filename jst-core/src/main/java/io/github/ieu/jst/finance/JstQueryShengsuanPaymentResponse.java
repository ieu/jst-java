package io.github.ieu.jst.finance;

@lombok.Data
public class JstQueryShengsuanPaymentResponse {

    /**
     * 第几页
     */
    private Integer pageIndex;

    /**
     * 每页多少条
     */
    private Integer pageSize;

    /**
     * 是否有下一页
     */
    private Boolean hasNext;

    private java.util.List<Data> datas;

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 是否执行成功
     */
    private Boolean issuccess;

    /**
     * 错误描述
     */
    private String msg;

    @lombok.Data
    public static class Data {

        /**
         * 付款编号
         */
        private String payid;

        /**
         * 公司编号
         */
        private String coid;

        /**
         * 单据日期
         */
        private String paydate;

        /**
         * 状态
         */
        private String status;

        /**
         * 收款银行账号
         */
        private String payaccountnumber;

        /**
         * 收款单位开户行
         */
        private String payprobank;

        /**
         * 往来单位编号
         */
        private String sellerid;

        /**
         * 往来单位名称
         */
        private String seller;

        /**
         * 应付金额
         */
        private String payamount;

        /**
         * 实付金额
         */
        private String amount;

        /**
         * 扣款金额
         */
        private String lessamount;

        /**
         * 付款类型
         */
        private String payway;

        /**
         * 备注
         */
        private String remark;

        /**
         * 创建时间
         */
        private String created;

        /**
         * 创建人编号
         */
        private String creator;

        /**
         * 最后修改时间
         */
        private String modified;

        /**
         * 最后修改人编号
         */
        private String modifier;

        /**
         * 创建人名称
         */
        private String creatorname;

        /**
         * 最后修改人名称
         */
        private String modifiername;

        /**
         * 采购单号
         */
        private String poid;

        /**
         * 付款账号
         */
        private String account;

        /**
         * 是否支付
         */
        private String ispaid;

        /**
         * 打款时间
         */
        private String paiddate;

        /**
         * 标记|多标签
         */
        private String labs;

        /**
         * 往来单位类型
         */
        private String sellertype;

        /**
         * 收款账户名称
         */
        private String payaccountname;

        /**
         * 时间ts
         */
        private String ts;

        /**
         * 明细
         */
        private java.util.List<Item> items;

        @lombok.Data
        public static class Item {

            /**
             * 付款明细编号
             */
            private Integer autoid;

            /**
             * 付款编号
             */
            private Integer payid;

            /**
             * 公司编号
             */
            private Integer coid;

            /**
             * 来源单号（应付单号，费用单号和预付款单号等）
             */
            private Integer ioid;

            /**
             * 本次金额
             */
            private Integer amount;

            /**
             * 类型
             */
            private String type;

            /**
             * 付款编号
             */
            private Integer poid;
        }
    }
}
