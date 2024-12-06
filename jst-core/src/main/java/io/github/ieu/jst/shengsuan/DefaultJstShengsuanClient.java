package io.github.ieu.jst.shengsuan;

import io.github.ieu.jst.AbstractJstBizClient;
import io.github.ieu.jst.JstConfiguration;

/**
 * 胜算API
 */
public class DefaultJstShengsuanClient extends AbstractJstBizClient implements JstShengsuanClient {

    public DefaultJstShengsuanClient(JstConfiguration configuration) {
        super(configuration);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=36&docId=973">获取胜算平台原始账单</a>
     */
    @Override
    public JstGetOpenAlipayBillRecordsResponse getOpenAlipayBillRecords(JstGetOpenAlipayBillRecordsRequest request) {
        return execute("/open/webapi/pfopen/pfopenalifee/getopenalipaybillrecords", request, JstGetOpenAlipayBillRecordsResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=36&docId=972">获取胜算店铺级推广费</a>
     */
    @Override
    public JstGetOpenAlipayPromotionFeeResponse getOpenAlipayPromotionFee(JstGetOpenAlipayPromotionFeeRequest request) {
        return execute("/open/webapi/pfopen/pfopenalifee/getopenalipaypromotionfee", request, JstGetOpenAlipayPromotionFeeResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=36&docId=971">获取胜算链接级推广费数据</a>
     */
    @Override
    public JstGetOpenPfPromotionShopItemResponse getOpenPfPromotionShopItem(JstGetOpenPfPromotionShopItemRequest request) {
        return execute("/open/webapi/pfopen/pfopenalifee/getopenpfpromotionshopitem", request, JstGetOpenPfPromotionShopItemResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=36&docId=970">获取胜算日常记账数据</a>
     */
    @Override
    public JstGetOpenFeeFlowingResponse getOpenFeeFlowing(JstGetOpenFeeFlowingRequest request) {
        return execute("/open/webapi/pfopen/pfopenorderfee/getopenfeeflowing", request, JstGetOpenFeeFlowingResponse.class);
    }
}
