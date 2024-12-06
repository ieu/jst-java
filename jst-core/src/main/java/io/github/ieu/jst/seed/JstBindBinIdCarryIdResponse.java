package io.github.ieu.jst.seed;

@lombok.Data
public class JstBindBinIdCarryIdResponse {

    /**
     * 是否绑定成功
     */
    private Boolean data;

    /**
     * 错误码
     */
    private String code;

    /**
     * 是否执行成功
     */
    private String issuccess;

    /**
     * 返回信息
     */
    private String msg;
}
