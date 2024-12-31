package io.github.ieu.jst.finance;

public class JstQueryShengsuanPaymentSpec {

    private final JstFinanceClient client;

    private final JstQueryShengsuanPaymentRequest.JstQueryShengsuanPaymentRequestBuilder requestBuilder = JstQueryShengsuanPaymentRequest.builder();

    public JstQueryShengsuanPaymentSpec(JstFinanceClient client) {
        this.client = client;
    }

    /**
     * 第几页
     */
    public JstQueryShengsuanPaymentSpec pageIndex(Integer pageIndex) {
        requestBuilder.pageIndex(pageIndex);
        return this;
    }

    /**
     * 每页多少条
     */
    public JstQueryShengsuanPaymentSpec pageSize(Integer pageSize) {
        requestBuilder.pageSize(pageSize);
        return this;
    }

    /**
     * 开始时间
     */
    public JstQueryShengsuanPaymentSpec startTime(String startTime) {
        requestBuilder.startTime(startTime);
        return this;
    }

    /**
     * 结束时间
     */
    public JstQueryShengsuanPaymentSpec endTime(String endTime) {
        requestBuilder.endTime(endTime);
        return this;
    }

    public JstQueryShengsuanPaymentResponse response() {
        return this.client.queryShengsuanPayment(requestBuilder.build());
    }
}
