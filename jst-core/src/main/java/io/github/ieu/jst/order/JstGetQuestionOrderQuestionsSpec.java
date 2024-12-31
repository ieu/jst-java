package io.github.ieu.jst.order;

public class JstGetQuestionOrderQuestionsSpec {

    private final JstOrderClient client;

    private final JstGetQuestionOrderQuestionsRequest.JstGetQuestionOrderQuestionsRequestBuilder requestBuilder = JstGetQuestionOrderQuestionsRequest.builder();

    public JstGetQuestionOrderQuestionsSpec(JstOrderClient client) {
        this.client = client;
    }

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/deab32f3-191d-43c8-b213-343bb82070e1_2161_433.png" target="_blank">内部订单号</a></div>（与线上单号二选一必填一项），最大50个
     */
    public JstGetQuestionOrderQuestionsSpec oIds(java.util.List<Number> oIds) {
        requestBuilder.oIds(oIds);
        return this;
    }

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/e457dae3-e441-4644-860e-e070d05929df_1924_284.png" target="_blank">线上单号</a></div>（与内部单号二选一必填一项），最大50个
     */
    public JstGetQuestionOrderQuestionsSpec soIds(java.util.List<String> soIds) {
        requestBuilder.soIds(soIds);
        return this;
    }

    /**
     * 操作人，记录在订单详情日志上，不填写默认open
     */
    public JstGetQuestionOrderQuestionsSpec channel(String channel) {
        requestBuilder.channel(channel);
        return this;
    }

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/c79ab91f-2b87-4932-a647-a305824f7782_2121_1174.png" target="_blank">异常类型</a></div>也支持自定义
     */
    public JstGetQuestionOrderQuestionsSpec questionType(String questionType) {
        requestBuilder.questionType(questionType);
        return this;
    }

    /**
     * 异常描述
     */
    public JstGetQuestionOrderQuestionsSpec questionDesc(String questionDesc) {
        requestBuilder.questionDesc(questionDesc);
        return this;
    }

    public JstGetQuestionOrderQuestionsResponse response() {
        return this.client.getQuestionOrderQuestions(requestBuilder.build());
    }
}
