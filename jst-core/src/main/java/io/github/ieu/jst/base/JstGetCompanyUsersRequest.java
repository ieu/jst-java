package io.github.ieu.jst.base;

@lombok.Data
@lombok.Builder
public class JstGetCompanyUsersRequest {

    /**
     * 当前页
     */
    private Number currentPage;

    /**
     * 每页数
     */
    private Number pageSize;

    /**
     * 查询类型，0:查询分页列表和总数量,1:只查询分页列表,2:只查询总数量
     */
    private Number pageAction;

    /**
     * 用户状态
     */
    private Boolean enabled;

    /**
     * 版本号(默认只返回u_id，name，enabled，created，modified；如需返回分组等信息这个值需要传2)
     */
    private Number version;

    /**
     * 查询的登录账号
     */
    private String loginid;

    /**
     * 创建开始时间
     */
    private String creatdBegin;

    /**
     * 创建结束时间
     */
    private String creatdEnd;
}
