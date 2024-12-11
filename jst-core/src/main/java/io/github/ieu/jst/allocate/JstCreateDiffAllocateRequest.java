package io.github.ieu.jst.allocate;

@lombok.Data
@lombok.Builder
public class JstCreateDiffAllocateRequest {

    /**
     * 调拨入单号
     */
    private String ioId;

    /**
     * 商品集合
     */
    private java.util.List<Item> items;

    @lombok.Data
    public static class Item {

        /**
         * 商品编码（最多100个）
         */
        private String skuId;

        /**
         * 商品数量
         */
        private String qty;
    }
}
