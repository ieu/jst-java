package io.github.ieu.jst.otherstocking;

@lombok.Data
public class JstQueryOtherInOutResponse {

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 错误描述
     */
    private String msg;

    private Pagination data;

    @lombok.Data
    public static class Pagination {

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
        private java.util.List<Data> datas;

        @lombok.Data
        public static class Data {

            /**
             * 出仓单号
             */
            private Integer ioId;

            /**
             * 单据日期
             */
            private String ioDate;

            /**
             * 单据状态，Confirmed生效，WaitConfirm待审核，OuterConfirming外部确认中，Cancelled取消（单据生效后的作废），Delete作废（单据生效前的作废）
             */
            private String status;

            /**
             * 线上单号
             */
            private String soId;

            /**
             * 单据类型
             */
            private String type;

            /**
             * 财务状态
             */
            private String fStatus;

            /**
             * 仓库名称
             */
            private String warehouse;

            /**
             * 收货人
             */
            private String receiverName;

            /**
             * 收货人手机
             */
            private String receiverMobile;

            /**
             * 收货人省
             */
            private String receiverState;

            /**
             * 收货人市
             */
            private String receiverCity;

            /**
             * 收货人区
             */
            private String receiverDistrict;

            /**
             * 收货人地址
             */
            private String receiverAddress;

            /**
             * 仓库编号；主仓=1，销退仓=2，进货仓=3，次品仓=4，自定义1仓=6，自定义2仓=7，自定义3仓=8
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
             * 创建时间
             */
            private String created;

            /**
             * 多标签
             */
            private String labels;

            /**
             * 分仓编号
             */
            private Integer wmsCoId;

            /**
             * 创建人
             */
            private String creatorName;

            /**
             * 拣货批次号
             */
            private Number waveId;

            /**
             * 出库类型
             */
            private String dropCoName;

            /**
             * 其它出入库人员
             */
            private String inoutUser;

            /**
             * 快递单号
             */
            private String lId;

            /**
             * 物流公司编码
             */
            private String lcId;

            /**
             * 物流公司
             */
            private String logisticsCompany;

            /**
             * 虚拟仓编码
             */
            private Number lockWhId;

            /**
             * 虚拟仓名称
             */
            private String lockWhName;

            /**
             * 商品集合
             */
            private java.util.List<Item> items;

            /**
             * 批次集合，获取该节点系统中相关业务项需配置（对应erp基础设置开启生产批次管理 如果是分仓数据 分仓也需要开启）
             */
            private java.util.List<Batch> batchs;

            /**
             * 唯一码集合，获取该节点系统中相关业务项需配置（对应erp基础设置商品唯一码开关）
             */
            private java.util.List<Sn> sns;

            @lombok.Data
            public static class Sn {

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
            public static class Batch {

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
            public static class Item {

                /**
                 * 子单号
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
                 * 单位
                 */
                private String unit;

                /**
                 * 颜色及规格
                 */
                private String propertiesValue;

                /**
                 * 数量
                 */
                private Integer qty;

                /**
                 * 成本单价
                 */
                private Number costPrice;

                /**
                 * 总成本价
                 */
                private Number costAmount;

                /**
                 * 款式编码
                 */
                private String iId;

                /**
                 * 商品备注
                 */
                private String remark;

                /**
                 * 出仓单号
                 */
                private Integer ioId;

                /**
                 * 单价
                 */
                private Number salePrice;

                /**
                 * 金额
                 */
                private Number saleAmount;

                /**
                 * 批次号，需开启相关业务配置
                 */
                private String batchId;

                /**
                 * 批次日期，需开启相关业务配置
                 */
                private String productDate;

                /**
                 * 供应商编号，需开启相关业务配置
                 */
                private Integer supplierId;

                /**
                 * 有效期至，需开启相关业务配置
                 */
                private String expirationDate;
            }
        }
    }
}
