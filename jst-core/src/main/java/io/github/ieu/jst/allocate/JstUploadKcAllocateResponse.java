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

    private DataWrap data;

    @lombok.Data
    public static class DataWrap {

        private java.util.List<Data> datas;

        @lombok.Data
        public static class Data {

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
