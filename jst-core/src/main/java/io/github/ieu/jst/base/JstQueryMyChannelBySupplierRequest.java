package io.github.ieu.jst.base;

@lombok.Data
@lombok.Builder
public class JstQueryMyChannelBySupplierRequest {

    /**
     * 合作状态-0:待授权；1:待审核；2:合作中;3:已拒绝；4:已终止
     */
    private Number status;

    /**
     * 页数
     */
    private Number pageNum;

    /**
     * 每页数量，最大100
     */
    private Number pageSize;
}
