package io.github.ieu.jst.shengsuan;

/**
 * 根目录
 */
@lombok.Data
public class JstGetOpenFeeFlowingResponse {

    /**
     * 0表示正常
     */
    private Number code;

    /**
     * 错误提示文案
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
             * 记录流水号
             */
            private Number autoId;

            /**
             * 店铺编码
             */
            private Number shopId;

            /**
             * 费用金额
             */
            private Number amount;

            /**
             * 费用发生时间
             */
            private String feeTime;

            /**
             * 审核状态
             */
            private String status;

            /**
             * 是否按日期分摊
             */
            private Number isSplit;

            /**
             * 分摊开始时间
             */
            private String splitBeginDate;

            /**
             * 分摊结束时间
             */
            private String splitEndDate;

            /**
             * 备注
             */
            private String remark;

            /**
             * 账户编码
             */
            private String account;

            /**
             * 账户名称
             */
            private String accountName;

            /**
             * 利润表项目编码
             */
            private String csgCode;

            /**
             * 利润表项目名称
             */
            private String csgName;

            /**
             * 利润表项目收支方向:1表示收入，其它值均表示支出
             */
            private Number csgIo;

            /**
             * 利润表项目Id
             */
            private String csgId;

            /**
             * 1-已发生费用;   0-预估费用;
             */
            private String feeType;

            /**
             * 原币金额
             */
            private String ocAmount;

            /**
             * 原币币种的代码，可到ERP的“汇率管理”菜单中查看币种名称
             */
            private String currency;

            /**
             * 是否被删除：0表示有效数据，大于0表示已被删除
             */
            private Number delFlag;
        }
    }
}
