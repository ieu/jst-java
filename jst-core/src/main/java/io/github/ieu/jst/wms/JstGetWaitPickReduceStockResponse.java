package io.github.ieu.jst.wms;

@lombok.Data
public class JstGetWaitPickReduceStockResponse {

    private java.util.List<Data> data;

    /**
     * 状态码
     */
    private Integer code;

    /**
     * 是否成功
     */
    private String issuccess;

    /**
     * 描述信息
     */
    private String msg;

    @lombok.Data
    public static class Data {

        private String filter;

        /**
         * 状态
         */
        private String status;

        /**
         * 拣货员
         */
        private String pickerName;

        /**
         * 拣货批次号
         */
        private String waveId;

        /**
         * 类型
         */
        private String type;

        /**
         * 明细信息
         */
        private java.util.List<Item> items;

        @lombok.Data
        public static class Item {

            /**
             * 生产批次号
             */
            private String batchId;

            /**
             * 拣货明细id
             */
            private String waveItemId;

            /**
             * 仓位
             */
            private String bin;

            /**
             * 创建时间
             */
            private String created;

            /**
             * 公司编码
             */
            private String coId;

            /**
             * 商品编码
             */
            private String skuId;

            /**
             * 缺货数量
             */
            private String stockoutQty;

            /**
             * 生产日期
             */
            private String producedDate;

            /**
             * 编号
             */
            private Number wppId;

            /**
             * 分仓编码
             */
            private String wmsCoId;

            /**
             * 商品规格属性
             */
            private String propertiesValue;

            /**
             * 商品数量
             */
            private String qty;

            /**
             * 组合装商品编码
             */
            private String combineSkuId;

            /**
             * 拣货批次号
             */
            private String waveId;

            /**
             * 商品名称
             */
            private String name;

            /**
             * 修改时间
             */
            private String modified;

            /**
             * 供应商内部编码
             */
            private String supplierId;

            /**
             * 已拣数量
             */
            private String pickedQty;

            /**
             * 状态
             */
            private String status;
        }
    }
}
