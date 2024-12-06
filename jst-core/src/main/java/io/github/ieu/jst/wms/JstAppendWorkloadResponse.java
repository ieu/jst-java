package io.github.ieu.jst.wms;

/**
 * 根目录
 */
@lombok.Data
public class JstAppendWorkloadResponse {

    /**
     * 0表示正常
     */
    private Number code;

    /**
     * 错误提示文案
     */
    private String msg;

    private Data data;

    @lombok.Data
    public static class Data {

        private String message;

        private Boolean success;
    }
}
