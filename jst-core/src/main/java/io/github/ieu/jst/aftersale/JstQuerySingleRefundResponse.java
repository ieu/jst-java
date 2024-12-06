package io.github.ieu.jst.aftersale;

@lombok.Data
public class JstQuerySingleRefundResponse {

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
        private java.util.List<Datas> datas;

        @lombok.Data
        public static class Datas {

            /**
             * 聚水潭售后单号
             */
            private Integer asId;

            /**
             * 申请时间
             */
            private String asDate;

            /**
             * 平台退货退款单号
             */
            private String outerAsId;

            /**
             * 订单内部单号
             */
            private Integer oId;

            /**
             * 订单线上单号
             */
            private String soId;

            /**
             * 售后类型，普通退货，其它，拒收退货，仅退款，投诉，补发，换货，维修
             */
            private String type;

            /**
             * 登记时间
             */
            private String created;

            /**
             * 修改时间
             */
            private String modified;

            /**
             * 状态（WaitConfirm:待确认,Confirmed:已确认,Cancelled:作废,Merged:被合并）
             */
            private String status;

            /**
             * WAIT_SELLER_AGREE:等待卖家同意; WAIT_BUYER_RETURN_GOODS:等待买家退货;WAIT_SELLER_CONFIRM_GOODS:买家已经退货，等待卖家确认收货;SELLER_REFUSE_BUYER:卖家拒绝退款;EXCHANGE_SELLER_DELIVERY:售后换货商家发货;EXCHANGE_BUYER_CONFIRM_GOODS:售后换货用户收货;WAIT_SELLER_DELIVER_GOODS:等待卖家发货;REISSUE_SELLER_DELIVERY:补发卖家发货;CLOSED:退款关闭;SUCCESS:退款成功;SYNCING:同步中;SYNC_SUCCESS:同步成功;SYNC_ERROR:同步失败;待发出换货商品:待发出换货商品
             */
            private String shopStatus;

            /**
             * 备注
             */
            private String remark;

            /**
             * 问题类型
             */
            private String questionType;

            /**
             * 仓库
             */
            private String warehouse;

            /**
             * 退款金额(退货金额+卖家应补)
             */
            private Number refund;

            /**
             * 补偿金额(换货金额+买家应补)
             */
            private Number payment;

            /**
             * 优惠/差额
             */
            private Number freeAmount;

            /**
             * 货物状态（BUYER_NOT_RECEIVED:买家未收到货,BUYER_RECEIVED:买家已收到货,BUYER_RETURNED_GOODS:买家已退货,SELLER_RECEIVED:卖家已收到退货）
             */
            private String goodStatus;

            /**
             * 售后线下备注
             */
            private String node;

            /**
             * 原订单状态(待付款：WaitPay；发货中：Delivering；被合并：Merged；异常：Question；被拆分：Split；等供销商|外仓发货：WaitOuterSent；已付款待审核：WaitConfirm；已客审待财审：WaitFConfirm；已发货：Sent；取消：Cancelled)
             */
            private String orderStatus;

            /**
             * 线上类型
             */
            private String shopType;

            /**
             * 店铺编号
             */
            private Integer shopId;

            /**
             * 物流公司
             */
            private String logisticsCompany;

            /**
             * 物流单号
             */
            private String lId;

            /**
             * 仓库编号
             */
            private Integer whId;

            /**
             * 分仓编号
             */
            private Integer wmsCoId;

            /**
             * 最后确认日期
             */
            private String confirmDate;

            /**
             * 卖家应退运费
             */
            private Number freight;

            /**
             * 分销商编号
             */
            private Integer drpCoIdFrom;

            /**
             * 原订单收件人电话
             */
            private String receiverMobile;

            /**
             * 原订单收件人名称
             */
            private String receiverName;

            /**
             * 买家账号
             */
            private String shopBuyerId;

            /**
             * 线上申请金额
             */
            private Number buyerApplyRefund;

