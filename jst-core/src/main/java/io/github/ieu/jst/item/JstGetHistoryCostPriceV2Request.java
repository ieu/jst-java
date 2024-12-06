package io.github.ieu.jst.item;

@lombok.Data
@lombok.Builder
public class JstGetHistoryCostPriceV2Request {

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/90e7fb07-a2a8-4ba5-83c8-a7a84d3b2f8d_2545_956.png" target="_blank">商品编码</a></div>必填
     */
    private java.util.List<String> skuIds;

    /**
     * 仓储方（入参仓储方没有，默认查询当前公司）
     */
    private java.util.List<Number> wmsCoIds;

    /**
     * 获取方式：all（获取全部商品历史成本价），newest（获取最新商品历史成本价），默认：all
     */
    private String getWay;

    /**
     * 是否使用普通商品资料成本价，即：如果没有历史成本价，是否取普通商品资料，默认：true
     */
    private Boolean isUseItemSkuCostPrice;
}
