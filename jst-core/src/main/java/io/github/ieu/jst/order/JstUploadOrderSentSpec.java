package io.github.ieu.jst.order;

public class JstUploadOrderSentSpec {

    private final JstOrderClient client;

    private final JstUploadOrderSentRequest.JstUploadOrderSentRequestBuilder requestBuilder = JstUploadOrderSentRequest.builder();

    public JstUploadOrderSentSpec(JstOrderClient client) {
        this.client = client;
    }

    public JstUploadOrderSentSpec items(java.util.List<JstUploadOrderSentRequest.Item> items) {
        requestBuilder.items(items);
        return this;
    }

    public JstUploadOrderSentResponse response() {
        return this.client.uploadOrderSent(requestBuilder.build());
    }
}
