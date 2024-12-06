package io.github.ieu.jst.wms;

@lombok.Data
@lombok.Builder
public class JstLoadSkusnRequest {

    /**
     * 第几页
     */
    private Number pageIndex;

    /**
     * 页大小；默认30条，最大500条
     */
    private Number pageSize;

    /**
     * 创建开始时间
     */
    private String startTime;

    /**
     * 创建结束时间
     */
    private String endTime;

    /**
     * 上一页最大id
     */
    private Number lastMaxId;

    /**
     * 来源订单；与时间查询条件不能同时为空
     */
    private java.util.List<Number> fromOId;

    /**
     * 线上单号：最大限制100
     */
    private java.util.List<String> soId;

    /**
     * 快销标签，与时间条件不能同时为空
     */
    private java.util.List<String> skuSn;

    /**
     * 排除标签状态
     */
    private java.util.List<String> exceptStatus;
}
