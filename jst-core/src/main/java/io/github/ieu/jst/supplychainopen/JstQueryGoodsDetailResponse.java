package io.github.ieu.jst.supplychainopen;

@lombok.Data
public class JstQueryGoodsDetailResponse {

    /**
     * 返回码 0表示业务处理成功
     */
    private Integer code;

    /**
     * 错误信息 未获取到商品信息
     */
    private String msg;

    /**
     * 商品信息
     */
    private Data data;

    /**
     * 商品信息
     */
    @lombok.Data
    public static class Data {

        /**
         * 商品ID
         */
        private String itemSpuid;

        /**
         * 商品名称
         */
        private String itemName;

        /**
         * 推荐文案
         */
        private String commendMsg;

        /**
         * 商品描述
         */
        private String describe;

        /**
         * 资料编码(款号)
         */
        private String styleCode;

        /**
         * 宝贝链接
         */
        private String babyLink;

        /**
         * 第一个规格名称 比如:颜色
         */
        private String firstSpecCame;

        /**
         * 第二个规格名称 比如:尺码
         */
        private String secondSpecName;

        /**
         * 商品状态 cantDistribution:不可分销, distribution:可分销, defective:待完善
         */
        private String itemStatus;

        /**
         * 商品私密状态 true:私密商品, 当itemStatus = cantDistribution并且商品私密状态 true:私密商品, 当itemStatus = cantDistribution并且privateStatus = true时,表示不可分销
         */
        private Boolean privateStatus;

        /**
         * 商品来源 ADD: 手工新增 COPY: 复制 EXCEL: EXCEL批量导入 ERP: 基础资料-按商品(SKU)导入 ERP_SPU: 基础资料-按款导入 FROM_SUP: 从供应商导入 ERP_SHELVE: ERP快速铺货生成 DRP_COMBO: 分销组合装创建
         */
        private String itemSource;

        /**
         * 创建时间
         */
        private String created;

        /**
         * 创建人
         */
        private String creator;

        /**
         * 叶子类目名称(最后一级的类目名称)
         */
        private String leafCategoryName;

        /**
         * 叶子类目ID(最后一级的类目ID)
         */
        private String leafCategoryId;

        /**
         * 类目树ID列表(全链路类目ID)
         */
        private java.util.List<String> categoryTree;

        private ItemPhoto itemPhoto;

        private java.util.List<ItemSkuList> itemSkuList;

        @lombok.Data
        public static class ItemSkuList {

            /**
             * skuId
             */
            private String skuId;

            /**
             * 商品ID
             */
            private String itemSpuid;

            /**
             * 第一个规格值名称 比如:黑色
             */
            private String firstSpecValuenName;

            /**
             * 第二个规格值名称 比如:大号
             */
            private String secondSpecValueName;

            /**
             * 商品编码
             */
            private String itemCode;

            /**
             * 商品简称
             */
            private String shortName;

            /**
             * 基本售价
             */
            private Number supplyPrice;

            /**
             * 成本价
             */
            private Number costPrice;

            /**
             * 零售价
             */
            private Number salePrice;

            /**
             * 重量
             */
            private Number weight;

            /**
             * sku图片链接
             */
            private String pic;

            /**
             * sku类型 normal:普通商品,combine: 组合商品
             */
            private String skuType;

            /**
             * 1级分销价
             */
            private Number levelOneDistributorPrice;

            /**
             * 2级分销价
             */
            private Number levelTwoDistributorPrice;

            /**
             * 3级分销价
             */
            private Number levelThreeDistributorPrice;

            /**
             * 4级分销价
             */
            private Number levelFourDistributorPrice;

            /**
             * 5级分销价
             */
            private Number levelFiveDistributorPrice;
        }

        @lombok.Data
        public static class ItemPhoto {

            /**
             * 相册ID
             */
            private String photoId;

            /**
             * 备用图
             */
            private java.util.List<String> itemSpareImage;

            /**
             * 详情图
             */
            private java.util.List<String> itemDetailImages;

            /**
             * 主图
             */
            private java.util.List<String> mainImageList;

            /**
             * 长图
             */
            private String itemLongImage;

            /**
             * 透明素材图
             */
            private String transparentImage;

            /**
             * 白底图
             */
            private String whiteImage;

            /**
             * 3:4视频链接
             */
            private String itemVideo;

            /**
             * 16:9视频链接
             */
            private String goodsVideo;
        }
    }
}
