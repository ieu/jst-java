package io.github.ieu.jst.crossborder;

@lombok.Data
public class JstGetCbOrdersResponse {

    private Number code;

    private Data data;

    private String msg;

    private String msgType;

    private String requestId;

    private String cookie;

    @lombok.Data
    public static class Data {

        /**
         * 页码
         */
        private Number pageIndex;

        /**
         * 每页数量
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
         * 订单列表
         */
        private java.util.List<DataWrap> data;

        @lombok.Data
        public static class DataWrap {

            /**
             * 商家id
             */
            private Number coId;

            /**
             * 内部订单号
             */
            private Number oId;

            /**
             * 店铺
             */
            private Number shopId;

            /**
             * 线上单号
             */
            private String soId;

            /**
             * 采购日期
             */
            private String orderDate;

            /**
             * 平台状态
             */
            private String shopStatus;

            /**
             * 异常类型
             */
            private String questionType;

            /**
             * 异常描述
             */
            private String questionDesc;

            /**
             * 状态
             */
            private String status;

            /**
             * 买家id
             */
            private String shopBuyerId;

            /**
             * 收件人国家
             */
            private String receiverCountry;

            /**
             * 收件人省
             */
            private String receiverState;

            /**
             * 收件人市
             */
            private String receiverCity;

            /**
             * 收件人区
             */
            private String receiverDistrict;

            /**
             * 收件人地址
             */
            private String receiverAddress;

            /**
             * 收件人姓名
             */
            private String receiverName;

            /**
             * 收件人手机
             */
            private String receiverMobile;

            /**
             * 收件人电话
             */
            private String receiverPhone;

            /**
             * 收件人镇
             */
            private String receiverTown;

            /**
             * 收件人邮编
             */
            private String receiverZip;

            /**
             * 买家id
             */
            private String buyerId;

            /**
             * 发货时间
             */
            private String sendDate;

            /**
             * 应付
             */
            private String payAmount;

            /**
             * 运费
             */
            private String freight;

            /**
             * 实际运费
             */
            private String fFreight;

            /**
             * 重量
             */
            private String weight;

            /**
             * 实重
             */
            private String fWeight;

            /**
             * 买家留言
             */
            private String buyerMessage;

            /**
             * 备注
             */
            private String remark;

            /**
             * 发票
             */
            private String invoiceTitle;

            /**
             * 是否货到付款
             */
            private Boolean isCod;

            /**
             * 订单类型
             */
            private String type;

            /**
             * 站点
             */
            private String shopSite;

            /**
             * 优惠
             */
            private String freeAmount;

            /**
             * 已付
             */
            private String paidAmount;

            /**
             * 付款时间
             */
            private String payDate;

            /**
             * 支付单号
             */
            private String outerPayId;

            /**
             * 修改时间
             */
            private String modified;

            /**
             * 订单来源
             */
            private String orderFrom;

            /**
             * 店铺名称
             */
            private String shopName;

            /**
             * 卖家标记
             */
            private String sellerFlag;

            /**
             * 计划发货时间
             */
            private String planDeliveryDate;

            /**
             * 物流编号
             */
            private String lcId;

            /**
             * 物流单号
             */
            private String lId;

            /**
             * 物流公司
             */
            private String logisticsCompany;

            /**
             * 折扣
             */
            private String discountRate;

            /**
             * 标记
             */
            private String tag;

            /**
             * 分仓id
             */
            private String wmsCoId;

            /**
             * 币种
             */
            private String currency;

            /**
             * 标签
             */
            private String labels;

            /**
             * 金额
             */
            private String amount;

            /**
             * 分销商
             */
            private String drpCoIdFrom;

            /**
             * 是否拆分
             */
            private Boolean isSplit;

            /**
             * 是否合并
             */
            private Boolean isMerge;

            /**
             * 创建人
             */
            private String creatorName;

            /**
             * 买家税号
             */
            private String buyerTaxNo;

            /**
             * 发票类型
             */
            private String invoiceType;

            /**
             * 签收时间
             */
            private String signTime;

            /**
             * 商品
             */
            private String skus;

            /**
             * 证件信息
             */
            private String cardInfo;

            /**
             * 结束时间
             */
            private String endTime;

            /**
             * 发件人信息
             */
            private String senderAddress;

            /**
             * 主播id
             */
            private String referrerId;

            /**
             * 主播名称
             */
            private String referrerName;

            /**
             * 创建时间
             */
            private String created;

            /**
             * 买家指定物流
             */
            private String shipment;

            private String openId;

            private String outerAsId;

            private String ts;

