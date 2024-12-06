package io.github.ieu.jst.shengsuan;

/**
 * 胜算API
 */
public interface JstShengsuanClient {

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=36&docId=973">获取胜算平台原始账单</a>
     */
    JstGetOpenAlipayBillRecordsResponse getOpenAlipayBillRecords(JstGetOpenAlipayBillRecordsRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=36&docId=972">获取胜算店铺级推广费</a>
     */
    JstGetOpenAlipayPromotionFeeResponse getOpenAlipayPromotionFee(JstGetOpenAlipayPromotionFeeRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=36&docId=971">获取胜算链接级推广费数据</a>
     */
    JstGetOpenPfPromotionShopItemResponse getOpenPfPromotionShopItem(JstGetOpenPfPromotionShopItemRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=36&docId=970">获取胜算日常记账数据</a>
     */
    JstGetOpenFeeFlowingResponse getOpenFeeFlowing(JstGetOpenFeeFlowingRequest request);
}
