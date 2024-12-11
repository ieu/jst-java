package io.github.ieu.jst.order;

@lombok.Data
@lombok.Builder
public class JstUploadOrdersRequest {

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/ccaa4f9d-b986-4c48-b2d2-1e8b20177658_2166_836.png" target="_blank">店铺编号</a></div>（店铺设置界面的编号字段）：仅支持创建到商家自有商城站点、跨境线下平台、线下店铺站点、B2B站点 ； 可通过店铺查询接口获取：https://openweb.jushuitan.com/dev-doc?docType=1&docId=1。关于【商家自有商城】的店铺如何创建，可查看操作 http://www.erp321.com/app/support/document.html#page=1865
     */
    private Integer shopId;

    /**
     * oaid（从淘宝平台拿到的的密文串），同时订单标签要打上“淘宝订单”full_receive_en_json的OuterSoId要传线上单号
     */
    private String oaid;

    /**
     * 分仓编号；订单指定分仓，主仓发货无需填写。可通过接口仓库查询获取仓库编码，ERP界面不展示：https://openweb.jushuitan.com/dev-doc?docType=1&docId=3
     */
    private Integer wmsCoId;

    /**
     * 最晚发货时间；发货前可更新
     */
    private String planDeliveryDate;

    /**
     * 外部交易单号
     */
    private String outerSoId;

    /**
     * 收件人密文串json（支持从淘宝抖音快手拼多多京东平台拿到的密文信息）同时订单多标签要打上对应密文站点标签如快手的标记“快手订单”（抖音订单，快手订单，拼多多订单，京东订单）
     */
    private String fullReceiveEnJson;

    /**
     * 收件人密文手机号（抖音：147：原始密文）nvarchar（200）
     */
    private String receiverMobileEn;

    /**
     * 收件人密文姓名（抖音：147：原始密文）nvarchar（200）
     */
    private String receiverNameEn;

    /**
     * 总买家实付
     */
    private Number buyerPaidAmount;

    /**
     * 总卖家实收
     */
    private Number sellerIncomeAmount;

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/84a8b0d2-e4ca-4a77-899c-80ed1f39af98_2330_449.png" target="_blank">自研商城系统订单号</a></div>长度<=50，自有商城店铺中唯一值不允许重复单号上传
     */
    private String soId;

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/3ef545a9-3cbe-4ef6-a1d8-c8f24671737a_2321_505.png" target="_blank">订单日期</a></div>（不能传订单归档日期前的日期）
     */
    private String orderDate;

    /**
     * 自研商城系统订单状态：等待买家付款=WAIT_BUYER_PAY，等待卖家发货=WAIT_SELLER_SEND_GOODS（传此状态时实际支付金额即pay节点支付金额=应付金额ERP才会显示已付款待审核）,等待买家确认收货=WAIT_BUYER_CONFIRM_GOODS,交易成功=TRADE_FINISHED,付款后交易关闭=TRADE_CLOSED,付款前交易关闭=TRADE_CLOSED_BY_TAOBAO；可更新
     */
    private String shopStatus;

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/4e8a5331-b56f-494a-a563-e2f836ccaa52_2157_721.png" target="_blank">买家帐号</a></div>自定义上传，nvarchar(50)
     */
    private String shopBuyerId;

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/f2b2cdbb-523e-4991-861e-05f95486cfd4_1842_991.png" target="_blank">收货省份</a></div>长度<=50；发货前可更新（如果详细地址传带省市区的完整地址，该字段可以不传，整个字段不传，不能传null或者空字符串）
     */
    private String receiverState;

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/f2b2cdbb-523e-4991-861e-05f95486cfd4_1842_991.png" target="_blank">收货市</a></div>长度<=50；发货前可更新（如果详细地址传带省市区的完整地址，该字段可以不传，整个字段不传，不能传null或者空字符串）
     */
    private String receiverCity;

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/f2b2cdbb-523e-4991-861e-05f95486cfd4_1842_991.png" target="_blank">收货区/街道</a></div>长度<=50；发货前可更新（如果详细地址传带省市区的完整地址，该字段可以不传，整个字段不传，不能传null或者空字符串）
     */
    private String receiverDistrict;

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/eff5708e-2e6a-43b2-aff6-7b17fb82be34_1962_972.png" target="_blank">收货地址</a></div>长度<=200；发货前可更新
     */
    private String receiverAddress;

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/79544f73-30f3-49c7-8df5-7c10361d0b24_1744_1045.png" target="_blank">收件人</a></div>长度<=50；发货前可更新
     */
    private String receiverName;

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/e97c868a-468a-4987-94c0-a5883768b11a_1895_1049.png" target="_blank">联系电话</a></div>长度<=50；发货前可更新
     */
    private String receiverPhone;

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/2fc4ab7a-9151-4966-be8e-6fffcb86272f_1850_1062.png" target="_blank">手机</a></div>长度<=50；发货前可更新
     */
    private String receiverMobile;

