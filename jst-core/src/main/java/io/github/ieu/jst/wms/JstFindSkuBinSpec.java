package io.github.ieu.jst.wms;

public class JstFindSkuBinSpec {

    private final JstWmsClient client;

    private final JstFindSkuBinRequest.JstFindSkuBinRequestBuilder requestBuilder = JstFindSkuBinRequest.builder();

    public JstFindSkuBinSpec(JstWmsClient client) {
        this.client = client;
    }

    public JstFindSkuBinSpec packId(String packId) {
        requestBuilder.packId(packId);
        return this;
    }

    public JstFindSkuBinResponse response() {
        return this.client.findSkuBin(requestBuilder.build());
    }
}
