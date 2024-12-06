package io.github.ieu.jst.order;

@lombok.Data
public class JstSetOrderNodeBySoidResponse {

    /**
     * 返回值0代表成功
     */
    private Number code;

    /**
     * 是否成功
     */
    private Boolean issuccess;

    /**
     * 异常信息描述
     */
    private String msg;
}
