package io.github.ieu.jst.order;

@lombok.Data
public class JstUploadModifyWmsOrderResponse {

    /**
     * 返回码
     */
    private Integer code;

    /**
     * 是否执行成功
     */
    private String issuccess;

    /**
     * 返回信息
     */
    private String msg;
}
