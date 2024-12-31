package io.github.ieu.jst.base;

public class JstQueryLogisticsCompanySpec {

    private final JstBaseClient client;

    private final JstQueryLogisticsCompanyRequest.JstQueryLogisticsCompanyRequestBuilder requestBuilder = JstQueryLogisticsCompanyRequest.builder();

    public JstQueryLogisticsCompanySpec(JstBaseClient client) {
        this.client = client;
    }

    /**
     * 第几页，默认第一页开始
     */
    public JstQueryLogisticsCompanySpec pageIndex(Integer pageIndex) {
        requestBuilder.pageIndex(pageIndex);
        return this;
    }

    /**
     * 每页多少条，默认30条，最大50条
     */
    public JstQueryLogisticsCompanySpec pageSize(Integer pageSize) {
        requestBuilder.pageSize(pageSize);
        return this;
    }

    /**
     * 修改起始时间
     */
    public JstQueryLogisticsCompanySpec modifiedBegin(String modifiedBegin) {
        requestBuilder.modifiedBegin(modifiedBegin);
        return this;
    }

    /**
     * 修改结束时间
     */
    public JstQueryLogisticsCompanySpec modifiedEnd(String modifiedEnd) {
        requestBuilder.modifiedEnd(modifiedEnd);
        return this;
    }

    /**
     * 公司编号，该值存在时查询对应公司或分仓下的启用的物流公司信息，否则查询系统内所有的物流公司信息
     */
    public JstQueryLogisticsCompanySpec wmsCoId(Integer wmsCoId) {
        requestBuilder.wmsCoId(wmsCoId);
        return this;
    }

    public JstQueryLogisticsCompanyResponse response() {
        return this.client.queryLogisticsCompany(requestBuilder.build());
    }
}