    /**
     * 收货邮箱（需符合邮箱格式否则忽略上传，不可更新）
     */
    private String receiverEmail;

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/f0f0f0ca-cfc5-40fd-85a4-149e18555f66_1737_1012.png" target="_blank">收货街道</a></div>@
     */
    private String receiverTown;

    /**
     * 收货国家，长度<=5。请填写对应国家的二字码编码https://openweb.jushuitan.com/doc?docId=225
     */
    private String receiverCountry;

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/a5fd15aa-5ee5-4c95-993e-8abf5c252520_1743_1093.png" target="_blank">邮政编码</a></div>@ varchar(20)
     */
    private String receiverZip;

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/2a00d64d-9472-4327-b1b9-556c5827ad52_2121_1157.png" target="_blank">应付金额</a></div>保留两位小数，单位元）
     */
    private Number payAmount;

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/47036dd5-3e09-4264-add3-479bfb9547eb_2142_1224.png" target="_blank">运费</a></div>
     */
    private Number freight;

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/c3c66059-9f07-4ced-b2f1-1dd023cea394_2055_963.png" target="_blank">买家留言</a></div>长度<=400；可更新
     */
    private String buyerMessage;

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/469fb4ea-6059-4584-b21b-42baf5040980_2092_1051.png" target="_blank">卖家备注</a></div>长度<=1000；可更新
     */
    private String remark;

    /**
     * 跨境买家指定物流
     */
    private String shipment;

    /**
     * 是否货到付款
     */
    private Boolean isCod;

    /**
     * 订单修改日期
     */
    private String shopModified;

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/3e150899-e741-43e9-ac06-5997097f76f2_2228_911.png" target="_blank">快递单号</a></div>
     */
    private String lId;

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/6d851e65-e406-47a2-b6a6-80f43b446c62_2207_787.png" target="_blank">快递公司名称</a></div>需要先在系统【物流(快递)公司及打印模板】页面中配置对应的物流公司及编码，如选择现场取货收件人信息非必填手机和电话必填一项即可
     */
    private String logisticsCompany;

    /**
     * 订单异常描述
     */
    private String questionDesc;

    /**
     * 卖家标签（旗帜），可选1:red,2:yellow,3:green,4:blue,5:purple
     */
    private Integer sellerFlag;

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/861f81c7-c4db-4634-bd51-61a50d4e9854_2298_1107.png" target="_blank">商品明细</a></div>
     */
    private java.util.List<Item> items;

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/18cfa79d-1249-4eaf-b4bd-564096038530_2075_1010.png" target="_blank">支付明细</a></div>shop_status=WAIT_BUYER_PAY 的时候可不传，如果Pay节点不传系统默认为等待买家支付状态，如果此时ERP设置了只下载已支付订单则未支付的订单会被拦截创建无效
     */
    private Pay pay;

    /**
     * card节点非必填，如果填写了节点中name，card_id必填
     */
    private Card card;

    /**
     * 发货日期
     */
    private String sendDate;

    /**
     * 标记｜多标签，长度<=200以逗号分隔，单个标签不能超过十个字符
     */
    private String labels;

    /**
     * 快递公司编码，需要先在系统【物流(快递)公司及打印模板】页面中配置对应的物流公司及编码
     */
    private String lcId;

    /**
     * 货币代码，跨境线下订单必填，不填写默认人民币
     */
    private String currency;

    /**
     * 发票类型：个人电子普通;单位电子普通;个人纸质普通;单位纸质普通;个人电子增值税;单位电子增值税;个人纸质增值税;单位纸质增值税
     */
    private String invoiceType;

    /**
     * 发票抬头
     */
    private String invoiceTitle;

    /**
     * 发票税号
     */
    private String buyerTaxNo;

    /**
     * 发票信息（基础设置配置开关后可更新）
     */
    private Invoice invoice;

    /**
     * 线下备注
     */
    private String node;

    /**
     * 跨境财务数据
     */
    private FinanceData financeData;

    /**
     * 业务员id（用户及权限的用户编码 https://openweb.jushuitan.com/dev-doc?docType=41&docId=611）
     */
    private String creator;

    /**
     * 业务员名称
     */
    private String creatorName;

    /**
     * 跨境扩展信息，见请求示例
     */
    private OrderExt orderExt;

    /**
     * 跨境扩展信息，见请求示例
     */
    @lombok.Data
    public static class OrderExt {

        private ExtData extDatas;

        @lombok.Data
        public static class ExtData {

            /**
             * 门牌号，可更新
             */
            private String doorPlate;

            /**
             * 公司名称，可更新
             */
            private String companyName;
        }
    }

    /**
     * 跨境财务数据
     */
    @lombok.Data
    public static class FinanceData {

        /**
         * 回扣金额
         */
        private Number rebateFee;

        /**
         * 收入税费
         */
        private Number productTax;

        /**
         * 快递税
         */
        private Number shippingTax;

        /**
         * 其他收入
         */
        private Number otherIncome;

        /**
         * 促销优惠金额
         */
        private Number voucherFromSeller;

