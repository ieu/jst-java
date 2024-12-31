package io.github.ieu.jst.purchase;

public class JstQueryPurchaseBookingSpec {

    private final JstPurchaseClient client;

    private final JstQueryPurchaseBookingRequest.JstQueryPurchaseBookingRequestBuilder requestBuilder = JstQueryPurchaseBookingRequest.builder();

    public JstQueryPurchaseBookingSpec(JstPurchaseClient client) {
        this.client = client;
    }

    /**
     * 修改起始时间，和结束时间必须同时存在，时间间隔不能超过七天
     */
    public JstQueryPurchaseBookingSpec startTime(String startTime) {
        requestBuilder.startTime(startTime);
        return this;
    }

    /**
     * 修改结束时间，和起始时间必须同时存在，时间间隔不能超过七天
     */
    public JstQueryPurchaseBookingSpec endTime(String endTime) {
        requestBuilder.endTime(endTime);
        return this;
    }

    /**
     * 第几页，从1 开始
     */
    public JstQueryPurchaseBookingSpec pageIndex(Integer pageIndex) {
        requestBuilder.pageIndex(pageIndex);
        return this;
    }

    /**
     * 每页多少条，最大100条
     */
    public JstQueryPurchaseBookingSpec pageSize(Integer pageSize) {
        requestBuilder.pageSize(pageSize);
        return this;
    }

    public JstQueryPurchaseBookingResponse response() {
        return this.client.queryPurchaseBooking(requestBuilder.build());
    }
}
