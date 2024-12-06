package io.github.ieu.jst.wms;

@lombok.Data
@lombok.Builder
public class JstGetRecommendBinRequest {

    /**
     * 商品编码
     */
    private String skuId;
}
