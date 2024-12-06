package io.github.ieu.jst.seed;

@lombok.Data
public class JstReturnSeedResponse {

    /**
     * 返回码 0 表示成功
     */
    private String code;

    /**
     * 是否调用成功
     */
    private String issuccess;

    /**
     * 返回信息
     */
    private String msg;
}
