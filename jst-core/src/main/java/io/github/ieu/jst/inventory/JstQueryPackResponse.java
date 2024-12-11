package io.github.ieu.jst.inventory;

@lombok.Data
public class JstQueryPackResponse {

    /**
     * 错误码，0代表成功
     */
    private Integer code;

    /**
     * 描述
     */
    private String msg;

    private Pagination data;

    @lombok.Data
    public static class Pagination {

        /**
         * 总条数
         */
        private Integer dateCount;

        /**
         * 第几页
         */
        private Integer pageIndex;

        /**
         * 每页多少条
         */
        private Integer pageSize;

        private java.util.List<Data> datas;

        @lombok.Data
        public static class Data {

            /**
             * 类型
             */
            private String packType;

            /**
             * 明细仓位
             */
            private String itemBin;

            /**
             * 分仓编号
             */
            private String wmsCoId;

            /**
             * 箱号
             */
            private String packId;

            /**
             * 仓库编号： 主仓 = 1, 销退仓 = 2, 进货仓 = 3, 次品仓 = 4, 门店 = 5, 自定义1仓=6, 自定义2仓=7, 自定义3仓=8, 错误的仓库 = 0, 外仓 = 1000, 已出库 = -1, 待进仓 = -2
             */
            private Integer whId;

            /**
             * 主仓位
             */
            private String bin;

            /**
             * 数量
             */
            private Integer qty;

            /**
             * 修改时间
             */
            private String modified;

            /**
             * 商品编码
             */
            private String skuId;

            /**
             * 有效期
             */
            private String expirationDate;

            /**
             * 生产日期
             */
            private String productDate;

            /**
             * 生产批次
             */
            private String batchNo;

            /**
             * 供应商ID
             */
            private Integer supplierId;

            /**
             * 仓位分组
             */
            private String binGroup;
        }
    }
}
