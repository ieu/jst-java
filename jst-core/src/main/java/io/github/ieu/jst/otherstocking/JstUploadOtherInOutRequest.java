package io.github.ieu.jst.otherstocking;

@lombok.Data
@lombok.Builder
public class JstUploadOtherInOutRequest {

    /**
     * 是否确认单据；默认false
     */
    private Boolean isConfirm;

    /**
     * 是否审核单据；默认false
     */
    private Boolean excuteConfirming;

    /**
     * 分仓编号或者三方仓编码
     */
    private Integer wmsCoId;

    /**
     * 出入库类型:in是入库（其它退货）out是出库（其它出库）
     */
    private String type;

    /**
     * 外部单号（单据上传成功之后对应页面线上单号）
     */
    private String externalId;

    /**
     * 默认1 ，主仓=1，销退仓=2，进货仓=3，次品仓=4，自定义1仓=6，自定义2仓=7，自定义3仓=8，自定义4仓=9，自定义5仓=10，自定义6仓=11，自定义7仓=12，自定义8仓=13，自定义9仓=14，自定义10仓=15（对应ERP仓库资料设定页面）
     */
    private Integer warehouse;

    /**
     * 备注，不能传空值
     */
    private String remark;

    /**
     * 出库类型
     */
    private String drpCoName;

    /**
     * 商品列表
     */
    private java.util.List<Item> items;

    /**
     * 收件人姓名
     */
    private String receiverName;

    /**
     * 收件人手机号
     */
    private String receiverMobile;

    /**
     * 收件地址省
     */
    private String receiverState;

    /**
     * 收件地址市
     */
    private String receiverCity;

    /**
     * 收件地址区|县
     */
    private String receiverDistrict;

    /**
     * 收件详细地址
     */
    private String receiverAddress;

    /**
     * 标记｜多标签（总length不能超过200）
     */
    private java.util.List<String> labels;

    /**
     * 虚拟仓编号(对应虚拟仓设置页面虚拟仓编号):传ID取ID，传名称取名称，二者皆传以ID为准
     */
    private Integer lockWhId;

    /**
     * 虚拟仓名称
     */
    private String lockWhName;

    /**
     * 物流公司编码
     */
    private String lcId;

    /**
     * 物流单号
     */
    private String lId;

    /**
     * 物流公司名称
     */
    private String logisticsCompany;

    /**
     * 最大支持上传1000条
     */
    @lombok.Data
    public static class Item {

        /**
         * 商品编码
         */
        private String skuId;

        /**
         * 唯一码集合（如需使用请联系我们做配置）
         */
        private java.util.List<String> skuSns;

        /**
         * 数量（必须大于0）
         */
        private Integer qty;

        /**
         * 内部供应商编码
         */
        private Number supplierId;

        /**
         * 批次单号，系统中需开启相关配置（对应erp基础设置开启生产批次管理 如果是分仓数据 分仓也需要开启）
         */
        private String batchId;

        /**
         * 生产日期，系统中需开启相关配置（对应erp基础设置开启生产批次管理 如果是分仓数据 分仓也需要开启）
         */
        private String producedDate;

        /**
         * 有效期至，系统中需开启相关配置（对应erp基础设置开启生产批次管理 如果是分仓数据 分仓也需要开启）
         */
        private String expirationDate;

        /**
         * 备注
         */
        private String remark;

        /**
         * 商品单价
         */
        private Number salePrice;
    }
}
