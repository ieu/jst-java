package io.github.ieu.jst.crossborder;

@lombok.Data
public class JstGetCbRefundsResponse {

    private Number code;

    private Pagination data;

    private String msg;

    private String requestId;

    @lombok.Data
    public static class Pagination {

        /**
         * 当前页
         */
        private Number pageIndex;

        /**
         * 分页数
         */
        private Number pageSize;

        /**
         * 总数量
         */
        private Number dataCount;

        /**
         * 总页数
         */
        private Number pageCount;

        /**
         * 是否有下页
         */
        private Boolean hasNext;

        /**
         * 数据对象列表
         */
        private java.util.List<Data> data;

        @lombok.Data
        public static class Data {

            /**
             * 售后单号
             */
            private Number asId;

            /**
             * 售后时间
             */
            private String asDate;

            /**
             * 外部售后单号
             */
            private String outerAsId;

            /**
             * 内部单号
             */
            private String oId;

            /**
             * 线上单号
             */
            private String soId;

            /**
             * 售后类型
             */
            private String type;

            /**
             * 创建时间
             */
            private String created;

            /**
             * 创建人
             */
            private String creatorName;

            /**
             * 修改时间
             */
            private String modified;

            /**
             * 修改人
             */
            private String modifierName;

            /**
             * 状态
             */
            private String status;

            /**
             * 店铺状态
             */
            private String shopStatus;

            /**
             * 备注
             */
            private String remark;

            /**
             * 出库单号
             */
            private String ioId;

            /**
             * 异常类型
             */
            private String questionType;

            /**
             * 分仓
             */
            private String warehouse;

            /**
             * 退款金额
             */
            private String refund;

            /**
             * 支付方式
             */
            private String payment;

            /**
             * 货物状态
             */
            private String goodStatus;

            /**
             * 备注
             */
            private String node;

            /**
             * 订单状态
             */
            private String orderStatus;

            /**
             * 店铺买家账号
             */
            private String shopBuyerId;

            /**
             * 店铺id
             */
            private String shopId;

            /**
             * 收件人姓名
             */
            private String receiverName;

            /**
             * 收件人手机
             */
            private String receiverMobile;

            /**
             * 物流公司
             */
            private String logisticsCompany;

            /**
             * 物流单号
             */
            private String lId;

            /**
             * 仓库类型
             */
            private String whId;

            /**
             * 分销商id
             */
            private String drpCoName;

            /**
             * 分仓id
             */
            private String wmsCoId;

            /**
             * 确认时间
             */
            private String confirmDate;

            /**
             * 运费
             */
            private String freight;

            /**
             * 分销商名称
             */
            private String drpCoIdFrom;

            /**
             * 供销商id
             */
            private String drpCoIdTo;

            /**
             * 订单类型
             */
            private String orderType;

            /**
             * 买家申请退款金额
             */
            private String buyerApplyRefund;

            /**
             * 优惠
             */
            private String freeAmount;

            /**
             * 时间戳
             */
            private String ts;

            /**
             * 商家id
             */
            private String coId;

            /**
             * 退款明细
             */
            private java.util.List<RefundItems> refundItems;

            @lombok.Data
            public static class RefundItems {

                /**
                 * 退款明细id
                 */
                private Number asiId;

                /**
                 * 售后单号
                 */
                private Number asId;

                /**
                 * 商品编码
                 */
                private String skuId;

                /**
                 * 数量
                 */
                private String qty;

                /**
                 * 次品数量
                 */
                private String defectiveQty;

                /**
                 * 价格
                 */
                private String price;

                /**
                 * 金额
                 */
                private String amount;

                /**
                 * 名称
                 */
                private String name;

                /**
                 * 图片
                 */
                private String pic;

                /**
                 * 售后类型
                 */
                private String type;

                /**
                 * 属性
                 */
                private String propertiesValue;

                /**
                 * 外部明细单号
                 */
                private String outerOiId;

                /**
                 * 商品类型
                 */
                private String skuType;

                /**
                 * 实退数量
                 */
                private String rQty;

                /**
                 * 明细签名
                 */
                private String itemSign;

                /**
                 * 箱号
                 */
                private String boxId;

                /**
                 * 组合装商品编码
                 */
                private String combineSkuId;

                /**
                 * 收货时间
                 */
                private String receiveDate;

                /**
                 * 店铺商品编码
                 */
                private String shopSkuId;

                /**
                 * 款号
                 */
                private String iId;

                /**
                 * 描述
                 */
                private String des;

                /**
                 * 店铺金额
                 */
                private String shopAmount;

                /**
                 * 是否赠品
                 */
                private String isGift;
            }
        }
    }
}
