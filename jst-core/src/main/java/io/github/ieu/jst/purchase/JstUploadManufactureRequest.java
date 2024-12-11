package io.github.ieu.jst.purchase;

@lombok.Data
@lombok.Builder
public class JstUploadManufactureRequest {

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/f19f6400-d415-4d07-ad45-868a4d32ea19_1631_224.png"target="_blank">外部单号</a></div>
     */
    private String soId;

    /**
     * 加工单时间
     */
    private String poDate;

    /**
     * 线上单号
     */
    private String outerPoId;

    /**
     * 加工工厂编号（供应商编号）
     */
    private Integer sellerId;

    /**
     * 送货地址
     */
    private String sendAddress;

    /**
     * 合同条款
     */
    private String term;

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/af38b13a-6168-4111-8ecb-47b660e5ab05_1480_224.png"target="_blank">标签</a></div
     */
    private java.util.List<String> labels;

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/31cbbe4c-0139-4461-b925-983cc6fd73d7_1415_221.png"target="_blank">加工仓储方</a></div>
     */
    private Integer wmsCoId;

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/a3d2c327-ff24-4ac7-a0ee-76ebe97159e0_1533_191.png"target="_blank">收货仓储方</a></div>
     */
    private Integer receiptWmsCoId;

    /**
     * 备注
     */
    private String remark;

    /**
     * 成品节点
     */
    private java.util.List<Item> items;

    /**
     * 是否自动确认单据（默认false待审核）
     */
    private Boolean isConfirm;

    @lombok.Data
    public static class Item {

        /**
         * <div><a href="https://cdn.erp321.cn/jst-fed/5ca7b0cf-48f6-4aa7-85bd-6f289b05927a_1185_171.png"target="_blank">商品编码</a></div>
         */
        private String skuId;

        /**
         * 数量
         */
        private Number qty;

        /**
         * 预计完成加工数
         */
        private Number planArriveQty;

        /**
         * 预计完成加工时间
         */
        private String deliveryDate;

        /**
         * 物料成本
         */
        private String price;

        /**
         * 加工费
         */
        private String processingCharges;

        /**
         * 备注
         */
        private String remark;
    }
}
