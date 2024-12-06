package io.github.ieu.jst.crossborder;

@lombok.Data
public class JstLoadAllocateFeeResponse {

    private Data data;

    /**
     * 0表示成功
     */
    private Number code;

    /**
     * 返回信息
     */
    private String msg;

    @lombok.Data
    public static class Data {

        /**
         * 调拨单头程费用集合
         */
        private java.util.List<AllocatefeeDetailList> allocatefeeDetailList;

        @lombok.Data
        public static class AllocatefeeDetailList {

            /**
             * 调拨单号
             */
            private Number transferNo;

            /**
             * 修改时间
             */
            private String modifyTime;

            /**
             * 商品费用集合
             */
            private java.util.List<SkufeeDetailList> skufeeDetailList;

            @lombok.Data
            public static class SkufeeDetailList {

                /**
                 * 商品编码
                 */
                private String skuId;

                /**
                 * 运费
                 */
                private Number freightPrice;

                /**
                 * 运费币种
                 */
                private String freightCurrency;

                /**
                 * 关税
                 */
                private Number tariffPrice;

                /**
                 * 关税币种
                 */
                private String tariffCurrency;

                /**
                 * 其他费用
                 */
                private Number otherCostPrice;

                /**
                 * 其他费用币种
                 */
                private String otherCostCurrency;
            }
        }
    }
}
