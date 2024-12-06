package io.github.ieu.jst.item;

@lombok.Data
public class JstQueryCombineSkuResponse {

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 错误描述
     */
    private String msg;

    private Data data;

    @lombok.Data
    public static class Data {

        /**
         * 每页多少条
         */
        private Integer pageSize;

        /**
         * 第几页
         */
        private Integer pageIndex;

        /**
         * 总条数
         */
        private Integer dataCount;

        /**
         * 总页数
         */
        private Integer pageCount;

        /**
         * 是否有下一页
         */
        private Boolean hasNext;

        /**
         * 数据集合
         */
        private java.util.List<Datas> datas;

        @lombok.Data
        public static class Datas {

            /**
             * 组合装款式编码
             */
            private String iId;

            /**
             * 组合装商品名称
             */
            private String name;

            /**
             * 组合装简称
             */
            private String shortName;

            /**
             * 虚拟分类
             */
            private String vcName;

            /**
             * 图片地址
             */
            private String pic;

            /**
             * 组合装颜色及规格
             */
            private String propertiesValue;

            /**
             * 组合装售价
             */
            private Number salePrice;

            /**
             * 组合装重量
             */
            private Number weight;

            /**
             * 组合装商品编码
             */
            private String skuId;

            /**
             * 修改时间
             */
            private String modified;

            /**
             * 创建时间
             */
            private String created;

            /**
             * 组合商品实体编码
             */
            private String entySkuId;

            /**
             * 标签
             */
            private String labels;

            /**
             * 品牌
             */
            private String brand;

            /**
             * <div><a href="https://cdn.erp321.cn/jst-fed/0202f38a-7bae-4277-913b-31d3cbf9e143_1284_474.jpg" target="_blank">组合装商品成本价</a></div>
             */
            private Number costPrice;

            /**
             * 是否启用   1表示启用；0表示备用；-1表示禁用
             */
            private Number enabled;

            /**
             * 国标码
             */
            private String skuCode;

            /**
             * 其它价格1
             */
            private Number otherPrice_1;

            /**
             * 其它价格2
             */
            private Number otherPrice_2;

            /**
             * 其它价格3
             */
            private Number otherPrice_3;

            /**
             * 其它价格4
             */
            private Number otherPrice_4;

            /**
             * 其它价格5
             */
            private Number otherPrice_5;

            /**
             * 其它属性1
             */
            private String other_1;

            /**
             * 其它属性2
             */
            private String other_2;

            /**
             * 其它属性3
             */
            private String other_3;

            /**
             * 其它属性4
             */
            private String other_4;

            /**
             * 其它属性5
             */
            private String other_5;

            /**
             * 长
             */
            private Number l;

            /**
             * 宽
             */
            private Number w;

            /**
             * 高
             */
            private Number h;

            /**
             * 体积
             */
            private Number volume;

            /**
             * 商品属性
             */
            private String itemType;

            /**
             * 备注
             */
            private String remark;

            /**
             * 子商品数量
             */
            private Integer skuQty;

            /**
             * 商品列表
             */
            private java.util.List<Items> items;

            @lombok.Data
            public static class Items {

                /**
                 * 子商品编码
                 */
                private String srcSkuId;

                /**
                 * 子商品数量
                 */
                private Integer qty;

                /**
                 * 应占售价
                 */
                private Number salePrice;

                /**
                 * 修改时间
                 */
                private String modified;

                /**
                 * 组合装商品编码
                 */
                private String combineSkuId;
            }
        }
    }
}
