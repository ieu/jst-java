package io.github.ieu.jst.allocate;

@lombok.Data
public class JstQueryAllocateResponse {

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
             * 分仓编号，调拨出为发起方，调拨入为接收方
             */
            private Integer wmsCoId;

            /**
             * 公司编号
             */
            private Integer coId;

            /**
             * 调拨单号
             */
            private Integer ioId;

            /**
             * 单据日期
             */
            private String ioDate;

            /**
             * 修改时间
             */
            private String modified;

            /**
             * Creating：待确认，Confirmed：调拨中，完成（若remark包含”红冲单据“则ERP显示红冲状态），Picking：拣货中，OuterConfirming：外部确认中，Cancelled：取消,Confirming:确认
             */
            private String status;

            /**
             * 调拨出仓库名称（对应ERP仓库资料设定页面）
             */
            private String warehouse;

            /**
             * 调拨入仓库名称（对应ERP仓库资料设定页面）
             */
            private String linkWarehouse;

            /**
             * 财务状态Archive:归档,modifing:变更,WaitConfirm:待审核,Confirmed:已审核,Cancelled:取消,Delete:作废
             */
            private String fStatus;

            /**
             * 调拨类型
             */
            private String type;

            /**
             * 调拨出仓库编号；主仓=1，销退仓=2，进货仓=3，次品仓=4
             */
            private Integer whId;

            /**
             * 调拨入仓库编号；主仓=1，销退仓=2，进货仓=3，次品仓=4
             */
            private Integer linkWhId;

            /**
             * 调拨入分仓编号，调拨出为接收方，调拨入为发起方
             */
            private Integer linkWmsCoId;

            /**
             * 调拨入关联单号
             */
            private Integer linkIoId;

            /**
             * 调拨建议号，跨仓调拨入单据才有值，数据来源是跨仓调拨上传的so_id
             */
            private String soId;

            /**
             * 拣货批次号
             */
            private Number waveId;

            /**
             * 备注
             */
            private String remark;

            /**
             * 创建人
             */
            private String creatorName;

            /**
             * 调出虚拟仓编码
             */
            private String lockWhId;

            /**
             * 调入虚拟仓编码
             */
            private String lockLinkWhId;

            /**
             * 外部单号
             */
            private String outIoId;

            /**
             * 标记｜多标签
             */
            private java.util.List<String> labels;

            /**
             * 商品集合
             */
            private java.util.List<Items> items;

            /**
             * 批次集合，获取该节点系统中相关业务项需配置（对应erp基础设置开启生产批次管理 如果是分仓数据 分仓也需要开启）
             */
            private java.util.List<Batchs> batchs;

            private java.util.List<Sns> sns;

            /**
             * 收货人
             */
            private String receiverNameEn;

            /**
             * 移动电话
             */
            private String receiverMobileEn;

            /**
             * 省
             */
            private String receiverState;

            /**
             * 市
             */
            private String receiverCity;

            /**
             * 区
             */
            private String receiverDistrict;

            /**
             * 详细地址
             */
            private String receiverAddress;

            /**
             * 标记｜多标签
             */
            private java.util.List<String> lables;

            /**
             * 物流单号
             */
            private String lId;

            /**
             * 物流公司编码
             */
            private String lcId;

            /**
             * 物流公司名称
             */
            private String logisticsCompany;

            /**
             * 单位
             */
            private String unit;

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
                 * 调拨单号
                 */
                private Integer ioId;

                /**
                 * 子单号
                 */
                private Integer ioiId;

                /**
                 * 商品编码
                 */
                private String skuId;

                /**
                 * 款式编码
                 */
                private String iId;

                /**
                 * 数量
                 */
                private Integer qty;

                /**
                 * 商品名称
                 */
                private String name;

                /**
                 * 颜色及规格
                 */
                private String propertiesValue;

                /**
                 * 点数
                 */
                private Integer rQty;

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
