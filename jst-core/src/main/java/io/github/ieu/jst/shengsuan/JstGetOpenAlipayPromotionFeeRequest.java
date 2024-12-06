package io.github.ieu.jst.shengsuan;

@lombok.Data
@lombok.Builder
public class JstGetOpenAlipayPromotionFeeRequest {

    /**
     * 时间类型
     */
    private String timeType;

    /**
     * 开始时间
     */
    private String startTime;

    /**
     * 结束时间
     */
    private String endTime;

    /**
     * 游标
     */
    private Number cursor;

    /**
     * 店铺id列表多个都好隔开10156284,10040204
     */
    private String shopIds;

    /**
     * 页大小
     */
    private Number pageSize;
}
