package io.github.ieu.jst.item;

@lombok.Data
public class JstQueryMallItemResponse {

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 错误描述
     */
    private String msg;

    private Pagination data;

    @lombok.Data
    public static class Pagination {

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
        private java.util.List<Data> datas;

        @lombok.Data
        public static class Data {

            /**
             * 款式编码
             */
            private String iId;

            /**
             * 公司编号
             */
            private Integer coId;

            /**
             * 商品名称
             */
            private String name;

            /**
             * 商品分类编号
             */
            private Integer cId;

            /**
             * 商品分类名称
             */
            private String cName;

            /**
             * 基本售价（款式）
             */
            private Number sPrice;

            /**
             * 成本价(采购价)
             */
            private Number cPrice;

            /**
             * 商品备注
             */
            private String remark;

            /**
             * 图片地址
             */
            private String pic;

            /**
             * 创建时间
             */
            private String created;

            /**
             * 修改时间
             */
            private String modified;

            /**
             * 品牌
             */
            private String brand;

            /**
             * 重量
             */
            private Number weight;

            /**
             * 市场|吊牌价
             */
            private String marketPrice;

            /**
             * 虚拟分类
             */
            private String vcName;

            /**
             * 商品属性：成品/半成品/原材料
             */
            private String itemType;

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
             * 保质期(天）
             */
            private Integer shelfLife;

            /**
             * sku列表
             */
            private java.util.List<Sku> skus;

            /**
             * 商品属性集合，对应款式明细里面的类目属性
             */
            private java.util.List<Up> ups;

            /**
             * 生产批次信息
             */
            private String productionbatchFormat;

            /**
             * 生产许可证
             */
            private String productionLicence;

            /**
             * 单位
             */
            private String unit;

            @lombok.Data
            public static class Up {

                /**
                 * 属性编号
                 */
                private Integer pId;

                /**
                 * 属性列名
                 */
                private String pName;

                /**
                 * 属性值编号
                 */
                private Integer pvId;

                /**
                 * 属性值名称
                 */
                private String pvValue;
            }

            @lombok.Data
            public static class Sku {

                /**
                 * 公司编号
                 */
                private Integer coId;

                /**
                 * 商品编码
                 */
                private String skuId;

                /**
                 * 款式编码
                 */
                private String iId;

                /**
                 * 商品名称
                 */
                private String name;

                /**
                 * 商品分类编号
                 */
                private Integer cId;

                /**
                 * 品牌
                 */
                private String brand;

                /**
                 * 市场|吊牌价
                 */
                private Number marketPrice;

                /**
                 * 基本售价
                 */
                private Number salePrice;

                /**
                 * 成本价
                 */
                private Number costPrice;

                /**
                 * 是否启用，默认值1,可选值:-1=禁用,0=备用,1=启用
                 */
                private Integer enabled;

                /**
                 * 分类
                 */
                private String category;

                /**
                 * 创建人编号
                 */
                private String creator;

                /**
                 * 修改人编号
                 */
                private String modifier;

                /**
                 * 创建人名称
                 */
                private String creatorName;

                /**
                 * 修改人名称
                 */
                private String modifierName;

                /**
                 * 颜色及规格
                 */
                private String propertiesValue;

                /**
                 * 国际码
                 */
                private String skuCode;

                /**
                 * 采购价
                 */
                private Integer purchasePrice;

                /**
                 * 图片地址
                 */
                private String pic;

                /**
                 * 大图地址
                 */
                private String picBig;

                /**
                 * 重量
                 */
                private Number weight;

                /**
                 * 简称
                 */
                private String shortName;

                /**
                 * 商品属性，可选值["成品","半成品","原材料","包材"]
                 */
                private String itemType;

                /**
                 * 供应商编码
                 */
                private Integer supplierId;

                /**
                 * 供应商名称
                 */
                private String supplierName;

                /**
                 * 供应商商品编码
                 */
                private String supplierSkuId;

                /**
                 * 供应商款式编码
                 */
                private String supplierIId;

                /**
                 * 商品备注
                 */
                private String remark;

                /**
                 * 虚拟分类
                 */
                private String vcName;

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
                 * 商品标签
                 */
                private String labels;

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
                 * 单位
                 */
                private String unit;

                /**
                 * 保质期
                 */
                private String shelfLife;

                /**
                 * 生产批次信息
                 */
                private String productionbatchFormat;

                /**
                 * 生产许可证
                 */
                private String productionLicence;

                /**
                 * 供销商编号
                 */
                private Integer drpCoIdTo;
            }
        }
    }
}
