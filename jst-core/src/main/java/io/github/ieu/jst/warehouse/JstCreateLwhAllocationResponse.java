package io.github.ieu.jst.warehouse;

@lombok.Data
public class JstCreateLwhAllocationResponse {

    /**
     * 接口请求是否成功，0表示成功
     */
    private Number code;

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
         * 业务执行是否成功，0代表成功
         */
        private Integer code;
    }
}
