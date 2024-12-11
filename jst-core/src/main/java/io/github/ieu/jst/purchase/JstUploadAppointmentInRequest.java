package io.github.ieu.jst.purchase;

@lombok.Data
@lombok.Builder
public class JstUploadAppointmentInRequest {

    /**
     * 采购单号列表，最大10个，无采购预约入库，供应商内部id必填
     */
    private java.util.List<Integer> poIds;

    /**
     * 分仓编号
     */
    private Integer wmsCoId;

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/bf26d89f-d1f7-439e-b773-2f125e57764f_1534_487.png" target="_blank">供应商内部编号</a></div>无采购单时必填
     */
    private Integer supplierId;

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/3db29488-c665-453c-82f4-4156f31995b8_1617_196.png" target="_blank">外部预约单号</a></div>
     */
    private String externalId;

    /**
     * 预约到货时间
     */
    private String planArriveDate;

    /**
     * 备注
     */
    private String remark;

    /**
     * 送货地址
     */
    private String sendAddress;

    /**
     * 商品类型；可选值：成品；半成品；原材料
     */
    private String itemType;

    /**
     * 商品列表
     */
    private java.util.List<Item> items;

    /**
     * 是否自动确认；默认false
     */
    private Boolean isConfirm;

    @lombok.Data
    public static class Item {

        /**
         * 商品编码
         */
        private String skuId;

        /**
         * 预约到货数量，审核前可更新
         */
        private Integer qty;
    }
}
