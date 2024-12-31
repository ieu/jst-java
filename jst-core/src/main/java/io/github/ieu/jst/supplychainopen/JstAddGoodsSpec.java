package io.github.ieu.jst.supplychainopen;

public class JstAddGoodsSpec {

    private final JstSupplyChainOpenClient client;

    private final JstAddGoodsRequest.JstAddGoodsRequestBuilder requestBuilder = JstAddGoodsRequest.builder();

    public JstAddGoodsSpec(JstSupplyChainOpenClient client) {
        this.client = client;
    }

    /**
     * 商品名称 长度最多100
     */
    public JstAddGoodsSpec itemName(String itemName) {
        requestBuilder.itemName(itemName);
        return this;
    }

    /**
     * 推荐文案 长度最多200
     */
    public JstAddGoodsSpec commendMsg(String commendMsg) {
        requestBuilder.commendMsg(commendMsg);
        return this;
    }

    /**
     * 商品描述 长度最多500
     */
    public JstAddGoodsSpec describ(String describ) {
        requestBuilder.describ(describ);
        return this;
    }

    /**
     * 资料编码(款号) 长度最多64
     */
    public JstAddGoodsSpec styleCode(String styleCode) {
        requestBuilder.styleCode(styleCode);
        return this;
    }

    /**
     * 宝贝链接 长度最多1024,必须是http链接
     */
    public JstAddGoodsSpec babyLink(String babyLink) {
        requestBuilder.babyLink(babyLink);
        return this;
    }

    /**
     * 商品类目ID(从inneropen/category/queryCategorybypid (根据父类目ID查询子类目列表接口获取))如果不是叶子类目ID, 接口报错,如果传的类目ID在供应链不存在,接口不会报错,会跳过设置(不会设置类目)
     */
    public JstAddGoodsSpec categoryId(String categoryId) {
        requestBuilder.categoryId(categoryId);
        return this;
    }

    /**
     * 第一个规格名称,比如:颜色 长度最多128
     */
    public JstAddGoodsSpec firstSpecName(String firstSpecName) {
        requestBuilder.firstSpecName(firstSpecName);
        return this;
    }

    /**
     * 第二个规格名称,比如:尺码 长度最多128
     */
    public JstAddGoodsSpec secondSpecName(String secondSpecName) {
        requestBuilder.secondSpecName(secondSpecName);
        return this;
    }

    /**
     * 商品相册信息
     */
    public JstAddGoodsSpec itemPhoto(JstAddGoodsRequest.ItemPhoto itemPhoto) {
        requestBuilder.itemPhoto(itemPhoto);
        return this;
    }

    /**
     * SKU列表,最多1500个
     */
    public JstAddGoodsSpec itemSkuList(java.util.List<JstAddGoodsRequest.ItemSku> itemSkuList) {
        requestBuilder.itemSkuList(itemSkuList);
        return this;
    }

    public JstAddGoodsResponse response() {
        return this.client.addGoods(requestBuilder.build());
    }
}
