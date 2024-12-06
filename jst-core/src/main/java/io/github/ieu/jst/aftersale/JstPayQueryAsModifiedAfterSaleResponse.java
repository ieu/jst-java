package io.github.ieu.jst.aftersale;

@lombok.Data
public class JstPayQueryAsModifiedAfterSaleResponse {

    private Integer code;

    private Data data;

    /**
     * 返回信息
     */
    private String msg;

    /**
     * 请求id
     */
    private String requestId;

    @lombok.Data
    public static class Data {

        private Integer pageSize;

        private Integer pageIndex;

        private Integer pageCount;

        private Integer dataCount;

        private java.util.List<Datas> datas;

        @lombok.Data
        public static class Datas {

            /**
             * 店铺编码
             */
            private Integer shopId;

            /**
             * 售后单
             */
            private Integer asId;

            /**
             * 内部订单号
             */
            private Integer oId;

            /**
             * 退款单号
             */
            private Integer payId;

            /**
             * 退款时间
             */
            private String payDate;

            /**
             * 审核时间
             */
            private String confirmDate;

            /**
             * 修改时间
             */
            private String modified;

            /**
             * 原订单已付金额
             */
            private Number amount;

            /**
             * 状态
             */
            private String status;

            /**
             * 退款方式
             */
            private String payment;

            /**
             * 分销商id
             */
            private Integer drpCoIdFrom;

            /**
             * 分页用时间戳
             */
            private Integer ts;
        }
    }
}
