package io.github.ieu.jst.purchase;

import io.github.ieu.jst.AbstractJstBizClient;
import io.github.ieu.jst.JstConfiguration;

/**
 * 采购API
 */
public class DefaultJstPurchaseClient extends AbstractJstBizClient implements JstPurchaseClient {

    public DefaultJstPurchaseClient(JstConfiguration configuration) {
        super(configuration);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=6&docId=26">采购单查询</a>
     */
    @Override
    public JstQueryPurchaseResponse queryPurchase(JstQueryPurchaseRequest request) {
        return execute("/open/purchase/query", request, JstQueryPurchaseResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=6&docId=27">采购单上传</a>
     */
    @Override
    public JstUploadPurchaseResponse uploadPurchase(JstUploadPurchaseRequest request) {
        return execute("/open/jushuitan/purchase/upload", request, JstUploadPurchaseResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=6&docId=28">供应商上传</a>
     */
    @Override
    public JstUploadSupplierResponse uploadSupplier(java.util.List<JstUploadSupplierRequest> request) {
        return execute("/open/supplier/upload", request, JstUploadSupplierResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=6&docId=29">供应商查询</a>
     */
    @Override
    public JstQuerySupplierResponse querySupplier(JstQuerySupplierRequest request) {
        return execute("/open/supplier/query", request, JstQuerySupplierResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=6&docId=52">加工单查询</a>
     */
    @Override
    public JstQueryManufactureResponse queryManufacture(JstQueryManufactureRequest request) {
        return execute("/open/jushuitan/manufacture/query", request, JstQueryManufactureResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=6&docId=55">加工单上传</a>
     */
    @Override
    public JstUploadManufactureResponse uploadManufacture(JstUploadManufactureRequest request) {
        return execute("/open/jushuitan/manufacture/upload", request, JstUploadManufactureResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=6&docId=63">采购单加工单标签（新增/移除）</a>
     */
    @Override
    public JstUploadPurchaseLabelResponse uploadPurchaseLabel(JstUploadPurchaseLabelRequest request) {
        return execute("/open/jushuitan/purchaselabel/upload", request, JstUploadPurchaseLabelResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=6&docId=92">预约入库上传</a>
     */
    @Override
    public JstUploadAppointmentInResponse uploadAppointmentIn(JstUploadAppointmentInRequest request) {
        return execute("/open/jushuitan/appointmentin/upload", request, JstUploadAppointmentInResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=6&docId=156">预约入库查询列表</a>
     */
    @Override
    public JstQueryPurchaseBookingResponse queryPurchaseBooking(JstQueryPurchaseBookingRequest request) {
        return execute("/open/jushuitan/purchasebooking/query", request, JstQueryPurchaseBookingResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=6&docId=193">变更采购单状态</a>
     */
    @Override
    public JstChangePurchaseStatusResponse changePurchaseStatus(JstChangePurchaseStatusRequest request) {
        return execute("/open/jushuitan/purchase/change/status", request, JstChangePurchaseStatusResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=6&docId=452">采购单/加工单/预约入库单作废</a>
     */
    @Override
    public JstCancelPurchaseResponse cancelPurchase(JstCancelPurchaseRequest request) {
        return execute("/open/webapi/wmsapi/purchase/cancel", request, JstCancelPurchaseResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=6&docId=698">修改采购单</a>
     */
    @Override
    public JstEditPurchaseResponse editPurchase(JstEditPurchaseRequest request) {
        return execute("/open/webapi/wmsapi/openpurchase/editpurchase", request, JstEditPurchaseResponse.class);
    }
}
