package io.github.ieu.jst.aftersale;

@lombok.Data
@lombok.Builder
public class JstQueryAfterSaleReceivedRequest {

    /**
     * 默认30，最大不超过50
     */
    private Integer pageSize;

    /**
     * 修改开始时间,开始时间和结束时间必须同时存在，时间间隔不能超过七天
     */
    private String modifiedBegin;

    /**
     * 修改结束时间,开始时间和结束时间必须同时存在，时间间隔不能超过七天
     */
    private String modifiedEnd;

    /**
     * 外部订单号列表
     */
    private java.util.List<String> soIds;

    /**
     * 时间戳
     */
    private Integer startTs;

    /**
     * ERP内部订单号，唯一
     */
    private java.util.List<String> oIds;

    /**
     * 第几页，从1开始
     */
    private Integer pageIndex;

    /**
     * 退货店铺
     */
    private String shopId;

    /**
     * 日期类型，0:修改时间，1:创建日期，2:订单日期，4:实际出/入库时间
     */
    private Integer dateType;

    /**
     * 售后单号列表,最大50
     */
    private java.util.List<Integer> asIds;

    /**
     * 退仓单号列表,最大50
     */
    private java.util.List<Integer> ioIds;
}
