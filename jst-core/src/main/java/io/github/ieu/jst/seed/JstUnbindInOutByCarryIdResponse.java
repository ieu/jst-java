package io.github.ieu.jst.seed;

/**
 * 根目录
 */
@lombok.Data
public class JstUnbindInOutByCarryIdResponse {

    /**
     * 0表示正常
     */
    private Number code;

    /**
     * 错误提示文案
     */
    private String msg;

    private Boolean data;
}
