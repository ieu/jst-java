package io.github.ieu.jst.order;

public class JstQuerySingleOrderSpec {

    private final JstOrderClient client;

    private final JstQuerySingleOrderRequest.JstQuerySingleOrderRequestBuilder requestBuilder = JstQuerySingleOrderRequest.builder();

    public JstQuerySingleOrderSpec(JstOrderClient client) {
        this.client = client;
    }

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/ccaa4f9d-b986-4c48-b2d2-1e8b20177658_2166_836.png" target="_blank">店铺编号</a></div>
     */
    public JstQuerySingleOrderSpec shopId(Integer shopId) {
        requestBuilder.shopId(shopId);
        return this;
    }

    /**
     * shop_id为0且is_offline_shop为true查询线下店铺单据
     */
    public JstQuerySingleOrderSpec isOfflineShop(Boolean isOfflineShop) {
        requestBuilder.isOfflineShop(isOfflineShop);
        return this;
    }

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/e457dae3-e441-4644-860e-e070d05929df_1924_284.png" target="_blank">线上单号</a></div>与时间条件，内部单号不能同时为空，最大限制20条
     */
    public JstQuerySingleOrderSpec soIds(java.util.List<String> soIds) {
        requestBuilder.soIds(soIds);
        return this;
    }

    /**
     * 起始时间，和结束时间必须同时存在，时间间隔不能超过七天，与线上单号，内部单号不能同时为空;tips:用时间条件查询由于查询中数据存在变动的可能会由于排序问题引发分页查询漏单的问题，建议使用ts时间戳增量查询的方式
     */
    public JstQuerySingleOrderSpec modifiedBegin(String modifiedBegin) {
        requestBuilder.modifiedBegin(modifiedBegin);
        return this;
    }

    /**
     * 结束时间，和起始时间必须同时存在，时间间隔不能超过七天，与线上单号，内部单号不能同时为空
     */
    public JstQuerySingleOrderSpec modifiedEnd(String modifiedEnd) {
        requestBuilder.modifiedEnd(modifiedEnd);
        return this;
    }

    /**
     * (0:修改时间modified，2:订单日期order_date，3:发货时间send_date；非必填，默认0)
     */
    public JstQuerySingleOrderSpec dateType(Number dateType) {
        requestBuilder.dateType(dateType);
        return this;
    }

    /**
     * 订单状态：待付款：WaitPay；发货中：Delivering；被合并：Merged；异常：Question；被拆分：Split；等供销商|外仓发货：WaitOuterSent；已付款待审核：WaitConfirm；已客审待财审：WaitFConfirm；已发货：Sent；取消：Cancelled
     */
    public JstQuerySingleOrderSpec status(String status) {
        requestBuilder.status(status);
        return this;
    }

    /**
     * 第几页，从1开始
     */
    public JstQuerySingleOrderSpec pageIndex(Integer pageIndex) {
        requestBuilder.pageIndex(pageIndex);
        return this;
    }

    /**
     * 最每页多少条，最大100条
     */
    public JstQuerySingleOrderSpec pageSize(Integer pageSize) {
        requestBuilder.pageSize(pageSize);
        return this;
    }

    /**
     * ts时间戳，sql server中的行版本号，该字段查询防止分页过程中漏单。查询条件值是大于等于的关系
     */
    public JstQuerySingleOrderSpec startTs(Integer startTs) {
        requestBuilder.startTs(startTs);
        return this;
    }

    /**
     * 是否查询总条数默认true，如果使用start_ts查询，该值传false否则影响查询效率
     */
    public JstQuerySingleOrderSpec isGetTotal(Boolean isGetTotal) {
        requestBuilder.isGetTotal(isGetTotal);
        return this;
    }

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/deab32f3-191d-43c8-b213-343bb82070e1_2161_433.png" target="_blank">内部订单号</a></div>（商家维度下订单信息的唯一值），与时间条件，线上单号不能同时为空
     */
    public JstQuerySingleOrderSpec oIds(java.util.List<Number> oIds) {
        requestBuilder.oIds(oIds);
        return this;
    }

    /**
     * 是否查询跨境财务信息
     */
    public JstQuerySingleOrderSpec isGetCbfinance(Boolean isGetCbfinance) {
        requestBuilder.isGetCbfinance(isGetCbfinance);
        return this;
    }

    /**
     * 订单自定义查询字段
     */
    public JstQuerySingleOrderSpec orderFlds(java.util.List<String> orderFlds) {
        requestBuilder.orderFlds(orderFlds);
        return this;
    }

    /**
     * 订单明细自定义查询字段
     */
    public JstQuerySingleOrderSpec orderItemFlds(java.util.List<String> orderItemFlds) {
        requestBuilder.orderItemFlds(orderItemFlds);
        return this;
    }

    /**
     * 订单类型
     */
    public JstQuerySingleOrderSpec orderTypes(java.util.List<String> orderTypes) {
        requestBuilder.orderTypes(orderTypes);
        return this;
    }

    public JstQuerySingleOrderResponse response() {
        return this.client.querySingleOrder(requestBuilder.build());
    }
}
