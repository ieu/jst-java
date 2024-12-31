package io.github.ieu.jst.purchase;

public class JstQuerySupplierSpec {

    private final JstPurchaseClient client;

    private final JstQuerySupplierRequest.JstQuerySupplierRequestBuilder requestBuilder = JstQuerySupplierRequest.builder();

    public JstQuerySupplierSpec(JstPurchaseClient client) {
        this.client = client;
    }

    /**
     * 供应商编码
     */
    public JstQuerySupplierSpec supplierCodes(java.util.List<String> supplierCodes) {
        requestBuilder.supplierCodes(supplierCodes);
        return this;
    }

    /**
     * 第几页，从1开始
     */
    public JstQuerySupplierSpec pageIndex(Integer pageIndex) {
        requestBuilder.pageIndex(pageIndex);
        return this;
    }

    /**
     * 默认30，最大不超过500
     */
    public JstQuerySupplierSpec pageSize(Integer pageSize) {
        requestBuilder.pageSize(pageSize);
        return this;
    }

    /**
     * 修改起始时间
     */
    public JstQuerySupplierSpec modifiedBegin(String modifiedBegin) {
        requestBuilder.modifiedBegin(modifiedBegin);
        return this;
    }

    /**
     * 修改结束时间；当supplier ids、names、supplier codes 同时为空时，修改时间必填，且时间跨度不能超过1天
     */
    public JstQuerySupplierSpec modifiedEnd(String modifiedEnd) {
        requestBuilder.modifiedEnd(modifiedEnd);
        return this;
    }

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/bf26d89f-d1f7-439e-b773-2f125e57764f_1534_487.png" target="_blank">供应商内部编码</a></div>最大50条
     */
    public JstQuerySupplierSpec supplierIds(java.util.List<Integer> supplierIds) {
        requestBuilder.supplierIds(supplierIds);
        return this;
    }

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/a6728c86-d446-4958-9979-92072e8f6ab2_2173_333.png" target="_blank">供应商名称</a></div>最大50条
     */
    public JstQuerySupplierSpec names(java.util.List<String> names) {
        requestBuilder.names(names);
        return this;
    }

    public JstQuerySupplierResponse response() {
        return this.client.querySupplier(requestBuilder.build());
    }
}
