package io.github.ieu.jst.logistics;

@lombok.Data
public class JstUploadExpressRegisterResponse {

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 错误描述
     */
    private String msg;

    private Data data;

    @lombok.Data
    public static class Data {
    }
}
