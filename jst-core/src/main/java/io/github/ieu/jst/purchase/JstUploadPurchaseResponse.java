package io.github.ieu.jst.purchase;

@lombok.Data
public class JstUploadPurchaseResponse {

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
             * 聚水潭采购单号
             */
            private Integer poId;

            /**
             * 外部采购单号（单据上传成功之后对应页面外部单号）
             */
            private String externalId;
        }
    }
}
