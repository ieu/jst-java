package io.github.ieu.jst.warehouse;

@lombok.Data
@lombok.Builder
public class JstCreateOrUpdateLockPurchaseRequest {

    /**
     * 虚拟仓采购申请单的id（如果要更新该字段必填）
     */
    private String lpId;

    /**
     * 虚拟仓编码
     */
    private String lwhId;

    /**
     * 分仓编码
     */
    private String wmsCoId;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 商品明细
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
        private String qty;

        /**
         * 明细备注
         */
        private String remark;
    }
}
