package io.github.ieu.jst.supplychainopen;

@lombok.Data
public class JstQueryOssSignatureResponse {

    /**
     * 返回码,0表示业务处理成功
     */
    private Integer code;

    /**
     * 错误信息
     */
    private String msg;

    /**
     * 请求ID
     */
    private String requestId;

    private Data data;

    @lombok.Data
    public static class Data {

        /**
         * OSS的AccessKeyId
         */
        private String accessId;

        /**
         * 策略
         */
        private String policy;

        /**
         * 签名
         */
        private String signature;

        /**
         * 要上传的文件目录
         */
        private String dir;

        /**
         * OSS访问域名
         */
        private String host;

        /**
         * 失效时间 10分钟
         */
        private String expire;

        /**
         * OSS文件url域名
         */
        private String ossUrlDomain;
    }
}
