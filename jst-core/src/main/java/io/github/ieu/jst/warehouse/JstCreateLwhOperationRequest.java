package io.github.ieu.jst.warehouse;

@lombok.Data
@lombok.Builder
public class JstCreateLwhOperationRequest {

    /**
     * 虚拟仓编码
     */
    private Number lwhId;

    /**
     * 是否审核生效 默认false
     */
    private Boolean examine;

    /**
     * 仓储编码 若使用虚拟仓分仓则必填
     */
    private Number wmsCoId;

    /**
     * 外部单号 唯一
     */
    private String soId;

    /**
     * 类型 虚拟仓分配 虚拟仓归还
     */
    private String type;

    private java.util.List<Item> items;

    /**
     * 是否超锁，examine = true 的时候这个入参才有效（true：允许超锁，false：不允许超锁）不传为默认值 false
     */
    private Boolean isignoreCheckStock;

    @lombok.Data
    public static class Item {

        /**
         * 商品编码
         */
        private String skuId;

        /**
         * 不填 或者0 则取可用数
         */
        private Number qty;
    }
}
