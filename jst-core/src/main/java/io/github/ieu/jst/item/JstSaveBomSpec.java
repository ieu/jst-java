package io.github.ieu.jst.item;

public class JstSaveBomSpec {

    private final JstItemClient client;

    private final JstSaveBomRequest.JstSaveBomRequestBuilder requestBuilder = JstSaveBomRequest.builder();

    public JstSaveBomSpec(JstItemClient client) {
        this.client = client;
    }

    /**
     * 商品主料集合
     */
    public JstSaveBomSpec bomList(java.util.List<JstSaveBomRequest.Bom> bomList) {
        requestBuilder.bomList(bomList);
        return this;
    }

    /**
     * 商品辅料集合
     */
    public JstSaveBomSpec minorList(java.util.List<JstSaveBomRequest.Minor> minorList) {
        requestBuilder.minorList(minorList);
        return this;
    }

    public JstSaveBomResponse response() {
        return this.client.saveBom(requestBuilder.build());
    }
}
