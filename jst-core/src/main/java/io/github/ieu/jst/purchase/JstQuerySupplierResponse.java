package io.github.ieu.jst.purchase;

@lombok.Data
public class JstQuerySupplierResponse {

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
        private java.util.List<Data> datas;

        @lombok.Data
        public static class Data {

            /**
             * <div><a href="https://cdn.erp321.cn/jst-fed/bf26d89f-d1f7-439e-b773-2f125e57764f_1534_487.png" target="_blank">供应商内部编码</a></div>
             */
            private Integer supplierId;

            /**
             * <div><a href="https://cdn.erp321.cn/jst-fed/799f18a8-d589-416a-a83d-a5072f798cc3_1276_415.png" target="_blank">供应商编码</a></div>
             */
            private String supplierCode;

            /**
             * <div><a href="https://cdn.erp321.cn/jst-fed/a6728c86-d446-4958-9979-92072e8f6ab2_2173_333.png" target="_blank">供应商名称</a></div>
             */
            private String name;

            /**
             * 修改时间
             */
            private String modified;

            /**
             * 备注1
             */
            private String remark;

            /**
             * 备注2
             */
            private String remark2;

            /**
             * 备注3
             */
            private String remark3;

            /**
             * 供应商分类
             */
            private String group;

            /**
             * 是否启用，true：启用，false：未启用
             */
            private Boolean enabled;

            /**
             * 开户银行
             */
            private String depositbank;

            /**
             * 账户名称
             */
            private String bankacount;

            /**
             * 银行账号
             */
            private String acountnumber;
        }
    }
}
