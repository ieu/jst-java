package io.github.ieu.jst.crossborder;

import io.github.ieu.jst.AbstractJstBizClient;
import io.github.ieu.jst.JstConfiguration;

/**
 * 跨境API
 */
public class DefaultJstCrossBorderClient extends AbstractJstBizClient implements JstCrossBorderClient {

    public DefaultJstCrossBorderClient(JstConfiguration configuration) {
        super(configuration);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=44&docId=1110">跨境售后单查询</a>
     */
    @Override
    public JstGetCbRefundsResponse getCbRefunds(JstGetCbRefundsRequest request) {
        return execute("/open/webapi/cb/cborder/getrefunds", request, JstGetCbRefundsResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=44&docId=1109">跨境订单查询</a>
     */
    @Override
    public JstGetCbOrdersResponse getCbOrders(JstGetCbOrdersRequest request) {
        return execute("/open/webapi/cb/cborder/getorders", request, JstGetCbOrdersResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=44&docId=891">创建头程单</a>
     */
    @Override
    public JstCreateFirstCbTripResponse createFirstCbTrip(JstCreateFirstCbTripRequest request) {
        return execute("/open/webapi/cb/cbfirsttrip/createfirsttrip", request, JstCreateFirstCbTripResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=44&docId=787">【收费】获取跨境轨迹详情</a>
     */
    @Override
    public JstGetCbLogisticsTrackDetailResponse getCbLogisticsTrackDetail(JstGetCbLogisticsTrackDetailRequest request) {
        return execute("/open/webapi/cblogisticsapi/cblogistics/gettrackdetail", request, JstGetCbLogisticsTrackDetailResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=44&docId=502">1688商品映射推送</a>
     */
    @Override
    public JstMapSkuMapResponse mapSkuMap(JstMapSkuMapRequest request) {
        return execute("/open/webapi/globalapi/skumap/mapping", request, JstMapSkuMapResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=44&docId=489">尾程运费回写接口</a>
     */
    @Override
    public JstSaveCbExpressStatementFeeResponse saveCbExpressStatementFee(JstSaveCbExpressStatementFeeRequest request) {
        return execute("/open/webapi/cblogisticsapi/cbexpressstatement/savefee", request, JstSaveCbExpressStatementFeeResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=44&docId=297">查询调拨单头程费用</a>
     */
    @Override
    public JstLoadAllocateFeeResponse loadAllocateFee(JstLoadAllocateFeeRequest request) {
        return execute("/open/webapi/wmsapi/allocate/loadallocatefee", request, JstLoadAllocateFeeResponse.class);
    }
}
