package io.github.ieu.jst.supplychainopen;

public class JstUpdateGoodsSpec {

    private final JstSupplyChainOpenClient client;

    private final JstUpdateGoodsRequest.JstUpdateGoodsRequestBuilder requestBuilder = JstUpdateGoodsRequest.builder();

    public JstUpdateGoodsSpec(JstSupplyChainOpenClient client) {
        this.client = client;
    }

    /**
     * 商品名称 长度最多100
     */
    public JstUpdateGoodsSpec itemName(String itemName) {
        requestBuilder.itemName(itemName);
        return this;
    }

    /**
     * 商品ID 可通过/open/api/goods/inneropen/goods/querygoodsdetail 或者 /open/api/goods/inneropen/goods/querygoodslist 获取
     */
    public JstUpdateGoodsSpec itemSpuId(String itemSpuId) {
        requestBuilder.itemSpuId(itemSpuId);
        return this;
    }

    /**
     * 推荐文案 长度最多200
     */
    public JstUpdateGoodsSpec commendMsg(String commendMsg) {
        requestBuilder.commendMsg(commendMsg);
        return this;
    }

    /**
     * 商品描述 长度最多500
     */
    public JstUpdateGoodsSpec describ(String describ) {
        requestBuilder.describ(describ);
        return this;
    }

    /**
     * 资料编码(款号) 长度最多64（2秒内不能重复修改同一个style_code）
     */
    public JstUpdateGoodsSpec styleCode(String styleCode) {
        requestBuilder.styleCode(styleCode);
        return this;
    }

    /**
     * 宝贝链接 长度最多1024,必须是http链接
     */
    public JstUpdateGoodsSpec babyLink(String babyLink) {
        requestBuilder.babyLink(babyLink);
        return this;
    }

    /**
     * 第一个规格名称,比如:颜色 长度最多128
     */
    public JstUpdateGoodsSpec firstSpecName(String firstSpecName) {
        requestBuilder.firstSpecName(firstSpecName);
        return this;
    }

    /**
     * 第二个规格名称,比如:尺码 长度最多128
     */
    public JstUpdateGoodsSpec secondSpecName(String secondSpecName) {
        requestBuilder.secondSpecName(secondSpecName);
        return this;
    }

    /**
     * 商品类目ID(从inneropen/category/queryCategorybypid (根据父类目ID查询子类目列表接口获取))如果不是叶子类目ID, 接口报错,如果传的类目ID在供应链不存在,接口不会报错,会跳过设置(不会设置类目)
     */
    public JstUpdateGoodsSpec categoryId(String categoryId) {
        requestBuilder.categoryId(categoryId);
        return this;
    }

    /**
     * 商品相册信息
     */
    public JstUpdateGoodsSpec itemPhoto(JstUpdateGoodsRequest.ItemPhoto itemPhoto) {
        requestBuilder.itemPhoto(itemPhoto);
        return this;
    }

    public JstUpdateGoodsSpec itemSkuList(java.util.List<JstUpdateGoodsRequest.ItemSku> itemSkuList) {
        requestBuilder.itemSkuList(itemSkuList);
        return this;
    }

    public JstUpdateGoodsResponse response() {
        return this.client.updateGoods(requestBuilder.build());
    }
}
