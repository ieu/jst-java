package io.github.ieu.jst.base;

@lombok.Data
public class JstQueryLogisticsCompanyResponse {

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
         * 总条数
         */
        private Integer dataCount;

        /**
         * 总页数
         */
        private Integer pageCount;

        /**
         * 店铺列表
         */
        private java.util.List<Data> datas;

        @lombok.Data
        public static class Data {

            /**
             * <div><a href="https://cdn.erp321.cn/jst-fed/c1b67c08-a75c-4227-8385-1a0e048bee04_1583_732.png" target="_blank">快递公司编码</a></div>ERP唯一
             */
            private String lcId;

            /**
             * <div><a href="https://cdn.erp321.cn/jst-fed/d56ce286-f850-42a1-a251-9c421758cfa9_1706_746.png" target="_blank">快递公司</a></div>
             */
            private String lcName;

            /**
             * 修改时间
             */
            private String modified;
        }
    }
}
