package io.github.ieu.jst.item;

public class JstUploadCombineSkuSpec {

    private final JstItemClient client;

    private final JstUploadCombineSkuRequest.JstUploadCombineSkuRequestBuilder requestBuilder = JstUploadCombineSkuRequest.builder();

    public JstUploadCombineSkuSpec(JstItemClient client) {
        this.client = client;
    }

    /**
     * 存在是否覆盖，默认值true，true:是,false:否
     */
    public JstUploadCombineSkuSpec isCover(Boolean isCover) {
        requestBuilder.isCover(isCover);
        return this;
    }

    /**
     * 空值是否覆盖，默认值false，true:是,false:否
     */
    public JstUploadCombineSkuSpec isNullCover(Boolean isNullCover) {
        requestBuilder.isNullCover(isNullCover);
        return this;
    }

    /**
     * 一次最多上传50个
     */
    public JstUploadCombineSkuSpec items(java.util.List<JstUploadCombineSkuRequest.Item> items) {
        requestBuilder.items(items);
        return this;
    }

    public JstUploadCombineSkuResponse response() {
        return this.client.uploadCombineSku(requestBuilder.build());
    }
}
