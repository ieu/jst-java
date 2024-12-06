package io.github.ieu.jst.aftersale;

@lombok.Data
public class JstConfirmAfterSaleGoodsResponse {

    /**
     * 返回代码
     */
    private String code;

    /**
     * 失败消息
     */
    private String msg;

    private Data data;

    @lombok.Data
    public static class Data {

        /**
         * 成功明细
         */
        private java.util.List<Success> success;

        /**
         * 失败明细
         */
        private java.util.List<Fail> fail;

        /**
         * 成功数量
         */
        private Number successCount;

        /**
         * 失败数量
         */
        private Number failCount;

        @lombok.Data
        public static class Fail {

            /**
             * 售后单号
             */
            private String asId;

            /**
             * 平台退货退款单号
             */
            private String outerAsId;

            /**
             * 消息
             */
            private String message;

            /**
             * 消息明细
             */
            private String details;

            /**
             * 是否成功
             */
            private String isSuccess;
        }

        @lombok.Data
        public static class Success {

            /**
             * 售后单号
             */
            private Number asId;

            /**
             * 平台退货退款单号
             */
            private String outerAsId;

            /**
             * 消息
             */
            private String message;

            /**
             * 消息明细
             */
            private String details;

            /**
             * 是否成功
             */
            private Boolean isSuccess;
        }
    }
}
