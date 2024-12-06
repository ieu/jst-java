package io.github.ieu.jst.order;

@lombok.Data
@lombok.Builder
public class JstGetQuestionOrderQuestionsRequest {

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/deab32f3-191d-43c8-b213-343bb82070e1_2161_433.png" target="_blank">内部订单号</a></div>（与线上单号二选一必填一项），最大50个
     */
    private java.util.List<Number> oIds;

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/e457dae3-e441-4644-860e-e070d05929df_1924_284.png" target="_blank">线上单号</a></div>（与内部单号二选一必填一项），最大50个
     */
    private java.util.List<String> soIds;

    /**
     * 操作人，记录在订单详情日志上，不填写默认open
     */
    private String channel;

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/c79ab91f-2b87-4932-a647-a305824f7782_2121_1174.png" target="_blank">异常类型</a></div>也支持自定义
     */
    private String questionType;

    /**
     * 异常描述
     */
    private String questionDesc;
}
