package io.github.ieu.jst.order;

@lombok.Data
@lombok.Builder
public class JstCancelOrderByOidRequest {

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/deab32f3-191d-43c8-b213-343bb82070e1_2161_433.png" target="_blank">内部订单号</a></div>一次最大支持50条
     */
    private java.util.List<Integer> oIds;

    /**
     * 取消类型
     */
    private String cancelType;

    /**
     * 备注
     */
    private String remark;
}
