package io.github.ieu.jst.item;

@lombok.Data
public class JstUploadItemSkuResponse {

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
             * 是否上传成功
             */
            private String isSuccess;

            /**
             * 商品编码
             */
            private String skuId;

            /**
             * 执行信息
             */
            private String msg;
        }
    }
}
