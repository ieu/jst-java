package io.github.ieu.jst.wms;

public class JstLoadSkusnSpec {

    private final JstWmsClient client;

    private final JstLoadSkusnRequest.JstLoadSkusnRequestBuilder requestBuilder = JstLoadSkusnRequest.builder();

    public JstLoadSkusnSpec(JstWmsClient client) {
        this.client = client;
    }

    /**
     * 第几页
     */
    public JstLoadSkusnSpec pageIndex(Number pageIndex) {
        requestBuilder.pageIndex(pageIndex);
        return this;
    }

    /**
     * 页大小；默认30条，最大500条
     */
    public JstLoadSkusnSpec pageSize(Number pageSize) {
        requestBuilder.pageSize(pageSize);
        return this;
    }

    /**
     * 创建开始时间
     */
    public JstLoadSkusnSpec startTime(String startTime) {
        requestBuilder.startTime(startTime);
        return this;
    }

    /**
     * 创建结束时间
     */
    public JstLoadSkusnSpec endTime(String endTime) {
        requestBuilder.endTime(endTime);
        return this;
    }

    /**
     * 上一页最大id
     */
    public JstLoadSkusnSpec lastMaxId(Number lastMaxId) {
        requestBuilder.lastMaxId(lastMaxId);
        return this;
    }

    /**
     * 来源订单；与时间查询条件不能同时为空
     */
    public JstLoadSkusnSpec fromOId(java.util.List<Number> fromOId) {
        requestBuilder.fromOId(fromOId);
        return this;
    }

    /**
     * 线上单号：最大限制100
     */
    public JstLoadSkusnSpec soId(java.util.List<String> soId) {
        requestBuilder.soId(soId);
        return this;
    }

    /**
     * 快销标签，与时间条件不能同时为空
     */
    public JstLoadSkusnSpec skuSn(java.util.List<String> skuSn) {
        requestBuilder.skuSn(skuSn);
        return this;
    }

    /**
     * 排除标签状态
     */
    public JstLoadSkusnSpec exceptStatus(java.util.List<String> exceptStatus) {
        requestBuilder.exceptStatus(exceptStatus);
        return this;
    }

    public JstLoadSkusnResponse response() {
        return this.client.loadSkusn(requestBuilder.build());
    }
}
