package io.github.ieu.jst.item;

@lombok.Data
public class JstQuerySkuMapResponse {

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
             * 公司编号
             */
            private Integer coId;

            /**
             * 店铺编号
             */
            private Integer shopId;

            /**
             * 来源平台：https://jushuitan.yuque.com/docs/share/d34de6aa-9613-4bc3-8a6e-12b20523925f?# 《channel 来源平台 枚举值》密码：glnu
             */
            private String channel;

            /**
             * 款式编码（线上款式编码）
             */
            private String iId;

            /**
             * 商品编码（线上商品编码）
             */
            private String skuId;

            /**
             * 店铺款式编码（平台店铺款式编码）
             */
            private String shopIId;

            /**
             * 店铺商品编码（平台店铺商品编码）
             */
            private String shopSkuId;

            /**
             * 修改时间
             */
            private String modified;

            /**
             * 商品对应关系修改时间
             */
            private String linkModified;

            /**
             * 是否上架
             */
            private Boolean enabled;

            /**
             * 类目编码（类目ID）
             */
            private Integer cId;

            /**
             * 原始商品编码（未经系统处理的线上商品编码原值）
             */
            private String rawSkuId;

            /**
             * 平台价格（店铺售价）,系统中需开启相关配置
             */
            private String shopPrice;

            /**
             * 平台商品名称（线上商品名称）
             */
            private String name;

            /**
             * 线上颜色规格
             */
            private String propertiesValue;

            /**
             * 款式图片
             */
            private String pic;

            /**
             * 创建时间
             */
            private String created;

            /**
             * 平台创建时间
             */
            private String shopCreated;

            /**
             * 下架时间
             */
            private String pullOffTime;

            /**
             * 线上国标码
             */
            private String outerSkuCode;

            /**
             * 链接同步设置，0是开启同步，2是禁止同步
             */
            private Integer type;

            /**
             * 店铺库存
             */
            private Number shopQty;

            /**
             * 对应商品编码（商品对应关系页面）
             */
            private String linkSkuId;

            /**
             * 售价下限
             */
            private Integer salePriceMin;

            /**
             * 售价上限
             */
            private Integer salePriceMax;
        }
    }
}
