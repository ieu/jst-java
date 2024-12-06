package io.github.ieu.jst.base;

@lombok.Data
@lombok.Builder
public class JstQueryMySupplierByPartnerChannelRequest {

    /**
     * 合作状态-0:待授权；1:待审核；2:合作中;3:已拒绝；4:已终止
     */
    private Number status;

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/a6728c86-d446-4958-9979-92072e8f6ab2_2173_333.png" target="_blank">供应商名称</a></div>
     */
    private String coName;

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/bf26d89f-d1f7-439e-b773-2f125e57764f_1534_487.png" target="_blank">供应商编码</a></div>
     */
    private String supplierCoId;

    /**
     * 页数
     */
    private Number pageNum;

    /**
     * 每页数量，最大100
     */
    private Number pageSize;
}
