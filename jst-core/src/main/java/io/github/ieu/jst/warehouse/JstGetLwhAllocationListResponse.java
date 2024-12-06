package io.github.ieu.jst.warehouse;

@lombok.Data
public class JstGetLwhAllocationListResponse {

    /**
     * 状态码，0代表成功
     */
    private Number code;

    private Data data;

    /**
     * msg
     */
    private String msg;

    /**
     * request_id
     */
    private String requestId;

    @lombok.Data
    public static class Data {

        /**
         * 分页
         */
        private Page page;

        private java.util.List<List> list;

        @lombok.Data
        public static class List {

            /**
             * 调拨编号
             */
            private Number ioId;

            /**
             * 调出虚拟仓编号
             */
            private Number outLwhId;

            /**
             * 调出虚拟仓名称
             */
            private String outLwhName;

            /**
             * 调入虚拟仓编号
             */
            private Number inLwhId;

            /**
             * 调入虚拟仓名称
             */
            private String inLwhName;

            /**
             * 单据状态
             */
            private String status;

            /**
             * 标签
             */
            private String labels;

            /**
             * 备注
             */
            private String remark;

            /**
             * 仓储方编码
             */
            private Number wmsCoId;

            /**
             * 仓储方名称
             */
            private String wmsName;

            /**
             * 创建时间
             */
            private String created;

            /**
             * 审核时间
             */
            private String ioDate;

            /**
             * 商品明细
             */
            private java.util.List<Items> items;

            /**
             * 外部单号
             */
            private String soId;

            /**
             * 虚单据类型：虚拟仓调出（调拨单据）
             */
            private String type;

            @lombok.Data
            public static class Items {

                /**
                 * 款式编码
                 */
                private String iId;

                /**
                 * 商品编码
                 */
                private String skuId;

                /**
                 * 商品名称
                 */
                private String skuName;

                /**
                 * 颜色规格
                 */
                private String propertiesValue;

                /**
                 * 库存数
                 */
                private Number qty;

                /**
                 * 虚拟仓可用数
                 */
                private Number lockQty;

                /**
                 * 调入虚拟仓可用数
                 */
                private Number targetLwhLockableQty;

                /**
                 * 虚拟仓可配数
                 */
                private Number pickAbleQty;

                /**
                 * 公有可用数
                 */
                private Number publicQty;

                /**
                 * 成本价
                 */
                private Number costPrice;
            }
        }

        /**
         * 分页
         */
        @lombok.Data
        public static class Page {

            /**
             * 当前页数
             */
            private Number currentPage;

            /**
             * 每页最大条数
             */
            private Number pageSize;

            /**
             * 总条数
             */
            private Number count;

            /**
             * 总页数
             */
            private Number pages;

            /**
             * 索引下标
             */
            private Number index;
        }
    }
}
