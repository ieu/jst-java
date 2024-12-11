package io.github.ieu.jst.supplychainopen;

@lombok.Data
public class JstQueryDiserpGoodsDataResponse {

    /**
     * 状态码: 0成功,其他都是异常
     */
    private Integer code;

    /**
     * 信息
     */
    private String msg;

    private String requestId;

    private Data data;

    @lombok.Data
    public static class Data {

        /**
         * 总数
         */
        private Number total;

        /**
         * 数据列表
         */
        private java.util.List<List> list;

        @lombok.Data
        public static class List {

            /**
             * 图片
             */
            private String pic;

            /**
             * 商品名称
             */
            private String itemName;

            /**
             * 款式编码
             */
            private String styleCode;

            /**
             * 商品编码
             */
            private String itemCode;

            /**
             * 颜色规格
             */
            private String propertiesValue;

            /**
             * 库存（如果供销商设置了分销商不可以查看我们的库存，则界面只显示有货和无货，接口返回10000：有货；0：无货）
             */
            private Integer stock;

            /**
             * 基本售价
             */
            private Number basePrice;

            /**
             * 零售价
             */
            private Number salePrice;

            /**
             * 采购价
             */
            private Number supplyPrice;

            /**
             * 重量
             */
            private Number weight;

            /**
             * 创建时间
             */
            private String created;

            /**
             * 品牌名
             */
            private String brandName;

            /**
             * 库存字符串
             */
            private String stockStr;
        }
    }
}
