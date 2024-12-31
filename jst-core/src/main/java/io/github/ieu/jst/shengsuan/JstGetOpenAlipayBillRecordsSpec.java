package io.github.ieu.jst.shengsuan;

public class JstGetOpenAlipayBillRecordsSpec {

    private final JstShengsuanClient client;

    private final JstGetOpenAlipayBillRecordsRequest.JstGetOpenAlipayBillRecordsRequestBuilder requestBuilder = JstGetOpenAlipayBillRecordsRequest.builder();

    public JstGetOpenAlipayBillRecordsSpec(JstShengsuanClient client) {
        this.client = client;
    }

    /**
     * 时间类型
     */
    public JstGetOpenAlipayBillRecordsSpec timeType(String timeType) {
        requestBuilder.timeType(timeType);
        return this;
    }

    /**
     * 开始时间
     */
    public JstGetOpenAlipayBillRecordsSpec startTime(String startTime) {
        requestBuilder.startTime(startTime);
        return this;
    }

    /**
     * 结束时间
     */
    public JstGetOpenAlipayBillRecordsSpec endTime(String endTime) {
        requestBuilder.endTime(endTime);
        return this;
    }

    /**
     * 游标
     */
    public JstGetOpenAlipayBillRecordsSpec cursor(Number cursor) {
        requestBuilder.cursor(cursor);
        return this;
    }

    /**
     * 店铺id列表多个都好隔开10156284,10040204
     */
    public JstGetOpenAlipayBillRecordsSpec shopIds(String shopIds) {
        requestBuilder.shopIds(shopIds);
        return this;
    }

    /**
     * 页大小
     */
    public JstGetOpenAlipayBillRecordsSpec pageSize(Number pageSize) {
        requestBuilder.pageSize(pageSize);
        return this;
    }

    public JstGetOpenAlipayBillRecordsResponse response() {
        return this.client.getOpenAlipayBillRecords(requestBuilder.build());
    }
}
