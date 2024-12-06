package io.github.ieu.jst.base;

@lombok.Data
public class JstQueryWmsPartnerResponse {

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 错误描述
     */
    private String msg;

    private Data data;

    @lombok.Data
    public static class Data {

        /**
         * 总条数
         */
        private Integer dataCount;

        /**
         * 总页数
         */
        private Integer pageCount;

        /**
         * 是否有下一页
         */
        private Boolean hasNext;

        /**
         * 第几页
         */
        private Integer pageIndex;

        /**
         * 每页多少条
         */
        private Integer pageSize;

        /**
         * 店铺列表
         */
        private java.util.List<Datas> datas;

        @lombok.Data
        public static class Datas {

            /**
             * <div><a href="https://cdn.erp321.cn/jst-fed/a18a6acc-60b6-46f9-ae8c-5e88876f232d_2213_383.png" target="_blank">分仓名称</a></div>
             */
            private String name;

            /**
             * 主仓公司编号
             */
            private Integer coId;

            /**
             * 分仓编号
             */
            private Integer wmsCoId;

            /**
             * 是否为主仓，true=主仓
             */
            private Boolean isMain;

            /**
             * 状态
             */
            private String status;

            /**
             * 对方备注
             */
            private String remark1;

            /**
             * 我方备注
             */
            private String remark2;
        }
    }
}
