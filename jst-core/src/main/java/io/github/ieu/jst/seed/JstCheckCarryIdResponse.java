package io.github.ieu.jst.seed;

@lombok.Data
public class JstCheckCarryIdResponse {

    /**
     * 是否校验成功
     */
    private Boolean data;

    /**
     * 返回码
     */
    private Integer code;

    /**
     * 是否执行成功
     */
    private String issuccess;

    /**
     * 执行信息
     */
    private String msg;
}
