package io.github.ieu.jst.logistics;

import io.github.ieu.jst.AbstractJstBizClient;
import io.github.ieu.jst.JstConfiguration;
import io.github.ieu.jst.JstErrorCode;
import io.github.ieu.jst.JstServerException;

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
        JstUploadExpressRegisterResponse response = execute("/open/express/register/upload", request, JstUploadExpressRegisterResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=5&docId=23">批量快递登记</a>
     */
    @Override
    public JstUploadExpressRegisterSpec uploadExpressRegister() {
        return new JstUploadExpressRegisterSpec(this);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=5&docId=24">称重并发货/快递分拣</a>
     */
    @Override
    public JstUploadOrderWeightSendResponse uploadOrderWeightSend(java.util.List<JstUploadOrderWeightSendRequest> request) {
        JstUploadOrderWeightSendResponse response = execute("/open/orders/weight/send/upload", request, JstUploadOrderWeightSendResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=5&docId=24">称重并发货/快递分拣</a>
     */
    @Override
    public JstUploadOrderWeightSendSpec uploadOrderWeightSend() {
        return new JstUploadOrderWeightSendSpec(this);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=5&docId=25">发货信息查询</a>
     */
    @Override
    public JstQueryLogisticResponse queryLogistic(JstQueryLogisticRequest request) {
        JstQueryLogisticResponse response = execute("/open/logistic/query", request, JstQueryLogisticResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=5&docId=25">发货信息查询</a>
     */
    @Override
    public JstQueryLogisticSpec queryLogistic() {
        return new JstQueryLogisticSpec(this);
    }
}
