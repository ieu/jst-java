package io.github.ieu.jst.purchase;

@lombok.Data
public class JstUploadManufactureResponse {

    /**
     * 0代码成功
     */
    private Integer code;

    /**
     * 是否成功描述
     */
    private Boolean issuccess;

    /**
     * 执行结果描述
     */
    private String msg;

    private Data data;

    @lombok.Data
    public static class Data {

        /**
         * <div><a href="https://cdn.erp321.cn/jst-fed/2b7a85f3-ffa3-49bf-97f2-26ca65584d0b_1296_226.png"target="_blank">加工单号</a></div>
         */
        private Number poId;

        /**
         * <div><a href="https://cdn.erp321.cn/jst-fed/f19f6400-d415-4d07-ad45-868a4d32ea19_1631_224.png"target="_blank">线上单号</a></div>
         */
        private String soId;
    }
}
