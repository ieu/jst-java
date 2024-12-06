package io.github.ieu.jst.supplychainopen;

@lombok.Data
@lombok.Builder
public class JstUploadImageToOssRequest {

    /**
     * 原始图片链接（原始图片链接 必须是http链接）
     */
    private String originalUrl;
}
