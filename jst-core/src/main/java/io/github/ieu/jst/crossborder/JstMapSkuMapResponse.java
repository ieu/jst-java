package io.github.ieu.jst.crossborder;

@lombok.Data
public class JstMapSkuMapResponse {

    private Integer code;

    private Data data;

    private String msg;

    private String requestId;

    private Boolean success;

    @lombok.Data
    public static class Data {

        private Integer code;

        private String msg;

        private String data;
    }
}
