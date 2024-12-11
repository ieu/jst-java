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
        private SkuHistoryCostPriceMaps skuHistoryCostPriceMaps;

        /**
         * 商品历史成本价字典，keys是wmsCoId
         */
        @lombok.Data
        public static class SkuHistoryCostPriceMaps {
        }
    }
}
