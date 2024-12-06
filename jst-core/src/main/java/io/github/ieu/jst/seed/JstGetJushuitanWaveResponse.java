package io.github.ieu.jst.seed;

@lombok.Data
public class JstGetJushuitanWaveResponse {

    /**
     * true代表成功
     */
    private Boolean issuccess;

    /**
     * 执行描述
     */
    private String msg;

    private Data data;

    @lombok.Data
    public static class Data {

        /**
         * 批次号
         */
        private Integer waveId;

        /**
         * 订单数量
         */
        private Integer orderCount;

        /**
         * 商品种类数量
         */
        private Integer skuCount;

        /**
         * 商品数量
         */
        private Integer skuQty;

        /**
         * 批次状态
         */
        private String status;

        /**
         * 批次状态
         */
        private String created;

        /**
         * 备注
         */
        private String remark;

        /**
         * 出库单集合
         */
        private java.util.List<Inouts> inouts;

        @lombok.Data
        public static class Inouts {

            /**
             * 出库单号
             */
            private Integer ioId;

            /**
             * 内部订单号
             */
            private Integer oId;

            /**
             * 播种柜号
             */
            private Integer idx;

            /**
             * 快递单号
             */
            private String lId;

            /**
             * 快递编码
             */
            private String lcId;

            /**
             * 物流公司名称
             */
            private String logisticsCompany;

            /**
             * 出库单状态
             */
            private String status;

            /**
             * 播种商品集合
             */
            private java.util.List<Items> items;

            @lombok.Data
            public static class Items {

                /**
                 * 商品编码
                 */
                private String skuId;

                /**
                 * 款式编码
                 */
                private String iId;

                /**
                 * 商品名称
                 */
                private String name;

                /**
                 * 商品数量
                 */
                private Integer qty;

                /**
                 * 已播数数量
                 */
                private Integer seedQty;

                /**
                 * 样式
                 */
                private String propertiesValue;

                /**
                 * 商品自增键
                 */
                private Integer ioiId;
            }
        }
    }
}
