package io.github.ieu.jst.supplychainopen;

public class JstQueryGoodsDetailSpec {

    private final JstSupplyChainOpenClient client;

    private final JstQueryGoodsDetailRequest.JstQueryGoodsDetailRequestBuilder requestBuilder = JstQueryGoodsDetailRequest.builder();

    public JstQueryGoodsDetailSpec(JstSupplyChainOpenClient client) {
        this.client = client;
    }

    /**
     * 商品ID
     */
    public JstQueryGoodsDetailSpec itemSpuId(String itemSpuId) {
        requestBuilder.itemSpuId(itemSpuId);
        return this;
    }

    public JstQueryGoodsDetailResponse response() {
        return this.client.queryGoodsDetail(requestBuilder.build());
    }
}
