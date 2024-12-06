package io.github.ieu.jst.base;

@lombok.Data
@lombok.Builder
public class JstQueryWmsPartnerRequest {

    /**
     * 第几页，默认第一页开始
     */
    private Integer pageIndex;

    /**
     * 每页多少条，非必填项，默认30条
     */
    private Integer pageSize;
}
