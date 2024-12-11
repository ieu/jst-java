package io.github.ieu.jst.allocate;

@lombok.Data
public class JstCancelAllocateV2Response {

    /**
     * 返回码；0表示成功
     */
    private Integer code;

    /**
     * 是否执行成功
     */
    private Boolean issuccess;

    /**
     * 返回信息
     */
    private String msg;
}
