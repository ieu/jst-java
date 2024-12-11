package io.github.ieu.jst.base;

@lombok.Data
public class JstQueryMyChannelBySupplierResponse {

    private Integer code;

    private String msg;

    private Data data;

    @lombok.Data
    public static class Data {

        /**
         * 总数
         */
        private Number total;

        private java.util.List<ChannelVos> channelVos;

        @lombok.Data
        public static class ChannelVos {

            /**
             * 合作状态-0:待授权；1:待审核；2:合作中;3:已拒绝；4:已终止
             */
            private Number status;

            /**
             * 分销商商公司名
             */
            private String coName;

            /**
             * 分销商编号
             */
            private String channelCoId;

            /**
             * 申请时间
             */
            private String applyTime;

            /**
             * 合作时间
             */
            private String confirmTime;

            /**
             * 开单名称
             */
            private String billName;

            /**
             * 联系人名称
             */
            private String contactName;

            /**
             * 联系人手机号
             */
            private String contactPhone;

            /**
             * 供应商备注
             */
            private String supplierRemark;

            /**
             * 供应商业务员名称
             */
            private String supplierSalesmanName;

            /**
             * 分销商等级
             */
            private Number disLevel;
        }
    }
}
