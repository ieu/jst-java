package io.github.ieu.jst.order;

@lombok.Data
public class JstQueryOrderActionResponse {

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
         * 每页多少条
         */
        private Integer pageSize;

        /**
         * 第几页
         */
        private Integer pageIndex;

        /**
         * 是否有下一页
         */
        private Boolean hasNext;

        /**
         * 数据集合
         */
        private java.util.List<Data> datas;

        @lombok.Data
        public static class Data {

            /**
             * 日志id
             */
            private Integer oaId;

            /**
             * 订单id
             */
            private Integer oId;

            /**
             * 操作名称
             */
            private String name;

            /**
             * 备注
             */
            private String remark;

            /**
             * 操作时间
             */
            private String created;

            /**
             * Selina89
             */
            private String creatorName;
        }
    }
}
