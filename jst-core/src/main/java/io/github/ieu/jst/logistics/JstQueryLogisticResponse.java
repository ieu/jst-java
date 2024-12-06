package io.github.ieu.jst.logistics;

@lombok.Data
public class JstQueryLogisticResponse {

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 错误描述
     */
    private String msg;

    private Data data;

    @lombok.Data
    public static class Data {

        /**
         * 每页多少条
         */
        private Integer pageSize;

        /**
         * 第几页
         */
        private Integer pageIndex;

        /**
         * 总条数
         */
        private Integer dataCount;

        /**
         * 总页数
         */
        private Integer pageCount;

        /**
         * 是否有下一页
         */
        private Boolean hasNext;

        /**
         * 数据集合
         */
        private java.util.List<Orders> orders;

        @lombok.Data
        public static class Orders {

            /**
             * ERP订单号;唯一
             */
            private Integer oId;

            /**
             * 店铺编号
             */
            private Integer shopId;

            /**
             * 订单号，最长不超过50;唯一
             */
            private String soId;

            /**
             * 发货时间
             */
            private String sendDate;

            /**
             * 运费
             */
            private Number freight;

            /**
             * 重量
             */
            private Number weight;

            /**
             * 快递公司代码
             */
            private String lcId;

            /**
             * 快递单号
             */
            private String lId;

            /**
             * 快递公司
             */
            private String logisticsCompany;

            /**
             * 订单明细；商品信息
             */
            private java.util.List<Items> items;

            @lombok.Data
            public static class Items {

                /**
                 * 商家SKU，对应库存管理的SKU
                 */
                private String skuId;

                /**
                 * 购买数量
                 */
                private Integer qty;

                /**
                 * 子订单号
                 */
                private String outerOiId;

                /**
                 * 原始平台订单号，可以为空，最长不超过50
                 */
                private String rawSoId;

                /**
                 * 内部单号
                 */
                private String oId;

                /**
                 * 商品退款状态
                 */
                private String refundStatus;
            }
        }
    }
}
