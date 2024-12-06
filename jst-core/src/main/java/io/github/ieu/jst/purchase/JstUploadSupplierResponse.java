package io.github.ieu.jst.purchase;

@lombok.Data
public class JstUploadSupplierResponse {

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
             * <div><a href="https://cdn.erp321.cn/jst-fed/bf26d89f-d1f7-439e-b773-2f125e57764f_1534_487.png" target="_blank">供应商内部编码</a></div> erp唯一
             */
            private Integer id;

            /**
             * 是否成功
             */
            private Boolean issuccess;

            /**
             * 提示信息
             */
            private String msg;

            /**
             * 供应商名称
             */
            private String name;

            /**
             * <div><a href="https://cdn.erp321.cn/jst-fed/799f18a8-d589-416a-a83d-a5072f798cc3_1276_415.png" target="_blank">供应商编码</a></div>
             */
            private String supplierCode;
        }
    }
}
