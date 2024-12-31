package io.github.ieu.jst.shengsuan;

public class JstGetOpenAlipayPromotionFeeSpec {

    private final JstShengsuanClient client;

    private final JstGetOpenAlipayPromotionFeeRequest.JstGetOpenAlipayPromotionFeeRequestBuilder requestBuilder = JstGetOpenAlipayPromotionFeeRequest.builder();

    public JstGetOpenAlipayPromotionFeeSpec(JstShengsuanClient client) {
        this.client = client;
    }

    /**
     * 时间类型
     */
    public JstGetOpenAlipayPromotionFeeSpec timeType(String timeType) {
        requestBuilder.timeType(timeType);
        return this;
    }

    /**
     * 开始时间
     */
    public JstGetOpenAlipayPromotionFeeSpec startTime(String startTime) {
        requestBuilder.startTime(startTime);
        return this;
    }

    /**
     * 结束时间
     */
    public JstGetOpenAlipayPromotionFeeSpec endTime(String endTime) {
        requestBuilder.endTime(endTime);
        return this;
    }

    /**
     * 游标
     */
    public JstGetOpenAlipayPromotionFeeSpec cursor(Number cursor) {
        requestBuilder.cursor(cursor);
        return this;
    }

    /**
     * 店铺id列表多个都好隔开10156284,10040204
     */
    public JstGetOpenAlipayPromotionFeeSpec shopIds(String shopIds) {
        requestBuilder.shopIds(shopIds);
        return this;
    }

    /**
     * 页大小
     */
    public JstGetOpenAlipayPromotionFeeSpec pageSize(Number pageSize) {
        requestBuilder.pageSize(pageSize);
        return this;
    }

    public JstGetOpenAlipayPromotionFeeResponse response() {
        return this.client.getOpenAlipayPromotionFee(requestBuilder.build());
    }
}
