package io.github.ieu.jst.finance;

import io.github.ieu.jst.AbstractJstBizClient;
import io.github.ieu.jst.JstConfiguration;
import io.github.ieu.jst.JstErrorCode;
import io.github.ieu.jst.JstServerException;

/**
 * 财务API
 */
public class DefaultJstFinanceClient extends AbstractJstBizClient implements JstFinanceClient {

    public DefaultJstFinanceClient(JstConfiguration configuration) {
        super(configuration);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=49&docId=153">付款单查询</a>
     */
    @Override
    public JstQueryShengsuanPaymentResponse queryShengsuanPayment(JstQueryShengsuanPaymentRequest request) {
        JstQueryShengsuanPaymentResponse response = execute("/open/jushuitan/shengsuan/payment/query", request, JstQueryShengsuanPaymentResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=49&docId=318">应付单查询</a>
     */
    @Override
    public JstQueryShengsuanPayableResponse queryShengsuanPayable(JstQueryShengsuanPayableRequest request) {
        JstQueryShengsuanPayableResponse response = execute("/open/jushuitan/shengsuan/payable/query", request, JstQueryShengsuanPayableResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }
}
