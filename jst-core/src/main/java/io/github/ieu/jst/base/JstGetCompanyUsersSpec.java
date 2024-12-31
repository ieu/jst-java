package io.github.ieu.jst.base;

public class JstGetCompanyUsersSpec {

    private final JstBaseClient client;

    private final JstGetCompanyUsersRequest.JstGetCompanyUsersRequestBuilder requestBuilder = JstGetCompanyUsersRequest.builder();

    public JstGetCompanyUsersSpec(JstBaseClient client) {
        this.client = client;
    }

    /**
     * 当前页
     */
    public JstGetCompanyUsersSpec currentPage(Number currentPage) {
        requestBuilder.currentPage(currentPage);
        return this;
    }

    /**
     * 每页数
     */
    public JstGetCompanyUsersSpec pageSize(Number pageSize) {
        requestBuilder.pageSize(pageSize);
        return this;
    }

    /**
     * 查询类型，0:查询分页列表和总数量,1:只查询分页列表,2:只查询总数量
     */
    public JstGetCompanyUsersSpec pageAction(Number pageAction) {
        requestBuilder.pageAction(pageAction);
        return this;
    }

    /**
     * 用户状态
     */
    public JstGetCompanyUsersSpec enabled(Boolean enabled) {
        requestBuilder.enabled(enabled);
        return this;
    }

    /**
     * 版本号(默认只返回u_id，name，enabled，created，modified；如需返回分组等信息这个值需要传2)
     */
    public JstGetCompanyUsersSpec version(Number version) {
        requestBuilder.version(version);
        return this;
    }

    /**
     * 查询的登录账号
     */
    public JstGetCompanyUsersSpec loginId(String loginId) {
        requestBuilder.loginId(loginId);
        return this;
    }

    /**
     * 创建开始时间
     */
    public JstGetCompanyUsersSpec creatdBegin(String creatdBegin) {
        requestBuilder.creatdBegin(creatdBegin);
        return this;
    }

    /**
     * 创建结束时间
     */
    public JstGetCompanyUsersSpec creatdEnd(String creatdEnd) {
        requestBuilder.creatdEnd(creatdEnd);
        return this;
    }

    public JstGetCompanyUsersResponse response() {
        return this.client.getCompanyUsers(requestBuilder.build());
    }
}
