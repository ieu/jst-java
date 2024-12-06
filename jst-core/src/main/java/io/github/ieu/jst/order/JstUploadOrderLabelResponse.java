package io.github.ieu.jst.order;

@lombok.Data
public class JstUploadOrderLabelResponse {

    /**
     * 状态码
     */
    private Integer code;

    /**
     * 是否成功
     */
    private Boolean issuccess;

    /**
     * 执行结果描述
     */
    private String msg;
}
