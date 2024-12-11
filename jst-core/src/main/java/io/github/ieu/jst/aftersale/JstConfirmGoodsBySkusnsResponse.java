package io.github.ieu.jst.aftersale;

@lombok.Data
public class JstConfirmGoodsBySkusnsResponse {

    /**
     * 0表示成功
     */
    private Integer code;

    /**
     * 执行返回信息
     */
    private String msg;

    private Data data;

    @lombok.Data
    public static class Data {

        /**
         * 成功详情
         */
        private java.util.List<Success> success;

        /**
         * 失败详情
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
             * 内部售后单号
             */
            private String asId;

            /**
             * 外部售后单号
             */
            private String outerAsId;

            /**
             * 唯一码
             */
            private String skuSns;

            /**
             * 返回码
             */
            private Integer code;

            /**
             * 返回信息
             */
            private String message;

            /**
             * 详细信息
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
             * 内部售后单号
             */
            private String asId;

            /**
             * 外部售后单号
             */
            private String outerAsId;

            /**
             * 唯一码
             */
            private String skuSns;

            /**
             * 返回码
             */
            private Integer code;

            /**
             * 返回信息
             */
            private String message;

            /**
             * 详细信息
             */
            private String details;

            /**
             * 是否成功
             */
            private String isSuccess;
        }
    }
}
