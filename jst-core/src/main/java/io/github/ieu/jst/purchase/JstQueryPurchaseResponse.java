package io.github.ieu.jst.purchase;

@lombok.Data
public class JstQueryPurchaseResponse {

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 错误描述
     */
    private String msg;

    private Pagination data;

    @lombok.Data
    public static class Pagination {

        /**
         * 每页多少条
         */
        private Integer pageSize;

        /**
         * 第几页
         */
        private Integer pageIndex;

        /**
         * 总条数
         */
        private Integer dataCount;

        /**
         * 总页数
         */
        private Integer pageCount;

        /**
         * 是否有下一页
         */
        private Boolean hasNext;

        /**
         * 数据集合
         */
        private java.util.List<Data> datas;

        /**
         * <div><a href="https://cdn.erp321.cn/jst-fed/5f065926-3029-4e58-aecc-c1954e11a990_1636_291.png" target="_blank">运营云仓编码</a></div>（入参是否返回运营云仓信息字段传true才会返回）
         */
        private Number lockLwhId;

        @lombok.Data
        public static class Data {

            /**
             * 采购日期
             */
            private String poDate;

            /**
             * 采购单号
             */
            private Integer poId;

            /**
             * 外部单号;对应采购单管理页面外部单号(且对应采购单上传的external_id)
             */
            private String soId;

            /**
             * 备注
             */
            private String remark;

            /**
             * 状态:Creating:草拟,WaitConfirm:待审核,Confirmed:已确认,Finished:完成,Cancelled:作废，Delete:删除
             */
            private String status;

            /**
             * <div><a href="https://cdn.erp321.cn/jst-fed/bf26d89f-d1f7-439e-b773-2f125e57764f_1534_487.png" target="_blank">供应商编码</a></div>
             */
            private Integer supplierId;

            /**
             * 供应商名称
             */
            private String seller;

            /**
             * 税率
             */
            private Integer taxRate;

            /**
             * 采购员
             */
            private String purchaserName;

            /**
             * 送货地址
             */
            private String sendAddress;

            /**
             * 合同条款
             */
            private String term;

            /**
             * 商品类型
             */
            private String itemType;

            /**
             * 数据集合
             */
            private java.util.List<Item> items;

            /**
             * 多标签
             */
            private String labels;

            /**
             * 审核生效日期
             */
            private String confirmDate;

            /**
             * 完成日期
             */
            private String finishTime;

            /**
             * 修改时间
             */
            private String modified;

            /**
             * 仓库编号
             */
            private Integer wmsCoId;

            /**
             * 收货状态:Timeout:预计收货超时,Received:全部入库,Part_Received:部分入库,Not_Received:未入库
             */
            private String receiveStatus;

            /**
             * 溢装比
             */
            private Number moreRate;

            /**
             * 运费
             */
            private Number freight;

            /**
             * 汇总采购单号
             */
            private String mergePoId;

            @lombok.Data
            public static class Item {

                /**
                 * 商家sku
                 */
                private String skuId;

                /**
                 * 商品名称
                 */
                private String name;

                /**
                 * 数量，非实际入库数量，如需获取实际入库数量请调用采购入库查询接口，对应采购入库单（已入库状态）的商品明细数量
                 */
                private Integer qty;

                /**
                 * 单价
                 */
                private Number price;

                /**
                 * 款号
                 */
                private String iId;

                /**
                 * 采购单编号
                 */
                private Integer poId;

                /**
                 * 采购单明细编号
                 */
                private Integer poiId;

                /**
                 * 预计到货日期
                 */
                private String deliveryDate;

                /**
                 * 备注
                 */
                private String remark;

                /**
                 * 税率
                 */
                private Number taxRate;

                /**
                 * 质检数
                 */
                private Number qcQty;

                /**
                 * 质检正品数
                 */
                private Number qcQualityQty;

                /**
                 * 质检次品数
                 */
                private Number qcDefectiveQty;

                /**
                 * 已入库数
                 */
                private Number inqty;

                /**
                 * 退货数
                 */
                private Number returnQty;

                /**
                 * 是否上架：2全部上架 1部分上架 0未上架
                 */
                private Number isDelivery;
            }
        }
    }
}
