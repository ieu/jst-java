package io.github.ieu.jst.crossborder;

/**
 * 跨境API
 */
public interface JstCrossBorderClient {

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=44&docId=1110">跨境售后单查询</a>
     */
    JstGetCbRefundsResponse getCbRefunds(JstGetCbRefundsRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=44&docId=1109">跨境订单查询</a>
     */
    JstGetCbOrdersResponse getCbOrders(JstGetCbOrdersRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=44&docId=891">创建头程单</a>
     */
    JstCreateFirstCbTripResponse createFirstCbTrip(JstCreateFirstCbTripRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=44&docId=787">【收费】获取跨境轨迹详情</a>
     */
    JstGetCbLogisticsTrackDetailResponse getCbLogisticsTrackDetail(JstGetCbLogisticsTrackDetailRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=44&docId=502">1688商品映射推送</a>
     */
    JstMapSkuMapResponse mapSkuMap(JstMapSkuMapRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=44&docId=489">尾程运费回写接口</a>
     */
    JstSaveCbExpressStatementFeeResponse saveCbExpressStatementFee(JstSaveCbExpressStatementFeeRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=44&docId=297">查询调拨单头程费用</a>
     */
    JstLoadAllocateFeeResponse loadAllocateFee(JstLoadAllocateFeeRequest request);
}
