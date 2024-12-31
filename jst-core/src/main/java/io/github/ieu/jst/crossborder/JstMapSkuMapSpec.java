package io.github.ieu.jst.crossborder;

public class JstMapSkuMapSpec {

    private final JstCrossBorderClient client;

    private final JstMapSkuMapRequest.JstMapSkuMapRequestBuilder requestBuilder = JstMapSkuMapRequest.builder();

    public JstMapSkuMapSpec(JstCrossBorderClient client) {
        this.client = client;
    }

    /**
     * ERP本地商品编码
     */
    public JstMapSkuMapSpec skuId(String skuId) {
        requestBuilder.skuId(skuId);
        return this;
    }

    /**
     * ERP供应商id
     */
    public JstMapSkuMapSpec supplierId(Number supplierId) {
        requestBuilder.supplierId(supplierId);
        return this;
    }

    /**
     * 1688商品id
     */
    public JstMapSkuMapSpec platOfferId(String platOfferId) {
        requestBuilder.platOfferId(platOfferId);
        return this;
    }

    /**
     * 1688商品规格唯一标识
     */
    public JstMapSkuMapSpec platSpecId(String platSpecId) {
        requestBuilder.platSpecId(platSpecId);
        return this;
    }

    /**
     * 1688商品标识
     */
    public JstMapSkuMapSpec platSkuId(String platSkuId) {
        requestBuilder.platSkuId(platSkuId);
        return this;
    }

    /**
     * 1688商品链接
     */
    public JstMapSkuMapSpec url(String url) {
        requestBuilder.url(url);
        return this;
    }

    /**
     * 1688平台商品规格属性
     */
    public JstMapSkuMapSpec platPV(String platPV) {
        requestBuilder.platPV(platPV);
        return this;
    }

    /**
     * 1688商品名称
     */
    public JstMapSkuMapSpec name(String name) {
        requestBuilder.name(name);
        return this;
    }

    /**
     * 1688商品图片
     */
    public JstMapSkuMapSpec pic(String pic) {
        requestBuilder.pic(pic);
        return this;
    }

    /**
     * 1688最小起批数
     */
    public JstMapSkuMapSpec minOrderQty(Number minOrderQty) {
        requestBuilder.minOrderQty(minOrderQty);
        return this;
    }

    /**
     * 阿里巴巴授权店铺SessionUid
     */
    public JstMapSkuMapSpec memberId(String memberId) {
        requestBuilder.memberId(memberId);
        return this;
    }

    public JstMapSkuMapResponse response() {
        return this.client.mapSkuMap(requestBuilder.build());
    }
}
