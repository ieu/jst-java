package io.github.ieu.jst.supplychainopen;

@lombok.Data
@lombok.Builder
public class JstBatchUpdateDistributionStatusRequest {

    /**
     * 分销状态 0:不可分销 1:分销可见 2:所有人可见
     */
    private Number distributionStatus;

    /**
     * 商品ID列表 一次最多100个,可通过/open/api/goods/inneropen/goods/querygoodsdetail 或者 /open/api/goods/inneropen/goods/querygoodslist 获取
     */
    private java.util.List<String> itemSpuList;
}
