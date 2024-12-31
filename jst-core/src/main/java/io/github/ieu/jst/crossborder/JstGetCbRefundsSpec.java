package io.github.ieu.jst.crossborder;

public class JstGetCbRefundsSpec {

    private final JstCrossBorderClient client;

    private final JstGetCbRefundsRequest.JstGetCbRefundsRequestBuilder requestBuilder = JstGetCbRefundsRequest.builder();

    public JstGetCbRefundsSpec(JstCrossBorderClient client) {
        this.client = client;
    }

    public JstGetCbRefundsSpec modifiedBegin(String modifiedBegin) {
        requestBuilder.modifiedBegin(modifiedBegin);
        return this;
    }

    public JstGetCbRefundsSpec modifiedEnd(String modifiedEnd) {
        requestBuilder.modifiedEnd(modifiedEnd);
        return this;
    }

    /**
     * 售后单号组
     */
    public JstGetCbRefundsSpec asIds(java.util.List<Number> asIds) {
        requestBuilder.asIds(asIds);
        return this;
    }

    /**
     * 货物状态
     */
    public JstGetCbRefundsSpec goodStatus(String goodStatus) {
        requestBuilder.goodStatus(goodStatus);
        return this;
    }

    /**
     * 售后单状态
     */
    public JstGetCbRefundsSpec status(String status) {
        requestBuilder.status(status);
        return this;
    }

    /**
     * 平台状态
     */
    public JstGetCbRefundsSpec shopStatus(String shopStatus) {
        requestBuilder.shopStatus(shopStatus);
        return this;
    }

    /**
     * 线上单号
     */
    public JstGetCbRefundsSpec soIds(java.util.List<String> soIds) {
        requestBuilder.soIds(soIds);
        return this;
    }

    /**
     * 买家账号
     */
    public JstGetCbRefundsSpec shopBuyerIds(java.util.List<String> shopBuyerIds) {
        requestBuilder.shopBuyerIds(shopBuyerIds);
        return this;
    }

    /**
     * 内部订单号
     */
    public JstGetCbRefundsSpec oIds(java.util.List<Number> oIds) {
        requestBuilder.oIds(oIds);
        return this;
    }

    /**
     * 出库单号
     */
    public JstGetCbRefundsSpec ioIds(java.util.List<String> ioIds) {
        requestBuilder.ioIds(ioIds);
        return this;
    }

    /**
     * 店铺编号
     */
    public JstGetCbRefundsSpec shopId(Number shopId) {
        requestBuilder.shopId(shopId);
        return this;
    }

    /**
     * 开始TS
     */
    public JstGetCbRefundsSpec startTs(Number startTs) {
        requestBuilder.startTs(startTs);
        return this;
    }

    /**
     * 当前页
     */
    public JstGetCbRefundsSpec currentPage(Number currentPage) {
        requestBuilder.currentPage(currentPage);
        return this;
    }

    /**
     * 每页数
     */
    public JstGetCbRefundsSpec pageSize(Number pageSize) {
        requestBuilder.pageSize(pageSize);
        return this;
    }

    public JstGetCbRefundsResponse response() {
        return this.client.getCbRefunds(requestBuilder.build());
    }
}
