package io.github.ieu.jst.crossborder;

public class JstCreateFirstCbTripSpec {

    private final JstCrossBorderClient client;

    private final JstCreateFirstCbTripRequest.JstCreateFirstCbTripRequestBuilder requestBuilder = JstCreateFirstCbTripRequest.builder();

    public JstCreateFirstCbTripSpec(JstCrossBorderClient client) {
        this.client = client;
    }

    /**
     * 转出仓Id
     */
    public JstCreateFirstCbTripSpec outWms(Integer outWms) {
        requestBuilder.outWms(outWms);
        return this;
    }

    /**
     * 目的仓Id
     */
    public JstCreateFirstCbTripSpec destinationWms(Integer destinationWms) {
        requestBuilder.destinationWms(destinationWms);
        return this;
    }

    /**
     * 头程类型，海外仓头程：OverseasWms，FBA头程：FBA   ，目前仅支持海外仓头程
     */
    public JstCreateFirstCbTripSpec firstTripType(String firstTripType) {
        requestBuilder.firstTripType(firstTripType);
        return this;
    }

    /**
     * 起运国编码，可选值从离线表中选取，离线表请访问:https://w.erp321.com/app/support/document.html#page=6815
     */
    public JstCreateFirstCbTripSpec outCountry(String outCountry) {
        requestBuilder.outCountry(outCountry);
        return this;
    }

    /**
     * 目的国编码，可选值从离线表中选取，离线表请访问:https://w.erp321.com/app/support/document.html#page=6815
     */
    public JstCreateFirstCbTripSpec destinationCountry(String destinationCountry) {
        requestBuilder.destinationCountry(destinationCountry);
        return this;
    }

    /**
     * 起运港，可选值在聚水潭ERP中维护
     */
    public JstCreateFirstCbTripSpec departurePort(String departurePort) {
        requestBuilder.departurePort(departurePort);
        return this;
    }

    /**
     * 目的港，可选值在聚水潭ERP中维护
     */
    public JstCreateFirstCbTripSpec destinationPort(String destinationPort) {
        requestBuilder.destinationPort(destinationPort);
        return this;
    }

    /**
     * 补货方式，可选值在聚水潭ERP中维护
     */
    public JstCreateFirstCbTripSpec deliveryModel(String deliveryModel) {
        requestBuilder.deliveryModel(deliveryModel);
        return this;
    }

    /**
     * 预计出货时间
     */
    public JstCreateFirstCbTripSpec estimatedShipmentTime(String estimatedShipmentTime) {
        requestBuilder.estimatedShipmentTime(estimatedShipmentTime);
        return this;
    }

    /**
     * 预计到货时间
     */
    public JstCreateFirstCbTripSpec estimateInstockDate(String estimateInstockDate) {
        requestBuilder.estimateInstockDate(estimateInstockDate);
        return this;
    }

    /**
     * 箱数
     */
    public JstCreateFirstCbTripSpec packNum(Integer packNum) {
        requestBuilder.packNum(packNum);
        return this;
    }

    /**
     * 实际体积 m³
     */
    public JstCreateFirstCbTripSpec packVolumeTotal(Number packVolumeTotal) {
        requestBuilder.packVolumeTotal(packVolumeTotal);
        return this;
    }

    /**
     * 实际重量 kg
     */
    public JstCreateFirstCbTripSpec packWeightTotal(Number packWeightTotal) {
        requestBuilder.packWeightTotal(packWeightTotal);
        return this;
    }

    /**
     * 实际体积重 kg
     */
    public JstCreateFirstCbTripSpec packVolumeWeight(Number packVolumeWeight) {
        requestBuilder.packVolumeWeight(packVolumeWeight);
        return this;
    }

    /**
     * 装柜方式，枚举：[0、默认，1、整柜，2、散柜，3、退货]
     */
    public JstCreateFirstCbTripSpec packType(Integer packType) {
        requestBuilder.packType(packType);
        return this;
    }

    /**
     * 箱型，枚举：[0、默认，1、40HQ，2、20HQ，3、40GP，4、20GP，5、散货入库，6、托盘入库，7、45HQ，8、53HQ，9、45GP]
     */
    public JstCreateFirstCbTripSpec packSize(Integer packSize) {
        requestBuilder.packSize(packSize);
        return this;
    }

    /**
     * 托盘号
     */
    public JstCreateFirstCbTripSpec palletNumber(String palletNumber) {
        requestBuilder.palletNumber(palletNumber);
        return this;
    }

    /**
     * 柜号
     */
    public JstCreateFirstCbTripSpec cabinetNo(String cabinetNo) {
        requestBuilder.cabinetNo(cabinetNo);
        return this;
    }

    /**
     * 报关公司
     */
    public JstCreateFirstCbTripSpec declarationCompany(String declarationCompany) {
        requestBuilder.declarationCompany(declarationCompany);
        return this;
    }

    /**
     * 附件，最多支持三个附件
     */
    public JstCreateFirstCbTripSpec attachmentUrls(java.util.List<String> attachmentUrls) {
        requestBuilder.attachmentUrls(attachmentUrls);
        return this;
    }

    /**
     * 备注1，该备注会展示在头程单的备注1中
     */
    public JstCreateFirstCbTripSpec remark(String remark) {
        requestBuilder.remark(remark);
        return this;
    }

    /**
     * 备注2，该备注会展示在头程单的备注2中
     */
    public JstCreateFirstCbTripSpec remark2(String remark2) {
        requestBuilder.remark2(remark2);
        return this;
    }

    /**
     * 备注3，该备注会展示在头程单的备注3中
     */
    public JstCreateFirstCbTripSpec remark3(String remark3) {
        requestBuilder.remark3(remark3);
        return this;
    }

    /**
     * 备注4，该备注会展示在头程单的备注4中
     */
    public JstCreateFirstCbTripSpec remark4(String remark4) {
        requestBuilder.remark4(remark4);
        return this;
    }

    /**
     * 备注5，该备注会展示在头程单的备注5中
     */
    public JstCreateFirstCbTripSpec remark5(String remark5) {
        requestBuilder.remark5(remark5);
        return this;
    }

    public JstCreateFirstCbTripSpec items(java.util.List<JstCreateFirstCbTripRequest.Item> items) {
        requestBuilder.items(items);
        return this;
    }

    /**
     * 是否自动确认头程计划（默认true）
     */
    public JstCreateFirstCbTripSpec autoCfm(Boolean autoCfm) {
        requestBuilder.autoCfm(autoCfm);
        return this;
    }

    /**
     * 是否自动创建调拨单，仅当AutoCfm == true 时生效，因为不确认头程计划就不能生成调拨单
     */
    public JstCreateFirstCbTripSpec isAutoCreateAllocate(Boolean isAutoCreateAllocate) {
        requestBuilder.isAutoCreateAllocate(isAutoCreateAllocate);
        return this;
    }

    public JstCreateFirstCbTripResponse response() {
        return this.client.createFirstCbTrip(requestBuilder.build());
    }
}
