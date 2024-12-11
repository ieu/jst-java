package io.github.ieu.jst.supplychainopen;

@lombok.Data
public class JstUploadImageToOssResponse {

    /**
     * 返回码
     */
    private Integer code;

    /**
     * 错误信息
     */
    private String msg;

    /**
     * 请求id
     */
    private String requestId;

    /**
     * 图片链接,转换为聚水潭分销版之后的图片链接
     */
    private String data;
}
