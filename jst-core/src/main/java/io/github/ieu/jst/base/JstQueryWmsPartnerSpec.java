package io.github.ieu.jst.base;

public class JstQueryWmsPartnerSpec {

    private final JstBaseClient client;

    private final JstQueryWmsPartnerRequest.JstQueryWmsPartnerRequestBuilder requestBuilder = JstQueryWmsPartnerRequest.builder();

    public JstQueryWmsPartnerSpec(JstBaseClient client) {
        this.client = client;
    }

    /**
     * 第几页，默认第一页开始
     */
    public JstQueryWmsPartnerSpec pageIndex(Integer pageIndex) {
        requestBuilder.pageIndex(pageIndex);
        return this;
    }

    /**
     * 每页多少条，非必填项，默认30条
     */
    public JstQueryWmsPartnerSpec pageSize(Integer pageSize) {
        requestBuilder.pageSize(pageSize);
        return this;
    }

    public JstQueryWmsPartnerResponse response() {
        return this.client.queryWmsPartner(requestBuilder.build());
    }
}
