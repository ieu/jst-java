package io.github.ieu.jst.stockout;

@lombok.Data
@lombok.Builder
public class JstCreatePurchaseOutBatchRequest {

    /**
     * 是否审核
     */
    private Boolean isConfirm;

    /**
     * 退货类型(传默认为0：普通退货  0：普通退货，1：质检退货，2：返修退货 )
     */
    private Number type;

    /**
     * 外部采购退货单单号
     */
    private String externalId;

    /**
     * 供应商id
     */
    private Number supplierId;

    /**
     * 采购单id
     */
    private Number poId;

    /**
     * 仓储方id（分仓或者老版三方仓）
     */
    private Number wmsCoId;

    /**
     * 默认值 ：false，货主登录仓储方为三方仓时，单据生成在货主端，传true时与is_confirm:true互斥
     */
    private Boolean createInOwner;

    /**
     * 仓库编号 主仓=1，销退仓=2， 进货仓=3，次品仓 = 4,自定义1仓=6，自定义2仓=7，自定义3仓=8，自定义4仓=9，自定义5仓=10，自定义6仓=11，自定义7仓=12，自定义8仓=13，自定义9仓=14，自定义10仓=15；不传默认进货仓
     */
    private Number warehouse;

    /**
     * 多标签
     */
    private java.util.List<String> labels;

    /**
     * 收件电话
     */
    private Number receiverMobile;

    /**
     * 收件人省
     */
    private String receiverState;

    /**
     * 收件人市
     */
    private String receiverCity;

    /**
     * 货主（正数）
     */
    private Number coId;

    /**
     * 收件人区
     */
    private String receiverDistrict;

    /**
     * 收件人地址
     */
    private String receiverAddress;

    /**
     * 物流公司编码
     */
    private String lcId;

    /**
     * 物流单号
     */
    private String lId;

    /**
     * 备注
     */
    private String remark;

    /**
     * 商品列表
     */
    private java.util.List<Items> items;

    @lombok.Data
    public static class Items {

        /**
         * 商品编码
         */
        private String skuId;

        /**
         * 唯一码集合，系统中需要开启相关配置（对应erp基础设置开启商品唯一码）
         */
        private java.util.List<String> skuSn;

        /**
         * 数量
         */
        private Number qty;

        /**
         * 单价
         */
        private Number price;

        /**
         * 内部供应商编码
         */
        private Number supplierId;

        /**
         * 批次单号，系统中需开启相关配置(对应erp基础设置开启生产批次管理 如果是分仓数据 分仓也需要开启)
         */
        private String batchId;

        /**
         * 生产日期，系统中需开启相关配置(对应erp基础设置开启生产批次管理 如果是分仓数据 分仓也需要开启)
         */
        private String producedDate;

        /**
         * 明细备注
         */
        private String remark;

        /**
         * 税率
         */
        private Integer taxRate;
    }
}
