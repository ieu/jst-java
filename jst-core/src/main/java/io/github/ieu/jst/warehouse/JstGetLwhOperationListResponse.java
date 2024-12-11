package io.github.ieu.jst.warehouse;

@lombok.Data
public class JstGetLwhOperationListResponse {

    private Integer code;

    private Data data;

    private String msg;

    private String requestId;

    @lombok.Data
    public static class Data {

        private Page page;

        private java.util.List<List> list;

        @lombok.Data
        public static class List {

            /**
             * 单据号
             */
            private Number ioId;

            /**
             * 虚拟仓编号
             */
            private Number lwhId;

            /**
             * 虚拟仓名称
             */
            private String lwhName;

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
            private java.util.List<Item> items;

            /**
             * 单据类型：虚拟仓分配，虚拟仓归还
             */
            private String type;

            /**
             * 外部单号
             */
            private String soId;

            @lombok.Data
            public static class Item {

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

        @lombok.Data
        public static class Page {

            /**
             * 当前页数
             */
            private Number currentPage;

            /**
             * 每页最多多少条
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
