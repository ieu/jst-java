package io.github.ieu.jst.base;

@lombok.Data
public class JstQueryShopsResponse {

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 错误描述
     */
    private String msg;

    private Pagination data;

    @lombok.Data
    public static class Pagination {

        /**
         * 第几页
         */
        private Integer pageIndex;

        /**
         * 每页多少条
         */
        private Integer pageSize;

        /**
         * 是否有下一页
         */
        private Boolean hasNext;

        /**
         * 店铺列表
         */
        private java.util.List<Data> datas;

        @lombok.Data
        public static class Data {

            /**
             * 店铺编号
             */
            private Integer shopId;

            /**
             * 店铺名称
             */
            private String shopName;

            /**
             * 公司编号
             */
            private Integer coId;

            /**
             * 店铺站点（https://openweb.jushuitan.com/doc?docId=338）
             */
            private String shopSite;

            /**
             * 店铺网址
             */
            private String shopUrl;

            /**
             * 创建时间
             */
            private String created;

            /**
             * 主账号
             */
            private String nick;

            /**
             * 授权过期时间
             */
            private String sessionExpired;

            /**
             * 会话用户编号
             */
            private String sessionUid;

            /**
             * 店铺简称
             */
            private String shortName;

            /**
             * 分组id
             */
            private Number groupId;

            /**
             * 分组名称
             */
            private String groupName;
        }
    }
}
