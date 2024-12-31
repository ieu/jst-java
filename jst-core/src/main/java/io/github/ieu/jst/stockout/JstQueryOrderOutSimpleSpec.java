package io.github.ieu.jst.stockout;

public class JstQueryOrderOutSimpleSpec {

    private final JstStockOutClient client;

    private final JstQueryOrderOutSimpleRequest.JstQueryOrderOutSimpleRequestBuilder requestBuilder = JstQueryOrderOutSimpleRequest.builder();

    public JstQueryOrderOutSimpleSpec(JstStockOutClient client) {
        this.client = client;
    }

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/2a89fec6-8da9-4a25-958e-16ef2b6343ce_1577_438.png" target="_blank">店铺编码</a> </div>
     */
    public JstQueryOrderOutSimpleSpec shopId(Integer shopId) {
        requestBuilder.shopId(shopId);
        return this;
    }

    /**
     * 是否线上店铺：shop_id为0且is_offline_shop为true查询线下店铺单据
     */
    public JstQueryOrderOutSimpleSpec isOfflineShop(Boolean isOfflineShop) {
        requestBuilder.isOfflineShop(isOfflineShop);
        return this;
    }

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/d8ed18ca-e9d6-4307-be30-5d36492e4f16_1688_202.png" target="_blank">单据状态</a> </div>WaitConfirm=待出库;Confirmed=已出库;Delete=作废;Cancelled=取消;OuterConfirming外部发货中
     */
    public JstQueryOrderOutSimpleSpec status(String status) {
        requestBuilder.status(status);
        return this;
    }

    /**
     * 起始时间，和结束时间必须同时存在，时间间隔不能超过七天，与线上单号不能同时为空；tips:用时间条件查询由于查询中数据存在变动的可能会由于排序问题引发分页查询漏单的问题，建议使用ts时间戳增量查询的方式
     */
    public JstQueryOrderOutSimpleSpec modifiedBegin(String modifiedBegin) {
        requestBuilder.modifiedBegin(modifiedBegin);
        return this;
    }

    /**
     * 结束时间，和起始时间必须同时存在，时间间隔不能超过七天，与线上单号不能同时为空
     */
    public JstQueryOrderOutSimpleSpec modifiedEnd(String modifiedEnd) {
        requestBuilder.modifiedEnd(modifiedEnd);
        return this;
    }

    /**
     * 指定<div><a href="https://cdn.erp321.cn/jst-fed/52fc40e0-353a-45f0-928b-9f999d040ebc_1606_202.png" target="_blank">线上单号</a></div>，和时间段不能同时为空，最大50
     */
    public JstQueryOrderOutSimpleSpec soIds(java.util.List<String> soIds) {
        requestBuilder.soIds(soIds);
        return this;
    }

    /**
     * 第几页，从第一页开始，默认1
     */
    public JstQueryOrderOutSimpleSpec pageIndex(Integer pageIndex) {
        requestBuilder.pageIndex(pageIndex);
        return this;
    }

    /**
     * 每页多少条，默认30，最大50
     */
    public JstQueryOrderOutSimpleSpec pageSize(Integer pageSize) {
        requestBuilder.pageSize(pageSize);
        return this;
    }

    /**
     * 出库仓编号
     */
    public JstQueryOrderOutSimpleSpec wmsCoId(Integer wmsCoId) {
        requestBuilder.wmsCoId(wmsCoId);
        return this;
    }

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/52a949c3-cd0e-4c99-9ca6-6fe9f7301ae2_1805_235.png" target="_blank">内部单号</a> </div>最大50条；与时间条件不能同时为空
     */
    public JstQueryOrderOutSimpleSpec oIds(java.util.List<String> oIds) {
        requestBuilder.oIds(oIds);
        return this;
    }

    /**
     * 物流单号；不超过20条
     */
    public JstQueryOrderOutSimpleSpec lIds(java.util.List<String> lIds) {
        requestBuilder.lIds(lIds);
        return this;
    }

    /**
     * 拣货批次号；不超过50条  与时间条件不能同时为空
     */
    public JstQueryOrderOutSimpleSpec waveIds(java.util.List<Number> waveIds) {
        requestBuilder.waveIds(waveIds);
        return this;
    }

    /**
     * 时间戳，sql server中的行版本号，该字段查询防止分页过程中漏单
     */
    public JstQueryOrderOutSimpleSpec startTs(Integer startTs) {
        requestBuilder.startTs(startTs);
        return this;
    }

    /**
     * 是否查询总条数默认true，如果使用start_ts查询，该值传false否则影响查询效率
     */
    public JstQueryOrderOutSimpleSpec isGetTotal(Boolean isGetTotal) {
        requestBuilder.isGetTotal(isGetTotal);
        return this;
    }

    /**
     * 出库单号列表（商家维度下出库单全局唯一值），最大50
     */
    public JstQueryOrderOutSimpleSpec ioIds(java.util.List<String> ioIds) {
        requestBuilder.ioIds(ioIds);
        return this;
    }

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/d2820f24-fd39-43b5-8508-d3721e00e0a1_1694_224.png"target="_blank">货主</a></div>编码
     */
    public JstQueryOrderOutSimpleSpec ownerCoId(Integer ownerCoId) {
        requestBuilder.ownerCoId(ownerCoId);
        return this;
    }

    /**
     * 是否获取跨境财务信息
     */
    public JstQueryOrderOutSimpleSpec isGetCbfinance(Boolean isGetCbfinance) {
        requestBuilder.isGetCbfinance(isGetCbfinance);
        return this;
    }

    /**
     * 是否获取跨境物流信息
     */
    public JstQueryOrderOutSimpleSpec isGetCblogistic(Boolean isGetCblogistic) {
        requestBuilder.isGetCblogistic(isGetCblogistic);
        return this;
    }

    /**
     * 时间类型 0:修改时间modified，2:出库时间io_date;默认0
     */
    public JstQueryOrderOutSimpleSpec dateType(Number dateType) {
        requestBuilder.dateType(dateType);
        return this;
    }

    /**
     * 分销商编码（如使用该添加，时间查询条件限制跨度为1天）
     */
    public JstQueryOrderOutSimpleSpec drpCoId(Number drpCoId) {
        requestBuilder.drpCoId(drpCoId);
        return this;
    }

    /**
     * 出库单主表自定义查询字段
     */
    public JstQueryOrderOutSimpleSpec inoutFlds(java.util.List<String> inoutFlds) {
        requestBuilder.inoutFlds(inoutFlds);
        return this;
    }

    /**
     * 出库单明细自定义查询字段
     */
    public JstQueryOrderOutSimpleSpec inoutItemFlds(java.util.List<String> inoutItemFlds) {
        requestBuilder.inoutItemFlds(inoutItemFlds);
        return this;
    }

    public JstQueryOrderOutSimpleResponse response() {
        return this.client.queryOrderOutSimple(requestBuilder.build());
    }
}
