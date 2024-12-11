package io.github.ieu.jst.wms;

@lombok.Data
public class JstLoadSkusnResponse {

    private Data data;

    private Integer code;

    private String issuccess;

    private String msg;

    @lombok.Data
    public static class Data {

        /**
         * 是否有下一页
         */
        private Boolean hasnext;

        /**
         * 商品集合
         */
        private java.util.List<Items> items;

        /**
         * 当前页最大id
         */
        private Number maxid;

        @lombok.Data
        public static class Items {

            /**
             * 唯一码(快销采购标签)
             */
            private String skusn;

            /**
             * 货源类型：0未比较；1采购；2拣货；3仓内待检
             */
            private String sourcetype;

            /**
             * 赠品数据
             */
            private java.util.List<Gifts> gifts;

            /**
             * 到货时间：有到货时有值，未到货则为空
             */
            private String arrivaldate;

            /**
             * 发货时间：发货订单有值 取发货订单的发货时间，发货订单无值时 未发货为空
             */
            private String senddate;

            /**
             * 播种区：A、B、C、D
             */
            private String area;

            /**
             * 播种柜号：多件柜号如3-1
             */
            private String areabin;

            /**
             * 订单类型（单，多）
             */
            private String pkey;

            /**
             * 已到货数：（包含本件）
             */
            private String arrivenum;

            /**
             * 物流公司
             */
            private String logisticscompany;

            /**
             * 初次采购日期
             */
            private String minpurchasedate;

            /**
             * 是否已到货
             */
            private String isarrive;

            /**
             * 是否作废
             */
            private String iscanceled;

            /**
             * 商品编码
             */
            private String skuid;

            /**
             * 数量
             */
            private Number qty;

            /**
             * 内部订单号
             */
            private Number fromoid;

            /**
             * 内部订单明细号
             */
            private Number fromoiid;

            @lombok.Data
            public static class Gifts {

                /**
                 * 商品编码
                 */
                private String skuid;

                /**
                 * 数量
                 */
                private Number qty;
            }
        }
    }
}
