package io.github.ieu.jst.purchase;

import io.github.ieu.jst.AbstractJstBizClient;
import io.github.ieu.jst.JstConfiguration;
import io.github.ieu.jst.JstErrorCode;
import io.github.ieu.jst.JstServerException;

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
        JstQueryPurchaseResponse response = execute("/open/purchase/query", request, JstQueryPurchaseResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=6&docId=26">采购单查询</a>
     */
    @Override
    public JstQueryPurchaseSpec queryPurchase() {
        return new JstQueryPurchaseSpec(this);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=6&docId=27">采购单上传</a>
     */
    @Override
    public JstUploadPurchaseResponse uploadPurchase(JstUploadPurchaseRequest request) {
        JstUploadPurchaseResponse response = execute("/open/jushuitan/purchase/upload", request, JstUploadPurchaseResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=6&docId=27">采购单上传</a>
     */
    @Override
    public JstUploadPurchaseSpec uploadPurchase() {
        return new JstUploadPurchaseSpec(this);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=6&docId=28">供应商上传</a>
     */
    @Override
    public JstUploadSupplierResponse uploadSupplier(java.util.List<JstUploadSupplierRequest> request) {
        JstUploadSupplierResponse response = execute("/open/supplier/upload", request, JstUploadSupplierResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=6&docId=28">供应商上传</a>
     */
    @Override
    public JstUploadSupplierSpec uploadSupplier() {
        return new JstUploadSupplierSpec(this);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=6&docId=29">供应商查询</a>
     */
    @Override
    public JstQuerySupplierResponse querySupplier(JstQuerySupplierRequest request) {
        JstQuerySupplierResponse response = execute("/open/supplier/query", request, JstQuerySupplierResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=6&docId=29">供应商查询</a>
     */
    @Override
    public JstQuerySupplierSpec querySupplier() {
        return new JstQuerySupplierSpec(this);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=6&docId=52">加工单查询</a>
     */
    @Override
    public JstQueryManufactureResponse queryManufacture(JstQueryManufactureRequest request) {
        JstQueryManufactureResponse response = execute("/open/jushuitan/manufacture/query", request, JstQueryManufactureResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=6&docId=52">加工单查询</a>
     */
    @Override
    public JstQueryManufactureSpec queryManufacture() {
        return new JstQueryManufactureSpec(this);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=6&docId=55">加工单上传</a>
     */
    @Override
    public JstUploadManufactureResponse uploadManufacture(JstUploadManufactureRequest request) {
        JstUploadManufactureResponse response = execute("/open/jushuitan/manufacture/upload", request, JstUploadManufactureResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=6&docId=55">加工单上传</a>
     */
    @Override
    public JstUploadManufactureSpec uploadManufacture() {
        return new JstUploadManufactureSpec(this);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=6&docId=63">采购单加工单标签（新增/移除）</a>
     */
    @Override
    public JstUploadPurchaseLabelResponse uploadPurchaseLabel(JstUploadPurchaseLabelRequest request) {
        JstUploadPurchaseLabelResponse response = execute("/open/jushuitan/purchaselabel/upload", request, JstUploadPurchaseLabelResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=6&docId=63">采购单加工单标签（新增/移除）</a>
     */
    @Override
    public JstUploadPurchaseLabelSpec uploadPurchaseLabel() {
        return new JstUploadPurchaseLabelSpec(this);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=6&docId=92">预约入库上传</a>
     */
    @Override
    public JstUploadAppointmentInResponse uploadAppointmentIn(JstUploadAppointmentInRequest request) {
        JstUploadAppointmentInResponse response = execute("/open/jushuitan/appointmentin/upload", request, JstUploadAppointmentInResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=6&docId=92">预约入库上传</a>
     */
    @Override
    public JstUploadAppointmentInSpec uploadAppointmentIn() {
        return new JstUploadAppointmentInSpec(this);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=6&docId=156">预约入库查询列表</a>
     */
    @Override
    public JstQueryPurchaseBookingResponse queryPurchaseBooking(JstQueryPurchaseBookingRequest request) {
        JstQueryPurchaseBookingResponse response = execute("/open/jushuitan/purchasebooking/query", request, JstQueryPurchaseBookingResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=6&docId=156">预约入库查询列表</a>
     */
    @Override
    public JstQueryPurchaseBookingSpec queryPurchaseBooking() {
        return new JstQueryPurchaseBookingSpec(this);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=6&docId=193">变更采购单状态</a>
     */
    @Override
    public JstChangePurchaseStatusResponse changePurchaseStatus(JstChangePurchaseStatusRequest request) {
        JstChangePurchaseStatusResponse response = execute("/open/jushuitan/purchase/change/status", request, JstChangePurchaseStatusResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=6&docId=193">变更采购单状态</a>
     */
    @Override
    public JstChangePurchaseStatusSpec changePurchaseStatus() {
        return new JstChangePurchaseStatusSpec(this);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=6&docId=452">采购单/加工单/预约入库单作废</a>
     */
    @Override
    public JstCancelPurchaseResponse cancelPurchase(JstCancelPurchaseRequest request) {
        JstCancelPurchaseResponse response = execute("/open/webapi/wmsapi/purchase/cancel", request, JstCancelPurchaseResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=6&docId=452">采购单/加工单/预约入库单作废</a>
     */
    @Override
    public JstCancelPurchaseSpec cancelPurchase() {
        return new JstCancelPurchaseSpec(this);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=6&docId=698">修改采购单</a>
     */
    @Override
    public JstEditPurchaseResponse editPurchase(JstEditPurchaseRequest request) {
        JstEditPurchaseResponse response = execute("/open/webapi/wmsapi/openpurchase/editpurchase", request, JstEditPurchaseResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=6&docId=698">修改采购单</a>
     */
    @Override
    public JstEditPurchaseSpec editPurchase() {
        return new JstEditPurchaseSpec(this);
    }
}
