package io.github.ieu.jst.aftersale;

@lombok.Data
public class JstQueryAfterSaleReceivedResponse {

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
             * 退仓单号
             */
            private Integer ioId;

            /**
             * 内部单号
             */
            private Integer oId;

            /**
             * 线上单号
             */
            private String soId;

            /**
             * 售后订单号
             */
            private Integer asId;

            /**
             * 物流单号
             */
            private String lId;

            /**
             * 物流公司名称
             */
            private String logisticsCompany;

            /**
             * 创建人编码
             */
            private Number creator;

            /**
             * 创建人名称
             */
            private String creatorName;

            /**
             * 入库日期
             */
            private String ioDate;

            /**
             * 仓库名称
             */
            private String warehouse;

            /**
             * 修改时间
             */
            private String modified;

            /**
             * 物流公司编码
             */
            private String lcId;

            /**
             * 店铺编号
             */
            private Integer shopId;

            /**
             * 售后备注
             */
            private String aftersaleRemark;

            /**
             * 时间戳
             */
            private Number ts;

            /**
             * 单据状态(售后单状态（WaitConfirm:待确认,Confirmed:已确认,Cancelled:作废,Merged:被合并
             */
            private String status;

            /**
             * 仓库代码（1主仓，2销退仓，3进货仓，4次品仓）
             */
            private Integer whId;

            /**
             * 分仓编号
             */
            private Integer wmsCoId;

            /**
             * 分销商名称
             */
            private String drpCoName;

            /**
             * 分销商编号
             */
            private Integer drpCoIdTo;

            /**
             * 售后类型：普通退货，其它，拒收退货，仅退款，投诉，补发，换货，维修
             */
            private String type;

            /**
             * 商品集合
             */
            private java.util.List<Items> items;

            /**
             * 批次信息集合
             */
            private java.util.List<Batchs> batchs;

            private java.util.List<Sns> sns;

            @lombok.Data
            public static class Sns {

                /**
                 * 商品编码
                 */
                private String skuId;

                /**
                 * SN码
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
                 * 退仓子单号，用于区分货品行的行号
                 */
                private Number ioiId;

                /**
                 * 商品编码
                 */
                private String skuId;

                /**
                 * 商品数量
                 */
                private Integer qty;

                /**
                 * 批次日期
                 */
                private String productDate;

                /**
                 * 供应商编号
                 */
                private String supplierId;

                /**
                 * 供应商名称
                 */
                private String supplierName;

                /**
                 * 有效期至
                 */
                private String expirationDate;
            }

            @lombok.Data
            public static class Items {

                /**
                 * 退仓单号
                 */
                private Integer ioId;

                /**
                 * 商品编码
                 */
                private String skuId;

                /**
                 * 款式编码
                 */
                private String iId;

                /**
                 * 单位
                 */
                private String unit;

                /**
                 * 商品数量
                 */
                private Integer qty;

                /**
                 * 商品名称
                 */
                private String name;

                /**
                 * 属性值
                 */
                private String propertiesValue;

                /**
                 * 销售价格
                 */
                private Number salePrice;

                /**
                 * 销售总金额
                 */
                private Number saleAmount;

                /**
                 * 退仓子单号，用于区分货品行的行号
                 */
                private String ioiId;
            }
        }
    }
}