        /**
         * 平台佣金
         */
        private Number platformCommission;

        /**
         * 转账费
         */
        private Number transitionFee;

        /**
         * 交易手续费
         */
        private Number transactionFee;

        /**
         * 支出税费
         */
        private Number opaqueBaggingFee;

        /**
         * 其他费用
         */
        private Number otherExpense;
    }

    /**
     * 发票信息（基础设置配置开关后可更新）
     */
    @lombok.Data
    public static class Invoice {

        /**
         * 专票地址
         */
        private String address;

        /**
         * 专票银行
         */
        private String bank;

        /**
         * 专票电话
         */
        private String phone;

        /**
         * 专票账户
         */
        private String account;

        /**
         * 专票邮箱
         */
        private String email;

        /**
         * 专票人姓名
         */
        private String username;

        /**
         * 专票人电话
         */
        private String userphone;

        /**
         * 专票人地址
         */
        private String useraddress;
    }

    /**
     * card节点非必填，如果填写了节点中name，card_id必填
     */
    @lombok.Data
    public static class Card {

        /**
         * 姓名；可更新，card节点存在必填
         */
        private String name;

        /**
         * 身份证号；可更新，card节点存在必填
         */
        private String cardId;
    }

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/18cfa79d-1249-4eaf-b4bd-564096038530_2075_1010.png" target="_blank">支付明细</a></div>shop_status=WAIT_BUYER_PAY 的时候可不传，如果Pay节点不传系统默认为等待买家支付状态，如果此时ERP设置了只下载已支付订单则未支付的订单会被拦截创建无效
     */
    @lombok.Data
    public static class Pay {

        /**
         * 外部支付单号，最大50
         */
        private String outerPayId;

        /**
         * 支付日期
         */
        private String payDate;

        /**
         * 支付方式，自定义上传，最大20
         */
        private String payment;

        /**
         * 卖家支付账号，最大50
         */
        private String sellerAccount;

        /**
         * 买家支付账号，最大200
         */
        private String buyerAccount;

        /**
         * 支付总额（最大传2位小数）
         */
        private Number amount;
    }

    @lombok.Data
    public static class Item {

        /**
         * 商品编码，对应普通商品资料页面商品编码，ERP内商品编码长度<=40PS:设置预售标识订单，修改商品编码=商品编码+预售（或==）+预计发货日期（可选）比如:"A321232"修改为"A321232预售2015-12-12"或者"A321232"修改为"A321232==2015-12-12"当商品被购买后ERP将自动识别为预售订单并更正商品编码为正确商品编码
         */
        private String skuId;

        /**
         * 店铺商品编码，对应店铺商品管理页面的平台店铺商品编码，店铺商品编码长度<=128，店铺商品资料未维护可自定义值上传
         */
        private String shopSkuId;

        /**
         * 店铺商品款式编码
         */
        private String shopIId;

        /**
         * ERP内款号/货号长度<=40
         */
        private String iId;

        /**
         * 图片地址长度<=300;若开启订单下载时商品图片取普通商品资料开关，图片则取普通商品资料，反之，传值取值
         */
        private String pic;

        /**
         * 商品属性；长度<=100
         */
        private String propertiesValue;

        /**
         * 成交总额单位（元）（（最大传2位小数））；备注：可能存在人工改价
         */
        private Number amount;

        /**
         * 单价，单位（元）（（最大传4位小数））
         */
        private Number price;

        /**
         * 原价，保留两位小数，单位（元）
         */
        private Number basePrice;

        /**
         * 数量
         */
        private Integer qty;

        /**
         * <div><a href="https://cdn.erp321.cn/jst-fed/f195a53d-7439-413a-8480-f35ae8bb3697_2396_484.png" target="_blank">退货数量</a></div>（同一件商品部分退部分拦截发货时使用）
         */
        private Integer refundQty;

        /**
         * 商品名称长度<=100
         */
        private String name;

        /**
         * <div><a href="https://cdn.erp321.cn/jst-fed/e53de062-f72a-4c41-88c8-a45edd7494ae_2257_889.png" target="_blank">状态</a></div>PS：值存在，会自动将订单转异常,success状态的，发货将不发该商品，不支持单商品退部分;退款状态:可选退款中=waiting;退款成功=success（订单的全部商品传此状态，订单会被取消）,closed=退款关闭；可更新
         */
        private String refundStatus;

        /**
         * 商家系统订单商品明细主键,为了拆单合单时溯源，最长不超过50,保持订单内唯一，支持自定义
         */
        private String outerOiId;

        /**
         * 订单明细备注
         */
        private String remark;

        /**
         * 生产批次号，ERP需开启生产批次管理，普通商品资料需启用生产批次
         */
        private String batchId;

        /**
         * 生产日期，ERP需开启生产批次管理，普通商品资料需启用生产批次
         */
        private String producedDate;

        /**
         * 是否赠品
         */
        private Boolean isGift;

        /**
         * 虚拟仓编码
         */
        private Number buId;
    }
}
