package io.github.ieu.jst.supplychainopen;

@lombok.Data
public class JstUpdateGoodsResponse {

    /**
     * 返回码 0表示业务处理成功
     */
    private Integer code;

    /**
     * 错误信息 商品ID不能为空
     */
    private String msg;

    /**
     * 请求ID
     */
    private String requestid;

    /**
     * 商品ID
     */
    private String data;
}
