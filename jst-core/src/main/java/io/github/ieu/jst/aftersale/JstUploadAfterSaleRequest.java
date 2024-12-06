package io.github.ieu.jst.aftersale;

/**
 * 退货退款列表
 */
@lombok.Data
@lombok.Builder
public class JstUploadAfterSaleRequest {

    /**
     * 店铺编号
     */
    private Integer shopId;

    /**
     * 退货退款单号，平台唯一
     */
    private String outerAsId;

    /**
     * 平台订单号(订单页面线上单号)
     */
    private String soId;

    /**
     * 售后类型，普通退货，其它，拒收退货,仅退款,投诉,补发,维修,换货
     */
    private String type;

    /**
     * 快递公司，可更新(货物状态为卖家已收到货物之后不可更新)
     */
    private String logisticsCompany;

    /**
     * 物流单号，可更新(货物状态为卖家已收到货物之后不可更新)
     */
    private String lId;

    /**
     * 收货人：仅针对换货补发类型的售后单有效
     */
    private String receiverNameEn;

    /**
     * 联系手机：仅针对换货补发类型的售后单有效
     */
    private String receiverMobileEn;

    /**
     * 平台单据状态：WAIT_SELLER_AGREE:买家已经申请，等待卖家同意,WAIT_BUYER_RETURN_GOODS:卖家已经同意，等待买家退货,WAIT_SELLER_CONFIRM_GOODS:买家已经退货，等待卖家确认收货,SELLER_REFUSE_BUYER:卖家拒绝售后,CLOSED:售后关闭(售后单未确认前填写该状态erp的售后单自动作废),SUCCESS:退款成功；可更新，补发、换货售后单确认时需在系统中手动确认；抖音、拼多多、淘系等线上平台换货换货单据，通过接口修改状态为SUCCESS且发出的快递单号是空，平台会判定为换货单超时未处理，会被平台强制退款，线上售后类型会变为普通退货
     */
    private String shopStatus;

    /**
     * 备注
     */
    private String remark;

    /**
     * BUYER_NOT_RECEIVED:买家未收到货,BUYER_RECEIVED:买家已收到货,BUYER_RETURNED_GOODS:买家已退货,SELLER_RECEIVED:卖家已收到退货；可更新
     */
    private String goodStatus;

    /**
     * 问题类型；可更新
     */
    private String questionType;

    /**
     * 原单据总金额
     */
    private Number totalAmount;

    /**
     * 卖家应退金额
     */
    private Number refund;

    /**
     * 买家应补偿金额
     */
    private Number payment;

    /**
     * 仓库；主仓 = 1, 销退仓 = 2, 进货仓 = 3, 次品仓 = 4, 门店 = 5, 自定义1仓=6，自定义2仓=7, 自定义3仓=8（只能选择已启用的仓）
     */
    private Number warehouseType;

    /**
     * 收货仓编码
     */
    private Number wmsCoId;

    /**
     * 省份
     */
    private String receiverState;

    /**
     * 城市
     */
    private String receiverCity;

    /**
     * 县市
     */
    private String receiverDistrict;

    /**
     * 收货地址
     */
    private String receiverAddress;

    /**
     * 寄出快递编码
     */
    private String sendLcId;

    /**
     * 寄出快递名称
     */
    private String sendLcName;

    /**
     * 商品列表
     */
    private java.util.List<Items> items;

    /**
     * 卖家应退运费
     */
    private Number freight;

    @lombok.Data
    public static class Items {

        /**
         * 平台订单明细编号，存在则会按此作为唯一性判断，商品为组合装时需要上传订单的明细编号（开启售后单下载拦截订单，不传会整单退款，订单转取消）订单有组合装商品时必传
         */
        private String outerOiId;

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
        private Number amount;

        /**
         * 可选:退货，换货，其它，补发
         */
        private String type;

        /**
         * 商品名称，outer_oi_id存在，此处可以不填
         */
        private String name;

        /**
         * 图片地址outer_oi_id存在，此处可以不填
         */
        private String pic;

        /**
         * 属性规格outer_oi_id存在，此处可以不填
         */
        private String propertiesValue;

        /**
         * 备注
         */
        private String des;
    }
}
