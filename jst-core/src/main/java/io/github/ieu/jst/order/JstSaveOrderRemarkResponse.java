package io.github.ieu.jst.order;

/**
 * 根目录
 */
@lombok.Data
public class JstSaveOrderRemarkResponse {

    /**
     * 0表示正常
     */
    private Integer code;

    /**
     * 错误提示文案
     */
    private String msg;

    private Data data;

    @lombok.Data
    public static class Data {
    }
}
