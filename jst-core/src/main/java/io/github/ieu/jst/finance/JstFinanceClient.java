package io.github.ieu.jst.finance;

/**
 * 财务API
 */
public interface JstFinanceClient {

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=49&docId=153">付款单查询</a>
     */
    JstQueryShengsuanPaymentResponse queryShengsuanPayment(JstQueryShengsuanPaymentRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=49&docId=153">付款单查询</a>
     */
    JstQueryShengsuanPaymentSpec queryShengsuanPayment();

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=49&docId=318">应付单查询</a>
     */
    JstQueryShengsuanPayableResponse queryShengsuanPayable(JstQueryShengsuanPayableRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=49&docId=318">应付单查询</a>
     */
    JstQueryShengsuanPayableSpec queryShengsuanPayable();
}
