package io.github.ieu.jst.stockin;

@lombok.Data
public class JstQueryPurchaseInResponse {

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
             * <div><a href="https://cdn.erp321.cn/jst-fed/b3020a08-adc9-4c03-bb19-420ac168a8de_1643_249.png" target="_blank">入库单号</a></div>
             */
            private Integer ioId;

            /**
             * 数据库行版本号：https://docs.microsoft.com/zh-cn/sql/t-sql/data-types/rowversion-transact-sql?view=sql-server-ver16
             */
            private Integer ts;

            /**
             * 仓库名称
             */
            private String warehouse;

            /**
             * <div><a href="https://cdn.erp321.cn/jst-fed/82a8fe9f-44e2-42f3-ab36-4981c811a3b5_1596_411.png" target="_blank">采购单号</a> </div>
             */
            private Integer poId;

            /**
             * <div><a href="https://cdn.erp321.cn/jst-fed/bf26d89f-d1f7-439e-b773-2f125e57764f_1534_487.png" target="_blank">供应商内部编号</a></div>
             */
            private Integer supplierId;

            /**
             * 供应商名称
             */
            private String supplierName;

            /**
             * 修改时间
             */
            private String modified;

            /**
             * <div><a href="https://cdn.erp321.cn/jst-fed/e3a0f8c6-30a1-4183-b5a9-86ae60e4a23f_1590_231.png" target="_blank">线上单号</a> </div>对应采购入库页面的线上单号(且对应采购入库上传的external_id)
             */
            private String soId;

            /**
             * 外部单号
             */
            private String outIoId;

            /**
             * 状态(WaitConfirm待入库;Confirmed已入库;Cancelled取消；Archive 归档；OuterConfirming 外部确认中)
             */
            private String status;

            /**
             * 入库日期
             */
            private String ioDate;

            /**
             * 仓库编号；主仓=1，销退仓=2，进货仓=3，次品仓=4，自定义1仓=6，自定义2仓=7，自定义3仓=8
             */
            private String whId;

            /**
             * 分仓编号
             */
            private Integer wmsCoId;

            /**
             * 备注
             */
            private String remark;

            /**
             * 税率
             */
            private Number taxRate;

            /**
             * 标签
             */
            private String labels;

            /**
             * 财务审核日期
             */
            private String archived;

            /**
             * 预约单号
             */
            private String mergeSoId;

            /**
             * <div><a href="https://cdn.erp321.cn/jst-fed/0c24b13a-3ad9-4038-ba5a-e96dad2f3a26_1551_244.png"target="_blank">进仓类型</a></div>
             */
            private String type;

            /**
             * 制单人
             */
            private String creatorName;

            /**
             * 财审状态，WaitConfirm=待审核;Confirmed=已审核
             */
            private String fStatus;

            /**
             * 物流单号
             */
            private String lId;

            /**
             * 商品集合
             */
            private java.util.List<Item> items;

            /**
             * 批次集合，获取该节点系统中相关业务项需配置
             */
            private java.util.List<Batch> batchs;

            /**
             * 唯一码集合，获取该节点系统中相关业务项需配置（对应erp基础设置开启商品唯一码）
             */
            private java.util.List<Sn> sns;

            /**
             * 虚拟仓编码
             */
            private Number lockWhId;

            /**
             * 虚拟仓名称
             */
            private String lockWhName;

            @lombok.Data
            public static class Sn {

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
                 * <div><a href="https://cdn.erp321.cn/jst-fed/bf26d89f-d1f7-439e-b773-2f125e57764f_1534_487.png" target="_blank">供应商内部编号</a></div>
                 */
                private Integer supplierId;

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
                 * 款式编码
                 */
                private String iId;

                /**
                 * 单位
                 */
                private String unit;

                /**
                 * 商品名称
                 */
                private String name;

                /**
                 * 入库数量
                 */
                private Integer qty;

                /**
                 * 入库单号
                 */
                private Integer ioId;

                /**
                 * 单价
                 */
                private Number costPrice;

                /**
                 * 金额
                 */
                private Number costAmount;

                /**
                 * 商品明细备注
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
