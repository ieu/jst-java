package io.github.ieu.jst.stockin;

@lombok.Data
public class JstCreatePurchaseInBatchResponse {

    /**
     * 编码
     */
    private Integer code;

    /**
     * 消息
     */
    private String msg;

    private String requestId;

    private Data data;

    @lombok.Data
    public static class Data {

        /**
         * <div><a href="https://cdn.erp321.cn/jst-fed/e3a0f8c6-30a1-4183-b5a9-86ae60e4a23f_1590_231.png" target="_blank">外部采购入库单号</a> </div>
         */
        private String externalId;

        /**
         * <div><a href="https://cdn.erp321.cn/jst-fed/b3020a08-adc9-4c03-bb19-420ac168a8de_1643_249.png" target="_blank">采购入库单号</a></div>
         */
        private String ioId;

        /**
         * 是否成功
         */
        private String isSuccess;

        /**
         * 消息
         */
        private String msg;
    }
}
