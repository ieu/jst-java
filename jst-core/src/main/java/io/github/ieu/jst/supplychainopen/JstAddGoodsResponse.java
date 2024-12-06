package io.github.ieu.jst.supplychainopen;

@lombok.Data
public class JstAddGoodsResponse {

    /**
     * 返回码 0表示业务处理成功
     */
    private Integer code;

    /**
     * 错误信息 商品名称不能为空
     */
    private String msg;

    /**
     * 商品ID
     */
    private String data;
}
