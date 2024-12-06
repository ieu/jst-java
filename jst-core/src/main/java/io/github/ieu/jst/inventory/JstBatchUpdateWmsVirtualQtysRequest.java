package io.github.ieu.jst.inventory;

@lombok.Data
@lombok.Builder
public class JstBatchUpdateWmsVirtualQtysRequest {

    /**
     * 分仓编码
     */
    private Number wmsCoId;

    private java.util.List<SkuAndQty> skuAndQty;

    /**
     * 最多1000条商品明细
     */
    @lombok.Data
    public static class SkuAndQty {

        /**
         * 商品编码
         */
        private String skuId;

        /**
         * <div><a href="https://cdn.erp321.cn/jst-fed/bb999f4b-cedc-4d9a-af58-8c3c9117930c_2497_687.png" target="_blank">商品数量</a></div>
         */
        private Number qty;
    }
}
