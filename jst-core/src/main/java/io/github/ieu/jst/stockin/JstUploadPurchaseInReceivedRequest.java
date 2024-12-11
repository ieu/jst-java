package io.github.ieu.jst.stockin;

@lombok.Data
@lombok.Builder
public class JstUploadPurchaseInReceivedRequest {

    /**
     * 进仓单号
     */
    private Integer ioId;

    /**
     * 商品信息
     */
    private java.util.List<Item> items;

    @lombok.Data
    public static class Item {

        /**
         * 实收数量
         */
        private Integer qty;

        /**
         * 商品编码
         */
        private String skuId;
    }
}
