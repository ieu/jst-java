package io.github.ieu.jst.stockin;

@lombok.Data
public class JstQueryPurchaseInDetailsResponse {

    private String msg;

    private Integer code;

    private Pagination data;

    @lombok.Data
    public static class Pagination {

        private java.util.List<Data> datas;

        /**
         * 第几页
         */
        private Number pageIndex;

        /**
         * 是否有下一页
         */
        private Boolean hasNext;

        /**
         * 总条数
         */
        private Number dataCount;

        /**
         * 总页数
         */
        private Number pageCount;

        /**
         * 每页多少条
         */
        private Number pageSize;

        @lombok.Data
        public static class Data {

            /**
             * 采购单号
             */
            private Number poId;

            /**
             * 入库日期
             */
            private String ioDate;

            /**
             * 备注 nvarchar(1000)
             */
            private String remark;

            /**
             * 仓库名称 nvarchar(40)
             */
            private String warehouse;

            /**
             * 进仓类型 nvarchar(20)
             */
            private String type;

            /**
             * 税率 decimal(14,2)
             */
            private Number taxRate;

            /**
             * 入库单号
             */
            private Number ioId;

            /**
             * 标签 nvarchar(200)
             */
            private String labels;

            /**
             * 财务审核日期
             */
            private String archived;

            /**
             * 预约单号 varchar(300)
             */
            private String mergeSoId;

            /**
             * 商品明细信息
             */
            private java.util.List<Item> items;

            /**
             * 分仓编号
             */
            private Number wmsCoId;

            /**
             * 仓库编号；主仓=1，销退仓=2，进货仓=3，次品仓=4，自定义1仓=6，自定义2仓=7，自定义3仓=8
             */
            private String whId;

            /**
             * 线上单号:对应采购入库页面的线上单号(且对应采购入库上传的external_id) varchar(300)
             */
            private String soId;

            /**
             * 修改时间
             */
            private String modified;

            /**
             * <div><a href="https://cdn.erp321.cn/jst-fed/1480fd4b-f07f-4f6f-9099-51e459e1b772_1634_247.png"target="_blank">唯一码集合</a></div>获取该节点系统中相关业务项需配置（对应erp基础设置商品唯一码开关）
             */
            private java.util.List<Sn> sns;

            /**
             * 制单人 nvarchar(10)
             */
            private String creatorName;

            /**
             * 供应商名称 nvarchar(200)
             */
            private String supplierName;

            /**
             * 供应商编号
             */
            private Number supplierId;

            /**
             * <div><a href="https://cdn.erp321.cn/jst-fed/6e7a0bbb-124e-457f-9b31-b9286c42d8ea_1558_310.png"target="_blank">生产批次集合</a></div>获取该节点系统中相关业务项需配置（对应erp基础设置开启生产批次管理 如果是分仓数据 分仓也需要开启）
             */
            private java.util.List<Batch> batchs;

            /**
             * 财审状态，WaitConfirm=待审核;Confirmed=已审核   varchar(20)
             */
            private String fStatus;

            /**
             * 状态(WaitConfirm待入库;Confirmed已入库;Cancelled取消；Archive 归档；OuterConfirming 外部确认中) varchar(20)
             */
            private String status;

            /**
             * 外部单号 varchar(150)
             */
            private String outIoId;

            /**
             * 数据库行版本号：https://docs.microsoft.com/zh-cn/sql/t-sql/data-types/rowversion-transact-sql?view=sql-server-ver16
             */
            private String ts;

            /**
             * 虚拟仓编码
             */
            private Number lockWhId;

            /**
             * 备注2  varchar(500)
             */
            private String extendRemark;

            /**
             * 物流单号 varchar(200)
             */
            private String lId;

            /**
             * 物流公司 nvarchar(60)
             */
            private String logisticsCompany;

            /**
             * 批次节点
             */
            @lombok.Data
            public static class Batch {

                /**
                 * 批次号 varchar(50)
                 */
                private String batchNo;

                /**
                 * 商品编码 nvarchar(64)
                 */
                private String qty;

                /**
                 * 数量
                 */
                private Number name;

                /**
                 * 批次日期
                 */
                private String productDate;

                /**
                 * 供应商编号
                 */
                private Integer supplierId;

                /**
                 * 供应商名称 nvarchar(100)
                 */
                private String supplierName;

                /**
                 * 有效期至
                 */
                private String expirationDate;
            }

            @lombok.Data
            public static class Sn {

                private String skuId;

                private String sn;
            }

            @lombok.Data
            public static class Item {

                /**
                 * 入库子单号
                 */
                private Integer ioiId;

                /**
                 * 商品编码
                 */
                private String skuId;

                /**
                 * 款式编码 nvarchar(64)
                 */
                private String iId;

                /**
                 * 单位 nvarchar(20)
                 */
                private String unit;

                /**
                 * 商品名称 nvarchar(100)
                 */
                private String name;

                /**
                 * 入库数量
                 */
                private Number qty;

                /**
                 * 入库单号
                 */
                private Integer ioId;

                /**
                 * 单价 numeric(12,4)
                 */
                private Number costPrice;

                /**
                 * 金额 decimal(12,2)
                 */
                private Number costAmount;

                /**
                 * 商品明细备注 nvarchar(500)
                 */
                private String remark;

                /**
                 * 批次号，需开启相关业务配置
                 */
                private String batchNo;

                /**
                 * 税率
                 */
                private Integer taxRate;
            }
        }
    }
}
