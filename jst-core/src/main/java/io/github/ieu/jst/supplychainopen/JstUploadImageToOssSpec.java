package io.github.ieu.jst.supplychainopen;

public class JstUploadImageToOssSpec {

    private final JstSupplyChainOpenClient client;

    private final JstUploadImageToOssRequest.JstUploadImageToOssRequestBuilder requestBuilder = JstUploadImageToOssRequest.builder();

    public JstUploadImageToOssSpec(JstSupplyChainOpenClient client) {
        this.client = client;
    }

    /**
     * 原始图片链接（原始图片链接 必须是http链接）
     */
    public JstUploadImageToOssSpec originalUrl(String originalUrl) {
        requestBuilder.originalUrl(originalUrl);
        return this;
    }

    public JstUploadImageToOssResponse response() {
        return this.client.uploadImageToOss(requestBuilder.build());
    }
}
