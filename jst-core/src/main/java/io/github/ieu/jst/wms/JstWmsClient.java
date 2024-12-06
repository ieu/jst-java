package io.github.ieu.jst.wms;

/**
 * WMS API
 */
public interface JstWmsClient {

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=22&docId=436">快销到货</a>
     */
    JstQuickSaleArrivalResponse quickSaleArrival(JstQuickSaleArrivalRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=22&docId=450">根据箱号查询箱内商品推荐仓位</a>
     */
    JstFindSkuBinResponse findSkuBin(JstFindSkuBinRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=22&docId=593">发货-强制审核单件商品缺货订单</a>
     */
    JstConfirmSingleOrderCheckoutResponse confirmSingleOrderCheckout(JstConfirmSingleOrderCheckoutRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=22&docId=386">获取推荐仓位</a>
     */
    JstGetRecommendBinResponse getRecommendBin(JstGetRecommendBinRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=22&docId=925">查询极速发货订单数</a>
     */
    JstGetFastDeliveryOrderCountResponse getFastDeliveryOrderCount(JstGetFastDeliveryOrderCountRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=22&docId=986">发货装箱</a>
     */
    JstAddShippingPackResponse addShippingPack(JstAddShippingPackRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=22&docId=996">唯一码进出流水查询</a>
     */
    JstQueryInOutItemSkusnsResponse queryInOutItemSkusns(JstQueryInOutItemSkusnsRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=22&docId=1030">打包机保存视频记录</a>
     */
    JstSaveIpcVedioRecordResponse saveIpcVedioRecord(JstSaveIpcVedioRecordRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=22&docId=180">更新批次拣货状态</a>
     */
    JstUploadWaveStatusResponse uploadWaveStatus(JstUploadWaveStatusRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=22&docId=73">强制审核单件商品缺货订单并入库</a>
     */
    JstConfirmSingleOrderResponse confirmSingleOrder(JstConfirmSingleOrderRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=22&docId=76">查询WMS工作日志</a>
     */
    JstGetWorkLogResponse getWorkLog(JstGetWorkLogRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=22&docId=112">拣货批次管理查询</a>
     */
    JstLoadWavesByFilterResponse loadWavesByFilter(JstLoadWavesByFilterRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=22&docId=154">工作量补入</a>
     */
    JstAppendWorkloadResponse appendWorkload(JstAppendWorkloadRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=22&docId=159">机器人获取批次</a>
     */
    JstQueryPickWaveResponse queryPickWave(JstQueryPickWaveRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=22&docId=160">批次预占重算</a>
     */
    JstQueryPreReduceWaveResponse queryPreReduceWave(JstQueryPreReduceWaveRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=22&docId=161">获取正在等待拣货的预占信息</a>
     */
    JstGetWaitPickReduceStockResponse getWaitPickReduceStock(JstGetWaitPickReduceStockRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=22&docId=172">指定机器人批次</a>
     */
    JstAssignAgvWaveResponse assignAgvWave(JstAssignAgvWaveRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=22&docId=173">查询快销唯一码信息</a>
     */
    JstLoadSkusnResponse loadSkusn(JstLoadSkusnRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=22&docId=54">进出仓流水</a>
     */
    JstQueryInOutWaterResponse queryInOutWater(JstQueryInOutWaterRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=22&docId=212">快销-获取订单替换商品分析</a>
     */
    JstLoadOrderChangeStatisticsResponse loadOrderChangeStatistics(JstLoadOrderChangeStatisticsRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=22&docId=252">跟踪信息查询</a>
     */
    JstQuerySkusnResponse querySkusn(JstQuerySkusnRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=22&docId=322">生成快销标签</a>
     */
    JstCreateSkusnResponse createSkusn(JstCreateSkusnRequest request);
}
