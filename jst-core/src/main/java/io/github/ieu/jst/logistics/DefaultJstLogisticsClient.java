package io.github.ieu.jst.logistics;

import io.github.ieu.jst.AbstractJstBizClient;
import io.github.ieu.jst.JstConfiguration;

/**
 * 物流API
 */
public class DefaultJstLogisticsClient extends AbstractJstBizClient implements JstLogisticsClient {

    public DefaultJstLogisticsClient(JstConfiguration configuration) {
        super(configuration);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=5&docId=23">批量快递登记</a>
     */
    @Override
    public JstUploadExpressRegisterResponse uploadExpressRegister(java.util.List<JstUploadExpressRegisterRequest> request) {
        return execute("/open/express/register/upload", request, JstUploadExpressRegisterResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=5&docId=24">称重并发货/快递分拣</a>
     */
    @Override
    public JstUploadOrderWeightSendResponse uploadOrderWeightSend(java.util.List<JstUploadOrderWeightSendRequest> request) {
        return execute("/open/orders/weight/send/upload", request, JstUploadOrderWeightSendResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=5&docId=25">发货信息查询</a>
     */
    @Override
    public JstQueryLogisticResponse queryLogistic(JstQueryLogisticRequest request) {
        return execute("/open/logistic/query", request, JstQueryLogisticResponse.class);
    }
}
