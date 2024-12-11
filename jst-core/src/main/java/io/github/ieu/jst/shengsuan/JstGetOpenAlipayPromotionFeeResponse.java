package io.github.ieu.jst.shengsuan;

/**
 * 根目录
 */
@lombok.Data
public class JstGetOpenAlipayPromotionFeeResponse {

    /**
     * 0表示正常
     */
    private Integer code;

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
             * 费用发生时间
             */
            private String feeTime;

            /**
             * 费用金额
             */
            private Number amount;

            /**
             * 费用名称
             */
            private String feeName;

            /**
             * 平台类型
             */
            private String channel;

            /**
             * 利润表项目编码
             */
            private String csgCode;

            /**
             * 利润表项目名称
             */
            private String csgName;

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
