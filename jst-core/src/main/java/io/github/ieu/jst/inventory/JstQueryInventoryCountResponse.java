package io.github.ieu.jst.inventory;

@lombok.Data
public class JstQueryInventoryCountResponse {

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
             * 单据类型
             */
            private String type;

            /**
             * 盘点单号
             */
            private Integer ioId;

            /**
             * 单据日期
             */
            private String ioDate;

            /**
             * 状态;WaitConfirm:待确认,Confirmed:生效,Archive:归档,Cancelled:取消,Delete:作废
             */
            private String status;

            /**
             * 仓库名称
             */
            private String warehouse;

            /**
             * 创建人
             */
            private String creatorName;

            /**
             * 备注
             */
            private String remark;

            /**
             * 仓库编号，主仓=1，销退仓=2，进货仓=3，次品仓=4
             */
            private Integer whId;

            /**
             * 分仓编号
             */
            private Integer wmsCoId;

            /**
             * 修改时间
             */
            private String modified;

            /**
             * 商品集合
             */
            private java.util.List<Item> items;

            /**
             * 批次集合，获取该节点系统中相关业务项需配置
             */
            private java.util.List<Batch> batchs;

            /**
             * 唯一码集合，获取该节点系统中相关业务项需配置
             */
            private java.util.List<Sn> sns;

            /**
             * 财审状态，WaitConfirm=待审核;Confirmed=已审核
             */
            private String fStatus;

            /**
             * 虚拟仓编码
             */
            private Number lockWhId;

            /**
             * 虚拟仓名称
             */
            private String lockWhName;

            /**
             * 标记|多标签
             */
            private String labels;

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
                 * 供应商编号
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
                 * 盘点单号
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
                 * 商品名称
                 */
                private String name;

                /**
                 * 颜色及规格
                 */
                private String propertiesValue;

                /**
                 * 盘点后数量
                 */
                private Integer rQty;

                /**
                 * 盈亏数量
                 */
                private Integer qty;

                /**
                 * 批次号，等于batch_no，获取该字段系统中相关业务项需配置
                 */
                private String batchId;

                /**
                 * 批次日期，系统中相关业务项需配置
                 */
                private String productDate;

                /**
                 * 供应商编号，系统中相关业务项需配置
                 */
                private Integer supplierId;

                /**
                 * 有效期至，系统中相关业务项需配置
                 */
                private String expirationDate;
            }
        }
    }
}
