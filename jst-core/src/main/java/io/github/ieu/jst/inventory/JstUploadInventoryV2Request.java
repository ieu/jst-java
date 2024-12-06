package io.github.ieu.jst.inventory;

@lombok.Data
@lombok.Builder
public class JstUploadInventoryV2Request {

    /**
     * 仓库编码，不填写默认主仓
     */
    private Integer wmsCoId;

    /**
     * 盘点类型 :非精细化盘点 ，全量:check （覆盖，传哪个商品覆盖哪个商品库存，没有传的商品库存不变）;增量:adjust(默认adjust，在原基础数量上增加) ；精细化仓位盘点，type=check，为全量盘点，仓位上未传的商品库存盘为0；type=adjust，为增量盘点，未传的商品库存不盘点，传的数量做增量盘点，如盘前库存=10，传参数量=2，则盘点后库存为10+2=12
     */
    private String type;

    /**
     * 是否自动确认单据；默认false
     */
    private Boolean isConfirm;

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/d5c28299-18a0-4bd7-82e4-6854444e0a6c_2438_434.png" target="_blank">外部单号</a></div>（自定义传唯一值不可重复传，以第一次传成功的结果为准）
     */
    private String soId;

    /**
     * 仓库;主仓=1，销退仓=2， 进货仓=3，次品仓 = 4,自定义1仓=6，自定义2仓=7，自定义3仓=8
     */
    private String warehouse;

    /**
     * 备注
     */
    private String remark;

    /**
     * 仓位(开启精细化管理有效且必填）
     */
    private String bin;

    /**
     * 暂存位类型（开启精细化管理有效且必填可传值Default（暂存位），Pick（拣货暂存位）,None）
     */
    private String defaultType;

    /**
     * 商品明细，最大500
     */
    private java.util.List<Items> items;

    @lombok.Data
    public static class Items {

        /**
         * 数量
         */
        private Integer qty;

        /**
         * 唯一码集合,如果type = adjust 不支持传sn会报错增量盘点不支持传唯一码（开启统一功能：stockchange.use.reconfig.service）
         */
        private java.util.List<String> skuSns;

        /**
         * <div><a href="https://cdn.erp321.cn/jst-fed/7030e9de-f869-4953-b84a-c0258f7be8fd_2480_1181.png" target="_blank">商品编码</a></div>
         */
        private String skuId;

        /**
         * 供应商编码
         */
        private Number supplierId;

        /**
         * 批次号；如果开启商品批次开关，批次信息必填
         */
        private String batchId;

        /**
         * 生产日期（时间范围1970-01-01 00:00:00-3000-01-01 00:00:00）
         */
        private String producedDate;

        /**
         * 有效期（时间范围1970-01-01 00:00:00-3000-01-01 00:00:00）
         */
        private String expirationDate;
    }
}
