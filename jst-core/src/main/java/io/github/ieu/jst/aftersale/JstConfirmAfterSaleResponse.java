package io.github.ieu.jst.aftersale;

@lombok.Data
public class JstConfirmAfterSaleResponse {

    private Number code;

    private Data data;

    private String msg;

    @lombok.Data
    public static class Data {

        private java.util.List<Success> success;

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
            private Number asId;

            /**
             * 外部售后单号
             */
            private String outerAsId;

            /**
             * 错误消息
             */
            private String message;

            /**
             * 错误详细消息
             */
            private String details;

            /**
             * 是否成功
             */
            private Boolean isSuccess;
        }

        @lombok.Data
        public static class Success {

            /**
             * 售后单号
             */
            private Number asId;

            /**
             * 外部售后单号
             */
            private String outerAsId;

            /**
             * 成功消息
             */
            private String message;

            /**
             * 成功详细消息
             */
            private String details;

            /**
             * 是否成功
             */
            private Boolean isSuccess;

            /**
             * 新生成的补发的内部订单号
             */
            private String newOId;
        }
    }
}
