package io.github.ieu.jst.allocate;

@lombok.Data
public class JstConfirmAllocateResponse {

    /**
     * 返回错误码；0代表成功
     */
    private Integer code;

    /**
     * 是否成功
     */
    private Boolean issuccess;

    /**
     * 提示信息
     */
    private String msg;
}
