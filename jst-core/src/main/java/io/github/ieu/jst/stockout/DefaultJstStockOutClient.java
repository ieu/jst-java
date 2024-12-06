package io.github.ieu.jst.stockout;

import io.github.ieu.jst.AbstractJstBizClient;
import io.github.ieu.jst.JstConfiguration;

/**
 * 出库API
 */
public class DefaultJstStockOutClient extends AbstractJstBizClient implements JstStockOutClient {

    public DefaultJstStockOutClient(JstConfiguration configuration) {
        super(configuration);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=8&docId=34">销售出库查询</a>
     */
    @Override
    public JstQueryOrderOutSimpleResponse queryOrderOutSimple(JstQueryOrderOutSimpleRequest request) {
        return execute("/open/orders/out/simple/query", request, JstQueryOrderOutSimpleResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=8&docId=35">出库发货</a>
     */
    @Override
    public JstUploadWmsSentOrdersResponse uploadWmsSentOrders(java.util.List<JstUploadWmsSentOrdersRequest> request) {
        return execute("/open/orders/wms/sent/upload", request, JstUploadWmsSentOrdersResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=8&docId=36">采购退货查询</a>
     */
    @Override
    public JstQueryPurchaseOutResponse queryPurchaseOut(JstQueryPurchaseOutRequest request) {
        return execute("/open/purchaseout/query", request, JstQueryPurchaseOutResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=8&docId=93">采购退货取消</a>
     */
    @Override
    public JstCancelPurchaseOutResponse cancelPurchaseOut(JstCancelPurchaseOutRequest request) {
        return execute("/open/jushuitan/purchaseout/cancel", request, JstCancelPurchaseOutResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=8&docId=269">生成采购退货单-支持批量</a>
     */
    @Override
    public JstCreatePurchaseOutBatchResponse createPurchaseOutBatch(java.util.List<JstCreatePurchaseOutBatchRequest> request) {
        return execute("/open/webapi/wmsapi/purchaseout/createbatch", request, JstCreatePurchaseOutBatchResponse.class);
    }
}
