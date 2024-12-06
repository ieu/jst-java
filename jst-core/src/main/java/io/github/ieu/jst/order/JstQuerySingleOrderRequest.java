package io.github.ieu.jst.order;

@lombok.Data
@lombok.Builder
public class JstQuerySingleOrderRequest {

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/ccaa4f9d-b986-4c48-b2d2-1e8b20177658_2166_836.png" target="_blank">店铺编号</a></div>
     */
    private Integer shopId;

    /**
     * shop_id为0且is_offline_shop为true查询线下店铺单据
     */
    private Boolean isOfflineShop;

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/e457dae3-e441-4644-860e-e070d05929df_1924_284.png" target="_blank">线上单号</a></div>与时间条件，内部单号不能同时为空，最大限制20条
     */
    private java.util.List<String> soIds;

    /**
     * 起始时间，和结束时间必须同时存在，时间间隔不能超过七天，与线上单号，内部单号不能同时为空;tips:用时间条件查询由于查询中数据存在变动的可能会由于排序问题引发分页查询漏单的问题，建议使用ts时间戳增量查询的方式
     */
    private String modifiedBegin;

    /**
     * 结束时间，和起始时间必须同时存在，时间间隔不能超过七天，与线上单号，内部单号不能同时为空
     */
    private String modifiedEnd;

    /**
     * (0:修改时间modified，2:订单日期order_date，3:发货时间send_date；非必填，默认0)
     */
    private Number dateType;

    /**
     * 订单状态：待付款：WaitPay；发货中：Delivering；被合并：Merged；异常：Question；被拆分：Split；等供销商|外仓发货：WaitOuterSent；已付款待审核：WaitConfirm；已客审待财审：WaitFConfirm；已发货：Sent；取消：Cancelled
     */
    private String status;

    /**
     * 第几页，从1开始
     */
    private Integer pageIndex;

    /**
     * 最每页多少条，最大100条
     */
    private Integer pageSize;

    /**
     * ts时间戳，sql server中的行版本号，该字段查询防止分页过程中漏单。查询条件值是大于等于的关系
     */
    private Integer startTs;

    /**
     * 是否查询总条数默认true，如果使用start_ts查询，该值传false否则影响查询效率
     */
    private Boolean isGetTotal;

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/deab32f3-191d-43c8-b213-343bb82070e1_2161_433.png" target="_blank">内部订单号</a></div>（商家维度下订单信息的唯一值），与时间条件，线上单号不能同时为空
     */
    private java.util.List<Number> oIds;

    /**
     * 是否查询跨境财务信息
     */
    private Boolean isGetCbfinance;

    /**
     * 订单自定义查询字段
     */
    private java.util.List<String> orderFlds;

    /**
     * 订单明细自定义查询字段
     */
    private java.util.List<String> orderItemFlds;

    /**
     * 订单类型
     */
    private java.util.List<String> orderTypes;
}
