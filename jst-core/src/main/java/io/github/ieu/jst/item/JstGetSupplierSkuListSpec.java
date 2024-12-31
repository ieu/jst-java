package io.github.ieu.jst.item;

public class JstGetSupplierSkuListSpec {

    private final JstItemClient client;

    private final JstGetSupplierSkuListRequest.JstGetSupplierSkuListRequestBuilder requestBuilder = JstGetSupplierSkuListRequest.builder();

    public JstGetSupplierSkuListSpec(JstItemClient client) {
        this.client = client;
    }

    /**
     * 商品编码
     */
    public JstGetSupplierSkuListSpec skuid(String skuid) {
        requestBuilder.skuid(skuid);
        return this;
    }

    /**
     * 款式编码
     */
    public JstGetSupplierSkuListSpec iid(String iid) {
        requestBuilder.iid(iid);
        return this;
    }

    /**
     * 供应商id
     */
    public JstGetSupplierSkuListSpec supplierId(Number supplierId) {
        requestBuilder.supplierId(supplierId);
        return this;
    }

    /**
     * 最早创建时间
     */
    public JstGetSupplierSkuListSpec begin(String begin) {
        requestBuilder.begin(begin);
        return this;
    }

    /**
     * 最晚创建时间
     */
    public JstGetSupplierSkuListSpec end(String end) {
        requestBuilder.end(end);
        return this;
    }

    /**
     * 当前分页
     */
    public JstGetSupplierSkuListSpec currentPage(Number currentPage) {
        requestBuilder.currentPage(currentPage);
        return this;
    }

    /**
     * 分页数
     */
    public JstGetSupplierSkuListSpec pageSize(Number pageSize) {
        requestBuilder.pageSize(pageSize);
        return this;
    }

    public JstGetSupplierSkuListResponse response() {
        return this.client.getSupplierSkuList(requestBuilder.build());
    }
}
