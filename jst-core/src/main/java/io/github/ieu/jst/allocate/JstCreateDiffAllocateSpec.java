package io.github.ieu.jst.allocate;

public class JstCreateDiffAllocateSpec {

    private final JstAllocateClient client;

    private final JstCreateDiffAllocateRequest.JstCreateDiffAllocateRequestBuilder requestBuilder = JstCreateDiffAllocateRequest.builder();

    public JstCreateDiffAllocateSpec(JstAllocateClient client) {
        this.client = client;
    }

    /**
     * 调拨入单号
     */
    public JstCreateDiffAllocateSpec ioId(String ioId) {
        requestBuilder.ioId(ioId);
        return this;
    }

    /**
     * 商品集合
     */
    public JstCreateDiffAllocateSpec items(java.util.List<JstCreateDiffAllocateRequest.Item> items) {
        requestBuilder.items(items);
        return this;
    }

    public JstCreateDiffAllocateResponse response() {
        return this.client.createDiffAllocate(requestBuilder.build());
    }
}
