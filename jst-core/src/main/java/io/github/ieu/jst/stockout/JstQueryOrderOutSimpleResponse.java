package io.github.ieu.jst.stockout;

@lombok.Data
public class JstQueryOrderOutSimpleResponse {

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 错误描述
     */
    private String msg;

    private Pagination data;

    @lombok.Data
    public static class Pagination {

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
        private java.util.List<Data> datas;

        @lombok.Data
        public static class Data {

            /**
             * 公司编号
             */
            private Integer coId;

            /**
             * <div><a href="https://cdn.erp321.cn/jst-fed/2a89fec6-8da9-4a25-958e-16ef2b6343ce_1577_438.png" target="_blank">店铺编码</a> </div>
             */
            private Integer shopId;

            /**
             * 出库单号(商家维度下出库单全局唯一值)
             */
            private Integer ioId;

            /**
             * <div><a href="https://cdn.erp321.cn/jst-fed/52a949c3-cd0e-4c99-9ca6-6fe9f7301ae2_1805_235.png" target="_blank">内部单号</a> </div>
             */
            private Integer oId;

            /**
             * <div><a href="https://cdn.erp321.cn/jst-fed/52fc40e0-353a-45f0-928b-9f999d040ebc_1606_202.png" target="_blank">线上单号</a></div>
             */
            private String soId;

            /**
             * 创建时间
             */
            private String created;

            /**
             * 修改时间
             */
            private String modified;

            /**
             * <div><a href="https://cdn.erp321.cn/jst-fed/d8ed18ca-e9d6-4307-be30-5d36492e4f16_1688_202.png" target="_blank">状态</a> </div>;WaitConfirm:待出库,Confirmed:已出库,Delete:作废（订单发货中取消订单）,OuterConfirming:外部发货中;Cancelled=取消（订单发货后撤销已发货）
             */
            private String status;

            /**
             * 订单类型，普通订单；补发订单；分销Plus；供销Plus；换货订单
             */
            private String orderType;

            /**
             * 发票抬头
             */
            private String invoiceTitle;

            /**
             * 买家昵称/线下客户
             */
            private String shopBuyerId;

            /**
             * 平台买家唯一值，仅支持天猫，抖音，快手
             */
            private String openId;

            /**
             * 国家
             */
            private String receiverCountry;

            /**
             * 省
             */
            private String receiverState;

            /**
             * 市
             */
            private String receiverCity;

            /**
             * 区
             */
            private String receiverDistrict;

            /**
             * 街道
             */
            private String receiverTown;

            /**
             * 地址
             */
            private String receiverAddress;

            /**
             * 收件人姓名
             */
            private String receiverName;

            /**
             * 收件人手机
             */
            private String receiverPhone;

            /**
             * 收件人电话
             */
            private String receiverMobile;

            /**
             * 买家留言
             */
            private String buyerMessage;

            /**
             * 备注
             */
            private String remark;

            /**
             * 是否货到付款
             */
            private Boolean isCod;

            /**
             * 应付金额
             */
            private Number payAmount;

            /**
             * 物流单号
             */
            private String lId;

            /**
             * 出库时间
             */
            private String ioDate;

            /**
             * 快递公司编码
             */
            private String lcId;

            /**
             * 是否启用库存管理
             */
            private String stockEnabled;

            /**
             * 分销商编号
             */
            private String drpCoIdFrom;

            /**
             * 标记|多标签
             */
            private String labels;

            /**
             * 实付金额
             */
            private Number paidAmount;

            /**
             * 优惠金额
             */
            private Number freeAmount;

            /**
             * 买家支付运费
             */
            private Number freight;

            /**
             * 预估重量
             */
            private Number weight;

            /**
             * 实称重量
             */
            private Number fWeight;

            /**
             * 合并订单号
             */
            private String mergeSoId;

            /**
             * 分仓编号
             */
            private Integer wmsCoId;

            /**
             * 业务人员
             */
            private String businessStaff;

            /**
             * 货币类型
             */
            private String currency;

            /**
             * 付款日期
             */
            private String payDate;

            /**
             * 物流公司名称
             */
            private String logisticsCompany;

            /**
             * 拣货批次号
             */
            private Integer waveId;

            /**
             * 旗帜(1红旗，2黄旗，3绿旗，4蓝旗，5紫旗)）
             */
            private Integer sellerFlag;

            /**
             * 订单业务员编号
             */
            private Integer orderStaffId;

            /**
             * 订单业务员名称
             */
            private String orderStaffName;

            /**
             * 线下备注
             */
            private String node;

            /**
             * 商品集合
             */
            private java.util.List<Item> items;

            /**
             * 子母单的子单信息
             */
            private java.util.List<ClusterInfo> clusterinfos;

            /**
             * <div><a href="https://cdn.erp321.cn/jst-fed/6e7a0bbb-124e-457f-9b31-b9286c42d8ea_1558_310.png"target="_blank">生产批次集合</a></div>获取该节点系统中相关业务项需配置（对应erp基础设置开启生产批次管理 如果是分仓数据 分仓也需要开启）
             */
            private java.util.List<Batch> batchs;

