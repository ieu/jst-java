package io.github.ieu.jst.wms;

@lombok.Data
public class JstQueryInOutWaterResponse {

    private Data datas;

    /**
     * 提示信息
     */
    private String msg;

    /**
     * 是否查询成功
     */
    private String issuccess;

    /**
     * 成功码，0代表成功
     */
    private Integer code;

    /**
     * 是否有下一页
     */
    private Boolean hasNext;

    /**
     * 总页数
     */
    private Integer pageCount;

    /**
     * 查询到的总数据量
     */
    private Integer dataCount;

    /**
     * 页码
     */
    private Integer pageIndex;

    /**
     * 每页数据条数
     */
    private Integer pageSize;

    @lombok.Data
    public static class Data {

        /**
         * 公司编号，调拨业务时代表发起方
         */
        private Integer coId;

        /**
         * 分仓编号，调拨业务时代表接收方
         */
        private Integer wmsCoId;

        /**
         * 仓库编号，主仓=1，销退仓=2，进货仓=3，次品仓=4
         */
        private Integer whId;

        /**
         * 调入/出仓的仓库编号，主仓=1，销退仓=2，进货仓=3，次品仓=4调拨业务
         */
        private Integer linkWhId;

        /**
         * 调入/出仓单号，调拨业务
         */
        private Integer linkIoId;

        /**
         * 店铺编号，订单业务
         */
        private Integer shopId;

        /**
         * 进出仓单号
         */
        private Integer ioId;

        /**
         * 内部单号
         */
        private Integer oId;

        /**
         * 线上单号，订单业务
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
         * 进出仓日期
         */
        private String ioDate;

        /**
         * 供应商ID,采购相关业务
         */
        private Integer supplierId;

        /**
         * 状态
         */
        private String status;

        /**
         * 是否使用库存
         */
        private String stockEnabled;

        /**
         * 预估重量
         */
        private Number weight;

        /**
         * 实际重量
         */
        private Number fWeight;

        /**
         * 出库类型，其它出入库业务
         */
        private String drpCoName;

        /**
         * 备注
         */
        private String remark;

        private Item items;

        /**
         * 单据类型
         */
        private String type;

        @lombok.Data
        public static class Item {

            /**
             * 商品明细ID
             */
            private Integer ioiId;

            /**
             * 商品编码
             */
            private String skuId;

            /**
             * 数量
             */
            private Integer qty;

            /**
             * 商品属性
             */
            private String propertiesValue;

            /**
             * 实际数量
             */
            private Integer rQty;

            /**
             * 数量加减标识+1，-1
             */
            private Integer qtyType;
        }
    }
}
