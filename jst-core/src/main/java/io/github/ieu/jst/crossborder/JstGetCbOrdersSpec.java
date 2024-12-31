package io.github.ieu.jst.crossborder;

public class JstGetCbOrdersSpec {

    private final JstCrossBorderClient client;

    private final JstGetCbOrdersRequest.JstGetCbOrdersRequestBuilder requestBuilder = JstGetCbOrdersRequest.builder();

    public JstGetCbOrdersSpec(JstCrossBorderClient client) {
        this.client = client;
    }

    /**
     * 修改开始时间
     */
    public JstGetCbOrdersSpec modifiedBegin(String modifiedBegin) {
        requestBuilder.modifiedBegin(modifiedBegin);
        return this;
    }

    /**
     * 修改结束时间
     */
    public JstGetCbOrdersSpec modifiedEnd(String modifiedEnd) {
        requestBuilder.modifiedEnd(modifiedEnd);
        return this;
    }

    /**
     * 内部订单
     */
    public JstGetCbOrdersSpec oIds(java.util.List<Number> oIds) {
        requestBuilder.oIds(oIds);
        return this;
    }

    /**
     * 订单状态
     */
    public JstGetCbOrdersSpec statuss(java.util.List<String> statuss) {
        requestBuilder.statuss(statuss);
        return this;
    }

    /**
     * 排除状态
     */
    public JstGetCbOrdersSpec notStatus(String notStatus) {
        requestBuilder.notStatus(notStatus);
        return this;
    }

    /**
     * 线上订单
     */
    public JstGetCbOrdersSpec soIds(java.util.List<String> soIds) {
        requestBuilder.soIds(soIds);
        return this;
    }

    /**
     * 出库单号
     */
    public JstGetCbOrdersSpec ioIds(java.util.List<String> ioIds) {
        requestBuilder.ioIds(ioIds);
        return this;
    }

    /**
     * 旗帜
     */
    public JstGetCbOrdersSpec sellerFlag(String sellerFlag) {
        requestBuilder.sellerFlag(sellerFlag);
        return this;
    }

    /**
     * 物流单号
     */
    public JstGetCbOrdersSpec lId(String lId) {
        requestBuilder.lId(lId);
        return this;
    }

    /**
     * 订单类型
     */
    public JstGetCbOrdersSpec orderTypes(java.util.List<String> orderTypes) {
        requestBuilder.orderTypes(orderTypes);
        return this;
    }

    /**
     * 开始ts
     */
    public JstGetCbOrdersSpec startTs(Number startTs) {
        requestBuilder.startTs(startTs);
        return this;
    }

    /**
     * 页码
     */
    public JstGetCbOrdersSpec currentPage(Number currentPage) {
        requestBuilder.currentPage(currentPage);
        return this;
    }

    /**
     * 返回订单数量
     */
    public JstGetCbOrdersSpec pageSize(Number pageSize) {
        requestBuilder.pageSize(pageSize);
        return this;
    }

    public JstGetCbOrdersResponse response() {
        return this.client.getCbOrders(requestBuilder.build());
    }
}
