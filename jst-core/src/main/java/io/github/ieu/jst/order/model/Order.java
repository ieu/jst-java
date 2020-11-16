package io.github.ieu.jst.order.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.List;

@Data
public class Order {
    /**
     * 是否货到付款
     */
    private boolean isCod;
    /**
     * 快递单号
     */
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private String lId;
    /**
     * 发货日期
     */
    private ZonedDateTime sendDate;
    /**
     * 支付时间
     */
    private ZonedDateTime payDate;
    /**
     * 运费，保留两位小数，单位（元）
     */
    private String freight;
    /**
     * 收货地址
     */
    private String receiverAddress;
    /**
     * 区
     */
    private String receiverDistrict;
    /**
     * 发货仓编号
     */
    private String wmsCoId;
    /**
     * 快递公司
     */
    private String logisticsCompany;
    /**
     * 抵扣金额
     */
    private String freeAmount;
    /**
     * 店铺名称
     */
    private String shopName;
    /**
     * 问题类型，仅当问题订单时有效
     */
    private String questionType;
    /**
     * 外部支付单号
     */
    private String outerPayId;
    /**
     * 线上订单号，最长不超过 20;唯一
     */
    private String soId;
    /**
     * 订单类型
     */
    private String type;
    /**
     * 订单来源
     */
    private String orderFrom;
    /**
     * 待付款：WaitPay；
     * 发货中：Delivering；
     * 被合并：Merged；
     * 异常：Question；
     * 被拆分：Split；
     * 等供销商|外仓发货：WaitOuterSent；
     * 已付款待审核：WaitConfirm；
     * 已客审待财审：WaitFConfirm；
     * 已发货：Sent；
     * 取消：Cancelled
     */
    private OrderStatus status;
    /**
     * 应付金额，保留两位小数，单位（元）
     */
    private String payAmount;
    /**
     * 买家昵称
     */
    private String shopBuyerId;
    /**
     * 平台订单状态
     */
    private String shopStatus;
    /**
     * 手机
     */
    private String receiverMobile;
    /**
     * 下单时间
     */
    private ZonedDateTime orderDate;
    /**
     * 问题描述
     */
    private String questionDesc;
    /**
     * 市
     */
    private String receiverCity;
    /**
     * 省
     */
    private String receiverState;
    /**
     * 收件人
     */
    private String receiverName;
    /**
     * ERP 内部订单号，唯一
     */
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private int oId;
    /**
     * 店铺编号
     */
    private int shopId;
    /**
     * 公司编号
     */
    private int coId;
    /**
     * 支付信息
     */
    private List<Pay> pays;
    /**
     * 商品信息
     */
    private List<Item> items;
    /**
     * 订单备注；
     * 卖家备注
     */
    private String remark;
    /**
     * 分销商名称
     */
    private String drpCoName;
    /**
     * 修改时间
     */
    private ZonedDateTime modified;
    /**
     * 多标签
     */
    private String labels;
    /**
     * 实际支付金额
     */
    private String paidAmount;
    /**
     * 币种
     */
    private String currency;
    /**
     * 买家留言
     */
    private String buyerMessage;
    /**
     * 物流公司编码
     */
    private String lcId;
    /**
     * 发票抬头
     */
    private String invoiceTitle;
    /**
     * 发票类型
     */
    private String invoiceType;
    /**
     * 发票税号
     */
    private String buyerTaxNo;
    /**
     * 业务员
     */
    private String creatorName;
    /**
     * 计划发货时间
     */
    private ZonedDateTime planDeliveryDate;
    /**
     * 线下备注
     */
    private String node;

    /**
     * Workaround to java bean specs
     */
    public String getlId() {
        return lId;
    }

    /**
     * Workaround to java bean specs
     */
    public void setlId(String lId) {
        this.lId = lId;
    }

    /**
     * Workaround to java bean specs
     */
    public int getoId() {
        return oId;
    }

    /**
     * Workaround to java bean specs
     */
    public void setoId(int oId) {
        this.oId = oId;
    }

    @Data
    public static class Pay {
        /**
         * 是否支付
         */
        private boolean isOrderPay;
        /**
         * 支付帐号
         */
        private String buyerAccount;
        /**
         * 支付金额
         */
        private BigDecimal amount;
        /**
         * 支付时间
         */
        private ZonedDateTime payDate;
        /**
         * 外部支付单号
         */
        private String outerPayId;
        /**
         * 支付单ID
         */
        private String payId;
        /**
         * 支付渠道
         */
        private String payment;
    }

    @Data
    public static class Item {
        /**
         * 是否赠品
         */
        private boolean isGift;
        /**
         * 商家编码，对应库存管理的 SKU
         */
        private String skuId;
        /**
         * 商品名称
         */
        private String name;
        /**
         * 申请退款的状态 ,
         * 未申请：none；
         * 退款中：waiting；
         * 退款成功：success
         */
        private RefundStatus refundStatus;
        /**
         * 退款的唯一单号
         */
        private String refundId;
        /**
         * 单价
         */
        private String price;
        /**
         * 子订单号，最长不超过 50
         */
        private String outerOiId;
        /**
         * 商品状态
         */
        private String itemStatus;
        /**
         * 款式编码
         */
        @Getter(AccessLevel.NONE)
        @Setter(AccessLevel.NONE)
        private String iId;
        /**
         * 属性
         */
        private String propertiesValue;
        /**
         * 子订单号，最长不超过 20
         */
        private int oiId;
        /**
         * 总额
         */
        private String amount;
        /**
         * 外部sku_id
         */
        private String shopSkuId;
        /**
         * 原始线上单号
         */
        private String rawSoId;
        /**
         * 数量
         */
        private int qty;
        /**
         * 是否预售
         */
        private String isPresale;
        /**
         * 基本售价
         */
        private String basePrice;
        /**
         * 商品图片
         */
        private String pic;

        /**
         * Workaround to java bean specs
         */
        public String getiId() {
            return iId;
        }

        /**
         * Workaround to java bean specs
         */
        public void setiId(String iId) {
            this.iId = iId;
        }

        public enum RefundStatus {
            /**
             * 未申请
             */
            none,
            /**
             * 退款中
             */
            waiting,
            /**
             * 退款成功
             */
            success,
            /**
             * 已关闭
             */
            closed
        }
    }
}
