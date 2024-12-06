package io.github.ieu.jst.wms;

@lombok.Data
@lombok.Builder
public class JstLoadOrderChangeStatisticsRequest {

    /**
     * 开始时间
     */
    private String startTime;

    /**
     * 结束时间
     */
    private String endTime;

    /**
     * 分仓id
     */
    private java.util.List<Number> wmsCoIds;

    /**
     * 商品编码
     */
    private java.util.List<String> srcSkuIds;

    /**
     * 商品款号
     */
    private java.util.List<String> srcLIds;

    /**
     * 供应商id
     */
    private java.util.List<Number> supplierIds;

    /**
     * 计算方式 0新订单 1重复计算
     */
    private java.util.List<Number> sourceType;

    /**
     * 当前页默认1
     */
    private Number pageIndex;

    /**
     * 页大小，默认50最大500
     */
    private Number pageSize;
}
