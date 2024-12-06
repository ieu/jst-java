package io.github.ieu.jst.purchase;

@lombok.Data
@lombok.Builder
public class JstQuerySupplierRequest {

    /**
     * 供应商编码
     */
    private java.util.List<String> supplierCodes;

    /**
     * 第几页，从1开始
     */
    private Integer pageIndex;

    /**
     * 默认30，最大不超过500
     */
    private Integer pageSize;

    /**
     * 修改起始时间
     */
    private String modifiedBegin;

    /**
     * 修改结束时间；当supplier ids、names、supplier codes 同时为空时，修改时间必填，且时间跨度不能超过1天
     */
    private String modifiedEnd;

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/bf26d89f-d1f7-439e-b773-2f125e57764f_1534_487.png" target="_blank">供应商内部编码</a></div>最大50条
     */
    private java.util.List<Integer> supplierIds;

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/a6728c86-d446-4958-9979-92072e8f6ab2_2173_333.png" target="_blank">供应商名称</a></div>最大50条
     */
    private java.util.List<String> names;
}
