package io.github.ieu.jst.finance;

public class JstQueryShengsuanPayableSpec {

    private final JstFinanceClient client;

    private final JstQueryShengsuanPayableRequest.JstQueryShengsuanPayableRequestBuilder requestBuilder = JstQueryShengsuanPayableRequest.builder();

    public JstQueryShengsuanPayableSpec(JstFinanceClient client) {
        this.client = client;
    }

    /**
     * 第几页
     */
    public JstQueryShengsuanPayableSpec pageIndex(Number pageIndex) {
        requestBuilder.pageIndex(pageIndex);
        return this;
    }

    /**
     * 显示多少条
     */
    public JstQueryShengsuanPayableSpec pageSize(Number pageSize) {
        requestBuilder.pageSize(pageSize);
        return this;
    }

    /**
     * 开始时间
     */
    public JstQueryShengsuanPayableSpec startTime(String startTime) {
        requestBuilder.startTime(startTime);
        return this;
    }

    /**
     * 结束时间
     */
    public JstQueryShengsuanPayableSpec endTime(String endTime) {
        requestBuilder.endTime(endTime);
        return this;
    }

    /**
     * 1查应付 2查期初应付
     */
    public JstQueryShengsuanPayableSpec type(Number type) {
        requestBuilder.type(type);
        return this;
    }

    public JstQueryShengsuanPayableResponse response() {
        return this.client.queryShengsuanPayable(requestBuilder.build());
    }
}
