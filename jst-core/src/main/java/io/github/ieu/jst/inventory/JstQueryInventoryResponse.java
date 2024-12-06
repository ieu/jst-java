package io.github.ieu.jst.inventory;

@lombok.Data
public class JstQueryInventoryResponse {

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 错误描述
     */
    private String msg;

    private Data data;

    @lombok.Data
    public static class Data {

        /**
         * 每页多少条
         */
        private Integer pageSize;

        /**
         * 第几页
         */
        private Integer pageIndex;

        /**
         * 是否有下一页
         */
        private Boolean hasNext;

        /**
         * 数据集合
         */
        private java.util.List<Inventorys> inventorys;

        @lombok.Data
        public static class Inventorys {

            /**
             * 商品编码
             */
            private String skuId;

            /**
             * 时间戳
             */
            private Integer ts;

            /**
             * 款式编码
             */
            private String iId;

            /**
             * 主仓实际库存
             */
            private Integer qty;

            /**
             * 订单占有数
             */
            private Integer orderLock;

            /**
             * 仓库待发数
             */
            private Integer pickLock;

            /**
             * 虚拟库存
             */
            private Integer virtualQty;

            /**
             * 采购在途数
             */
            private Integer purchaseQty;

            /**
             * 销退仓库存
             */
            private Integer returnQty;

            /**
             * 进货仓库存
             */
            private Integer inQty;

            /**
             * 次品库存（如需次品库存变更时修改时间同时更新需联系客服开通基数设置开关：次品仓、自定义仓库存变动修改商品库存修改时间）
             */
            private Integer defectiveQty;

            /**
             * 修改时间,用此时间作为下一次查询的起始时间
             */
            private String modified;

            /**
             * 安全库存下限
             */
            private Integer minQty;

            /**
             * 安全库存上限
             */
            private Integer maxQty;

            /**
             * 库存锁定数（是否返回取决于入参时has_lock_qty字段）
             */
            private Integer lockQty;

            /**
             * 商品名称
             */
            private String name;

            /**
             * 自定义仓1（如需自定义仓库存变更时修改时间同时更新需联系客服开通基数设置开关：次品仓、自定义仓库存变动修改商品库存修改时间）
             */
            private Integer customizeQty_1;

            /**
             * 自定义仓2（如需自定义仓库存变更时修改时间同时更新需联系客服开通基数设置开关：次品仓、自定义仓库存变动修改商品库存修改时间）
             */
            private Integer customizeQty_2;

            /**
             * 自定义仓3（如需自定义仓库存变更时修改时间同时更新需联系客服开通基数设置开关：次品仓、自定义仓库存变动修改商品库存修改时间）
             */
            private Integer customizeQty_3;

            /**
             * 调拨在途数
             */
            private Integer allocateQty;

            /**
             * 销退在途数
             */
            private Number saleRefundQty;
        }
    }
}
