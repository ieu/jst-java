package io.github.ieu.jst.allocate;

@lombok.Data
@lombok.Builder
public class JstUploadInAllocateRequest {

    /**
     * 调拨时间
     */
    private String ioDate;

    /**
     * 调入仓  1是主仓，2是销退仓，3是进货仓，4是次品仓，自定义1仓=6，自定义2仓=7，自定义3仓=8，自定义4仓=9，自定义5仓=10，自定义6仓=11，自定义7仓=12，自定义8仓=13，自定义9仓=14，自定义10仓=15（对应ERP仓库资料设定页面）
     */
    private Integer linkWarehouse;

    /**
     * 备注
     */
    private String remark;

    /**
     * 外部调拨单号，最长不超过50;唯一（单据上传成功之后对应页面线上订单号）
     */
    private String soId;

    /**
     * 调出仓公司内仓库id：1是主仓，2是销退仓，3是进货仓，4是次品仓，自定义1仓=6，自定义2仓=7，自定义3仓=8，自定义4仓=9，自定义5仓=10，自定义6仓=11，自定义7仓=12，自定义8仓=13，自定义9仓=14，自定义10仓=15（对应ERP仓库资料设定页面）
     */
    private Integer warehouse;

    /**
     * 分仓编号（对应ERP需要第三方物流或分仓页面,编码查询：https://openweb.jushuitan.com/dev-doc?docType=1&docId=3）
     */
    private Integer wmsCoId;

    /**
     * 商品集合
     */
    private java.util.List<Items> items;

    /**
     * 标记｜多标签
     */
    private java.util.List<String> labels;

    /**
     * 是否自动确认单据
     */
    private Boolean isConfirm;

    @lombok.Data
    public static class Items {

        /**
         * 商品数量
         */
        private Integer qty;

        /**
         * 商品编码
         */
        private String skuId;

        /**
         * 批次号
         */
        private String batchId;

        /**
         * 生产日期
         */
        private String producedDate;

        /**
         * 有效期
         */
        private String expirationDate;

        /**
         * 备注
         */
        private String remark;
    }
}
