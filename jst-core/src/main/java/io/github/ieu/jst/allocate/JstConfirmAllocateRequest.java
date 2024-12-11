package io.github.ieu.jst.allocate;

@lombok.Data
@lombok.Builder
public class JstConfirmAllocateRequest {

    /**
     * 调拨单号
     */
    private Integer ioId;

    /**
     * 分仓id（当单据为分仓调拨单时仓库编码必填）
     */
    private Integer wmsCoId;

    /**
     * 备注
     */
    private String remark;

    /**
     * 是否强制调拨
     */
    private Boolean isForce;

    /**
     * 商品集合
     */
    private java.util.List<Item> items;

    @lombok.Data
    public static class Item {

        /**
         * 商品编码
         */
        private String skuId;

        /**
         * 商品数量
         */
        private Integer qty;
    }
}
