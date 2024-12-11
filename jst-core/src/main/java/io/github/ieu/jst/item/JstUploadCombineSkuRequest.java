package io.github.ieu.jst.item;

@lombok.Data
@lombok.Builder
public class JstUploadCombineSkuRequest {

    /**
     * 存在是否覆盖，默认值true，true:是,false:否
     */
    private Boolean isCover;

    /**
     * 空值是否覆盖，默认值false，true:是,false:否
     */
    private Boolean isNullCover;

    /**
     * 一次最多上传50个
     */
    private java.util.List<Item> items;

    @lombok.Data
    public static class Item {

        /**
         * <div><a href="https://cdn.erp321.cn/jst-fed/c73eef94-c221-404c-a0d8-f5f666a9f943_2002_402.png" target="_blank">商品编码</a></div>
         */
        private String skuId;

        /**
         * <div><a href="https://cdn.erp321.cn/jst-fed/c5aff92b-99d9-48cc-95ab-bb4a46c986d2_2068_418.png" target="_blank">商品款号</a></div>可更新
         */
        private String iId;

        /**
         * <div><a href="https://cdn.erp321.cn/jst-fed/8915b537-f6c8-4e70-9df4-eaf842a22d37_2295_496.png" target="_blank">实体编码</a></div>只能传普通商品资料已有的编码并且只能用于一个组合装商品中
         */
        private String entySkuId;

        /**
         * <div><a href="https://cdn.erp321.cn/jst-fed/2a1bed76-3000-47e2-9aaf-047824927cb6_1966_456.png" target="_blank">商品名称</a></div>可更新
         */
        private String name;

        /**
         * 组合颜色及规格；可更新
         */
        private String propertiesValue;

        /**
         * 品牌；可更新
         */
        private String brand;

        /**
         * 成本价；可更新
         */
        private Number costPrice;

        /**
         * <div><a href="https://cdn.erp321.cn/jst-fed/f84594e7-da93-4f03-91cb-58c51fcb1556_2116_471.png" target="_blank">图片</a></div>可更新
         */
        private String pic;

        /**
         * 简称；可更新
         */
        private String shortName;

        /**
         * 备注；可更新
         */
        private String remark;

        /**
         * 是否启用，支持传“启用”，“备用”，“禁用”，不传该字段默认启用；可更新
         */
        private String enabled;

        private java.util.List<Child> childlist;

        /**
         * 是否追加标签；true追加，false全覆盖
         */
        private Boolean isAddLabels;

        /**
         * 移除标签；多个标签逗号间隔
         */
        private String deletedLabels;

        /**
         * 多标签，逗号分隔，最长200字符，仅可追加系统维护的标签，部分特定标签如奇门WMS,每日加权等标签不可追加
         */
        private String labels;

        @lombok.Data
        public static class Child {

            /**
             * <div><a href="https://cdn.erp321.cn/jst-fed/6e143d05-8f09-4373-9c9b-df7112d55a43_2501_1092.png" target="_blank">商品编码</a></div>可更新
             */
            private String srcSkuId;

            /**
             * 数量；可更新
             */
            private Integer qty;

            /**
             * 应占售价；可更新
             */
            private Number salePrice;
        }
    }
}
