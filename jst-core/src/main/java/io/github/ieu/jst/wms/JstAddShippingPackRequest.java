package io.github.ieu.jst.wms;

/**
 * 请求数据
 */
@lombok.Data
@lombok.Builder
public class JstAddShippingPackRequest {

    /**
     * 出库单号，优先查询
     */
    private Number ioId;

    /**
     * 快递单号，出库单号查不到再查快递单号
     */
    private String lid;

    /**
     * 装箱明细
     */
    private java.util.List<Detail> detail;

    @lombok.Data
    public static class Detail {

        /**
         * 商品编码
         */
        private String skuId;

        /**
         * 装箱数量
         */
        private Integer qty;
    }
}
