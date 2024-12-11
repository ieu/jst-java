package io.github.ieu.jst.order;

@lombok.Data
public class JstGetQuestionOrderQuestionsResponse {

    private Integer code;

    private Data data;

    private String msg;

    private String requestId;

    @lombok.Data
    public static class Data {

        /**
         * 成功数量
         */
        private Number success;

        /**
         * 失败数量
         */
        private Number fail;

        /**
         * 转异常失败信息
         */
        private java.util.List<Message> message;

        @lombok.Data
        public static class Message {

            /**
             * 失败订单编号
             */
            private Number id;

            /**
             * 失败信息
             */
            private String msg;
        }
    }
}
