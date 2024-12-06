package io.github.ieu.jst.finance;

@lombok.Data
@lombok.Builder
public class JstQueryShengsuanPaymentRequest {

    /**
     * 第几页
     */
    private Integer pageIndex;

    /**
     * 每页多少条
     */
    private Integer pageSize;

    /**
     * 开始时间
     */
    private String startTime;

    /**
     * 结束时间
     */
    private String endTime;
}
