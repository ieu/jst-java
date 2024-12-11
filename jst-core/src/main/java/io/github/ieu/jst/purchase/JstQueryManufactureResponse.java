package io.github.ieu.jst.purchase;

@lombok.Data
public class JstQueryManufactureResponse {

    /**
     * 每页多少条
     */
    private Integer pageSize;

    /**
     * 第几页
     */
    private Integer pageIndex;

    /**
     * 是否有下一页
     */
    private Boolean hasNext;

    /**
     * 总页数
     */
    private Integer pageCount;

    /**
     * 总条数
     */
    private Integer dataCount;

    /**
     * 数据集合
     */
    private java.util.List<Data> datas;

    /**
     * 错误码
     */
    private Integer code;

    /**
     * true代表成功
     */
    private Boolean issuccess;

    /**
     * 错误信息
     */
    private String msg;

    @lombok.Data
    public static class Data {

        /**
         * 加工单号
         */
        private Integer poId;

        /**
         * 加工日期
         */
        private String poDate;

        /**
         * 加工工厂
         */
        private String seller;

        /**
         * 送货地址
         */
        private String sendAddress;

        /**
         * 合同条款
         */
        private String term;

        /**
         * 状态；WaitConfirm=待审核；Confirmed=已确认；Finished=完成；Cancelled=作废
         */
        private String status;

        /**
         * 下单人
         */
        private String purchaserName;

        /**
         * 标签
         */
        private String labels;

        /**
         * 打印次数
         */
        private Integer printCount;

        /**
         * 加工种类
         */
        private String subType;

        /**
         * 预估重量
         */
        private Number weight;

        /**
         * 预估体积
         */
        private Number volume;

        /**
         * 加工仓储方编号
         */
        private Integer wmsCoId;

        /**
         * 收货仓储方编号
         */
        private Integer receiptWmsCoId;

        /**
         * 修改时间
         */
        private String modified;

        /**
         * 创建时间
         */
        private String created;

        /**
         * 成品集合
         */
        private java.util.List<Item> items;

        /**
         * 原料集合
         */
        private java.util.List<Raw> raws;

        /**
         * 批次集合
         */
        private java.util.List<Batch> batchs;

        /**
         * 拣货批次号
         */
        private Integer waveId;

        /**
         * 备注
         */
        private String remark;

        @lombok.Data
        public static class Batch {

            /**
             * 批次号
             */
            private String batchNo;

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
        }

        @lombok.Data
        public static class Raw {

            /**
             * 图片
             */
            private String pic;

            /**
             * 商品编码
             */
            private String skuId;

            /**
             * 商品名称
             */
            private String name;

            /**
             * 颜色及规格
             */
            private String propertiesValue;

            /**
             * 数量
             */
            private Integer qty;

            /**
             * 备注
             */
            private String remark;
        }

        @lombok.Data
        public static class Item {

            /**
             * 图片
             */
            private String pic;

            /**
             * 商品编码
             */
            private String skuId;

            /**
             * 商品名称
             */
            private String name;

            /**
             * 颜色及规格
             */
            private String propertiesValue;

            /**
             * 款式编码
             */
            private String iId;

            /**
             * 数量
             */
            private Integer qty;

            /**
             * 预计完成加工数
             */
            private Integer planArriveQty;

            /**
             * 预计加工完成时间
             */
            private String deliveryDate;

            /**
             * 物料成本
             */
            private Number price;

            /**
             * 加工费
             */
            private Number processingCharges;

            /**
             * 总金额
             */
            private Number amount;

            /**
             * 备注
             */
            private String remark;

            /**
             * 已入库数
             */
            private Integer ioQty;
        }
    }
}
