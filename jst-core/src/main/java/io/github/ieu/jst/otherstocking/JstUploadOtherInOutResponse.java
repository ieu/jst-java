package io.github.ieu.jst.otherstocking;

@lombok.Data
public class JstUploadOtherInOutResponse {

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

        private Data data;

        @lombok.Data
        public static class Data {

            /**
             * 外部单号（单据上传成功之后对应页面线上单号）
             */
            private String externalId;

            /**
             * 系统内部单号（单据上传成功之后对应页面出仓单号）
             */
            private Integer ioId;
        }
    }
}
