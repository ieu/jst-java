package io.github.ieu.jst.base;

@lombok.Data
public class JstGetCompanyUsersResponse {

    private Integer code;

    private Pagination data;

    private String msg;

    private String requestid;

    @lombok.Data
    public static class Pagination {

        /**
         * 当前页
         */
        private String currentPage;

        /**
         * 每页数
         */
        private String pageSize;

        /**
         * 总条数
         */
        private String count;

        /**
         * 总页数
         */
        private String pages;

        /**
         * 用户数据
         */
        private java.util.List<Data> datas;

        @lombok.Data
        public static class Data {

            /**
             * 用户编码
             */
            private Number uId;

            /**
             * 用户名称
             */
            private String name;

            /**
             * 状态
             */
            private String enabled;

            /**
             * 创建时间
             */
            private String created;

            /**
             * 修改时间
             */
            private String modified;

            /**
             * 最后登录时间
             */
            private String lastLoginTime;

            /**
             * 所属分组名称
             */
            private java.util.List<String> ugNames;

            /**
             * 所属分组id
             */
            private String ugIds;

            /**
             * 角色名称列表
             */
            private String roles;

            /**
             * 角色id列表
             */
            private String roleids;

            /**
             * 密码修改时间
             */
            private String pwdModified;

            /**
             * 备注
             */
            private String remark;

            /**
             * 工号
             */
            private String empid;

            /**
             * 创建人
             */
            private String creator;

            /**
             * 修改人
             */
            private String modifier;
        }
    }
}
