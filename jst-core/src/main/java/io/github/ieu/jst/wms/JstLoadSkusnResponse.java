package io.github.ieu.jst.wms;

@lombok.Data
public class JstLoadSkusnResponse {

    private Pagination data;

    private Integer code;

    private String issuccess;

    private String msg;

    @lombok.Data
    public static class Pagination {

        /**
         * 是否有下一页
         */
        private Boolean hasNext;

        /**
         * 商品集合
         */
        private java.util.List<Item> items;

        /**
         * 当前页最大id
         */
        private Number maxId;

        @lombok.Data
        public static class Item {

            /**
             * 唯一码(快销采购标签)
             */
            private String skuSn;

            /**
             * 货源类型：0未比较；1采购；2拣货；3仓内待检
             */
            private String sourceType;

            /**
             * 赠品数据
             */
            private java.util.List<Gift> gifts;

            /**
             * 到货时间：有到货时有值，未到货则为空
             */
            private String arrivalDate;

            /**
             * 发货时间：发货订单有值 取发货订单的发货时间，发货订单无值时 未发货为空
             */
            private String sendDate;

            /**
             * 播种区：A、B、C、D
             */
            private String area;

            /**
             * 播种柜号：多件柜号如3-1
             */
            private String areaBin;

            /**
             * 订单类型（单，多）
             */
            private String pKey;

            /**
             * 已到货数：（包含本件）
             */
            private String arriveNum;

            /**
             * 物流公司
             */
            private String logisticsCompany;

            /**
             * 初次采购日期
             */
            private String minPurchaseDate;

            /**
             * 是否已到货
             */
            private String isArrive;

            /**
             * 是否作废
             */
            private String isCanceled;

            /**
             * 商品编码
             */
            private String skuId;

            /**
             * 数量
             */
            private Number qty;

            /**
             * 内部订单号
             */
            private Number fromOId;

            /**
             * 内部订单明细号
             */
            private Number fromOiId;

            @lombok.Data
            public static class Gift {

                /**
                 * 商品编码
                 */
                private String skuId;

                /**
                 * 数量
                 */
                private Number qty;
            }
        }
    }
}
