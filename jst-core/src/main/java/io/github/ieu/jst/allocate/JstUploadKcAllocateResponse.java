package io.github.ieu.jst.allocate;

@lombok.Data
public class JstUploadKcAllocateResponse {

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

        private java.util.List<Datas> datas;

        @lombok.Data
        public static class Datas {

            /**
             * 线上订单号
             */
            private String soId;

            /**
             * 调拨单号
             */
            private String ioId;
        }
    }
}
