package io.github.ieu.jst.seed;

/**
 * 播种API
 */
public interface JstSeedClient {

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=51&docId=111">绑定播种车</a>
     */
    JstBindBinIdCarryIdToWaveResponse bindBinIdCarryIdToWave(JstBindBinIdCarryIdToWaveRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=51&docId=188">获取播种批次信息（支持新版三方仓查询）</a>
     */
    JstGetJushuitanWaveResponse getJushuitanWave(JstGetJushuitanWaveRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=51&docId=194">播种回传（出库）</a>
     */
    JstCallbackSeedResponse callbackSeed(JstCallbackSeedRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=51&docId=232">根据播种车号解绑出库单</a>
     */
    JstUnbindInOutByCarryIdResponse unbindInOutByCarryId(JstUnbindInOutByCarryIdRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=51&docId=456">播种回传（不出库）</a>
     */
    JstReturnSeedResponse returnSeed(JstReturnSeedRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=51&docId=467">解绑批次拣货车/播种车</a>
     */
    JstUnbindWaveCarryIdResponse unbindWaveCarryId(JstUnbindWaveCarryIdRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=51&docId=729">绑定播种柜号和播种车</a>
     */
    JstBindBinIdCarryIdResponse bindBinIdCarryId(JstBindBinIdCarryIdRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=51&docId=730">校验播种车的状态是否可用</a>
     */
    JstCheckCarryIdResponse checkCarryId(JstCheckCarryIdRequest request);
}
