package io.github.ieu.jst.crossborder;

@lombok.Data
public class JstGetCbLogisticsTrackDetailResponse {

    private Integer code;

    private java.util.List<Data> data;

    private String msg;

    private String requestId;

    @lombok.Data
    public static class Data {

        /**
         * 运单号
         */
        private String lid;

        /**
         * 轨迹详情
         */
        private java.util.List<Details> details;

        @lombok.Data
        public static class Details {

            /**
             * 轨迹明细
             */
            private String detail;

            /**
             * 创建时间
             */
            private String created;
        }
    }
}
