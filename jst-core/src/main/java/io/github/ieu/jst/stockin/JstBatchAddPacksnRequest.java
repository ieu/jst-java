package io.github.ieu.jst.stockin;

@lombok.Data
@lombok.Builder
public class JstBatchAddPacksnRequest {

    private java.util.List<PackSn> packSnList;

    /**
     * 1:待入库 2:入库 3:出库，其它值：待入库（不传默认是查询待入库单据）
     */
    private Number status;

    @lombok.Data
    public static class PackSn {

        /**
         * 商品编码
         */
        private String skuId;

        /**
         * 唯一码|序列号
         */
        private String sn;

        /**
         * 箱唯一码关联的普通唯一码列表
         */
        private java.util.List<String> packSkuSnList;
    }
}
