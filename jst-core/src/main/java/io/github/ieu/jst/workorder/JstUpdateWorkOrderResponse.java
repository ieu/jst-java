package io.github.ieu.jst.workorder;

@lombok.Data
public class JstUpdateWorkOrderResponse {

    private Integer code;

    private String requestId;

    private String msg;

    private Data data;

    @lombok.Data
    public static class Data {

        private String data;

        private String page;

        private Number now;
    }
}
