package io.github.ieu.jst.stockout;

@lombok.Data
@lombok.Builder
public class JstCancelPurchaseOutRequest {

    /**
     * 出仓单号，与线上单号不能同时为空，两者都存在时取io_ids，最多20个
     */
    private java.util.List<Integer> ioIds;

    /**
     * 线上单号，与出仓单号不能同时为空，两者都存在时取io_ids，最多20个
     */
    private java.util.List<String> soIds;
}
