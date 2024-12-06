package io.github.ieu.jst.wms;

@lombok.Data
public class JstConfirmSingleOrderResponse {

    /**
     * 非0失败
     */
    private Number code;

    /**
     * 错误描述
     */
    private String msg;

    private java.util.List<Data> data;

    @lombok.Data
    public static class Data {

        /**
         * 外部采购入库单号
         */
        private String externalId;

        /**
         * 内部采购入库单号
         */
        private Number ioId;
    }
}
