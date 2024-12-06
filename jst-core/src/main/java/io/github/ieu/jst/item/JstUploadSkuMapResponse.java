package io.github.ieu.jst.item;

@lombok.Data
public class JstUploadSkuMapResponse {

    /**
     * 错误码
     */
    private Integer code;

    private Data data;

    /**
     * 错误描述
     */
    private String msg;

    @lombok.Data
    public static class Data {
    }
}
