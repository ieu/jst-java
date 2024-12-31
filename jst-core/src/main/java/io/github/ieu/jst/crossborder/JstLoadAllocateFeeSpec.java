package io.github.ieu.jst.crossborder;

public class JstLoadAllocateFeeSpec {

    private final JstCrossBorderClient client;

    private final JstLoadAllocateFeeRequest.JstLoadAllocateFeeRequestBuilder requestBuilder = JstLoadAllocateFeeRequest.builder();

    public JstLoadAllocateFeeSpec(JstCrossBorderClient client) {
        this.client = client;
    }

    /**
     * 修改起始时间
     */
    public JstLoadAllocateFeeSpec modifyStartTime(String modifyStartTime) {
        requestBuilder.modifyStartTime(modifyStartTime);
        return this;
    }

    /**
     * 修改结束时间
     */
    public JstLoadAllocateFeeSpec modifyEndTime(String modifyEndTime) {
        requestBuilder.modifyEndTime(modifyEndTime);
        return this;
    }

    /**
     * 页大小
     */
    public JstLoadAllocateFeeSpec pageSize(Integer pageSize) {
        requestBuilder.pageSize(pageSize);
        return this;
    }

    /**
     * 第几页
     */
    public JstLoadAllocateFeeSpec pageNum(Integer pageNum) {
        requestBuilder.pageNum(pageNum);
        return this;
    }

    /**
     * 调拨单号
     */
    public JstLoadAllocateFeeSpec ioIds(java.util.List<Number> ioIds) {
        requestBuilder.ioIds(ioIds);
        return this;
    }

    public JstLoadAllocateFeeResponse response() {
        return this.client.loadAllocateFee(requestBuilder.build());
    }
}
