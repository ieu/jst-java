package io.github.ieu.jst.order;

@lombok.Data
@lombok.Builder
public class JstUploadModifyWmsOrderRequest {

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/deab32f3-191d-43c8-b213-343bb82070e1_2161_433.png" target="_blank">ERP内部订单号</a></div>
     */
    private Number oId;

    /**
     * 仓库编码
     */
    private Number wmsCoId;
}
