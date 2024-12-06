package io.github.ieu.jst.seed;

import io.github.ieu.jst.AbstractJstBizClient;
import io.github.ieu.jst.JstConfiguration;

/**
 * 播种API
 */
public class DefaultJstSeedClient extends AbstractJstBizClient implements JstSeedClient {

    public DefaultJstSeedClient(JstConfiguration configuration) {
        super(configuration);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=51&docId=111">绑定播种车</a>
     */
    @Override
    public JstBindBinIdCarryIdToWaveResponse bindBinIdCarryIdToWave(JstBindBinIdCarryIdToWaveRequest request) {
        return execute("/open/webapi/wmsapi/wave/bindbinidcarryid", request, JstBindBinIdCarryIdToWaveResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=51&docId=188">获取播种批次信息（支持新版三方仓查询）</a>
     */
    @Override
    public JstGetJushuitanWaveResponse getJushuitanWave(JstGetJushuitanWaveRequest request) {
        return execute("/open/jushuitan/wave/get", request, JstGetJushuitanWaveResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=51&docId=194">播种回传（出库）</a>
     */
    @Override
    public JstCallbackSeedResponse callbackSeed(JstCallbackSeedRequest request) {
        return execute("/open/jushuitan/seed/callback", request, JstCallbackSeedResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=51&docId=232">根据播种车号解绑出库单</a>
     */
    @Override
    public JstUnbindInOutByCarryIdResponse unbindInOutByCarryId(JstUnbindInOutByCarryIdRequest request) {
        return execute("/open/webapi/wmsapi/wave/unbindinoutbycarryid", request, JstUnbindInOutByCarryIdResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=51&docId=456">播种回传（不出库）</a>
     */
    @Override
    public JstReturnSeedResponse returnSeed(JstReturnSeedRequest request) {
        return execute("/open/jushuitan/seed/return", request, JstReturnSeedResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=51&docId=467">解绑批次拣货车/播种车</a>
     */
    @Override
    public JstUnbindWaveCarryIdResponse unbindWaveCarryId(JstUnbindWaveCarryIdRequest request) {
        return execute("/open/webapi/wmsapi/wave/unbindwavecarryid", request, JstUnbindWaveCarryIdResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=51&docId=729">绑定播种柜号和播种车</a>
     */
    @Override
    public JstBindBinIdCarryIdResponse bindBinIdCarryId(JstBindBinIdCarryIdRequest request) {
        return execute("/open/jushuitan/binid/carryid/bind", request, JstBindBinIdCarryIdResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=51&docId=730">校验播种车的状态是否可用</a>
     */
    @Override
    public JstCheckCarryIdResponse checkCarryId(JstCheckCarryIdRequest request) {
        return execute("/open/jushuitan/carryid/check", request, JstCheckCarryIdResponse.class);
    }
}
