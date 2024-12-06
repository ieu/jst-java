package io.github.ieu.jst.order;

@lombok.Data
public class JstCancelOrderByOidResponse {

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 错误描述
     */
    private String msg;

    private String data;
}
