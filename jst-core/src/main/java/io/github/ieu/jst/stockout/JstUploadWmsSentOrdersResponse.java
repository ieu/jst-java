package io.github.ieu.jst.stockout;

@lombok.Data
public class JstUploadWmsSentOrdersResponse {

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 错误描述
     */
    private String msg;

    /**
     * data节点返回的o_id字段对应的值为传入的出仓io_id
     */
    private DataWrap data;

    /**
     * data节点返回的o_id字段对应的值为传入的出仓io_id
     */
    @lombok.Data
    public static class DataWrap {

        private java.util.List<Data> data;

        @lombok.Data
        public static class Data {

            /**
             * 执行结果
             */
            private String msg;

            /**
             * 是否成功
             */
            private Boolean issuccess;

            /**
             * 出库单号
             */
            private Integer oId;
        }
    }
}