            /**
             * 实际退给买家的金额
             */
            private Number receiveRefund;

            /**
             * 处理结果
             */
            private String result;

            /**
             * 商品集合
             */
            private java.util.List<Items> items;

            /**
             * <div><a href="https://cdn.erp321.cn/jst-fed/6e7a0bbb-124e-457f-9b31-b9286c42d8ea_1558_310.png" target="_blank">生产批次集合</a></div>
             */
            private java.util.List<Batchs> batchs;

            /**
             * <div><a href="https://cdn.erp321.cn/jst-fed/1480fd4b-f07f-4f6f-9099-51e459e1b772_1634_247.png" target="_blank">唯一码集合</a></div>
             */
            private java.util.List<Sns> sns;

            /**
             * 供销商编号
             */
            private Integer drpCoIdTo;

            /**
             * 标记｜多标签
             */
            private String labels;

            /**
             * 退款版本号:（用于区分是否唯品会单据）
             */
            private Integer refundVersion;

            /**
             * 数据库行版本号：https://docs.microsoft.com/zh-cn/sql/t-sql/data-types/rowversion-transact-sql?view=sql-server-ver16
             */
            private String ts;

            /**
             * 店铺名称
             */
            private String shopName;

            /**
             * 币种（跨境单据有值，币种映射关系参考https://openweb.jushuitan.com/doc?docId=223）
             */
            private String currency;

            /**
             * 原订单标签
             */
            private java.util.List<String> orderLabels;

            /**
             * 退款阶段
             */
            private String refundPhase;

            /**
             * 创建人
             */
            private String creatorName;

            /**
             * 线上退运费
             */
            private Number shopFreight;

            /**
             * 订单类型
             */
            private String orderType;

            private java.util.List<Images> images;

            /**
             * 实退金额＋平台补贴（仅抖音）
             */
            private Number buyerReceiveRefund;

            /**
             * 附件图片
             */
            @lombok.Data
            public static class Images {

                /**
                 * 路径
                 */
                private String key;

                /**
                 * 域名
                 */
                private String domain;
            }

            @lombok.Data
            public static class Sns {

                /**
                 * 商品编码
                 */
                private String skuId;

                /**
                 * SN号码
                 */
                private String sn;
            }

            @lombok.Data
            public static class Batchs {

                /**
                 * 批次号
                 */
                private String batchNo;

                /**
                 * 商品编码
                 */
                private String skuId;

                /**
                 * 商品数量
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
            }

            @lombok.Data
            public static class Items {

                /**
                 * 售后子单号
                 */
                private Integer asiId;

                /**
                 * ERP售后单号
                 */
                private Integer asId;

                /**
                 * 线上明细金额
                 */
                private Number shopAmount;

                /**
                 * 商品编码
                 */
                private String skuId;

                /**
                 * 数量
                 */
                private Integer qty;

                /**
                 * 是否赠品
                 */
                private Boolean isGift;

                /**
                 * 单价
                 */
                private Number price;

                /**
                 * 申请金额
                 */
                private Number amount;

                /**
                 * 商品名称
                 */
                private String name;

                /**
                 * 图片地址
                 */
                private String pic;

                /**
                 * 类型（退货，换货,补发，其它）
                 */
                private String type;

                /**
                 * 颜色规格
                 */
                private String propertiesValue;

                /**
                 * 子订单号：取值订单outer_oi_id
                 */
                private String outerOiId;

                /**
                 * 商品类型
                 */
                private String skuType;

                /**
                 * 实收退货数量
                 */
                private Integer rQty;

                /**
                 * 入仓时间
                 */
                private String receiveDate;

                /**
                 * 组合商品编码
                 */
                private String combineSkuId;

                /**
                 * 店铺商品编码
                 */
                private String shopSkuId;

                /**
                 * 款式编码
                 */
                private String iId;

                /**
                 * 次品数量
                 */
                private Integer defectiveQty;

                /**
                 * 明细备注
                 */
                private String remark;
            }
        }
    }
}
