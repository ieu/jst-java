package io.github.ieu.jst.workorder;

import io.github.ieu.jst.AbstractJstBizClient;
import io.github.ieu.jst.JstConfiguration;
import io.github.ieu.jst.JstErrorCode;
import io.github.ieu.jst.JstServerException;

/**
 * 聚工单开放API
 */
public class DefaultJstWorkOrderClient extends AbstractJstBizClient implements JstWorkOrderClient {

    public DefaultJstWorkOrderClient(JstConfiguration configuration) {
        super(configuration);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=46&docId=1011">商家更新工单数据</a>
     */
    @Override
    public JstUpdateWorkOrderResponse updateWorkOrder(JstUpdateWorkOrderRequest request) {
        JstUpdateWorkOrderResponse response = execute("/open/api/gd/open/workorder/updateworkorder", request, JstUpdateWorkOrderResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }
}
