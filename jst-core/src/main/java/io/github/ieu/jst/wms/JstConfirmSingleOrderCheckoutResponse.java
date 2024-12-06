package io.github.ieu.jst.wms;

@lombok.Data
public class JstConfirmSingleOrderCheckoutResponse {

    private Number code;

    /**
     * 提示信息
     */
    private String message;

    /**
     * 匹配sku数量
     */
    private Data data;

    /**
     * 匹配sku数量
     */
    @lombok.Data
    public static class Data {

        private String success;

        private String message;

        private SkuData skuData;

        @lombok.Data
        public static class SkuData {

            /**
             * 商品数量
             */
            private String skuId;

            /**
             * 匹配数量
             */
            private Number qty;
        }
    }
}
