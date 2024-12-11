package io.github.ieu.jst.wms;

import io.github.ieu.jst.AbstractJstBizClient;
import io.github.ieu.jst.JstConfiguration;
import io.github.ieu.jst.JstErrorCode;
import io.github.ieu.jst.JstServerException;

/**
 * WMS API
 */
public class DefaultJstWmsClient extends AbstractJstBizClient implements JstWmsClient {

    public DefaultJstWmsClient(JstConfiguration configuration) {
        super(configuration);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=22&docId=436">快销到货</a>
     */
    @Override
    public JstQuickSaleArrivalResponse quickSaleArrival(JstQuickSaleArrivalRequest request) {
        JstQuickSaleArrivalResponse response = execute("/open/jushuitan/quicksale/arrival", request, JstQuickSaleArrivalResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=22&docId=450">根据箱号查询箱内商品推荐仓位</a>
     */
    @Override
    public JstFindSkuBinResponse findSkuBin(JstFindSkuBinRequest request) {
        JstFindSkuBinResponse response = execute("/open/webapi/wmsapi/openskubinquery/findskubin", request, JstFindSkuBinResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=22&docId=593">发货-强制审核单件商品缺货订单</a>
     */
    @Override
    public JstConfirmSingleOrderCheckoutResponse confirmSingleOrderCheckout(JstConfirmSingleOrderCheckoutRequest request) {
        JstConfirmSingleOrderCheckoutResponse response = execute("/open/webapi/wmsapi/checkoutopen/singleorderconfirms", request, JstConfirmSingleOrderCheckoutResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMessage()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=22&docId=386">获取推荐仓位</a>
     */
    @Override
    public JstGetRecommendBinResponse getRecommendBin(JstGetRecommendBinRequest request) {
        JstGetRecommendBinResponse response = execute("/open/jushuitan/recommend/bin/get", request, JstGetRecommendBinResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=22&docId=925">查询极速发货订单数</a>
     */
    @Override
    public JstGetFastDeliveryOrderCountResponse getFastDeliveryOrderCount(JstGetFastDeliveryOrderCountRequest request) {
        JstGetFastDeliveryOrderCountResponse response = execute("/open/webapi/wmsapi/checkout/getfastdeliveryordercount", request, JstGetFastDeliveryOrderCountResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=22&docId=986">发货装箱</a>
     */
    @Override
    public JstAddShippingPackResponse addShippingPack(JstAddShippingPackRequest request) {
        JstAddShippingPackResponse response = execute("/open/webapi/wmsapi/shippingpack/addshippingpack", request, JstAddShippingPackResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=22&docId=996">唯一码进出流水查询</a>
     */
    @Override
    public JstQueryInOutItemSkusnsResponse queryInOutItemSkusns(JstQueryInOutItemSkusnsRequest request) {
        JstQueryInOutItemSkusnsResponse response = execute("/open/webapi/wmsapi/skusn/queryinoutitemskusns", request, JstQueryInOutItemSkusnsResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=22&docId=1030">打包机保存视频记录</a>
     */
    @Override
    public JstSaveIpcVedioRecordResponse saveIpcVedioRecord(JstSaveIpcVedioRecordRequest request) {
        JstSaveIpcVedioRecordResponse response = execute("/open/webapi/wmsapi/packageentries/saveipcvediorecord", request, JstSaveIpcVedioRecordResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=22&docId=180">更新批次拣货状态</a>
     */
    @Override
    public JstUploadWaveStatusResponse uploadWaveStatus(JstUploadWaveStatusRequest request) {
        JstUploadWaveStatusResponse response = execute("/open/jushuitan/wavestatus/upload", request, JstUploadWaveStatusResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=22&docId=73">强制审核单件商品缺货订单并入库</a>
     */
    @Override
    public JstConfirmSingleOrderResponse confirmSingleOrder(JstConfirmSingleOrderRequest request) {
        JstConfirmSingleOrderResponse response = execute("/open/jushuitan/order/single/confirm", request, JstConfirmSingleOrderResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=22&docId=76">查询WMS工作日志</a>
     */
    @Override
    public JstGetWorkLogResponse getWorkLog(JstGetWorkLogRequest request) {
        JstGetWorkLogResponse response = execute("/open/webapi/wmsapi/worklog/getworklog", request, JstGetWorkLogResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=22&docId=112">拣货批次管理查询</a>
     */
    @Override
    public JstLoadWavesByFilterResponse loadWavesByFilter(JstLoadWavesByFilterRequest request) {
        JstLoadWavesByFilterResponse response = execute("/open/webapi/wmsapi/wavequery/loadwavesbyfilter", request, JstLoadWavesByFilterResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=22&docId=154">工作量补入</a>
     */
    @Override
    public JstAppendWorkloadResponse appendWorkload(JstAppendWorkloadRequest request) {
        JstAppendWorkloadResponse response = execute("/open/webapi/wmsapi/worklog/workloadappend", request, JstAppendWorkloadResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=22&docId=159">机器人获取批次</a>
     */
    @Override
    public JstQueryPickWaveResponse queryPickWave(JstQueryPickWaveRequest request) {
        JstQueryPickWaveResponse response = execute("/open/jushuitan/pickwave/query", request, JstQueryPickWaveResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=22&docId=160">批次预占重算</a>
     */
    @Override
    public JstQueryPreReduceWaveResponse queryPreReduceWave(JstQueryPreReduceWaveRequest request) {
        JstQueryPreReduceWaveResponse response = execute("/open/jushuitan/prereducewave/query", request, JstQueryPreReduceWaveResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=22&docId=161">获取正在等待拣货的预占信息</a>
     */
    @Override
    public JstGetWaitPickReduceStockResponse getWaitPickReduceStock(JstGetWaitPickReduceStockRequest request) {
        JstGetWaitPickReduceStockResponse response = execute("/open/jushuitan/reducestock/waitpick/get", request, JstGetWaitPickReduceStockResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=22&docId=172">指定机器人批次</a>
     */
    @Override
    public JstAssignAgvWaveResponse assignAgvWave(JstAssignAgvWaveRequest request) {
        JstAssignAgvWaveResponse response = execute("/open/jushuitan/agv/wave/assign", request, JstAssignAgvWaveResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=22&docId=173">查询快销唯一码信息</a>
     */
    @Override
    public JstLoadSkusnResponse loadSkusn(JstLoadSkusnRequest request) {
        JstLoadSkusnResponse response = execute("/open/jushuitan/skusn/load", request, JstLoadSkusnResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=22&docId=54">进出仓流水</a>
     */
    @Override
    public JstQueryInOutWaterResponse queryInOutWater(JstQueryInOutWaterRequest request) {
        JstQueryInOutWaterResponse response = execute("/open/jushuitan/inout/water/query", request, JstQueryInOutWaterResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=22&docId=212">快销-获取订单替换商品分析</a>
     */
    @Override
    public JstLoadOrderChangeStatisticsResponse loadOrderChangeStatistics(JstLoadOrderChangeStatisticsRequest request) {
        JstLoadOrderChangeStatisticsResponse response = execute("/open/webapi/wmsapi/openp2dskusn/loadorderchangestatistics", request, JstLoadOrderChangeStatisticsResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=22&docId=252">跟踪信息查询</a>
     */
    @Override
    public JstQuerySkusnResponse querySkusn(JstQuerySkusnRequest request) {
        JstQuerySkusnResponse response = execute("/open/jushuitan/skusn/query", request, JstQuerySkusnResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=22&docId=322">生成快销标签</a>
     */
    @Override
    public JstCreateSkusnResponse createSkusn(JstCreateSkusnRequest request) {
        JstCreateSkusnResponse response = execute("/open/webapi/wmsapi/openp2dskusn/createskusn", request, JstCreateSkusnResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }
}
