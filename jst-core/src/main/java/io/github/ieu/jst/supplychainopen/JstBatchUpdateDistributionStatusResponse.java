package io.github.ieu.jst.supplychainopen;

@lombok.Data
public class JstBatchUpdateDistributionStatusResponse {

    /**
     * 返回码 0表示业务处理成功
     */
    private String code;

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
         * 总数
         */
        private Integer totalQty;

        /**
         * 成功数量
         */
        private Integer successQty;

        /**
         * 失败数量
         */
        private Integer failQty;

        /**
         * 成功款号列表
         */
        private java.util.List<String> successStyleCodeList;

        /**
         * 失败款号列表
         */
        private java.util.List<String> failStyleCodeList;
    }
}
