package io.github.ieu.jst.stockout;

@lombok.Data
@lombok.Builder
public class JstQueryOrderOutSimpleRequest {

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/2a89fec6-8da9-4a25-958e-16ef2b6343ce_1577_438.png" target="_blank">店铺编码</a> </div>
     */
    private Integer shopId;

    /**
     * 是否线上店铺：shop_id为0且is_offline_shop为true查询线下店铺单据
     */
    private Boolean isOfflineShop;

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/d8ed18ca-e9d6-4307-be30-5d36492e4f16_1688_202.png" target="_blank">单据状态</a> </div>WaitConfirm=待出库;Confirmed=已出库;Delete=作废;Cancelled=取消;OuterConfirming外部发货中
     */
    private String status;

    /**
     * 起始时间，和结束时间必须同时存在，时间间隔不能超过七天，与线上单号不能同时为空；tips:用时间条件查询由于查询中数据存在变动的可能会由于排序问题引发分页查询漏单的问题，建议使用ts时间戳增量查询的方式
     */
    private String modifiedBegin;

    /**
     * 结束时间，和起始时间必须同时存在，时间间隔不能超过七天，与线上单号不能同时为空
     */
    private String modifiedEnd;

    /**
     * 指定<div><a href="https://cdn.erp321.cn/jst-fed/52fc40e0-353a-45f0-928b-9f999d040ebc_1606_202.png" target="_blank">线上单号</a></div>，和时间段不能同时为空，最大50
     */
    private java.util.List<String> soIds;

    /**
     * 第几页，从第一页开始，默认1
     */
    private Integer pageIndex;

    /**
     * 每页多少条，默认30，最大50
     */
    private Integer pageSize;

    /**
     * 出库仓编号
     */
    private Integer wmsCoId;

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/52a949c3-cd0e-4c99-9ca6-6fe9f7301ae2_1805_235.png" target="_blank">内部单号</a> </div>最大50条；与时间条件不能同时为空
     */
    private java.util.List<String> oIds;

    /**
     * 物流单号；不超过20条
     */
    private java.util.List<String> lIds;

    /**
     * 拣货批次号；不超过50条  与时间条件不能同时为空
     */
    private java.util.List<Number> waveIds;

    /**
     * 时间戳，sql server中的行版本号，该字段查询防止分页过程中漏单
     */
    private Integer startTs;

    /**
     * 是否查询总条数默认true，如果使用start_ts查询，该值传false否则影响查询效率
     */
    private Boolean isGetTotal;

    /**
     * 出库单号列表（商家维度下出库单全局唯一值），最大50
     */
    private java.util.List<String> ioIds;

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/d2820f24-fd39-43b5-8508-d3721e00e0a1_1694_224.png"target="_blank">货主</a></div>编码
     */
    private Integer ownerCoId;

    /**
     * 是否获取跨境财务信息
     */
    private Boolean isGetCbfinance;

    /**
     * 是否获取跨境物流信息
     */
    private Boolean isGetCblogistic;

    /**
     * 时间类型 0:修改时间modified，2:出库时间io_date;默认0
     */
    private Number dateType;

    /**
     * 分销商编码（如使用该添加，时间查询条件限制跨度为1天）
     */
    private Number drpCoId;

    /**
     * 出库单主表自定义查询字段
     */
    private java.util.List<String> inoutFlds;

    /**
     * 出库单明细自定义查询字段
     */
    private java.util.List<String> inoutItemFlds;
}
