package io.github.ieu.jst.allocate;

public class JstQueryAllocateSpec {

    private final JstAllocateClient client;

    private final JstQueryAllocateRequest.JstQueryAllocateRequestBuilder requestBuilder = JstQueryAllocateRequest.builder();

    public JstQueryAllocateSpec(JstAllocateClient client) {
        this.client = client;
    }

    /**
     * 修改起始时间，和结束时间必须同时存在，时间间隔不能超过七天，与线上单号不能同时为空
     */
    public JstQueryAllocateSpec modifiedBegin(String modifiedBegin) {
        requestBuilder.modifiedBegin(modifiedBegin);
        return this;
    }

    /**
     * 修改结束时间，和起始时间必须同时存在，时间间隔不能超过七天，与线上单号不能同时为空
     */
    public JstQueryAllocateSpec modifiedEnd(String modifiedEnd) {
        requestBuilder.modifiedEnd(modifiedEnd);
        return this;
    }

    /**
     * 指定线上订单号，和时间段不能同时为空
     */
    public JstQueryAllocateSpec soIds(java.util.List<String> soIds) {
        requestBuilder.soIds(soIds);
        return this;
    }

    /**
     * 第几页，从第一页开始，默认1
     */
    public JstQueryAllocateSpec pageIndex(Integer pageIndex) {
        requestBuilder.pageIndex(pageIndex);
        return this;
    }

    /**
     * 每页多少条，默认30，最大50
     */
    public JstQueryAllocateSpec pageSize(Integer pageSize) {
        requestBuilder.pageSize(pageSize);
        return this;
    }

    /**
     * 调拨单号
     */
    public JstQueryAllocateSpec ioIds(java.util.List<String> ioIds) {
        requestBuilder.ioIds(ioIds);
        return this;
    }

    /**
     * 调拨类型（调拨出，调拨入）
     */
    public JstQueryAllocateSpec type(String type) {
        requestBuilder.type(type);
        return this;
    }

    /**
     * 0:修改时间，modified。 2:出入库时间 io_date，未传入时默认为0
     */
    public JstQueryAllocateSpec dateType(Number dateType) {
        requestBuilder.dateType(dateType);
        return this;
    }

    public JstQueryAllocateResponse response() {
        return this.client.queryAllocate(requestBuilder.build());
    }
}
