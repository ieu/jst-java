package io.github.ieu.jst.purchase;

/**
 * 采购API
 */
public interface JstPurchaseClient {

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=6&docId=26">采购单查询</a>
     */
    JstQueryPurchaseResponse queryPurchase(JstQueryPurchaseRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=6&docId=26">采购单查询</a>
     */
    JstQueryPurchaseSpec queryPurchase();

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=6&docId=27">采购单上传</a>
     */
    JstUploadPurchaseResponse uploadPurchase(JstUploadPurchaseRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=6&docId=27">采购单上传</a>
     */
    JstUploadPurchaseSpec uploadPurchase();

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=6&docId=28">供应商上传</a>
     */
    JstUploadSupplierResponse uploadSupplier(java.util.List<JstUploadSupplierRequest> request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=6&docId=28">供应商上传</a>
     */
    JstUploadSupplierSpec uploadSupplier();

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=6&docId=29">供应商查询</a>
     */
    JstQuerySupplierResponse querySupplier(JstQuerySupplierRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=6&docId=29">供应商查询</a>
     */
    JstQuerySupplierSpec querySupplier();

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=6&docId=52">加工单查询</a>
     */
    JstQueryManufactureResponse queryManufacture(JstQueryManufactureRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=6&docId=52">加工单查询</a>
     */
    JstQueryManufactureSpec queryManufacture();

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=6&docId=55">加工单上传</a>
     */
    JstUploadManufactureResponse uploadManufacture(JstUploadManufactureRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=6&docId=55">加工单上传</a>
     */
    JstUploadManufactureSpec uploadManufacture();

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=6&docId=63">采购单加工单标签（新增/移除）</a>
     */
    JstUploadPurchaseLabelResponse uploadPurchaseLabel(JstUploadPurchaseLabelRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=6&docId=63">采购单加工单标签（新增/移除）</a>
     */
    JstUploadPurchaseLabelSpec uploadPurchaseLabel();

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=6&docId=92">预约入库上传</a>
     */
    JstUploadAppointmentInResponse uploadAppointmentIn(JstUploadAppointmentInRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=6&docId=92">预约入库上传</a>
     */
    JstUploadAppointmentInSpec uploadAppointmentIn();

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=6&docId=156">预约入库查询列表</a>
     */
    JstQueryPurchaseBookingResponse queryPurchaseBooking(JstQueryPurchaseBookingRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=6&docId=156">预约入库查询列表</a>
     */
    JstQueryPurchaseBookingSpec queryPurchaseBooking();

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=6&docId=193">变更采购单状态</a>
     */
    JstChangePurchaseStatusResponse changePurchaseStatus(JstChangePurchaseStatusRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=6&docId=193">变更采购单状态</a>
     */
    JstChangePurchaseStatusSpec changePurchaseStatus();

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=6&docId=452">采购单/加工单/预约入库单作废</a>
     */
    JstCancelPurchaseResponse cancelPurchase(JstCancelPurchaseRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=6&docId=452">采购单/加工单/预约入库单作废</a>
     */
    JstCancelPurchaseSpec cancelPurchase();

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=6&docId=698">修改采购单</a>
     */
    JstEditPurchaseResponse editPurchase(JstEditPurchaseRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=6&docId=698">修改采购单</a>
     */
    JstEditPurchaseSpec editPurchase();
}
