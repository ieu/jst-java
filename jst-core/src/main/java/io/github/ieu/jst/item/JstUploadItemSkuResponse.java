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

    private Data data;

    @lombok.Data
    public static class Data {

        private java.util.List<Datas> datas;

        @lombok.Data
        public static class Datas {

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
