package io.github.ieu.jst.warehouse;

@lombok.Data
public class JstGetVirtualStockResponse {

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 错误描述
     */
    private String msg;

    private Number pageIndex;

    private Number pageSize;

    private Number dataCount;

    private Boolean hasNext;

    private java.util.List<Data> data;

    @lombok.Data
    public static class Data {

        /**
         * 商品编码
         */
        private String skuId;

        private java.util.List<Stock> stocks;

        @lombok.Data
        public static class Stock {

            /**
             * 虚拟仓编号
             */
            private Number lwhId;

            /**
             * 虚拟仓名称
             */
            private String name;

            /**
             * 库存数
             */
            private Number qty;

            /**
             * 订单可用数
             */
            private Number orderAbleQty;

            /**
             * 订单占有数
             */
            private Number orderLock;

            /**
             * 仓库待发数
             */
            private Number pickLock;

            /**
             * 最后修改时间
             */
            private String modified;
        }
    }
}
