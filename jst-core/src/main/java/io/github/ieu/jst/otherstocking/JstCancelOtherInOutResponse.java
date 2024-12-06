package io.github.ieu.jst.otherstocking;

@lombok.Data
public class JstCancelOtherInOutResponse {

    /**
     * 错误码
     */
    private Integer code;

    /**
     * true 代表成功
     */
    private Boolean issuccess;

    /**
     * 执行描述
     */
    private String msg;
}
