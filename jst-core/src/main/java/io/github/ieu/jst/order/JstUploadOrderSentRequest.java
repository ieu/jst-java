package io.github.ieu.jst.order;

@lombok.Data
@lombok.Builder
public class JstUploadOrderSentRequest {

    private java.util.List<Item> items;

    /**
     * data
     */
    @lombok.Data
    public static class Item {

        /**
         * <div><a href="https://cdn.erp321.cn/jst-fed/deab32f3-191d-43c8-b213-343bb82070e1_2161_433.png" target="_blank">内部订单号</a></div>
         */
        private Integer oId;

        /**
         * <div><a href="https://cdn.erp321.cn/jst-fed/ccaa4f9d-b986-4c48-b2d2-1e8b20177658_2166_836.png" target="_blank">店铺编号</a></div>
         */
        private Integer shopId;

        /**
         * <div><a href="https://cdn.erp321.cn/jst-fed/e457dae3-e441-4644-860e-e070d05929df_1924_284.png" target="_blank">线上单号</a></div>
         */
        private String soId;

        /**
         * <div><a href="https://cdn.erp321.cn/jst-fed/d56ce286-f850-42a1-a251-9c421758cfa9_1706_746.png" target="_blank">快递公司</a></div>
         */
        private String lcName;

        /**
         * 快递单号；如果选择了跨境物流表示国际运单号
         */
        private String lId;

        /**
         * 是否允许传重复物流单号；默认false不重复
         */
        private Boolean sendByUsedLid;

        /**
         * <div><a href="https://cdn.erp321.cn/jst-fed/c1b67c08-a75c-4227-8385-1a0e048bee04_1583_732.png" target="_blank">快递公司编码</a></div>【物流(快递)公司及打印模板】中的物流公司编号
         */
        private String lcId;

        /**
         * 是否跨境物流；选true渠道信息必填
         */
        private Boolean isUnLid;

        /**
         * 渠道编码
         */
        private String trackingCode;

        /**
         * 渠道名称
         */
        private String trackingInfo;

        /**
         * 货代id（货代设置中的ID）；默认值可以传1000
         */
        private Number trackingType;
    }
}
