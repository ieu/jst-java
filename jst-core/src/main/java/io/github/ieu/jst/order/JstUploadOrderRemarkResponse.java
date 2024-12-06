package io.github.ieu.jst.order;

@lombok.Data
public class JstUploadOrderRemarkResponse {

    /**
     * 0 代表成功
     */
    private Integer code;

    /**
     * 是否成功
     */
    private String issuccess;

    /**
     * 描述
     */
    private String msg;
}
