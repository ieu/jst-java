package io.github.ieu.jst.crossborder;

/**
 * 订单列表
 */
@lombok.Data
@lombok.Builder
public class JstGetCbOrdersRequest {

    /**
     * 修改开始时间
     */
    private String modifiedBegin;

    /**
     * 修改结束时间
     */
    private String modifiedEnd;

    /**
     * 内部订单
     */
    private java.util.List<Number> oIds;

    /**
     * 订单状态
     */
    private java.util.List<String> statuss;

    /**
     * 排除状态
     */
    private String notStatus;

    /**
     * 线上订单
     */
    private java.util.List<String> soIds;

    /**
     * 出库单号
     */
    private java.util.List<String> ioIds;

    /**
     * 旗帜
     */
    private String sellerFlag;

    /**
     * 物流单号
     */
    private String lId;

    /**
     * 订单类型
     */
    private java.util.List<String> orderTypes;

    /**
     * 开始ts
     */
    private Number startTs;

    /**
     * 页码
     */
    private Number currentPage;

    /**
     * 返回订单数量
     */
    private Number pageSize;
}
