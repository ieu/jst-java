package io.github.ieu.jst.crossborder;

@lombok.Data
@lombok.Builder
public class JstCreateFirstCbTripRequest {

    /**
     * 转出仓Id
     */
    private Integer outWms;

    /**
     * 目的仓Id
     */
    private Integer destinationWms;

    /**
     * 头程类型，海外仓头程：OverseasWms，FBA头程：FBA   ，目前仅支持海外仓头程
     */
    private String firstTripType;

    /**
     * 起运国编码，可选值从离线表中选取，离线表请访问:https://w.erp321.com/app/support/document.html#page=6815
     */
    private String outCountry;

    /**
     * 目的国编码，可选值从离线表中选取，离线表请访问:https://w.erp321.com/app/support/document.html#page=6815
     */
    private String destinationCountry;

    /**
     * 起运港，可选值在聚水潭ERP中维护
     */
    private String departurePort;

    /**
     * 目的港，可选值在聚水潭ERP中维护
     */
    private String destinationPort;

    /**
     * 补货方式，可选值在聚水潭ERP中维护
     */
    private String deliveryModel;

    /**
     * 预计出货时间
     */
    private String estimatedShipmentTime;

    /**
     * 预计到货时间
     */
    private String estimateInstockDate;

    /**
     * 箱数
     */
    private Integer packNum;

    /**
     * 实际体积 m³
     */
    private Number packVolumeTotal;

    /**
     * 实际重量 kg
     */
    private Number packWeightTotal;

    /**
     * 实际体积重 kg
     */
    private Number packVolumeWeight;

    /**
     * 装柜方式，枚举：[0、默认，1、整柜，2、散柜，3、退货]
     */
    private Integer packType;

    /**
     * 箱型，枚举：[0、默认，1、40HQ，2、20HQ，3、40GP，4、20GP，5、散货入库，6、托盘入库，7、45HQ，8、53HQ，9、45GP]
     */
    private Integer packSize;

    /**
     * 托盘号
     */
    private String palletNumber;

    /**
     * 柜号
     */
    private String cabinetNo;

    /**
     * 报关公司
     */
    private String declarationCompany;

    /**
     * 附件，最多支持三个附件
     */
    private java.util.List<String> attachmentUrls;

    /**
     * 备注1，该备注会展示在头程单的备注1中
     */
    private String remark;

    /**
     * 备注2，该备注会展示在头程单的备注2中
     */
    private String remark2;

    /**
     * 备注3，该备注会展示在头程单的备注3中
     */
    private String remark3;

    /**
     * 备注4，该备注会展示在头程单的备注4中
     */
    private String remark4;

    /**
     * 备注5，该备注会展示在头程单的备注5中
     */
    private String remark5;

    private java.util.List<Item> items;

    /**
     * 是否自动确认头程计划（默认true）
     */
    private Boolean autoCfm;

    /**
     * 是否自动创建调拨单，仅当AutoCfm == true 时生效，因为不确认头程计划就不能生成调拨单
     */
    private Boolean isAutoCreateAllocate;

    @lombok.Data
    public static class Item {

        /**
         * 普通商品资料商品编码
         */
        private String skuId;

        /**
         * 头程计划数量
         */
        private Integer qty;
    }
}
