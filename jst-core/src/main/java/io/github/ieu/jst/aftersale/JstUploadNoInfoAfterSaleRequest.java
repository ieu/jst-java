package io.github.ieu.jst.aftersale;

@lombok.Data
@lombok.Builder
public class JstUploadNoInfoAfterSaleRequest {

    private java.util.List<Data> data;

    @lombok.Data
    public static class Data {

        /**
         * 聚水潭售后单号，修改时必须大于0，新增时为0
         */
        private Integer asId;

        /**
         * 售后申请日期，如果为空，则为当前时间
         */
        private String asDate;

        /**
         * 外部售后单号，如果为空，聚水潭随机生成
         */
        private String outerAsId;

        /**
         * 售后类型，目前仅支持“普通退货”
         */
        private String type;

        /**
         * 退货快递公司；可更新
         */
        private String logisticsCompany;

        /**
         * 退货物流单号；可更新
         */
        private String lId;

        /**
         * 店铺编号，0代表线下，-1代表不知道店铺
         */
        private Integer shopId;

        /**
         * WAIT_SELLER_AGREE:买家已经申请退款，等待卖家同意,WAIT_BUYER_RETURN_GOODS:卖家已经同意退款，等待买家退货,WAIT_SELLER_CONFIRM_GOODS:买家已经退货，等待卖家确认收货,SELLER_REFUSE_BUYER:卖家拒绝退款,CLOSED:退款关闭(售后单未确认前填写该状态erp的售后单自动作废),SUCCESS:退款成功；可更新
         */
        private String shopStatus;

        /**
         * 问题类型，最大长度100；可更新
         */
        private String questionType;

        /**
         * 退款原因，最大长度100；可更新
         */
        private String questionReason;

        /**
         * 备注，最大长度500；可更新
         */
        private String remark;

        /**
         * 卖家应退运费
         */
        private Number freight;

        private java.util.List<items> items;

        @lombok.Data
        public static class items {

            /**
             * 商家商品编码
             */
            private String skuId;

            /**
             * 退货数量
             */
            private Integer qty;

            /**
             * SKU退款金额
             */
            private String amount;

            /**
             * 商品名称，最大长度100 如果为空会尝试从 商家商品资料中填充
             */
            private String name;

            /**
             * 图片路径，最大长度300 如果为空会尝试从 商家商品资料中填充
             */
            private String pic;

            /**
             * 属性规格，最大长度100 如果为空会尝试从 商家商品资料中填充
             */
            private String propertiesValue;

            /**
             * 生产批次号
             */
            private String batchId;

            /**
             * 生产日期
             */
            private String producedDate;

            /**
             * 到期日
             */
            private String expirationDate;

            /**
             * 目前仅支持“退货“
             */
            private String type;

            /**
             * 备注
             */
            private String des;
        }
    }
}
