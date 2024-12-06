package io.github.ieu.jst.wms;

@lombok.Data
public class JstLoadOrderChangeStatisticsResponse {

    private String code;

    private String act;

    private Data data;

    private String msg;

    @lombok.Data
    public static class Data {

        private Number totalItems;

        private Boolean hasNext;

        private java.util.List<Items> items;

        @lombok.Data
        public static class Items {

            /**
             * 操作人
             */
            private String creatorName;

            /**
             * 操作时间
             */
            private String created;

            /**
             * 原商品编码
             */
            private String srcSkuId;

            /**
             * 替换商品编码
             */
            private String newSkuId;

            /**
             * 原商品总数
             */
            private String sumQty;

            /**
             * 应替换商品总数
             */
            private Number sumExpectQty;

            /**
             * 应替换比例
             */
            private Number expectPercent;

            /**
             * 实际替换商品数
             */
            private Number sumRealQty;

            /**
             * 实际替换比例
             */
            private Number realPercent;
        }
    }
}
