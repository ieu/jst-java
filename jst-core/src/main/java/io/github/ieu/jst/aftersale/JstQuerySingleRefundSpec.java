package io.github.ieu.jst.aftersale;

public class JstQuerySingleRefundSpec {

    private final JstAfterSaleClient client;

    private final JstQuerySingleRefundRequest.JstQuerySingleRefundRequestBuilder requestBuilder = JstQuerySingleRefundRequest.builder();

    public JstQuerySingleRefundSpec(JstAfterSaleClient client) {
        this.client = client;
    }

    /**
     * 店铺编号
     */
    public JstQuerySingleRefundSpec shopId(Integer shopId) {
        requestBuilder.shopId(shopId);
        return this;
    }

    /**
     * shop_id为0且is_offline_shop为true查询线下店铺单据
     */
    public JstQuerySingleRefundSpec isOfflineShop(Boolean isOfflineShop) {
        requestBuilder.isOfflineShop(isOfflineShop);
        return this;
    }

    /**
     * 修改起始时间，和结束时间必须同时存在，时间间隔不能超过七天，与线上单号不能同时为空；tips:用时间条件查询由于查询中数据存在变动的可能会由于排序问题引发分页查询漏单的问题，建议使用ts时间戳增量查询的方式
     */
    public JstQuerySingleRefundSpec modifiedBegin(String modifiedBegin) {
        requestBuilder.modifiedBegin(modifiedBegin);
        return this;
    }

    /**
     * 修改结束时间，和起始时间必须同时存在，时间间隔不能超过七天，与线上单号不能同时为空
     */
    public JstQuerySingleRefundSpec modifiedEnd(String modifiedEnd) {
        requestBuilder.modifiedEnd(modifiedEnd);
        return this;
    }

    /**
     * 指定线上订单号，和时间段不能同时为空
     */
    public JstQuerySingleRefundSpec soIds(java.util.List<String> soIds) {
        requestBuilder.soIds(soIds);
        return this;
    }

    /**
     * 指定买家账号，最多50
     */
    public JstQuerySingleRefundSpec shopBuyerIds(java.util.List<String> shopBuyerIds) {
        requestBuilder.shopBuyerIds(shopBuyerIds);
        return this;
    }

    /**
     * 第几页，从第一页开始，默认1
     */
    public JstQuerySingleRefundSpec pageIndex(Integer pageIndex) {
        requestBuilder.pageIndex(pageIndex);
        return this;
    }

    /**
     * 每页多少条，默认30，最大50
     */
    public JstQuerySingleRefundSpec pageSize(Integer pageSize) {
        requestBuilder.pageSize(pageSize);
        return this;
    }

    /**
     * 指定内部单号，和时间段不能同时为空
     */
    public JstQuerySingleRefundSpec oIds(java.util.List<Integer> oIds) {
        requestBuilder.oIds(oIds);
        return this;
    }

    /**
     * 售后单号（商家维度下售后唯一值），和时间段不能同时为空
     */
    public JstQuerySingleRefundSpec asIds(java.util.List<Integer> asIds) {
        requestBuilder.asIds(asIds);
        return this;
    }

    /**
     * 售后单状态（WaitConfirm:待确认,Confirmed:已确认,Cancelled:作废,Merged:被合并）
     */
    public JstQuerySingleRefundSpec status(String status) {
        requestBuilder.status(status);
        return this;
    }

    /**
     * 时间戳，sql server中的行版本号，该字段查询防止分页过程中漏单
     */
    public JstQuerySingleRefundSpec startTs(Integer startTs) {
        requestBuilder.startTs(startTs);
        return this;
    }

    /**
     * 是否查询总条数默认true，如果使用start_ts查询，该值传false否则影响查询效率
     */
    public JstQuerySingleRefundSpec isGetTotal(String isGetTotal) {
        requestBuilder.isGetTotal(isGetTotal);
        return this;
    }

    /**
     * 货物状态（BUYER_NOT_RECEIVED:买家未收到货,BUYER_RECEIVED:买家已收到货,BUYER_RETURNED_GOODS:买家已退货,SELLER_RECEIVED:卖家已收到退货）
     */
    public JstQuerySingleRefundSpec goodStatus(String goodStatus) {
        requestBuilder.goodStatus(goodStatus);
        return this;
    }

    /**
     * 售后类型，普通退货，其它，拒收退货，仅退款，投诉，补发，换货，维修
     */
    public JstQuerySingleRefundSpec type(String type) {
        requestBuilder.type(type);
        return this;
    }

    /**
     * 货主编码
     */
    public JstQuerySingleRefundSpec ownerCoId(String ownerCoId) {
        requestBuilder.ownerCoId(ownerCoId);
        return this;
    }

    public JstQuerySingleRefundResponse response() {
        return this.client.querySingleRefund(requestBuilder.build());
    }
}
