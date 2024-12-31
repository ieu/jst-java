package io.github.ieu.jst.stockout;

/**
 * 出库API
 */
public interface JstStockOutClient {

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=8&docId=34">销售出库查询</a>
     */
    JstQueryOrderOutSimpleResponse queryOrderOutSimple(JstQueryOrderOutSimpleRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=8&docId=34">销售出库查询</a>
     */
    JstQueryOrderOutSimpleSpec queryOrderOutSimple();

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=8&docId=35">出库发货</a>
     */
    JstUploadWmsSentOrdersResponse uploadWmsSentOrders(java.util.List<JstUploadWmsSentOrdersRequest> request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=8&docId=35">出库发货</a>
     */
    JstUploadWmsSentOrdersSpec uploadWmsSentOrders();

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=8&docId=36">采购退货查询</a>
     */
    JstQueryPurchaseOutResponse queryPurchaseOut(JstQueryPurchaseOutRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=8&docId=36">采购退货查询</a>
     */
    JstQueryPurchaseOutSpec queryPurchaseOut();

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=8&docId=93">采购退货取消</a>
     */
    JstCancelPurchaseOutResponse cancelPurchaseOut(JstCancelPurchaseOutRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=8&docId=93">采购退货取消</a>
     */
    JstCancelPurchaseOutSpec cancelPurchaseOut();

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=8&docId=269">生成采购退货单-支持批量</a>
     */
    JstCreatePurchaseOutBatchResponse createPurchaseOutBatch(java.util.List<JstCreatePurchaseOutBatchRequest> request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=8&docId=269">生成采购退货单-支持批量</a>
     */
    JstCreatePurchaseOutBatchSpec createPurchaseOutBatch();
}
