package io.github.ieu.jst.workorder;

@lombok.Data
@lombok.Builder
public class JstUpdateWorkOrderRequest {

    private Data data;

    @lombok.Data
    public static class Data {

        /**
         * 工单号
         */
        private String woNo;

        /**
         * 暂时支持操作（COMPLETE:完成工单,CANCEL:取消工单,CONFIRMING:标处理中,WAIT_CONFIRM:标待处理,REJECT_AUDIT:拒绝审核）
         */
        private String operateType;

        private java.util.List<BusinessFieldList> businessFieldList;

        @lombok.Data
        public static class BusinessFieldList {

            private String fieldId;

            private java.util.List<String> valueList;

            private String value;
        }
    }
}
