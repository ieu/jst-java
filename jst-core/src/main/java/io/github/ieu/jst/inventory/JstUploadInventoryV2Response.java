package io.github.ieu.jst.inventory;

@lombok.Data
public class JstUploadInventoryV2Response {

    /**
     * 状态码；0表示成功
     */
    private Integer code;

    /**
     * 执行结果
     */
    private Boolean issuccess;

    /**
     * 执行结果描述信息
     */
    private String msg;

    private DataWrap data;

    @lombok.Data
    public static class DataWrap {

        private Data data;

        @lombok.Data
        public static class Data {

            /**
             * 执行结果
             */
            private String msg;

            /**
             * 外部单号
             */
            private String soId;

            /**
             * 盘点单号
             */
            private Number ioId;
        }
    }
}
