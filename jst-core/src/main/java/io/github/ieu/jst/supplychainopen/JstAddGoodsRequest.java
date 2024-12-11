package io.github.ieu.jst.supplychainopen;

@lombok.Data
@lombok.Builder
public class JstAddGoodsRequest {

    /**
     * 商品名称 长度最多100
     */
    private String itemName;

    /**
     * 推荐文案 长度最多200
     */
    private String commendMsg;

    /**
     * 商品描述 长度最多500
     */
    private String describ;

    /**
     * 资料编码(款号) 长度最多64
     */
    private String styleCode;

    /**
     * 宝贝链接 长度最多1024,必须是http链接
     */
    private String babyLink;

    /**
     * 商品类目ID(从inneropen/category/queryCategorybypid (根据父类目ID查询子类目列表接口获取))如果不是叶子类目ID, 接口报错,如果传的类目ID在供应链不存在,接口不会报错,会跳过设置(不会设置类目)
     */
    private String categoryId;

    /**
     * 第一个规格名称,比如:颜色 长度最多128
     */
    private String firstSpecName;

    /**
     * 第二个规格名称,比如:尺码 长度最多128
     */
    private String secondSpecName;

    /**
     * 商品相册信息
     */
    private ItemPhoto itemPhoto;

    /**
     * SKU列表,最多1500个
     */
    private java.util.List<ItemSku> itemSkuList;

    @lombok.Data
    public static class ItemSku {

        /**
         * 第一个规格值名称 长度最多100
         */
        private String firstSpecValueName;

        /**
         * 第二个规格值名称 长度最多100
         */
        private String secondSpecValueName;

        /**
         * 商品编码 长度最多255
         */
        private String itemCode;

        /**
         * 商品简称 长度最多40
         */
        private String shortName;

        /**
         * 基本售价,单位元 最多999999.9999
         */
        private Number supplyPrice;

        /**
         * 成本价,单位元 最多999999.9999
         */
        private Number costPrice;

        /**
         * 零售价,单位元 最多999999.9999
         */
        private Number salePrice;

        /**
         * 重量 最多999999
         */
        private Number weight;

        /**
         * SKU图片 长度最多300,必须是聚水潭分销版图片链接
         */
        private String pic;
    }

    /**
     * 商品相册信息
     */
    @lombok.Data
    public static class ItemPhoto {

        /**
         * 备用图 最多41个聚水潭分销版图片链接
         */
        private java.util.List<String> itemSpareImage;

        /**
         * 详情图 最多100个聚水潭分销版图片链接
         */
        private java.util.List<String> itemDetailImages;

        /**
         * 主图 最多9个聚水潭分销版图片链接
         */
        private java.util.List<String> mainImageList;

        /**
         * 长图 长度最多512,必须是聚水潭分销版图片链接
         */
        private String itemLongImage;

        /**
         * 透明素材图 长度最多512,必须是聚水潭分销版图片链接
         */
        private String transparentImage;

        /**
         * 白底图 长度最多512,必须是聚水潭分销版图片链接
         */
        private String whiteImage;
    }
}
