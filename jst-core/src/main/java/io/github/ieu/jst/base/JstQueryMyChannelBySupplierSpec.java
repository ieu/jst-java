package io.github.ieu.jst.base;

public class JstQueryMyChannelBySupplierSpec {

    private final JstBaseClient client;

    private final JstQueryMyChannelBySupplierRequest.JstQueryMyChannelBySupplierRequestBuilder requestBuilder = JstQueryMyChannelBySupplierRequest.builder();

    public JstQueryMyChannelBySupplierSpec(JstBaseClient client) {
        this.client = client;
    }

    /**
     * 合作状态-0:待授权；1:待审核；2:合作中;3:已拒绝；4:已终止
     */
    public JstQueryMyChannelBySupplierSpec status(Number status) {
        requestBuilder.status(status);
        return this;
    }

    /**
     * 页数
     */
    public JstQueryMyChannelBySupplierSpec pageNum(Number pageNum) {
        requestBuilder.pageNum(pageNum);
        return this;
    }

    /**
     * 每页数量，最大100
     */
    public JstQueryMyChannelBySupplierSpec pageSize(Number pageSize) {
        requestBuilder.pageSize(pageSize);
        return this;
    }

    public JstQueryMyChannelBySupplierResponse response() {
        return this.client.queryMyChannelBySupplier(requestBuilder.build());
    }
}
