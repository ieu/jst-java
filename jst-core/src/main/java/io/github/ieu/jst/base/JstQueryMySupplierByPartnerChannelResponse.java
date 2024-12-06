package io.github.ieu.jst.base;

@lombok.Data
public class JstQueryMySupplierByPartnerChannelResponse {

    private Number code;

    private String msg;

    private Data data;

    @lombok.Data
    public static class Data {

        /**
         * 总数
         */
        private Number total;

        private java.util.List<SupplierVos> supplierVos;

        @lombok.Data
        public static class SupplierVos {

            /**
             * 合作状态-0:待授权；1:待审核；2:合作中;3:已拒绝；4:已终止
             */
            private Number status;

            /**
             * 供应商公司名
             */
            private String coName;

            /**
             * 供应商编号
             */
            private String supplierCoId;
        }
    }
}
