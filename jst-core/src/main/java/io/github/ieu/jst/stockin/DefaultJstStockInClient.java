package io.github.ieu.jst.stockin;

import io.github.ieu.jst.AbstractJstBizClient;
import io.github.ieu.jst.JstConfiguration;
import io.github.ieu.jst.JstErrorCode;
import io.github.ieu.jst.JstServerException;

/**
 * 入库API
 */
public class DefaultJstStockInClient extends AbstractJstBizClient implements JstStockInClient {

    public DefaultJstStockInClient(JstConfiguration configuration) {
        super(configuration);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=7&docId=31">采购入库查询</a>
     */
    @Override
    public JstQueryPurchaseInResponse queryPurchaseIn(JstQueryPurchaseInRequest request) {
        JstQueryPurchaseInResponse response = execute("/open/purchasein/query", request, JstQueryPurchaseInResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=7&docId=31">采购入库查询</a>
     */
    @Override
    public JstQueryPurchaseInSpec queryPurchaseIn() {
        return new JstQueryPurchaseInSpec(this);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=7&docId=32">入库单确认</a>
     */
    @Override
    public JstUploadPurchaseInReceivedResponse uploadPurchaseInReceived(java.util.List<JstUploadPurchaseInReceivedRequest> request) {
        JstUploadPurchaseInReceivedResponse response = execute("/open/purchasein/received/upload", request, JstUploadPurchaseInReceivedResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=7&docId=32">入库单确认</a>
     */
    @Override
    public JstUploadPurchaseInReceivedSpec uploadPurchaseInReceived() {
        return new JstUploadPurchaseInReceivedSpec(this);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=7&docId=270">生成采购入库单-支持批量</a>
     */
    @Override
    public JstCreatePurchaseInBatchResponse createPurchaseInBatch(java.util.List<JstCreatePurchaseInBatchRequest> request) {
        JstCreatePurchaseInBatchResponse response = execute("/open/webapi/wmsapi/purchasein/createbatch", request, JstCreatePurchaseInBatchResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=7&docId=270">生成采购入库单-支持批量</a>
     */
    @Override
    public JstCreatePurchaseInBatchSpec createPurchaseInBatch() {
        return new JstCreatePurchaseInBatchSpec(this);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=7&docId=670">批量录入唯一码</a>
     */
    @Override
    public JstBatchAddSkusnSimpleResponse batchAddSkusnSimple(JstBatchAddSkusnSimpleRequest request) {
        JstBatchAddSkusnSimpleResponse response = execute("/open/webapi/wmsapi/skusn/batchadd/simple", request, JstBatchAddSkusnSimpleResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=7&docId=670">批量录入唯一码</a>
     */
    @Override
    public JstBatchAddSkusnSimpleSpec batchAddSkusnSimple() {
        return new JstBatchAddSkusnSimpleSpec(this);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=7&docId=671">批量录入箱唯一码</a>
     */
    @Override
    public JstBatchAddPacksnResponse batchAddPacksn(JstBatchAddPacksnRequest request) {
        JstBatchAddPacksnResponse response = execute("/open/webapi/wmsapi/packsn/batchadd", request, JstBatchAddPacksnResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=7&docId=671">批量录入箱唯一码</a>
     */
    @Override
    public JstBatchAddPacksnSpec batchAddPacksn() {
        return new JstBatchAddPacksnSpec(this);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=7&docId=901">采购入库查询</a>
     */
    @Override
    public JstQueryPurchaseInDetailsResponse queryPurchaseInDetails(JstQueryPurchaseInDetailsRequest request) {
        JstQueryPurchaseInDetailsResponse response = execute("/open/webapi/wmsapi/purchasein/purchaseinquery", request, JstQueryPurchaseInDetailsResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=7&docId=901">采购入库查询</a>
     */
    @Override
    public JstQueryPurchaseInDetailsSpec queryPurchaseInDetails() {
        return new JstQueryPurchaseInDetailsSpec(this);
    }
}
