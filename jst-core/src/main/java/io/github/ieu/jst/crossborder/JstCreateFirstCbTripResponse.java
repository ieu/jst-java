package io.github.ieu.jst.crossborder;

@lombok.Data
public class JstCreateFirstCbTripResponse {

    private Integer code;

    private Data data;

    private String msg;

    private String requestId;

    @lombok.Data
    public static class Data {

        /**
         * 头程单号
         */
        private String firstTripCode;

        /**
         * 创建头程计划成功，但后续步骤失败的错误消息
         */
        private String message;

        /**
         * 头程计划是否确认成功
         */
        private Boolean isCfmed;

        /**
         * 调拨单号（如果生成调拨单成功，则返回调拨单号）
         */
        private Number ioId;
    }
}
