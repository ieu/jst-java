package io.github.ieu.jst.item;

@lombok.Data
public class JstGetSkuBomPageListResponse {

    private Integer code;

    private Data data;

    private String msg;

    private String requestId;

    @lombok.Data
    public static class Data {

        private List list;

        /**
         * 分页信息
         */
        private Page page;

        /**
         * 分页信息
         */
        @lombok.Data
        public static class Page {

            /**
             * 当前页
             */
            private Integer currentPage;

            /**
             * 页大小
             */
            private Integer pageSize;
        }

        @lombok.Data
        public static class List {

            /**
             * 商品编码
             */
            private String skuId;

            /**
             * 款式编码
             */
            private String iId;

            /**
             * 主料BOM信息
             */
            private java.util.List<Bom> boms;

            /**
             * 主料修改人
             */
            private String modifierName;

            /**
             * 主料修改时间
             */
            private String modified;

            /**
             * 辅料BOM信息
             */
            private java.util.List<BomMinor> bomMinors;

            @lombok.Data
            public static class BomMinor {

                /**
                 * 辅料商品编码
                 */
                private Number skuId;

                /**
                 * 关联ERP内部辅料商品编码
                 */
                private String outerSkuId;

                /**
                 * 商品名称
                 */
                private String name;

                /**
                 * 规格属性
                 */
                private String propertiesValue;

                /**
                 * 数量
                 */
                private Number qty;
            }

            @lombok.Data
            public static class Bom {

                /**
                 * 主料商品编码
                 */
                private Number skuId;

                /**
                 * 关联ERP内部主料商品编码
                 */
                private String outerSkuId;

                /**
                 * 商品名称
                 */
                private String name;

                /**
                 * 主料关联编码的autoid
                 */
                private Number mapSkuId;

                /**
                 * 主料关联编码
                 */
                private String mapOuterSkuId;

                /**
                 * 主料名称
                 */
                private String mapName;

                /**
                 * 规格属性
                 */
                private String propertiesValue;

                /**
                 * 关联规格属性
                 */
                private String mapPropertiesValue;

                /**
                 * 图片地址
                 */
                private String pic;

                /**
                 * 主料数量
                 */
                private Number rmQty;
            }
        }
    }
}
