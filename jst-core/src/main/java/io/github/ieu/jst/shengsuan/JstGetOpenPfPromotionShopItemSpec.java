package io.github.ieu.jst.shengsuan;

public class JstGetOpenPfPromotionShopItemSpec {

    private final JstShengsuanClient client;

    private final JstGetOpenPfPromotionShopItemRequest.JstGetOpenPfPromotionShopItemRequestBuilder requestBuilder = JstGetOpenPfPromotionShopItemRequest.builder();

    public JstGetOpenPfPromotionShopItemSpec(JstShengsuanClient client) {
        this.client = client;
    }

    /**
     * 时间类型
     */
    public JstGetOpenPfPromotionShopItemSpec timeType(String timeType) {
        requestBuilder.timeType(timeType);
        return this;
    }

    /**
     * 开始时间
     */
    public JstGetOpenPfPromotionShopItemSpec startTime(String startTime) {
        requestBuilder.startTime(startTime);
        return this;
    }

    /**
     * 结束时间
     */
    public JstGetOpenPfPromotionShopItemSpec endTime(String endTime) {
        requestBuilder.endTime(endTime);
        return this;
    }

    /**
     * 游标
     */
    public JstGetOpenPfPromotionShopItemSpec cursor(Number cursor) {
        requestBuilder.cursor(cursor);
        return this;
    }

    /**
     * 店铺id列表多个都好隔开10156284,10040204
     */
    public JstGetOpenPfPromotionShopItemSpec shopIds(String shopIds) {
        requestBuilder.shopIds(shopIds);
        return this;
    }

    /**
     * 页大小
     */
    public JstGetOpenPfPromotionShopItemSpec pageSize(Number pageSize) {
        requestBuilder.pageSize(pageSize);
        return this;
    }

    public JstGetOpenPfPromotionShopItemResponse response() {
        return this.client.getOpenPfPromotionShopItem(requestBuilder.build());
    }
}
