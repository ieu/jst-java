package io.github.ieu.jst.otherstocking;

public class JstUploadOtherInOutSpec {

    private final JstOtherStockingClient client;

    private final JstUploadOtherInOutRequest.JstUploadOtherInOutRequestBuilder requestBuilder = JstUploadOtherInOutRequest.builder();

    public JstUploadOtherInOutSpec(JstOtherStockingClient client) {
        this.client = client;
    }

    /**
     * 是否确认单据；默认false
     */
    public JstUploadOtherInOutSpec isConfirm(Boolean isConfirm) {
        requestBuilder.isConfirm(isConfirm);
        return this;
    }

    /**
     * 是否审核单据；默认false
     */
    public JstUploadOtherInOutSpec excuteConfirming(Boolean excuteConfirming) {
        requestBuilder.excuteConfirming(excuteConfirming);
        return this;
    }

    /**
     * 分仓编号或者三方仓编码
     */
    public JstUploadOtherInOutSpec wmsCoId(Integer wmsCoId) {
        requestBuilder.wmsCoId(wmsCoId);
        return this;
    }

    /**
     * 出入库类型:in是入库（其它退货）out是出库（其它出库）
     */
    public JstUploadOtherInOutSpec type(String type) {
        requestBuilder.type(type);
        return this;
    }

    /**
     * 外部单号（单据上传成功之后对应页面线上单号）
     */
    public JstUploadOtherInOutSpec externalId(String externalId) {
        requestBuilder.externalId(externalId);
        return this;
    }

    /**
     * 默认1 ，主仓=1，销退仓=2，进货仓=3，次品仓=4，自定义1仓=6，自定义2仓=7，自定义3仓=8，自定义4仓=9，自定义5仓=10，自定义6仓=11，自定义7仓=12，自定义8仓=13，自定义9仓=14，自定义10仓=15（对应ERP仓库资料设定页面）
     */
    public JstUploadOtherInOutSpec warehouse(Integer warehouse) {
        requestBuilder.warehouse(warehouse);
        return this;
    }

    /**
     * 备注，不能传空值
     */
    public JstUploadOtherInOutSpec remark(String remark) {
        requestBuilder.remark(remark);
        return this;
    }

    /**
     * 出库类型
     */
    public JstUploadOtherInOutSpec drpCoName(String drpCoName) {
        requestBuilder.drpCoName(drpCoName);
        return this;
    }

    /**
     * 商品列表
     */
    public JstUploadOtherInOutSpec items(java.util.List<JstUploadOtherInOutRequest.Item> items) {
        requestBuilder.items(items);
        return this;
    }

    /**
     * 收件人姓名
     */
    public JstUploadOtherInOutSpec receiverName(String receiverName) {
        requestBuilder.receiverName(receiverName);
        return this;
    }

    /**
     * 收件人手机号
     */
    public JstUploadOtherInOutSpec receiverMobile(String receiverMobile) {
        requestBuilder.receiverMobile(receiverMobile);
        return this;
    }

    /**
     * 收件地址省
     */
    public JstUploadOtherInOutSpec receiverState(String receiverState) {
        requestBuilder.receiverState(receiverState);
        return this;
    }

    /**
     * 收件地址市
     */
    public JstUploadOtherInOutSpec receiverCity(String receiverCity) {
        requestBuilder.receiverCity(receiverCity);
        return this;
    }

    /**
     * 收件地址区|县
     */
    public JstUploadOtherInOutSpec receiverDistrict(String receiverDistrict) {
        requestBuilder.receiverDistrict(receiverDistrict);
        return this;
    }

    /**
     * 收件详细地址
     */
    public JstUploadOtherInOutSpec receiverAddress(String receiverAddress) {
        requestBuilder.receiverAddress(receiverAddress);
        return this;
    }

    /**
     * 标记｜多标签（总length不能超过200）
     */
    public JstUploadOtherInOutSpec labels(java.util.List<String> labels) {
        requestBuilder.labels(labels);
        return this;
    }

    /**
     * 虚拟仓编号(对应虚拟仓设置页面虚拟仓编号):传ID取ID，传名称取名称，二者皆传以ID为准
     */
    public JstUploadOtherInOutSpec lockWhId(Integer lockWhId) {
        requestBuilder.lockWhId(lockWhId);
        return this;
    }

    /**
     * 虚拟仓名称
     */
    public JstUploadOtherInOutSpec lockWhName(String lockWhName) {
        requestBuilder.lockWhName(lockWhName);
        return this;
    }

    /**
     * 物流公司编码
     */
    public JstUploadOtherInOutSpec lcId(String lcId) {
        requestBuilder.lcId(lcId);
        return this;
    }

    /**
     * 物流单号
     */
    public JstUploadOtherInOutSpec lId(String lId) {
        requestBuilder.lId(lId);
        return this;
    }

    /**
     * 物流公司名称
     */
    public JstUploadOtherInOutSpec logisticsCompany(String logisticsCompany) {
        requestBuilder.logisticsCompany(logisticsCompany);
        return this;
    }

    public JstUploadOtherInOutResponse response() {
        return this.client.uploadOtherInOut(requestBuilder.build());
    }
}
