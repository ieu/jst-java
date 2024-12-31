package io.github.ieu.jst.aftersale;

public class JstUploadNoInfoAfterSaleSpec {

    private final JstAfterSaleClient client;

    private final JstUploadNoInfoAfterSaleRequest.JstUploadNoInfoAfterSaleRequestBuilder requestBuilder = JstUploadNoInfoAfterSaleRequest.builder();

    public JstUploadNoInfoAfterSaleSpec(JstAfterSaleClient client) {
        this.client = client;
    }

    public JstUploadNoInfoAfterSaleSpec data(java.util.List<JstUploadNoInfoAfterSaleRequest.Data> data) {
        requestBuilder.data(data);
        return this;
    }

    public JstUploadNoInfoAfterSaleResponse response() {
        return this.client.uploadNoInfoAfterSale(requestBuilder.build());
    }
}
