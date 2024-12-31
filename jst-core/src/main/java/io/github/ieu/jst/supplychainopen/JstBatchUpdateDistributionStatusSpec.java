package io.github.ieu.jst.supplychainopen;

public class JstBatchUpdateDistributionStatusSpec {

    private final JstSupplyChainOpenClient client;

    private final JstBatchUpdateDistributionStatusRequest.JstBatchUpdateDistributionStatusRequestBuilder requestBuilder = JstBatchUpdateDistributionStatusRequest.builder();

    public JstBatchUpdateDistributionStatusSpec(JstSupplyChainOpenClient client) {
        this.client = client;
    }

    /**
     * 分销状态 0:不可分销 1:分销可见 2:所有人可见
     */
    public JstBatchUpdateDistributionStatusSpec distributionStatus(Number distributionStatus) {
        requestBuilder.distributionStatus(distributionStatus);
        return this;
    }

    /**
     * 商品ID列表 一次最多100个,可通过/open/api/goods/inneropen/goods/querygoodsdetail 或者 /open/api/goods/inneropen/goods/querygoodslist 获取
     */
    public JstBatchUpdateDistributionStatusSpec itemSpuList(java.util.List<String> itemSpuList) {
        requestBuilder.itemSpuList(itemSpuList);
        return this;
    }

    public JstBatchUpdateDistributionStatusResponse response() {
        return this.client.batchUpdateDistributionStatus(requestBuilder.build());
    }
}
