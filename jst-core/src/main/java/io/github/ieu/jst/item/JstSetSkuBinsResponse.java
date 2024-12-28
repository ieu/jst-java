package io.github.ieu.jst.item;

@lombok.Data
public class JstSetSkuBinsResponse {

    private Integer code;

    /**
     * 返回结果
     */
    private java.util.List<Data> data;

    private String msg;

    private String requestId;

    @lombok.Data
    public static class Data {

        /**
         * 商品编码
         */
        private String skuId;

        /**
         * 是否成功
         */
        private Boolean issuccess;

        /**
         * 提示信息
         */
        private String msg;
    }
}
