package io.github.ieu.jst.otherstocking;

public class JstCancelOtherInOutSpec {

    private final JstOtherStockingClient client;

    private final JstCancelOtherInOutRequest.JstCancelOtherInOutRequestBuilder requestBuilder = JstCancelOtherInOutRequest.builder();

    public JstCancelOtherInOutSpec(JstOtherStockingClient client) {
        this.client = client;
    }

    /**
     * 出仓单号，与线上单号不能同时为空，两者都存在时取io_ids，最多20个
     */
    public JstCancelOtherInOutSpec ioIds(java.util.List<String> ioIds) {
        requestBuilder.ioIds(ioIds);
        return this;
    }

    /**
     * 线上单号，与出仓单号不能同时为空，两者都存在时取io_ids，最多20个
     */
    public JstCancelOtherInOutSpec soIds(java.util.List<String> soIds) {
        requestBuilder.soIds(soIds);
        return this;
    }

    /**
     * 分仓单据需传入分仓编号
     */
    public JstCancelOtherInOutSpec wmsCoId(String wmsCoId) {
        requestBuilder.wmsCoId(wmsCoId);
        return this;
    }

    /**
     * 操作  1:审核 2:取消审核 3:作废 4:确认生效（如果不传默认3作废操作）
     */
    public JstCancelOtherInOutSpec operateType(String operateType) {
        requestBuilder.operateType(operateType);
        return this;
    }

    public JstCancelOtherInOutResponse response() {
        return this.client.cancelOtherInOut(requestBuilder.build());
    }
}
