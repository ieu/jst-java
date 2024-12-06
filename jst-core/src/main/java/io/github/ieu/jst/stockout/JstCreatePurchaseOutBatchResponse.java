package io.github.ieu.jst.stockout;

@lombok.Data
public class JstCreatePurchaseOutBatchResponse {

    /**
     * 状态码
     */
    private String code;

    /**
     * 消息
     */
    private String msg;

    private String requestId;

    private Data data;

    @lombok.Data
    public static class Data {

        /**
         * 外部采购退货单单号
         */
        private String externalId;

        /**
         * 采购退货单单号
         */
        private Integer ioId;

        /**
         * 是否成功
         */
        private Boolean isSuccess;

        /**
         * 消息
         */
        private String msg;
    }
}