            /**
             * <div><a href="https://cdn.erp321.cn/jst-fed/1480fd4b-f07f-4f6f-9099-51e459e1b772_1634_247.png"target="_blank">唯一码集合</a></div>获取该节点系统中相关业务项需配置（对应erp基础设置商品唯一码开关）
             */
            private java.util.List<Sn> sns;

            /**
             * 快递单已打印
             */
            private Boolean isPrintExpress;

            /**
             * 订单已打印
             */
            private Boolean isPrint;

            /**
             * 店铺名称
             */
            private String shopName;

            /**
             * 数据库行版本号：https://docs.microsoft.com/zh-cn/sql/t-sql/data-types/rowversion-transact-sql?view=sql-server-ver16
             */
            private Integer ts;

            /**
             * 跨境订单买家指定物流（is_get_cblogistic传true返回）
             */
            private String shipment;

            /**
             * 跨境订单物流方式（is_get_cblogistic传true返回）
             */
            private String deliverName;

            /**
             * 跨境订单渠道名称（is_get_cblogistic传true返回）
             */
            private String channelName;

            /**
             * 跨境订单国际运单号（is_get_cblogistic传true返回）
             */
            private String trackingNumber;

            /**
             * 参考号
             */
            private String packageNo;

            /**
             * 外部单据号
             */
            private String warehouseOid;

            /**
             * 跨境订单财务数据
             */
            private CbFinance cbFinance;

            /**
             * 跨境订单财务数据
             */
            @lombok.Data
            public static class CbFinance {

                private Integer oId;

                private Double rebateFee;

                private Double productTax;

                private Double shippingTax;

                private Double otherIncome;

                private Double voucherFromSeller;

                private Double platformCommission;

                private Double transitionFee;

                private Double transactionFee;

                private Double opaqueBaggingFee;

                private Double otherExpense;
            }

            @lombok.Data
            public static class Sn {

                /**
                 * 商品编码
                 */
                private String skuId;

                /**
                 * 唯一码
                 */
                private String sn;

                /**
                 * 是否箱唯一码，true是箱唯一码
                 */
                private Boolean isPackSn;

                /**
                 * 是否开箱，true 是开箱
                 */
                private Boolean isOpened;

                /**
                 * 箱码
                 */
                private String packSn;
            }

            @lombok.Data
            public static class Batch {

                /**
                 * 批次号
                 */
                private String batchNo;

                /**
                 * 出库单商品明细单号（需开启批次2.0并且统一功能配置wms.ioiid.match.skusn）
                 */
                private Number ioiId;

                /**
                 * 商品编码
                 */
                private String skuId;

                /**
                 * 数量
                 */
                private Integer qty;

                /**
                 * 批次日期
                 */
                private String productDate;

                /**
                 * 供应商编号
                 */
                private Integer supplierId;

                /**
                 * 供应商名称
                 */
                private String supplierName;

                /**
                 * 有效期至
                 */
                private String expirationDate;

                /**
                 * 状态
                 */
                private String status;
            }

            @lombok.Data
            public static class ClusterInfo {

                /**
                 * 出库单号
                 */
                private String ioId;

                /**
                 * 物流单子单号
                 */
                private String lId;

                /**
                 * 物流公司名称
                 */
                private String logisticCompany;

                /**
                 * 物流公司编码
                 */
                private String lcId;

                /**
                 * 子单号实称重量
                 */
                private Number fWeight;
            }

            @lombok.Data
            public static class Item {

                /**
                 * 子单号
                 */
                private Integer ioiId;

                /**
                 * 图片
                 */
                private String pic;

                /**
                 * 商品编码
                 */
                private String skuId;

                /**
                 * 数量
                 */
                private Integer qty;

                /**
                 * 商品名称
                 */
                private String name;

                /**
                 * 颜色规格
                 */
                private String propertiesValue;

                /**
                 * 单价
                 */
                private Number salePrice;

                /**
                 * 订单子订单号
                 */
                private String oiId;

                /**
                 * 金额
                 */
                private Number saleAmount;

                /**
                 * 款式编码
                 */
                private String iId;

                /**
                 * 商品单位
                 */
                private String unit;

                /**
                 * 原价
                 */
                private Number saleBasePrice;

                /**
                 * 组合装商品编码
                 */
                private String combineSkuId;

                /**
                 * 是否赠品
                 */
                private Boolean isGift;

                /**
                 * 子订单号，商家系统订单商品明细主键,为了拆单合单时溯源，最长不超过50,保持唯一
                 */
                private String outerOiId;

                /**
                 * 原始线上订单号
                 */
                private String rawSoId;

                /**
                 * 批次号，获取该字段系统中相关业务项需配置
                 */
                private String batchId;

                /**
                 * 批次日期，系统中相关业务项需配置
                 */
                private String productDate;

                /**
                 * 供应商编号，系统中相关业务项需配置
                 */
                private Integer supplierId;

                /**
                 * 有效期至，系统中相关业务项需配置
                 */
                private String expirationDate;
            }
        }
    }
}
