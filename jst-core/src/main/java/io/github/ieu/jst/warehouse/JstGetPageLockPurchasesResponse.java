package io.github.ieu.jst.warehouse;

@lombok.Data
public class JstGetPageLockPurchasesResponse {

    private java.util.List<Data> data;

    @lombok.Data
    public static class Data {

        /**
         * 采购单信息
         */
        private LockPurchase lockPurchase;

        /**
         * 采购明细信息
         */
        private java.util.List<LockPurchaseItems> lockPurchaseItems;

        @lombok.Data
        public static class LockPurchaseItems {

            /**
             * 虚拟仓采购单号
             */
            private Number lpId;

            /**
             * 商品编码
             */
            private String skuId;

            /**
             * 商品名称
             */
            private String name;

            /**
             * 款式编码
             */
            private String iId;

            /**
             * 商品数量
             */
            private Number qty;

            /**
             * 供应商名称
             */
            private String supplierName;

            /**
             * 明细备注
             */
            private String remark;

            /**
             * 状态key值
             */
            private String status;

            /**
             * 状态中文值
             */
            private String statusCN;

            /**
             * 采购单号
             */
            private Number poId;
        }

        /**
         * 采购单信息
         */
        @lombok.Data
        public static class LockPurchase {

            /**
             * 虚拟仓采购单号
             */
            private Number lpId;

            /**
             * 虚拟仓编码
             */
            private String lwhId;

            /**
             * 虚拟仓名称
             */
            private String lwhName;

            /**
             * 仓储编码
             */
            private Number wmsCoId;

            /**
             * 状态
             */
            private String status;

            /**
             * 备注
             */
            private String remark;

            /**
             * 创建人
             */
            private String creatorName;

            /**
             * 修改时间
             */
            private String modified;

            /**
             * 修改人
             */
            private String modifierName;

            /**
             * 确认时间
             */
            private String confirmed;

            /**
             * 确认人
             */
            private String confirmerName;
        }
    }
}
