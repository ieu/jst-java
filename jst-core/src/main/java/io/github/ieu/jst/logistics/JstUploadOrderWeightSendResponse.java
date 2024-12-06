package io.github.ieu.jst.logistics;

@lombok.Data
public class JstUploadOrderWeightSendResponse {

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
         * 数据集合
         */
        private java.util.List<Datas> datas;

        @lombok.Data
        public static class Datas {

            /**
             * 预估重量
             */
            private Number weight;

            /**
             * 快递公司编码
             */
            private String lcId;

            /**
             * 快递单号
             */
            private String lId;

            /**
             * 物流公司
             */
            private Number logisticsCompany;

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
             * 国际物流编码
             */
            private String cbLcId;

            /**
             * 国际运单号
             */
            private String cbLId;

            /**
             * 国际物流渠道
             */
            private String cbLogisticsCompany;
        }
    }
}
