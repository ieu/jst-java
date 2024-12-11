package io.github.ieu.jst.item;

@lombok.Data
public class JstGetHistoryCostPriceV2Response {

    private Integer code;

    private Data data;

    private String msg;

    private String requestId;

    @lombok.Data
    public static class Data {

        /**
         * 商品历史成本价字典，keys是wmsCoId
         */
        private java.util.Map<String, java.util.List<SkuHistoryCostPrice>> skuHistoryCostPriceMaps;

        /**
         * 商品历史成本价字典，keys是wmsCoId
         */
        @lombok.Data
        public static class SkuHistoryCostPrice {

            /**
             * 商品编码
             */
            private String skuId;

            /**
             * 成本价
             */
            private String costPrice;

            /**
             * 开始日期
             */
            private String beginDate;

            /**
             * 结束日期
             */
            private String endDate;

            /**
             * 备注
             */
            private String remark;
        }
    }
}
