package io.github.ieu.jst.finance;

@lombok.Data
@lombok.Builder
public class JstQueryShengsuanPayableRequest {

    /**
     * 第几页
     */
    private Number pageIndex;

    /**
     * 显示多少条
     */
    private Number pageSize;

    /**
     * 开始时间
     */
    private String startTime;

    /**
     * 结束时间
     */
    private String endTime;

    /**
     * 1查应付 2查期初应付
     */
    private Number type;
}
