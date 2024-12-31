package io.github.ieu.jst.allocate;

public class JstCancelAllocateV2Spec {

    private final JstAllocateClient client;

    private final JstCancelAllocateV2Request.JstCancelAllocateV2RequestBuilder requestBuilder = JstCancelAllocateV2Request.builder();

    public JstCancelAllocateV2Spec(JstAllocateClient client) {
        this.client = client;
    }

    /**
     * 调拨出库单号
     */
    public JstCancelAllocateV2Spec ioId(Number ioId) {
        requestBuilder.ioId(ioId);
        return this;
    }

    public JstCancelAllocateV2Response response() {
        return this.client.cancelAllocateV2(requestBuilder.build());
    }
}
