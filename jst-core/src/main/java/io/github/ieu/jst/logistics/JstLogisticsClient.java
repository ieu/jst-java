package io.github.ieu.jst.logistics;

/**
 * 物流API
 */
public interface JstLogisticsClient {

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=5&docId=23">批量快递登记</a>
     */
    JstUploadExpressRegisterResponse uploadExpressRegister(java.util.List<JstUploadExpressRegisterRequest> request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=5&docId=24">称重并发货/快递分拣</a>
     */
    JstUploadOrderWeightSendResponse uploadOrderWeightSend(java.util.List<JstUploadOrderWeightSendRequest> request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=5&docId=25">发货信息查询</a>
     */
    JstQueryLogisticResponse queryLogistic(JstQueryLogisticRequest request);
}
