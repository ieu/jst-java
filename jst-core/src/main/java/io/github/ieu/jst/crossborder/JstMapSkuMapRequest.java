package io.github.ieu.jst.crossborder;

@lombok.Data
@lombok.Builder
public class JstMapSkuMapRequest {

    /**
     * ERP本地商品编码
     */
    private String skuId;

    /**
     * ERP供应商id
     */
    private Number supplierId;

    /**
     * 1688商品id
     */
    private String platOfferId;

    /**
     * 1688商品规格唯一标识
     */
    private String platSpecId;

    /**
     * 1688商品标识
     */
    private String platSkuId;

    /**
     * 1688商品链接
     */
    private String url;

    /**
     * 1688平台商品规格属性
     */
    private String platPV;

    /**
     * 1688商品名称
     */
    private String name;

    /**
     * 1688商品图片
     */
    private String pic;

    /**
     * 1688最小起批数
     */
    private Number minOrderQty;

    /**
     * 阿里巴巴授权店铺SessionUid
     */
    private String memberId;
}
