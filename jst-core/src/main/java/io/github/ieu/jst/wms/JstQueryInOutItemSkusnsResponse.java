package io.github.ieu.jst.wms;

@lombok.Data
public class JstQueryInOutItemSkusnsResponse {

    private Integer code;

    private java.util.List<Data> data;

    private String msg;

    private String requestId;

    @lombok.Data
    public static class Data {

        /**
         * 进出仓单号
         */
        private Number ioId;

        /**
         * 内部订单号
         */
        private String oId;

        /**
         * 单据类型，1=采购入库;2=采购退货,3=销售出仓,4=销售退货,5=调拨出,6=调拨入,7=盘点,8=差异,9=结算,10=领用出仓,11=领用退仓,12=期初,13=其它出库,14=其它进仓,15=发票,16=加工出仓,17=加工进仓,18=其它退货
         */
        private Number inoutType;

        /**
         * 商品编码
         */
        private String skuId;

        /**
         * 唯一码
         */
        private String skuSn;

        /**
         * 单价
         */
        private String costPrice;

        /**
         * 价格
         */
        private Number costAmount;

        /**
         * 备注
         */
        private String remark;

        /**
         * 创建时间
         */
        private String createTime;

        /**
         * 修改时间
         */
        private String modifiedTime;

        /**
         * 供应商Id
         */
        private String supplierId;

        /**
         * 供应商名称
         */
        private String supplierName;
    }
}
