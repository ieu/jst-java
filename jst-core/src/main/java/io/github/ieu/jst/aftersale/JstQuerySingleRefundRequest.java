package io.github.ieu.jst.aftersale;

@lombok.Data
@lombok.Builder
public class JstQuerySingleRefundRequest {

    /**
     * 店铺编号
     */
    private Integer shopId;

    /**
     * shop_id为0且is_offline_shop为true查询线下店铺单据
     */
    private Boolean isOfflineShop;

    /**
     * 修改起始时间，和结束时间必须同时存在，时间间隔不能超过七天，与线上单号不能同时为空；tips:用时间条件查询由于查询中数据存在变动的可能会由于排序问题引发分页查询漏单的问题，建议使用ts时间戳增量查询的方式
     */
    private String modifiedBegin;

    /**
     * 修改结束时间，和起始时间必须同时存在，时间间隔不能超过七天，与线上单号不能同时为空
     */
    private String modifiedEnd;

    /**
     * 指定线上订单号，和时间段不能同时为空
     */
    private java.util.List<String> soIds;

    /**
     * 指定买家账号，最多50
     */
    private java.util.List<String> shopBuyerIds;

    /**
     * 第几页，从第一页开始，默认1
     */
    private Integer pageIndex;

    /**
     * 每页多少条，默认30，最大50
     */
    private Integer pageSize;

    /**
     * 指定内部单号，和时间段不能同时为空
     */
    private java.util.List<Integer> oIds;

    /**
     * 售后单号（商家维度下售后唯一值），和时间段不能同时为空
     */
    private java.util.List<Integer> asIds;

    /**
     * 售后单状态（WaitConfirm:待确认,Confirmed:已确认,Cancelled:作废,Merged:被合并）
     */
    private String status;

    /**
     * 时间戳，sql server中的行版本号，该字段查询防止分页过程中漏单
     */
    private Integer startTs;

    /**
     * 是否查询总条数默认true，如果使用start_ts查询，该值传false否则影响查询效率
     */
    private String isGetTotal;

    /**
     * 货物状态（BUYER_NOT_RECEIVED:买家未收到货,BUYER_RECEIVED:买家已收到货,BUYER_RETURNED_GOODS:买家已退货,SELLER_RECEIVED:卖家已收到退货）
     */
    private String goodStatus;

    /**
     * 售后类型，普通退货，其它，拒收退货，仅退款，投诉，补发，换货，维修
     */
    private String type;

    /**
     * 货主编码
     */
    private String ownerCoId;
}
