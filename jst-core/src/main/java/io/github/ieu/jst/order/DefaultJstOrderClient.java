package io.github.ieu.jst.order;

import io.github.ieu.jst.AbstractJstBizClient;
import io.github.ieu.jst.JstConfiguration;
import io.github.ieu.jst.JstErrorCode;
import io.github.ieu.jst.JstServerException;

/**
 * 订单API
 */
public class DefaultJstOrderClient extends AbstractJstBizClient implements JstOrderClient {

    public DefaultJstOrderClient(JstConfiguration configuration) {
        super(configuration);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=4&docId=944">修改订单卖家备注（按线上单号）</a>
     */
    @Override
    public JstSaveOrderRemarkResponse saveOrderRemark(JstSaveOrderRemarkRequest request) {
        JstSaveOrderRemarkResponse response = execute("/open/webapi/orderapi/modifyorder/saveremark", request, JstSaveOrderRemarkResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=4&docId=362">订单指定发货仓</a>
     */
    @Override
    public JstUploadModifyWmsOrderResponse uploadModifyWmsOrder(java.util.List<JstUploadModifyWmsOrderRequest> request) {
        JstUploadModifyWmsOrderResponse response = execute("/open/orders/modifywms/upload", request, JstUploadModifyWmsOrderResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=4&docId=263">订单转异常</a>
     */
    @Override
    public JstGetQuestionOrderQuestionsResponse getQuestionOrderQuestions(JstGetQuestionOrderQuestionsRequest request) {
        JstGetQuestionOrderQuestionsResponse response = execute("/open/webapi/orderapi/questionorder/questions", request, JstGetQuestionOrderQuestionsResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=4&docId=18">订单上传(商家自有商城、跨境线下)</a>
     */
    @Override
    public JstUploadOrdersResponse uploadOrders(java.util.List<JstUploadOrdersRequest> request) {
        JstUploadOrdersResponse response = execute("/open/jushuitan/orders/upload", request, JstUploadOrdersResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=4&docId=233">订单拆分</a>
     */
    @Override
    public JstSplitDrpOrderResponse splitDrpOrder(JstSplitDrpOrderRequest request) {
        JstSplitDrpOrderResponse response = execute("/open/jushuitan/drporder/split", request, JstSplitDrpOrderResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=4&docId=196">修改订单卖家备注（按内部单号）</a>
     */
    @Override
    public JstUploadOrderRemarkResponse uploadOrderRemark(JstUploadOrderRemarkRequest request) {
        JstUploadOrderRemarkResponse response = execute("/open/jushuitan/order/remark/upload", request, JstUploadOrderRemarkResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=4&docId=118">通过订单号修改线下备注</a>
     */
    @Override
    public JstSetOrderNodeBySoidResponse setOrderNodeBySoid(JstSetOrderNodeBySoidRequest request) {
        JstSetOrderNodeBySoidResponse response = execute("/open/order/node/soid/set", request, JstSetOrderNodeBySoidResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=4&docId=72">订单标签（新增/移除）</a>
     */
    @Override
    public JstUploadOrderLabelResponse uploadOrderLabel(JstUploadOrderLabelRequest request) {
        JstUploadOrderLabelResponse response = execute("/open/jushuitan/order/label/upload", request, JstUploadOrderLabelResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=4&docId=62">订单发货-新</a>
     */
    @Override
    public JstUploadOrderSentResponse uploadOrderSent(JstUploadOrderSentRequest request) {
        JstUploadOrderSentResponse response = execute("/open/order/sent/upload", request, JstUploadOrderSentResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=4&docId=22">订单查询（自有商城、跨境下线）</a>
     */
    @Override
    public JstQuerySingleOrderResponse querySingleOrder(JstQuerySingleOrderRequest request) {
        JstQuerySingleOrderResponse response = execute("/open/orders/single/query", request, JstQuerySingleOrderResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=4&docId=21">订单操作日志查询</a>
     */
    @Override
    public JstQueryOrderActionResponse queryOrderAction(JstQueryOrderActionRequest request) {
        JstQueryOrderActionResponse response = execute("/open/order/action/query", request, JstQueryOrderActionResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=4&docId=19">订单取消-按内部单号取消</a>
     */
    @Override
    public JstCancelOrderByOidResponse cancelOrderByOid(JstCancelOrderByOidRequest request) {
        JstCancelOrderByOidResponse response = execute("/open/jushuitan/orderbyoid/cancel", request, JstCancelOrderByOidResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }
}
