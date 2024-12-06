package io.github.ieu.jst.warehouse;

@lombok.Data
@lombok.Builder
public class JstCreateLwhAllocationRequest {

    /**
     * 调出虚拟仓
     */
    private Number outLwhId;

    /**
     * 是否审核生效
     */
    private Boolean examine;

    /**
     * 调入虚拟仓
     */
    private Number inLwhId;

    /**
     * 实体仓编码
     */
    private Number wmsCoId;

    /**
     * 外部单号,保持
     */
    private String soId;

    /**
     * 备注
     */
    private String remark;

    private java.util.List<Items> items;

    @lombok.Data
    public static class Items {

        /**
         * 商品编码
         */
        private String skuId;

        private Number qty;
    }
}
