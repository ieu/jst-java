package io.github.ieu.jst.allocate;

@lombok.Data
public class JstUploadInAllocateResponse {

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 错误描述
     */
    private String msg;

    /**
     * 数据集合
     */
    private DataWrap data;

    /**
     * 数据集合
     */
    @lombok.Data
    public static class DataWrap {

        private Data data;

        @lombok.Data
        public static class Data {

            /**
             * 调拨单号
             */
            private Integer ioId;

            /**
             * 外部调拨单号
             */
            private String soId;
        }
    }
}
