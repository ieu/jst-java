package io.github.ieu.jst.crossborder;

import io.github.ieu.jst.AbstractJstBizClient;
import io.github.ieu.jst.JstConfiguration;
import io.github.ieu.jst.JstErrorCode;
import io.github.ieu.jst.JstServerException;

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
        JstGetCbRefundsResponse response = execute("/open/webapi/cb/cborder/getrefunds", request, JstGetCbRefundsResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=44&docId=1109">跨境订单查询</a>
     */
    @Override
    public JstGetCbOrdersResponse getCbOrders(JstGetCbOrdersRequest request) {
        JstGetCbOrdersResponse response = execute("/open/webapi/cb/cborder/getorders", request, JstGetCbOrdersResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=44&docId=891">创建头程单</a>
     */
    @Override
    public JstCreateFirstCbTripResponse createFirstCbTrip(JstCreateFirstCbTripRequest request) {
        JstCreateFirstCbTripResponse response = execute("/open/webapi/cb/cbfirsttrip/createfirsttrip", request, JstCreateFirstCbTripResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=44&docId=787">【收费】获取跨境轨迹详情</a>
     */
    @Override
    public JstGetCbLogisticsTrackDetailResponse getCbLogisticsTrackDetail(JstGetCbLogisticsTrackDetailRequest request) {
        JstGetCbLogisticsTrackDetailResponse response = execute("/open/webapi/cblogisticsapi/cblogistics/gettrackdetail", request, JstGetCbLogisticsTrackDetailResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=44&docId=502">1688商品映射推送</a>
     */
    @Override
    public JstMapSkuMapResponse mapSkuMap(JstMapSkuMapRequest request) {
        JstMapSkuMapResponse response = execute("/open/webapi/globalapi/skumap/mapping", request, JstMapSkuMapResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=44&docId=489">尾程运费回写接口</a>
     */
    @Override
    public JstSaveCbExpressStatementFeeResponse saveCbExpressStatementFee(JstSaveCbExpressStatementFeeRequest request) {
        JstSaveCbExpressStatementFeeResponse response = execute("/open/webapi/cblogisticsapi/cbexpressstatement/savefee", request, JstSaveCbExpressStatementFeeResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=44&docId=297">查询调拨单头程费用</a>
     */
    @Override
    public JstLoadAllocateFeeResponse loadAllocateFee(JstLoadAllocateFeeRequest request) {
        JstLoadAllocateFeeResponse response = execute("/open/webapi/wmsapi/allocate/loadallocatefee", request, JstLoadAllocateFeeResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }
}
