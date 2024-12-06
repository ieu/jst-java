package io.github.ieu.jst.purchase;

@lombok.Data
public class JstUploadAppointmentInResponse {

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 错误描述
     */
    private String msg;

    /**
     * 返回内容
     */
    private Data data;

    /**
     * 返回内容
     */
    @lombok.Data
    public static class Data {

        /**
         * 外部单号
         */
        private String externalId;

        /**
         * 内部预约单号
         */
        private Integer poId;
    }
}
