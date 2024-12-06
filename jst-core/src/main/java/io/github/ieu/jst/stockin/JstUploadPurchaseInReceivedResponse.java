package io.github.ieu.jst.stockin;

@lombok.Data
public class JstUploadPurchaseInReceivedResponse {

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
