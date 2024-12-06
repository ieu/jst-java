package io.github.ieu.jst.order;

@lombok.Data
public class JstUploadOrderSentResponse {

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 是否执行成功
     */
    private Boolean issuccess;

    /**
     * 执行描述
     */
    private String msg;

    private java.util.List<Data> data;

    @lombok.Data
    public static class Data {
    }
}
