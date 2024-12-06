package io.github.ieu.jst.stockin;

/**
 * 入库API
 */
public interface JstStockInClient {

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=7&docId=31">采购入库查询</a>
     */
    JstQueryPurchaseInResponse queryPurchaseIn(JstQueryPurchaseInRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=7&docId=32">入库单确认</a>
     */
    JstUploadPurchaseInReceivedResponse uploadPurchaseInReceived(java.util.List<JstUploadPurchaseInReceivedRequest> request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=7&docId=270">生成采购入库单-支持批量</a>
     */
    JstCreatePurchaseInBatchResponse createPurchaseInBatch(java.util.List<JstCreatePurchaseInBatchRequest> request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=7&docId=670">批量录入唯一码</a>
     */
    JstBatchAddSkusnSimpleResponse batchAddSkusnSimple(JstBatchAddSkusnSimpleRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=7&docId=671">批量录入箱唯一码</a>
     */
    JstBatchAddPacksnResponse batchAddPacksn(JstBatchAddPacksnRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=7&docId=901">采购入库查询</a>
     */
    JstQueryPurchaseInDetailsResponse queryPurchaseInDetails(JstQueryPurchaseInDetailsRequest request);
}
