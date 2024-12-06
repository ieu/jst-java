package io.github.ieu.jst.crossborder;

@lombok.Data
@lombok.Builder
public class JstLoadAllocateFeeRequest {

    /**
     * 修改起始时间
     */
    private String modifyStartTime;

    /**
     * 修改结束时间
     */
    private String modifyEndTime;

    /**
     * 页大小
     */
    private Integer pageSize;

    /**
     * 第几页
     */
    private Integer pageNum;

    /**
     * 调拨单号
     */
    private java.util.List<Number> ioIds;
}
