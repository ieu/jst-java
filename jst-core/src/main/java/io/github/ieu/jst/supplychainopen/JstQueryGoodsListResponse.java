package io.github.ieu.jst.supplychainopen;

@lombok.Data
public class JstQueryGoodsListResponse {

    private Data data;

    /**
     * 错误提示
     */
    private String msg;

    /**
     * 返回码 0表示业务处理成功
     */
    private Integer code;

    /**
     * 请求id
     */
    private String requestId;

    @lombok.Data
    public static class Data {

        /**
         * 商品ID
         */
        private String itemSpuId;

        /**
         * 主图
         */
        private java.util.List<String> mainImageList;

        /**
         * 资料编码(款号)
         */
        private String styleCode;

        /**
         * 商品名称
         */
        private String itemName;

        /**
         * 商品私密状态 true:私密商品, 当itemStatus = cantDistribution并且privateStatus = true时,表示不可分销
         */
        private Boolean privateStatus;

        /**
         * 商品状态 cantDistribution:不可分销, distribution:可分销, defective:待完善
         */
        private String itemStatus;

        /**
         * 商品来源 ADD: 手工新增 COPY: 复制 EXCEL: EXCEL批量导入 ERP: 基础资料-按商品(SKU)导入 ERP_SPU: 基础资料-按款导入 FROM_SUP: 从供应商导入 ERP_SHELVE: ERP快速铺货生成 DRP_COMBO: 分销组合装创建
         */
        private String itemSource;

        /**
         * 创建时间
         */
        private String created;

        /**
         * 创建人
         */
        private String creator;

        /**
         * 最后更新时间
         */
        private String updated;

        /**
         * 各平台资料标识
         */
        private java.util.List<PerfectPlatform> perfectPlatformList;

        /**
         * 最小基本售价
         */
        private Number minSupplyPrice;

        /**
         * 最小成本价
         */
        private Number minCostPrice;

        /**
         * 最小零售价
         */
        private Number minSalePrice;

        /**
         * 是否代发商品
         */
        private Boolean distributorStatus;

        /**
         * 代发供应商名称
         */
        private String distributorSupplierName;

        /**
         * 代发供应商公司编号
         */
        private String distributorCoId;

        @lombok.Data
        public static class PerfectPlatform {

            /**
             * 平台类型 taobao
             */
            private String platformType;

            /**
             * 是否已完善 true
             */
            private Boolean perfect;
        }
    }
}
