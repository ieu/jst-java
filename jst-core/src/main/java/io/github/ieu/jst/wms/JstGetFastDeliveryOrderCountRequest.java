package io.github.ieu.jst.wms;

@lombok.Data
@lombok.Builder
public class JstGetFastDeliveryOrderCountRequest {

    /**
     * 商品编码
     */
    private String skuId;

    /**
     * 平台（传固定值1）
     */
    private Number platform;

    /**
     * 货主编码（三方仓模式下必填，新版三方仓货主编码需要加负号）
     */
    private Number ownerCoId;

    /**
     * 分仓编码
     */
    private Number wmsCoId;

    /**
     * 匹配数量，默认值1，最大值500，超过500取500
     */
    private Number qty;
}
