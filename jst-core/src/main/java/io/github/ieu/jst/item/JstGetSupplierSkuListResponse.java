package io.github.ieu.jst.item;

@lombok.Data
public class JstGetSupplierSkuListResponse {

    private Integer code;

    private String msg;

    private Data data;

    @lombok.Data
    public static class Data {

        private Page page;

        private java.util.List<List> list;

        @lombok.Data
        public static class List {

            /**
             * 商品款式编码
             */
            private String iId;

            /**
             * 供应商品款式编码
             */
            private String supplierIId;

            /**
             * 创建时间
             */
            private String created;

            /**
             * 采购链接
             */
            private String purchaseUrl;

            /**
             * 商品编码
             */
            private String skuId;

            /**
             * 备注
             */
            private String remark;

            /**
             * 装箱数
             */
            private String packQty;

            /**
             * 供应商商品编码
             */
            private String supplierSkuId;

            /**
             * 交货天数（天）
             */
            private String deliveryDay;

            /**
             * 供应商名称
             */
            private String supplierName;

            /**
             * 供应商编码
             */
            private String supplierCode;

            /**
             * 内部供应商编码
             */
            private String supplierId;

            /**
             * 成本价
             */
            private Number costPrice;
        }

        @lombok.Data
        public static class Page {

            /**
             * 第几页
             */
            private Number pages;

            /**
             * 总条数
             */
            private Number count;
        }
    }
}
