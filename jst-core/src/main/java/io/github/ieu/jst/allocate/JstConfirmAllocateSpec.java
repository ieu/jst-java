package io.github.ieu.jst.allocate;

public class JstConfirmAllocateSpec {

    private final JstAllocateClient client;

    private final JstConfirmAllocateRequest.JstConfirmAllocateRequestBuilder requestBuilder = JstConfirmAllocateRequest.builder();

    public JstConfirmAllocateSpec(JstAllocateClient client) {
        this.client = client;
    }

    /**
     * 调拨单号
     */
    public JstConfirmAllocateSpec ioId(Integer ioId) {
        requestBuilder.ioId(ioId);
        return this;
    }

    /**
     * 分仓id（当单据为分仓调拨单时仓库编码必填）
     */
    public JstConfirmAllocateSpec wmsCoId(Integer wmsCoId) {
        requestBuilder.wmsCoId(wmsCoId);
        return this;
    }

    /**
     * 备注
     */
    public JstConfirmAllocateSpec remark(String remark) {
        requestBuilder.remark(remark);
        return this;
    }

    /**
     * 是否强制调拨
     */
    public JstConfirmAllocateSpec isForce(Boolean isForce) {
        requestBuilder.isForce(isForce);
        return this;
    }

    /**
     * 商品集合
     */
    public JstConfirmAllocateSpec items(java.util.List<JstConfirmAllocateRequest.Item> items) {
        requestBuilder.items(items);
        return this;
    }

    public JstConfirmAllocateResponse response() {
        return this.client.confirmAllocate(requestBuilder.build());
    }
}
