package io.github.ieu.jst.workorder;

/**
 * 聚工单开放API
 */
public interface JstWorkOrderClient {

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=46&docId=1011">商家更新工单数据</a>
     */
    JstUpdateWorkOrderResponse updateWorkOrder(JstUpdateWorkOrderRequest request);
}
