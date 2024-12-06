package io.github.ieu.jst.wms;

@lombok.Data
public class JstQuickSaleArrivalResponse {

    private String code;

    private String issuccess;

    private String msg;

    private Data data;

    @lombok.Data
    public static class Data {

        /**
         * 标签状态：有效、作废、非快销标签
         */
        private String status;

        /**
         * 订单类型（单，多）
         */
        private String pkey;

        /**
         * 播种区：A、B、C、D
         */
        private String area;

        /**
         * 播种柜号：多件柜号如3-1
         */
        private String areabin;

        /**
         * 已到货数：（包含本件）
         */
        private Number arrivenum;

        /**
         * 未到货数：（有效标签未到货数）
         */
        private Number unarrivenum;

        /**
         * 物流公司
         */
        private String logisticscompany;

        /**
         * 初次采购日期
         */
        private String minpurchasedate;

        /**
         * 是否已到货
         */
        private Boolean isarrive;
    }
}
