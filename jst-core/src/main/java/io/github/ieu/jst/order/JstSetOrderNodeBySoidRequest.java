package io.github.ieu.jst.order;

@lombok.Data
@lombok.Builder
public class JstSetOrderNodeBySoidRequest {

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/ccaa4f9d-b986-4c48-b2d2-1e8b20177658_2166_836.png" target="_blank">店铺编号</a></div>
     */
    private Number shopId;

    private java.util.List<Items> items;

    @lombok.Data
    public static class Items {

        /**
         * <div><a href="https://cdn.erp321.cn/jst-fed/deab32f3-191d-43c8-b213-343bb82070e1_2161_433.png" target="_blank">内部订单号</a></div>（与线上单号必填一个，最大支持10个）
         */
        private Number oId;

        /**
         * <div><a href="https://cdn.erp321.cn/jst-fed/e457dae3-e441-4644-860e-e070d05929df_1924_284.png" target="_blank">线上单号</a></div>（如果内部单号和线下单号不是同一个订单存在都会被修改）
         */
        private String soId;

        /**
         * <div><a href="https://cdn.erp321.cn/jst-fed/0645ab5e-9f49-4d84-9804-8a2e34c989f0_2163_1006.png" target="_blank">线下备注</a></div>
         */
        private String node;
    }
}
