package io.github.ieu.jst.item;

@lombok.Data
@lombok.Builder
public class JstGetSupplierSkuListRequest {

    /**
     * 商品编码
     */
    private String skuid;

    /**
     * 款式编码
     */
    private String iid;

    /**
     * 供应商id
     */
    private Number supplierId;

    /**
     * 最早创建时间
     */
    private String begin;

    /**
     * 最晚创建时间
     */
    private String end;

    /**
     * 当前分页
     */
    private Number currentPage;

    /**
     * 分页数
     */
    private Number pageSize;
}
