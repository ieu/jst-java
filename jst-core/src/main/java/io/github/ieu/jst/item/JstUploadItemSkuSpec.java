package io.github.ieu.jst.item;

public class JstUploadItemSkuSpec {

    private final JstItemClient client;

    private final JstUploadItemSkuRequest.JstUploadItemSkuRequestBuilder requestBuilder = JstUploadItemSkuRequest.builder();

    public JstUploadItemSkuSpec(JstItemClient client) {
        this.client = client;
    }

    /**
     * 商品列表
     */
    public JstUploadItemSkuSpec items(java.util.List<JstUploadItemSkuRequest.Item> items) {
        requestBuilder.items(items);
        return this;
    }

    /**
     * 校验是否已经有了组合装商品编码，默认为false,入参为 true 则校验修改的sku 类型不得为组合装，否则跳过不处理并输出错误信息
     */
    public JstUploadItemSkuSpec isNormal(Boolean isNormal) {
        requestBuilder.isNormal(isNormal);
        return this;
    }

    public JstUploadItemSkuResponse response() {
        return this.client.uploadItemSku(requestBuilder.build());
    }
}
