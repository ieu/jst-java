package io.github.ieu.jst.allocate;

@lombok.Data
@lombok.Builder
public class JstUploadKcAllocateRequest {

    /**
     * 外部订单号（单据上传成功之后对应页面线上订单号）
     */
    private String soId;

    /**
     * 单据日期
     */
    private String ioDate;

    /**
     * 金额
     */
    private Number price;

    /**
     * 调出仓公司id（对应ERP需要第三方物流或分仓页面,编码查询：https://openweb.jushuitan.com/dev-doc?docType=1&docId=3）
     */
    private Integer goCoId;

    /**
     * 调出仓公司内仓库id，主仓=1，销退仓=2，进货仓=3，次品仓=4，自定义1仓=6，自定义2仓=7，自定义3仓=8，自定义4仓=9，自定义5仓=10，自定义6仓=11，自定义7仓=12，自定义8仓=13，自定义9仓=14，自定义10仓=15（对应ERP仓库资料设定页面，剩下的仓以此类推）
     */
    private Integer warehouse;

    /**
     * 调入仓公司id（对应ERP需要第三方物流或分仓页面,编码查询：https://openweb.jushuitan.com/dev-doc?docType=1&docId=3）
     */
    private Integer linkCoId;

    /**
     * 调入仓公司内仓库id，主仓=1，销退仓=2，进货仓=3，次品仓=4，自定义1仓=6，自定义2仓=7，自定义3仓=8，自定义4仓=9，自定义5仓=10，自定义6仓=11，自定义7仓=12，自定义8仓=13，自定义9仓=14，自定义10仓=15（对应ERP仓库资料设定页面）
     */
    private Integer linkWarehouse;

    /**
     * 备注
     */
    private String remark;

    private java.util.List<Items> items;

    /**
     * 收货人
     */
    private String receiverName;

    /**
     * 移动电话
     */
    private String receiverMobile;

    /**
     * 省
     */
    private String receiverState;

    /**
     * 市
     */
    private String receiverCity;

    /**
     * 区
     */
    private String receiverDistrict;

    /**
     * 详细地址
     */
    private String receiverAddress;

    /**
     * 是否自动完成单据
     */
    private Boolean isConfirm;

    /**
     * 是否自动确认单据（针对非销售占有库存的true为确认）
     */
    private Boolean isConfirming;

    /**
     * 标记｜多标签
     */
    private java.util.List<String> labels;

    @lombok.Data
    public static class Items {

        /**
         * 商品编码
         */
        private String skuId;

        /**
         * 商品数量
         */
        private Integer qty;

        /**
         * 唯一码集合（开启唯一码及商品开启唯一码）is_confirm = true有效，记录唯一码流水
         */
        private java.util.List<String> skuSns;

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