            /**
             * 买家应付
             */
            private String buyerPaidAmount;

            /**
             * 卖家应收
             */
            private String sellerIncomeAmount;

            /**
             * 关联单号
             */
            private String linkOId;

            /**
             * 合并线上单号
             */
            private String mergeSoId;

            /**
             * 外部单号
             */
            private String outerSoId;

            /**
             * 国际单号
             */
            private String cbLId;

            /**
             * 物流渠道
             */
            private String cbLcCode;

            /**
             * 物流名称
             */
            private String cbLcName;

            /**
             * 选择渠道
             */
            private String chosenChannel;

            /**
             * 跨境税金
             */
            private String cbTotalTax;

            /**
             * 运费税
             */
            private String freightTax;

            /**
             * 包裹号
             */
            private String packageNo;

            /**
             * 仓库单号
             */
            private String warehouseOid;

            /**
             * 平台优惠
             */
            private String platformFreeAmount;

            /**
             * 支付优惠
             */
            private String payFreeAmount;

            /**
             * 主播优惠
             */
            private String referrerFreeAmount;

            /**
             * 店铺优惠
             */
            private String shopFreeAmount;

            /**
             * 退款金额
             */
            private String refundAmount;

            /**
             * 跨境财务
             */
            private String cbFinancenew;

            /**
             * 订单明细
             */
            private java.util.List<OrderItems> orderItems;

            /**
             * 支付单
             */
            private java.util.List<OrderPays> orderPays;

            @lombok.Data
            public static class OrderPays {

                /**
                 * 支付id
                 */
                private Number payId;

                /**
                 * 外部支付单号
                 */
                private String outerPayId;

                /**
                 * 支付时间
                 */
                private String payDate;

                /**
                 * 金额
                 */
                private String amount;

                /**
                 * 支付方式
                 */
                private String payment;

                /**
                 * 买家账号
                 */
                private String buyerAccount;

                /**
                 * 是否订单支付
                 */
                private Boolean isOrderPay;

                /**
                 * 支付状态
                 */
                private String status;

                /**
                 * 支付类型
                 */
                private String payType;
            }

            @lombok.Data
            public static class OrderItems {

                /**
                 * 明细id
                 */
                private Number oiId;

                /**
                 * 商品编码
                 */
                private String skuId;

                /**
                 * 款号
                 */
                private String iId;

                /**
                 * 店铺商品编码
                 */
                private String shopSkuId;

                /**
                 * 店铺款号
                 */
                private String shopIId;

                /**
                 * 属性
                 */
                private String propertiesValue;

                /**
                 * 金额
                 */
                private String amount;

                /**
                 * 基本售价
                 */
                private String basePrice;

                /**
                 * 数量
                 */
                private String qty;

                /**
                 * 名称
                 */
                private String name;

                /**
                 * 单价
                 */
                private String price;

                /**
                 * 外部关联id
                 */
                private String outerOiId;

                /**
                 * 退款id
                 */
                private String refundId;

                /**
                 * 退货数量
                 */
                private String refundQty;

                /**
                 * 退款状态
                 */
                private String refundStatus;

                /**
                 * 原始订单
                 */
                private String rawSoId;

                /**
                 * 是否预售
                 */
                private Boolean isPresale;

                /**
                 * 是否赠品
                 */
                private Boolean isGift;

                /**
                 * 明细状态
                 */
                private String itemStatus;

                /**
                 * 发货仓
                 */
                private String sendWarehouse;

                /**
                 * 实付金额
                 */
                private String itemPayAmount;

                /**
                 * 主播id
                 */
                private String referrerId;

                /**
                 * 主播名称
                 */
                private String referrerName;

                /**
                 * 折扣
                 */
                private String discountRate;

                /**
                 * 图片
                 */
                private String pic;

                /**
                 * 商品类型
                 */
                private String skuType;

                /**
                 * 备注
                 */
                private String remark;

                /**
                 * 源组合装
                 */
                private String srcCombineSkuId;

                /**
                 * 扩展信息
                 */
                private String itemExtData;

                /**
                 * 买家应付
                 */
                private String buyerPaidAmount;

                /**
                 * 卖家实收
                 */
                private String sellerIncomeAmount;

                /**
                 * 商品税
                 */
                private String productTax;

                /**
                 * 运费税
                 */
                private String productFreight;

                /**
                 * 商品优惠
                 */
                private String productFreeAmount;

                /**
                 * 批次Id
                 */
                private String batchId;

                /**
                 * 生产日期
                 */
                private String producedDate;

                /**
                 * 有效期
                 */
                private String expirationDate;
            }
        }
    }
}
