package io.github.ieu.jst.seed;

@lombok.Data
@lombok.Builder
public class JstReturnSeedRequest {

    /**
     * 批次号
     */
    private Number waveId;

    /**
     * 出库信息集合
     */
    private java.util.List<Data> datas;

    @lombok.Data
    public static class Data {

        /**
         * 出库单号
         */
        private Number ioId;

        /**
         * 商品集合
         */
        private java.util.List<Item> items;

        @lombok.Data
        public static class Item {

            /**
             * 商品编码
             */
            private String skuid;

            /**
             * 商品唯一码
             */
            private String skusn;

            /**
             * 出库明细号
             */
            private String ioiId;

            /**
             * 本次播种数量
             */
            private Number qty;

            /**
             * 累计播种数量
             */
            private Number seedQty;
        }
    }
}
