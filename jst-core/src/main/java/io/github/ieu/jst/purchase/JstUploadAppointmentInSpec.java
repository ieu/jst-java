package io.github.ieu.jst.purchase;

public class JstUploadAppointmentInSpec {

    private final JstPurchaseClient client;

    private final JstUploadAppointmentInRequest.JstUploadAppointmentInRequestBuilder requestBuilder = JstUploadAppointmentInRequest.builder();

    public JstUploadAppointmentInSpec(JstPurchaseClient client) {
        this.client = client;
    }

    /**
     * 采购单号列表，最大10个，无采购预约入库，供应商内部id必填
     */
    public JstUploadAppointmentInSpec poIds(java.util.List<Integer> poIds) {
        requestBuilder.poIds(poIds);
        return this;
    }

    /**
     * 分仓编号
     */
    public JstUploadAppointmentInSpec wmsCoId(Integer wmsCoId) {
        requestBuilder.wmsCoId(wmsCoId);
        return this;
    }

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/bf26d89f-d1f7-439e-b773-2f125e57764f_1534_487.png" target="_blank">供应商内部编号</a></div>无采购单时必填
     */
    public JstUploadAppointmentInSpec supplierId(Integer supplierId) {
        requestBuilder.supplierId(supplierId);
        return this;
    }

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/3db29488-c665-453c-82f4-4156f31995b8_1617_196.png" target="_blank">外部预约单号</a></div>
     */
    public JstUploadAppointmentInSpec externalId(String externalId) {
        requestBuilder.externalId(externalId);
        return this;
    }

    /**
     * 预约到货时间
     */
    public JstUploadAppointmentInSpec planArriveDate(String planArriveDate) {
        requestBuilder.planArriveDate(planArriveDate);
        return this;
    }

    /**
     * 备注
     */
    public JstUploadAppointmentInSpec remark(String remark) {
        requestBuilder.remark(remark);
        return this;
    }

    /**
     * 送货地址
     */
    public JstUploadAppointmentInSpec sendAddress(String sendAddress) {
        requestBuilder.sendAddress(sendAddress);
        return this;
    }

    /**
     * 商品类型；可选值：成品；半成品；原材料
     */
    public JstUploadAppointmentInSpec itemType(String itemType) {
        requestBuilder.itemType(itemType);
        return this;
    }

    /**
     * 商品列表
     */
    public JstUploadAppointmentInSpec items(java.util.List<JstUploadAppointmentInRequest.Item> items) {
        requestBuilder.items(items);
        return this;
    }

    /**
     * 是否自动确认；默认false
     */
    public JstUploadAppointmentInSpec isConfirm(Boolean isConfirm) {
        requestBuilder.isConfirm(isConfirm);
        return this;
    }

    public JstUploadAppointmentInResponse response() {
        return this.client.uploadAppointmentIn(requestBuilder.build());
    }
}
