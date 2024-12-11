package io.github.ieu.jst.stockin;

@lombok.Data
@lombok.Builder
public class JstBatchAddSkusnSimpleRequest {

    private java.util.List<SkuSn> skuSnList;

    @lombok.Data
    public static class SkuSn {

        /**
         * 商品编码
         */
        private String skuId;

        /**
         * 唯一码|序列号
         */
        private String sn;
    }
}
