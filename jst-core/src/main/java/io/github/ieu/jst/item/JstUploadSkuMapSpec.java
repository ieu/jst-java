package io.github.ieu.jst.item;

public class JstUploadSkuMapSpec {

    private final JstItemClient client;

    private final JstUploadSkuMapRequest.JstUploadSkuMapRequestBuilder requestBuilder = JstUploadSkuMapRequest.builder();

    public JstUploadSkuMapSpec(JstItemClient client) {
        this.client = client;
    }

    /**
     * 商品列表
     */
    public JstUploadSkuMapSpec items(java.util.List<JstUploadSkuMapRequest.Item> items) {
        requestBuilder.items(items);
        return this;
    }

    public JstUploadSkuMapResponse response() {
        return this.client.uploadSkuMap(requestBuilder.build());
    }
}
