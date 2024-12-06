package io.github.ieu.jst.stockout;

@lombok.Data
public class JstQueryPurchaseOutResponse {

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 错误描述
     */
    private String msg;

    private Data data;

    @lombok.Data
    public static class Data {

        /**
         * 每页多少条
         */
        private Integer pageSize;

        /**
         * 第几页
         */
        private Integer pageIndex;

        /**
         * 总条数
         */
        private Integer dataCount;

        /**
         * 总页数
         */
        private Integer pageCount;

        /**
         * 是否有下一页
         */
        private Boolean hasNext;

        /**
         * 数据集合
         */
        private java.util.List<Datas> datas;

        @lombok.Data
        public static class Datas {

            /**
             * 退货单号
             */
            private Integer ioId;

            /**
             * 退货日期
             */
            private String ioDate;

            /**
             * 返修退货关联采购单
             */
            private Number createdPoId;

            /**
             * 状态(Confirmed:生效，WaitConfirm:待审核，Creating:草拟，Cancelled:作废,OuterConfirming:外部确认中，Delete:取消)
             */
            private String status;

            /**
             * 线上单号
             */
            private String soId;

            /**
             * 财务状态，WaitConfirm=待审核，Confirmed=已审核
             */
            private String fStatus;

            /**
             * 仓库名
             */
            private String warehouse;

            /**
             * 收货人/供应商名称
             */
            private String receiverName;

            /**
             * 收货电话
             */
            private String receiverMobile;

            /**
             * 收件人省
             */
            private String receiverState;

            /**
             * 收件人市
             */
            private String receiverCity;

            /**
             * 收件人区
             */
            private String receiverDistrict;

            /**
             * 收件人省地址
             */
            private String receiverAddress;

            /**
             * 仓库编号，1=主仓，2=销退仓，3=进货仓，4=次品仓
             */
            private Integer whId;

            /**
             * 备注
             */
            private String remark;

            /**
             * 修改时间
             */
            private String modified;

            /**
             * 采购单号
             */
            private Integer poId;

            /**
             * 分仓编号
             */
            private String wmsCoId;

            /**
             * 供应商ID
             */
            private Integer sellerId;

            /**
             * 标记|多标签
             */
            private String labels;

            /**
             * 拣货批次号
             */
            private Number waveId;

            /**
             * 物流公司
             */
            private String logisticsCompany;

            /**
             * 税率
             */
            private Number freeAmount;

            /**
             * 物流公司编号
             */
            private String lcId;

            /**
             * 物流单号
             */
            private String lId;

            /**
             * 财务审核日期
             */
            private String archived;

            /**
             * 创建人
             */
            private String creatorName;

            /**
             * 虚拟仓编号
             */
            private Number lockWhId;

            /**
             * 虚拟仓名称
             */
            private String lockWhName;

            /**
             * 外部单号
             */
            private String outIoId;

            /**
             * 商品集合
             */
            private java.util.List<Items> items;

            /**
             * <div><a href="https://cdn.erp321.cn/jst-fed/6e7a0bbb-124e-457f-9b31-b9286c42d8ea_1558_310.png" target="_blank">生产批次集合</a></div>，系统中需开启相关配置(对应erp基础设置开启生产批次管理 如果是分仓数据 分仓也需要开启)
             */
            private java.util.List<Batchs> batchs;

            /**
             * <div><a href="https://cdn.erp321.cn/jst-fed/1480fd4b-f07f-4f6f-9099-51e459e1b772_1634_247.png" target="_blank">唯一码集合</a></div>，获取该节点系统中相关业务项需配置（对应erp基础设置商品唯一码开关）
             */
            private java.util.List<Sns> sns;

            @lombok.Data
            public static class Sns {

                /**
                 * 商品编码
                 */
                private String skuId;

                /**
                 * 唯一码
                 */
                private String sn;
            }

            @lombok.Data
            public static class Batchs {

                /**
                 * 批次号
                 */
                private String batchNo;

                /**
                 * 商品编码
                 */
                private String skuId;

                /**
                 * 数量
                 */
                private Integer qty;

                /**
                 * 批次日期
                 */
                private String productDate;

                /**
                 * 供应商编号
                 */
                private Integer supplierId;

                /**
                 * 供应商名称
                 */
                private String supplierName;
            }

            @lombok.Data
            public static class Items {

                /**
                 * 明细id
                 */
                private Integer ioiId;

                /**
                 * 商品编码
                 */
                private String skuId;

                /**
                 * 商品名称
                 */
                private String name;

                /**
                 * 属性
                 */
                private String propertiesValue;

                /**
                 * 税率
                 */
                private Number taxRate;

                /**
                 * 数量
                 */
                private Integer qty;

                /**
                 * 单价
                 */
                private Number costPrice;

                /**
                 * 金额
                 */
                private Number costAmount;

                /**
                 * 款式编码
                 */
                private String iId;

                /**
                 * 备注
                 */
                private String remark;

                /**
                 * 退货单号
                 */
                private Integer ioId;

                /**
                 * 公司编号
                 */
                private Integer coId;

                /**
                 * 批次号，系统中相关业务项需配置
                 */
                private String batchNo;
            }
        }
    }
}
