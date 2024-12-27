package io.github.ieu.jst.wms;

@lombok.Data
public class JstQuickSaleArrivalResponse {

    private Integer code;

    private Boolean issuccess;

    private String msg;

    private Data data;

    @lombok.Data
    public static class Data {

        /**
         * 标签状态：有效、作废、非快销标签
         */
        private Integer status;

        /**
         * 订单类型（单，多）
         */
        private String pKey;

        /**
         * 播种区：A、B、C、D
         */
        private String area;

        /**
         * 播种柜号：多件柜号如3-1
         */
        private String areaBin;

        /**
         * 已到货数：（包含本件）
         */
        private Number arriveNum;

        /**
         * 未到货数：（有效标签未到货数）
         */
        private Number unArriveNum;

        /**
         * 物流公司
         */
        private String logisticsCompany;

        /**
         * 初次采购日期
         */
        private String minPurchaseDate;

        /**
         * 是否已到货
         */
        private Boolean isArrive;
    }
}
