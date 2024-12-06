package io.github.ieu.jst.stockout;

@lombok.Data
@lombok.Builder
public class JstUploadWmsSentOrdersRequest {

    /**
     * 出仓单号，ERP内部单号，系统【销售出库单】页面中出仓单号
     */
    private Integer ioId;

    /**
     * 快递公司，最大30
     */
    private String lcName;

    /**
     * 快递单号，最大50；如果选择了跨境物流表示国际运单号
     */
    private String lId;

    /**
     * 快递公司代码
     */
    private String lcId;

    /**
     * 发货仓编码
     */
    private Integer wmsCoId;

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

    /**
     * 需要唯一码出库的商品节点
     */
    private java.util.List<Items> items;

    @lombok.Data
    public static class Items {

        /**
         * 商品编码
         */
        private String skuId;

        /**
         * 唯一码列表
         */
        private java.util.List<String> snList;
    }
}
