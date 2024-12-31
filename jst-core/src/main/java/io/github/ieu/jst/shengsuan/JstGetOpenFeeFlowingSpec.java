package io.github.ieu.jst.shengsuan;

public class JstGetOpenFeeFlowingSpec {

    private final JstShengsuanClient client;

    private final JstGetOpenFeeFlowingRequest.JstGetOpenFeeFlowingRequestBuilder requestBuilder = JstGetOpenFeeFlowingRequest.builder();

    public JstGetOpenFeeFlowingSpec(JstShengsuanClient client) {
        this.client = client;
    }

    /**
     * 时间类型
     */
    public JstGetOpenFeeFlowingSpec timeType(String timeType) {
        requestBuilder.timeType(timeType);
        return this;
    }

    /**
     * 开始时间
     */
    public JstGetOpenFeeFlowingSpec startTime(String startTime) {
        requestBuilder.startTime(startTime);
        return this;
    }

    /**
     * 结束时间
     */
    public JstGetOpenFeeFlowingSpec endTime(String endTime) {
        requestBuilder.endTime(endTime);
        return this;
    }

    /**
     * 游标
     */
    public JstGetOpenFeeFlowingSpec cursor(Number cursor) {
        requestBuilder.cursor(cursor);
        return this;
    }

    /**
     * 店铺id列表多个都好隔开10156284,10040204
     */
    public JstGetOpenFeeFlowingSpec shopIds(String shopIds) {
        requestBuilder.shopIds(shopIds);
        return this;
    }

    /**
     * 页大小
     */
    public JstGetOpenFeeFlowingSpec pageSize(Number pageSize) {
        requestBuilder.pageSize(pageSize);
        return this;
    }

    public JstGetOpenFeeFlowingResponse response() {
        return this.client.getOpenFeeFlowing(requestBuilder.build());
    }
}
