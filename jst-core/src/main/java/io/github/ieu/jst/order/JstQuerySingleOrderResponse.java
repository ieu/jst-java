package io.github.ieu.jst.order;

@lombok.Data
public class JstQuerySingleOrderResponse {

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 错误描述
     */
    private String msg;

    private Data data;

    @lombok.Data
    public static class Data {

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
        private java.util.List<Orders> orders;

        @lombok.Data
        public static class Orders {

            /**
             * 是否货到付款
             */
            private Boolean isCod;

            /**
             * 快递单号
             */
            private String lId;

            /**
             * 发货日期
             */
            private String sendDate;

            /**
             * 支付时间
             */
            private String payDate;

            /**
             * 买家支付运费，保留两位小数，单位（元）
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
             * 补发换货单对应的售后单号
             */
            private Number asId;

            /**
             * 抵扣金额
             */
            private Number freeAmount;

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
             * 线上订单号，线上同步过来的订单号，最长不超过20;唯一
             */
            private String soId;

            /**
             * 订单类型，普通订单；补发订单；分销Plus；供销Plus；换货订单
             */
            private String type;

            /**
             * 订单来源，ERP：手工下单； COPY：复制； MERGE：合并； SPLIT：拆分；拆分还原； MOBILE：京东； IMPORT:导入； drp-s：供销推送； drp-d：分销推送； KWAISHOP：快手；微商城； PINDUODUO；拼多多； TOUTIAOFXG；头条放心购
             */
            private String orderFrom;

            /**
             * 聚水潭订单状态 待付款：WaitPay；发货中：Delivering；被合并：Merged；异常：Question；被拆分：Split；等供销商|外仓发货：WaitOuterSent；已付款待审核：WaitConfirm；已客审待财审：WaitFConfirm；已发货：Sent；取消：Cancelled
             */
            private String status;

            /**
             * 应付金额，保留两位小数，单位（元）
             */
            private Number payAmount;

            /**
             * 买家昵称
             */
            private String shopBuyerId;

            /**
             * 平台买家唯一值，仅限平台已经支持的才会返回
             */
            private String openId;

            /**
             * https://jushuitan.yuque.com/docs/share/200c8f37-49c5-4b22-a530-f37046691d4b?#8lWt 《平台订单shop_status字段枚举》密码：qqs7
             */
            private String shopStatus;

            /**
             * 手机
             */
            private String receiverMobile;

            /**
             * 电话
             */
            private String receiverPhone;

            /**
             * 订单日期
             */
            private String orderDate;

            /**
             * 问题描述
             */
            private String questionDesc;

            /**
             * 收件信息-市
             */
            private String receiverCity;

            /**
             * 收件信息-省
             */
            private String receiverState;

            /**
             * 收件信息-收件人
             */
            private String receiverName;

            /**
             * ERP内部订单号，聚水潭生成的订单号，唯一
             */
            private Integer oId;

            /**
             * 店铺编号
             */
            private Integer shopId;

            /**
             * 公司编号
             */
            private Integer coId;

            /**
             * 订单备注；卖家备注
             */
            private String remark;

            /**
             * 参考号
             */
            private String packageNo;

            /**
             * 外部单据号
             */
            private String warehouseOid;

            /**
             * 分销商编号
             */
            private String drpCoIdFrom;

            /**
             * 修改时间
             */
            private String modified;

            /**
             * 多标签
             */
            private String labels;

            /**
             * 实际支付金额
             */
            private Number paidAmount;

            /**
             * 平台优惠；null值处理成了空字符串返回，实际有值的是number类型返回
             */
            private String platformFreeAmount;

            /**
             * 支付优惠；null值处理成了空字符串返回，实际有值的是number类型返回
             */
            private String payFreeAmount;

            /**
             * 达人优惠；null值处理成了空字符串返回，实际有值的是number类型返回
             */
            private String referrerFreeAmount;

            /**
             * 店铺优惠；null值处理成了空字符串返回，实际有值的是number类型返回
             */
            private String shopFreeAmount;

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
             * 跨境平台税金
             */
            private String cbTotalTax;

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
             * 订单业务员
             */
            private String creatorName;

            /**
             * 计划发货时间
             */
            private String planDeliveryDate;

            /**
             * 线下备注
             */
            private String node;

            /**
             * 收件信息-街道
             */
            private String receiverTown;

            /**
             * 供销商编号
             */
            private String drpCoIdTo;

            /**
             * 店铺站点信息
             */
            private String shopSite;

            /**
             * 国际物流单号
             */
            private String unLid;

            /**
             * 确认收货时间（仅限淘系平台，头条放心购、拼多多、苏宁易购、快手电商、有赞微商城，如果线上状态为取消，该时间为完结时间）
             */
            private String endTime;

            /**
             * 国家代码;（映射关系参考https://openweb.jushuitan.com/doc?docId=225）
             */
            private String receiverCountry;

            /**
             * 邮编
             */
            private String receiverZip;

            /**
             * 旗帜(1红旗，2黄旗，3绿旗，4蓝旗，5紫旗)）
             */
            private Integer sellerFlag;

            /**
             * 收货邮箱
             */
            private String receiverEmail;

            /**
             * 主播id
             */
            private String referrerId;

            /**
             * 主播名称
             */
            private String referrerName;

            /**
             * 订单创建时间
             */
            private String created;

            /**
             * 支付信息
             */
            private java.util.List<Pays> pays;

            /**
             * 商品信息
             */
            private java.util.List<Items> items;

            /**
             * 商品（商品总数.sku_id*qty）
             */
            private String skus;

            /**
             * 实称重量
             */
            private Number fWeight;

            /**
             * 重量
             */
            private Number weight;

