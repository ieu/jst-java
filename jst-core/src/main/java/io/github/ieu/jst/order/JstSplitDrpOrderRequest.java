package io.github.ieu.jst.order;

@lombok.Data
@lombok.Builder
public class JstSplitDrpOrderRequest {

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/deab32f3-191d-43c8-b213-343bb82070e1_2161_433.png" target="_blank">内部订单号</a></div>
     */
    private String oId;

    /**
     * 拆分信息
     */
    private java.util.List<java.util.List<SplitInfos>> splitInfos;

    @lombok.Data
    public static class SplitInfos {

        /**
         * 订单明细号，来源于订单查询接口的子订单号
         */
        private String oiId;

        /**
         * 拆分数量
         */
        private Number qty;
    }
}
