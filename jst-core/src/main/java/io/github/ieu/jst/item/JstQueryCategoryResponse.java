package io.github.ieu.jst.item;

@lombok.Data
public class JstQueryCategoryResponse {

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
         * 每页多少条
         */
        private Integer pageSize;

        /**
         * 第几页
         */
        private Integer pageIndex;

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
         * 数据集合
         */
        private java.util.List<Datas> datas;

        @lombok.Data
        public static class Datas {

            /**
             * 类目id
             */
            private Integer cId;

            /**
             * 父级类目id
             */
            private Integer parentCId;

            /**
             * 修改时间
             */
            private String modified;

            /**
             * 类目名称
             */
            private String name;
        }
    }
}
