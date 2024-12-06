package io.github.ieu.jst.order;

@lombok.Data
public class JstSplitDrpOrderResponse {

    /**
     * 拆分后的内部订单号
     */
    private java.util.List<Number> data;

    /**
     * 返回码0表示成功
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
