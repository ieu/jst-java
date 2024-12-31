package io.github.ieu.jst.supplychainopen;

public class JstQueryOssSignatureSpec {

    private final JstSupplyChainOpenClient client;

    private final JstQueryOssSignatureRequest.JstQueryOssSignatureRequestBuilder requestBuilder = JstQueryOssSignatureRequest.builder();

    public JstQueryOssSignatureSpec(JstSupplyChainOpenClient client) {
        this.client = client;
    }

    public JstQueryOssSignatureResponse response() {
        return this.client.queryOssSignature(requestBuilder.build());
    }
}
