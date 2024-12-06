package io.github.ieu.jst.order;

/**
 * 订单API
 */
public interface JstOrderClient {

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=4&docId=944">修改订单卖家备注（按线上单号）</a>
     */
    JstSaveOrderRemarkResponse saveOrderRemark(JstSaveOrderRemarkRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=4&docId=362">订单指定发货仓</a>
     */
    JstUploadModifyWmsOrderResponse uploadModifyWmsOrder(java.util.List<JstUploadModifyWmsOrderRequest> request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=4&docId=263">订单转异常</a>
     */
    JstGetQuestionOrderQuestionsResponse getQuestionOrderQuestions(JstGetQuestionOrderQuestionsRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=4&docId=18">订单上传(商家自有商城、跨境线下)</a>
     */
    JstUploadOrdersResponse uploadOrders(java.util.List<JstUploadOrdersRequest> request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=4&docId=233">订单拆分</a>
     */
    JstSplitDrpOrderResponse splitDrpOrder(JstSplitDrpOrderRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=4&docId=196">修改订单卖家备注（按内部单号）</a>
     */
    JstUploadOrderRemarkResponse uploadOrderRemark(JstUploadOrderRemarkRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=4&docId=118">通过订单号修改线下备注</a>
     */
    JstSetOrderNodeBySoidResponse setOrderNodeBySoid(JstSetOrderNodeBySoidRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=4&docId=72">订单标签（新增/移除）</a>
     */
    JstUploadOrderLabelResponse uploadOrderLabel(JstUploadOrderLabelRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=4&docId=62">订单发货-新</a>
     */
    JstUploadOrderSentResponse uploadOrderSent(JstUploadOrderSentRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=4&docId=22">订单查询（自有商城、跨境下线）</a>
     */
    JstQuerySingleOrderResponse querySingleOrder(JstQuerySingleOrderRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=4&docId=21">订单操作日志查询</a>
     */
    JstQueryOrderActionResponse queryOrderAction(JstQueryOrderActionRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=4&docId=19">订单取消-按内部单号取消</a>
     */
    JstCancelOrderByOidResponse cancelOrderByOid(JstCancelOrderByOidRequest request);
}
