package io.github.ieu.jst.wms;

@lombok.Data
public class JstLoadWavesByFilterResponse {

    private java.util.List<Data> data;

    /**
     * 返回码
     */
    private Integer code;

    /**
     * 提示信息
     */
    private String msg;

    /**
     * 请求唯一码
     */
    private String requestId;

    @lombok.Data
    public static class Data {

        /**
         * 批次号
         */
        private Number waveId;

        /**
         * 播种车号
         */
        private java.util.List<String> carryIds;

        /**
         * 类型
         */
        private String type;

        /**
         * 公司编码
         */
        private Number coId;

        /**
         * 拣货员编码
         */
        private String picker;

        /**
         * 已拣数
         */
        private Number pickedQty;

        /**
         * 商品总数
         */
        private Number qty;

        /**
         * 拣货员名称
         */
        private String pickerName;

        /**
         * 订单数
         */
        private Number orderCount;

        /**
         * 单品种类数
         */
        private Number skuCount;

        /**
         * 商品总量
         */
        private Number skuQty;

        /**
         * 批次状态（WaitPick 等待拣货 Break       终止拣货 Finished  已完成 WaitToBin  等待上架 WaitSeed   等待播种 WaitCheck 等待出库验货 WaitFinish  等待完成 Picking      正在拣货 WaitPurchase 等待采购 Seeding  正在播种 Checking  正在出库验货）
         */
        private String status;

        /**
         * 创建时间
         */
        private String created;

        /**
         * 创建人
         */
        private String creator;

        /**
         * 修改时间
         */
        private String modified;

        /**
         * 播种开始时间
         */
        private String seedBegin;

        /**
         * 播种员编号
         */
        private String seederId;

        /**
         * 播种员名称
         */
        private String seederName;

        /**
         * 备注
         */
        private String remark;

        /**
         * 混合捡
         */
        private String hybridPick;

        /**
         * 分仓编码
         */
        private Number wmsCoId;

        /**
         * 策略
         */
        private String filter;

        /**
         * 是否打印
         */
        private Boolean isPrint;

        /**
         * 批次箱号
         */
        private String waveBin;

        /**
         * 采购单号
         */
        private Number poId;

        /**
         * 分段捡
         */
        private String splitPick;

        /**
         * 是否打印面单
         */
        private Boolean isPrintExpress;

        /**
         * 纸质批次
         */
        private String paperPick;

        private String pickSeed;

        /**
         * 是否打印订单
         */
        private Number isPrintOrder;

        /**
         * 仓位号 主仓=1、销退仓=2、进货仓=3、次品仓=4
         */
        private Number whId;

        /**
         * 优先级
         */
        private Number priorty;

        /**
         * 倒序拣货
         */
        private Boolean pickInvert;

        /**
         * 是否打印订单标签
         */
        private Boolean isPrintOrdertags;

        private WaveFlag waveFlag;

        /**
         * 批次子类型
         */
        private String waveExtendType;

        /**
         * 商品明细
         */
        private java.util.List<Item> items;

        @lombok.Data
        public static class Item {

            /**
             * 批次明细编号
             */
            private Number waveItemId;

            /**
             * 批次编号
             */
            private Number waveId;

            /**
             * 仓位
             */
            private String bin;

            /**
             * 商品编号
             */
            private String skuId;

            /**
             * 商品名称
             */
            private String name;

            /**
             * 商品属性
             */
            private String propertiesValue;

            /**
             * 已拣数量
             */
            private Number pickedQty;

            /**
             * 数量
             */
            private Number qty;

            /**
             * 播种柜号
             */
            private Number binId;

            /**
             * 是否跳过
             */
            private Number skip;

            /**
             * 纸质批次拣货指引已拣数量
             */
            private Number checkedQty;

            /**
             * 是否有效
             */
            private Number disabled;

            /**
             * 其它仓位
             */
            private String otherBin;

            /**
             * 款号
             */
            private String iId;

            /**
             * 小包装数量
             */
            private Number subPackQty;

            /**
             * 跳过拣货区
             */
            private Number skipPickPack;

            /**
             * 跳过存货区
             */
            private Number skipPickBin;

            /**
             * 组合装编号
             */
            private String combineSkuId;

            /**
             * 批次号
             */
            private String batchId;

            /**
             * 生产日期
             */
            private String producedDate;

            /**
             * 供应商编号
             */
            private Number supplierId;

            /**
             * 移货类型(MoveOut:移出,MoveIn:移入)
             */
            private String waveItemType;

            /**
             * 移货批次关联Id
             */
            private Number relateId;

            /**
             * 失效日期
             */
            private String expirationDate;

            /**
             * 商家编号
             */
            private Number waveCoId;
        }

        @lombok.Data
        public static class WaveFlag {
        }
    }
}
