package io.github.ieu.jst.item;

@lombok.Data
@lombok.Builder
public class JstSaveBomRequest {

    /**
     * 商品主料集合
     */
    private java.util.List<BomList> bomList;

    /**
     * 商品辅料集合
     */
    private java.util.List<MinorList> minorList;

    @lombok.Data
    public static class MinorList {

        /**
         * 辅料商品编码
         */
        private String outerSkuId;

        /**
         * 款式编码
         */
        private String iId;

        /**
         * 是否删除辅料，默认false
         */
        private Boolean isDelete;
    }

    @lombok.Data
    public static class BomList {

        /**
         * 主料数量，不填，默认1
         */
        private Number rmQty;

        /**
         * 成品商品编码
         */
        private String outerSkuId;

        /**
         * 主料商品编码
         */
        private String mapOuterSkuId;

        /**
         * 款式编码
         */
        private String iId;

        /**
         * 是否删除主料，默认false
         */
        private Boolean isDelete;
    }
}
