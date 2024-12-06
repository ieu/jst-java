package io.github.ieu.jst.order;

@lombok.Data
public class JstUploadOrdersResponse {

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 错误描述
     */
    private String msg;

    /**
     * 数据集合
     */
    private Data data;

    /**
     * 数据集合
     */
    @lombok.Data
    public static class Data {

        private java.util.List<Datas> datas;

        @lombok.Data
        public static class Datas {

            /**
             * ERP订单界面-内部单号
             */
            private Integer oId;

            /**
             * ERP订单界面-线上单号
             */
            private String soId;

            /**
             * 是否成功
             */
            private Boolean issuccess;

            /**
             * 返回结果描述
             */
            private String msg;
        }
    }
}
