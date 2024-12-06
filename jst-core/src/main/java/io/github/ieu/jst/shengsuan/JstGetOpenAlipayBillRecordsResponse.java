package io.github.ieu.jst.shengsuan;

@lombok.Data
public class JstGetOpenAlipayBillRecordsResponse {

    /**
     * code对应一种特定的错误码
     */
    private String code;

    /**
     * 接口信息
     */
    private String msg;

    /**
     * 胜算日常记账集合
     */
    private Pagination data;

    /**
     * 胜算日常记账集合
     */
    @lombok.Data
    public static class Pagination {

        /**
         * 链路id
         */
        private String tranceId;

        /**
         * 游标
         */
        private Number cursor;

        /**
         * 是否有下一页
         */
        private Boolean hasNext;

        private java.util.List<Data> data;

        @lombok.Data
        public static class Data {

            /**
             * 店铺编号
             */
            private Number shopId;

            /**
             * 数据来源类型
             */
            private String channel;

            /**
             * 账务流水号
             */
            private String outeTradeDetailNo;

            /**
             * 业务流水号
             */
            private String payOrderNo;

            /**
             * 商户订单号
             */
            private String merchantOrderNo;

            /**
             * 商品名称
             */
            private String skuName;

            /**
             * 费用发生时间
             */
            private String feeTime;

            /**
             * 收入金额
             */
            private Number inAmount;

            /**
             * 支出金额
             */
            private Number outAmount;

            /**
             * 余额
             */
            private Number balance;

            /**
             * 业务类型
             */
            private String businessType;

            /**
             * 备注
             */
            private String memo;

            /**
             * 业务描述
             */
            private String businessDesc;

            /**
             * 业务账单来源
             */
            private String businessFrom;

            /**
             * 业务基础订单号
             */
            private String outTradeNo;

            /**
             * 业务订单号
             */
            private String businessOrderNo;

            /**
             * 自定义备注
             */
            private String remark;

            /**
             * 是否被删除：0表示有效数据，大于0表示已被删除
             */
            private Number delFlag;
        }
    }
}
