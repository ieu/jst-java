package io.github.ieu.jst.aftersale;

@lombok.Data
public class JstUploadAfterSaleResponse {

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 错误描述
     */
    private String msg;

    /**
     * 数据集合
     */
    private DataWrap data;

    /**
     * 数据集合
     */
    @lombok.Data
    public static class DataWrap {

        private java.util.List<Data> datas;

        @lombok.Data
        public static class Data {

            /**
             * 执行结果描述
             */
            private String msg;

            /**
             * 内部售后单号
             */
            private Integer asId;

            /**
             * 是否成功
             */
            private Boolean issuccess;

            /**
             * 线上单号
             */
            private String soId;

            /**
             * 外部售后单号
             */
            private String outerAsId;

            /**
             * 内部单号
             */
            private Integer oId;

            /**
             * 0
             */
            private Integer id;

            /**
             * null
             */
            private String orderType;

            /**
             * null
             */
            private String oaid;
        }
    }
}
