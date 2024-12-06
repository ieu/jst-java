package io.github.ieu.jst.stockout;

@lombok.Data
public class JstCancelPurchaseOutResponse {

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
