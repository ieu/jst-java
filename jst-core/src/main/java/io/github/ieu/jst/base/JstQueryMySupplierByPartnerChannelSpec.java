package io.github.ieu.jst.base;

public class JstQueryMySupplierByPartnerChannelSpec {

    private final JstBaseClient client;

    private final JstQueryMySupplierByPartnerChannelRequest.JstQueryMySupplierByPartnerChannelRequestBuilder requestBuilder = JstQueryMySupplierByPartnerChannelRequest.builder();

    public JstQueryMySupplierByPartnerChannelSpec(JstBaseClient client) {
        this.client = client;
    }

    /**
     * 合作状态-0:待授权；1:待审核；2:合作中;3:已拒绝；4:已终止
     */
    public JstQueryMySupplierByPartnerChannelSpec status(Number status) {
        requestBuilder.status(status);
        return this;
    }

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/a6728c86-d446-4958-9979-92072e8f6ab2_2173_333.png" target="_blank">供应商名称</a></div>
     */
    public JstQueryMySupplierByPartnerChannelSpec coName(String coName) {
        requestBuilder.coName(coName);
        return this;
    }

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/bf26d89f-d1f7-439e-b773-2f125e57764f_1534_487.png" target="_blank">供应商编码</a></div>
     */
    public JstQueryMySupplierByPartnerChannelSpec supplierCoId(String supplierCoId) {
        requestBuilder.supplierCoId(supplierCoId);
        return this;
    }

    /**
     * 页数
     */
    public JstQueryMySupplierByPartnerChannelSpec pageNum(Number pageNum) {
        requestBuilder.pageNum(pageNum);
        return this;
    }

    /**
     * 每页数量，最大100
     */
    public JstQueryMySupplierByPartnerChannelSpec pageSize(Number pageSize) {
        requestBuilder.pageSize(pageSize);
        return this;
    }

    public JstQueryMySupplierByPartnerChannelResponse response() {
        return this.client.queryMySupplierByPartnerChannel(requestBuilder.build());
    }
}
