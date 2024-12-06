package io.github.ieu.jst.wms;

@lombok.Data
public class JstAddShippingPackResponse {

    /**
     * 状态码，无异常=0
     */
    private Number code;

    /**
     * 接口数据
     */
    private Data data;

    /**
     * 接口信息
     */
    private String msg;

    /**
     * 接口类型：'json' | 'string'
     */
    private String msgType;

    /**
     * 接口数据
     */
    @lombok.Data
    public static class Data {

        /**
         * 出库单号
         */
        private Number ioId;

        /**
         * 订单号
         */
        private Number oId;

        /**
         * 快递单号
         */
        private String lcLId;

        /**
         * 快递公司
         */
        private String logisticsCompany;

        /**
         * 单据数量
         */
        private Number inoutQty;

        /**
         * 店铺ID
         */
        private Number shopId;

        /**
         * 买家ID
         */
        private String shopBuyerId;

        /**
         * 总装箱数量
         */
        private Number totalPackedQty;

        /**
         * 箱号
         */
        private java.util.List<String> packIds;

        /**
         * 商家ID
         */
        private Number coId;

        /**
         * 错误信息，即便状态为0，也会存在一些错误，这个错误信息有数据表示装箱失败
         */
        private String error;
    }
}
