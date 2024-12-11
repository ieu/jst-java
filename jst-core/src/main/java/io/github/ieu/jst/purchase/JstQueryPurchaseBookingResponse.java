package io.github.ieu.jst.purchase;

@lombok.Data
public class JstQueryPurchaseBookingResponse {

    /**
     * 每页多少条
     */
    private Integer pageSize;

    /**
     * 第几页
     */
    private Integer pageIndex;

    /**
     * 是否有下一页
     */
    private Boolean hasNext;

    /**
     * 总页数
     */
    private Integer pageCount;

    /**
     * 总条数
     */
    private Integer dataCount;

    /**
     * 数据集合
     */
    private java.util.List<Data> datas;

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 错误信息
     */
    private String msg;

    @lombok.Data
    public static class Data {

        /**
         * 预约单号
         */
        private Integer poId;

        /**
         * 采购单号
         */
        private String mergePoId;

        /**
         * 供应商编号
         */
        private Integer sellerId;

        /**
         * 供应商名称
         */
        private String seller;

        /**
         * 线上单号
         */
        private String externalId;

        /**
         * 创建时间
         */
        private String created;

        /**
         * 预计到货时间
         */
        private String planArriveDate;

        /**
         * 修改时间
         */
        private String modified;

        /**
         * 状态：WaitConfirm ：待审核：Confirmed  ：已确认；Finished ：完成；Cancelled：作废；OuterConfirming ：外部确认中
         */
        private String status;

        /**
         * 备注
         */
        private String remark;

        /**
         * 收货地址
         */
        private String sendAddress;

        /**
         * 创建人
         */
        private String creatorName;

        /**
         * 分仓编号
         */
        private Integer wmsCoId;

        /**
         * 创建人
         */
        private java.util.List<item> items;

        /**
         * 商品明细
         */
        @lombok.Data
        public static class item {

            /**
             * 入库子单号
             */
            private Integer poiId;

            /**
             * 商品编码
             */
            private String skuId;

            /**
             * 商品款号
             */
            private String iId;

            /**
             * 商品名称
             */
            private String name;

            /**
             * 颜色及规格
             */
            private String propertiesValue;

            /**
             * 采购数量
             */
            private Integer qty;

            /**
             * 本次入库数量
             */
            private Integer planQty;

            /**
             * 预约到货数量
             */
            private Integer planArriveQty;

            /**
             * 备注
             */
            private String remark;

            /**
             * 预约已入库数量（需要在ERP设置配置项）
             */
            private Integer inQty;
        }
    }
}
