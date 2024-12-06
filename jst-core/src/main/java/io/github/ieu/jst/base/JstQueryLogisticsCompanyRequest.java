package io.github.ieu.jst.base;

@lombok.Data
@lombok.Builder
public class JstQueryLogisticsCompanyRequest {

    /**
     * 第几页，默认第一页开始
     */
    private Integer pageIndex;

    /**
     * 每页多少条，默认30条，最大50条
     */
    private Integer pageSize;

    /**
     * 修改起始时间
     */
    private String modifiedBegin;

    /**
     * 修改结束时间
     */
    private String modifiedEnd;

    /**
     * 公司编号，该值存在时查询对应公司或分仓下的启用的物流公司信息，否则查询系统内所有的物流公司信息
     */
    private Integer wmsCoId;
}
