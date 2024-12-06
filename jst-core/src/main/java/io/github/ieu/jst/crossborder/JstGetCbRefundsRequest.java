package io.github.ieu.jst.crossborder;

@lombok.Data
@lombok.Builder
public class JstGetCbRefundsRequest {

    private String modifiedBegin;

    private String modifiedEnd;

    /**
     * 售后单号组
     */
    private java.util.List<Number> asIds;

    /**
     * 货物状态
     */
    private String goodStatus;

    /**
     * 售后单状态
     */
    private String status;

    /**
     * 平台状态
     */
    private String shopStatus;

    /**
     * 线上单号
     */
    private java.util.List<String> soIds;

    /**
     * 买家账号
     */
    private java.util.List<String> shopBuyerIds;

    /**
     * 内部订单号
     */
    private java.util.List<Number> oIds;

    /**
     * 出库单号
     */
    private java.util.List<String> ioIds;

    /**
     * 店铺编号
     */
    private Number shopId;

    /**
     * 开始TS
     */
    private Number startTs;

    /**
     * 当前页
     */
    private Number currentPage;

    /**
     * 每页数
     */
    private Number pageSize;
}