            /**
             * 数据库行版本号：https://docs.microsoft.com/zh-cn/sql/t-sql/data-types/rowversion-transact-sql?view=sql-server-ver16
             */
            private Integer ts;

            /**
             * 买家ID（系统根据shop_buy_id生成的）
             */
            private String buyerId;

            /**
             * 买家实付（仅限抖音，拼多多，京东平台订单）
             */
            private Number buyerPaidAmount;

            /**
             * 卖家实收
             */
            private Number sellerIncomeAmount;

            /**
             * 实发快递渠道
             */
            private String chosenChannel;

            /**
             * 被合并被拆分的订单内部单号
             */
            private String linkOId;

            /**
             * 合并线上订单号
             */
            private String mergeSoId;

            /**
             * 买家指定物流
             */
            private String shipment;

            /**
             * 预计送达时间
             */
            private String signTime;

            /**
             * 跨境订单财务数据
             */
            private CbFinances cbFinances;

            /**
             * 是否合并后订单
             */
            private Boolean isMerge;

            /**
             * 是否拆分后订单
             */
            private Boolean isSplit;

            /**
             * 跨境订单财务数据
             */
            @lombok.Data
            public static class CbFinances {

                /**
                 * 内部订单号
                 */
                private Number oId;

                /**
                 * 回扣金额
                 */
                private Integer rebateFee;

                /**
                 * 收入税费
                 */
                private Integer productTax;

                /**
                 * 快递税
                 */
                private Integer shippingTax;

                /**
                 * 其他收入
                 */
                private Integer otherIncome;

                /**
                 * 促销优惠金额
                 */
                private Integer voucherFromSeller;

                /**
                 * 平台佣金
                 */
                private Integer platformCommission;

                /**
                 * 转账费
                 */
                private Integer transitionFee;

                /**
                 * 交易手续费
                 */
                private Integer transactionFee;

                /**
                 * 支出税费
                 */
                private Integer opaqueBaggingFee;

                /**
                 * 其他费用
                 */
                private Integer otherExpense;
            }

            @lombok.Data
            public static class Items {

                /**
                 * 是否赠品
                 */
                private Boolean isGift;

                /**
                 * 原始商品编码
                 */
                private String skuId;

                /**
                 * 商品名称
                 */
                private String name;

                /**
                 * 申请退款的状态,未申请：none；退款中：waiting；退款成功：success；退款关闭：closed
                 */
                private String refundStatus;

                /**
                 * 退款的唯一单号
                 */
                private String refundId;

                /**
                 * 单价
                 */
                private Number price;

                /**
                 * 子订单号，商家系统订单商品明细主键，为了拆单合单时溯源，最长不超过50
                 */
                private String outerOiId;

                /**
                 * 商品状态；None：无；WaitPay：待付款；WaitConfirm：等待审核；Question：异常；WaitDeliver：平台接口告知ERP订单项解锁可发货的状态； WaitFConfirm：等待财务审核；Delivering：发货中；WaitOuterSent：等待外仓发货；Sent：已发货；OuterSent：外仓发货；Merged：被合并；Cancelled：用户取消订单；Replaced：被替换（明细）；Split：被拆分； Delete：删除；Lock：锁定；SentCancelled：发货后取消
                 */
                private String itemStatus;

                /**
                 * 款式编码
                 */
                private String iId;

                /**
                 * 属性
                 */
                private String propertiesValue;

                /**
                 * 子订单号，最长不超过20
                 */
                private Integer oiId;

                /**
                 * 总额
                 */
                private Number amount;

                /**
                 * 店铺商品编码，对应店铺商品资料页面平台店铺商品编码
                 */
                private String shopSkuId;

                /**
                 * 原始线上单号
                 */
                private String rawSoId;

                /**
                 * 数量
                 */
                private Integer qty;

                /**
                 * 是否预售
                 */
                private Boolean isPresale;

                /**
                 * 基本售价（原价）
                 */
                private Number basePrice;

                /**
                 * 商品图片
                 */
                private String pic;

                /**
                 * 商品类型；nomal：普通商品；combine：组合装商品；no_deliver：不发货
                 */
                private String skuType;

                /**
                 * 店铺款式编码
                 */
                private String shopIId;

                /**
                 * <div><a href="https://cdn.erp321.cn/jst-fed/51283fa8-860b-4177-b760-358748f3df7e_1101_312.png" target="_blank">买家实付</a></div>（仅限抖音，京东平台订单）
                 */
                private Number buyerPaidAmount;

                /**
                 * 卖家实收（仅限抖音平台订单）
                 */
                private Number sellerIncomeAmount;

                /**
                 * 主播ID
                 */
                private String referrerId;

                /**
                 * 虚拟仓编号；系统中相关业务项需配置。 统一功能配置（lock.stock.lwh.query）
                 */
                private String lwhId;

                /**
                 * 虚拟仓名称；系统中相关业务项需配置
                 */
                private String lwhName;

                /**
                 * 明细备注
                 */
                private String remark;

                /**
                 * 生产日期
                 */
                private String producedDate;

                /**
                 * 批次号
                 */
                private String batchId;

                /**
                 * 订单明细扩展字段
                 */
                private String itemExtData;
            }

            @lombok.Data
            public static class Pays {

                /**
                 * 是否支付
                 */
                private Boolean isOrderPay;

                /**
                 * 支付帐号
                 */
                private String buyerAccount;

                /**
                 * 支付金额
                 */
                private Number amount;

                /**
                 * 支付时间
                 */
                private String payDate;

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

                /**
                 * 支付状态
                 */
                private String status;

                /**
                 * 支付类型
                 */
                private String payType;

                /**
                 * 内部订单号
                 */
                private Number oId;
            }
        }
    }
}
