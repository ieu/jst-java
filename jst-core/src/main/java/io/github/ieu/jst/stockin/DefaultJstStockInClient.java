package io.github.ieu.jst.stockin;

import io.github.ieu.jst.AbstractJstBizClient;
import io.github.ieu.jst.JstConfiguration;

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
        return execute("/open/purchasein/query", request, JstQueryPurchaseInResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=7&docId=32">入库单确认</a>
     */
    @Override
    public JstUploadPurchaseInReceivedResponse uploadPurchaseInReceived(java.util.List<JstUploadPurchaseInReceivedRequest> request) {
        return execute("/open/purchasein/received/upload", request, JstUploadPurchaseInReceivedResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=7&docId=270">生成采购入库单-支持批量</a>
     */
    @Override
    public JstCreatePurchaseInBatchResponse createPurchaseInBatch(java.util.List<JstCreatePurchaseInBatchRequest> request) {
        return execute("/open/webapi/wmsapi/purchasein/createbatch", request, JstCreatePurchaseInBatchResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=7&docId=670">批量录入唯一码</a>
     */
    @Override
    public JstBatchAddSkusnSimpleResponse batchAddSkusnSimple(JstBatchAddSkusnSimpleRequest request) {
        return execute("/open/webapi/wmsapi/skusn/batchadd/simple", request, JstBatchAddSkusnSimpleResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=7&docId=671">批量录入箱唯一码</a>
     */
    @Override
    public JstBatchAddPacksnResponse batchAddPacksn(JstBatchAddPacksnRequest request) {
        return execute("/open/webapi/wmsapi/packsn/batchadd", request, JstBatchAddPacksnResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=7&docId=901">采购入库查询</a>
     */
    @Override
    public JstQueryPurchaseInDetailsResponse queryPurchaseInDetails(JstQueryPurchaseInDetailsRequest request) {
        return execute("/open/webapi/wmsapi/purchasein/purchaseinquery", request, JstQueryPurchaseInDetailsResponse.class);
    }
}
