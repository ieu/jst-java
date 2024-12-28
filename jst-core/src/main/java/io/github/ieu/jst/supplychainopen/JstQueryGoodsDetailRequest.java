package io.github.ieu.jst.supplychainopen;

@lombok.Data
@lombok.Builder
public class JstQueryGoodsDetailRequest {

    /**
     * 商品ID
     */
    private String itemSpuId;
}
