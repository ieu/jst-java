package io.github.ieu.jst.wms;

public class JstGetFastDeliveryOrderCountSpec {

    private final JstWmsClient client;

    private final JstGetFastDeliveryOrderCountRequest.JstGetFastDeliveryOrderCountRequestBuilder requestBuilder = JstGetFastDeliveryOrderCountRequest.builder();

    public JstGetFastDeliveryOrderCountSpec(JstWmsClient client) {
        this.client = client;
    }

    /**
     * 商品编码
     */
    public JstGetFastDeliveryOrderCountSpec skuId(String skuId) {
        requestBuilder.skuId(skuId);
        return this;
    }

    /**
     * 平台（传固定值1）
     */
    public JstGetFastDeliveryOrderCountSpec platform(Number platform) {
        requestBuilder.platform(platform);
        return this;
    }

    /**
     * 货主编码（三方仓模式下必填，新版三方仓货主编码需要加负号）
     */
    public JstGetFastDeliveryOrderCountSpec ownerCoId(Number ownerCoId) {
        requestBuilder.ownerCoId(ownerCoId);
        return this;
    }

    /**
     * 分仓编码
     */
    public JstGetFastDeliveryOrderCountSpec wmsCoId(Number wmsCoId) {
        requestBuilder.wmsCoId(wmsCoId);
        return this;
    }

    /**
     * 匹配数量，默认值1，最大值500，超过500取500
     */
    public JstGetFastDeliveryOrderCountSpec qty(Number qty) {
        requestBuilder.qty(qty);
        return this;
    }

    public JstGetFastDeliveryOrderCountResponse response() {
        return this.client.getFastDeliveryOrderCount(requestBuilder.build());
    }
}
