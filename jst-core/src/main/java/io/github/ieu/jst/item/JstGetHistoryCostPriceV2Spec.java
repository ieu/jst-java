package io.github.ieu.jst.item;

public class JstGetHistoryCostPriceV2Spec {

    private final JstItemClient client;

    private final JstGetHistoryCostPriceV2Request.JstGetHistoryCostPriceV2RequestBuilder requestBuilder = JstGetHistoryCostPriceV2Request.builder();

    public JstGetHistoryCostPriceV2Spec(JstItemClient client) {
        this.client = client;
    }

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/90e7fb07-a2a8-4ba5-83c8-a7a84d3b2f8d_2545_956.png" target="_blank">商品编码</a></div>必填
     */
    public JstGetHistoryCostPriceV2Spec skuIds(java.util.List<String> skuIds) {
        requestBuilder.skuIds(skuIds);
        return this;
    }

    /**
     * 仓储方（入参仓储方没有，默认查询当前公司）
     */
    public JstGetHistoryCostPriceV2Spec wmsCoIds(java.util.List<Number> wmsCoIds) {
        requestBuilder.wmsCoIds(wmsCoIds);
        return this;
    }

    /**
     * 获取方式：all（获取全部商品历史成本价），newest（获取最新商品历史成本价），默认：all
     */
    public JstGetHistoryCostPriceV2Spec getWay(String getWay) {
        requestBuilder.getWay(getWay);
        return this;
    }

    /**
     * 是否使用普通商品资料成本价，即：如果没有历史成本价，是否取普通商品资料，默认：true
     */
    public JstGetHistoryCostPriceV2Spec isUseItemSkuCostPrice(Boolean isUseItemSkuCostPrice) {
        requestBuilder.isUseItemSkuCostPrice(isUseItemSkuCostPrice);
        return this;
    }

    public JstGetHistoryCostPriceV2Response response() {
        return this.client.getHistoryCostPriceV2(requestBuilder.build());
    }
}
