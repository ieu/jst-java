package io.github.ieu.jst.aftersale;

@lombok.Data
public class JstUploadNoInfoAfterSaleResponse {

    /**
     * 状态码
     */
    private Integer code;

    /**
     * 执行结果
     */
    private Boolean issuccess;

    /**
     * 提示信息
     */
    private String msg;

    private java.util.List<Data> data;

    @lombok.Data
    public static class Data {

        /**
         * 内部单号
         */
        private String asId;

        /**
         * 外部单号
         */
        private String outerAsId;

        /**
         * 结果： true:成功,false:失败
         */
        private Boolean success;

        /**
         * 提示信息
         */
        private String message;
    }
}
