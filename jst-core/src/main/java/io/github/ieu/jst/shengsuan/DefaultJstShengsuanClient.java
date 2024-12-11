package io.github.ieu.jst.shengsuan;

import io.github.ieu.jst.AbstractJstBizClient;
import io.github.ieu.jst.JstConfiguration;
import io.github.ieu.jst.JstErrorCode;
import io.github.ieu.jst.JstServerException;

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
        JstGetOpenAlipayBillRecordsResponse response = execute("/open/webapi/pfopen/pfopenalifee/getopenalipaybillrecords", request, JstGetOpenAlipayBillRecordsResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=36&docId=972">获取胜算店铺级推广费</a>
     */
    @Override
    public JstGetOpenAlipayPromotionFeeResponse getOpenAlipayPromotionFee(JstGetOpenAlipayPromotionFeeRequest request) {
        JstGetOpenAlipayPromotionFeeResponse response = execute("/open/webapi/pfopen/pfopenalifee/getopenalipaypromotionfee", request, JstGetOpenAlipayPromotionFeeResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=36&docId=971">获取胜算链接级推广费数据</a>
     */
    @Override
    public JstGetOpenPfPromotionShopItemResponse getOpenPfPromotionShopItem(JstGetOpenPfPromotionShopItemRequest request) {
        JstGetOpenPfPromotionShopItemResponse response = execute("/open/webapi/pfopen/pfopenalifee/getopenpfpromotionshopitem", request, JstGetOpenPfPromotionShopItemResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=36&docId=970">获取胜算日常记账数据</a>
     */
    @Override
    public JstGetOpenFeeFlowingResponse getOpenFeeFlowing(JstGetOpenFeeFlowingRequest request) {
        JstGetOpenFeeFlowingResponse response = execute("/open/webapi/pfopen/pfopenorderfee/getopenfeeflowing", request, JstGetOpenFeeFlowingResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }
}
