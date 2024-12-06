package io.github.ieu.jst.wms;

@lombok.Data
public class JstFindSkuBinResponse {

    private Number code;

    private String msg;

    private String requestId;

    private java.util.List<Data> data;

    @lombok.Data
    public static class Data {

        /**
         * 商品编码
         */
        private String skuId;

        /**
         * 仓位
         */
        private String bin;
    }
}
