package io.github.ieu.jst.warehouse;

@lombok.Data
public class JstCreateLwhOperationResponse {

    private Integer code;

    private Data data;

    private String msg;

    private String requestId;

    @lombok.Data
    public static class Data {

        /**
         * 单据编号
         */
        private Integer ioId;

        private String msg;

        /**
         * 0代表成功
         */
        private Integer code;
    }
}
