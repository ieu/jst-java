package io.github.ieu.jst.purchase;

@lombok.Data
public class JstChangePurchaseStatusResponse {

    /**
     * 0 代表成功
     */
    private Integer code;

    /**
     * 是否成功
     */
    private String issuccess;

    /**
     * 错误提示信息
     */
    private String msg;

    /**
     * 结果集合
     */
    private java.util.List<Result> result;

    @lombok.Data
    public static class Result {

        /**
         * 0 代表成功
         */
        private Integer code;

        /**
         * 是否成功
         */
        private String issuccess;

        /**
         * 错误提示信息
         */
        private String msg;

        /**
         * ERP 内部单号，唯一
         */
        private String poId;

        /**
         * 外部采购单单号
         */
        private String soId;

        /**
         * 采购单状态
         */
        private String status;
    }
}
