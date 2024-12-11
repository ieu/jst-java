package io.github.ieu.jst.item;

@lombok.Data
public class JstUploadCombineSkuResponse {

    /**
     * 错误码，0代表成功
     */
    private Integer code;

    /**
     * true代表成功
     */
    private String issuccess;

    /**
     * 执行描述
     */
    private String msg;
}
