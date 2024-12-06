package io.github.ieu.jst.aftersale;

import io.github.ieu.jst.AbstractJstBizClient;
import io.github.ieu.jst.JstConfiguration;

/**
 * 售后API
 */
public class DefaultJstAfterSaleClient extends AbstractJstBizClient implements JstAfterSaleClient {

    public DefaultJstAfterSaleClient(JstConfiguration configuration) {
        super(configuration);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=9&docId=38">退货退款查询</a>
     */
    @Override
    public JstQuerySingleRefundResponse querySingleRefund(JstQuerySingleRefundRequest request) {
        return execute("/open/refund/single/query", request, JstQuerySingleRefundResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=9&docId=40">实际收货查询</a>
     */
    @Override
    public JstQueryAfterSaleReceivedResponse queryAfterSaleReceived(JstQueryAfterSaleReceivedRequest request) {
        return execute("/open/aftersale/received/query", request, JstQueryAfterSaleReceivedResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=9&docId=41">售后上传</a>
     */
    @Override
    public JstUploadAfterSaleResponse uploadAfterSale(java.util.List<JstUploadAfterSaleRequest> request) {
        return execute("/open/aftersale/upload", request, JstUploadAfterSaleResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=9&docId=124">售后上传（无信息件)</a>
     */
    @Override
    public JstUploadNoInfoAfterSaleResponse uploadNoInfoAfterSale(JstUploadNoInfoAfterSaleRequest request) {
        return execute("/open/aftersale/noinfo/upload", request, JstUploadNoInfoAfterSaleResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=9&docId=272">售后-确认收到货物（可分批确认）</a>
     */
    @Override
    public JstConfirmAfterSaleGoodsResponse confirmAfterSaleGoods(java.util.List<JstConfirmAfterSaleGoodsRequest> request) {
        return execute("/open/webapi/aftersaleapi/confirmgoods", request, JstConfirmAfterSaleGoodsResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=9&docId=579">售后单反确认</a>
     */
    @Override
    public JstUnconfirmAfterSaleResponse unconfirmAfterSale(JstUnconfirmAfterSaleRequest request) {
        return execute("/open/webapi/aftersaleapi/open/unconfirm", request, JstUnconfirmAfterSaleResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=9&docId=581">售后单确认</a>
     */
    @Override
    public JstConfirmAfterSaleResponse confirmAfterSale(JstConfirmAfterSaleRequest request) {
        return execute("/open/webapi/aftersaleapi/open/confirm", request, JstConfirmAfterSaleResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=9&docId=743">唯一码批量确认收货</a>
     */
    @Override
    public JstConfirmGoodsBySkusnsResponse confirmGoodsBySkusns(java.util.List<JstConfirmGoodsBySkusnsRequest> request) {
        return execute("/open/webapi/aftersaleapi/confirmgoodsbyskusns", request, JstConfirmGoodsBySkusnsResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=9&docId=982">退款单查询</a>
     */
    @Override
    public JstPayQueryAsModifiedAfterSaleResponse payQueryAsModifiedAfterSale(JstPayQueryAsModifiedAfterSaleRequest request) {
        return execute("/open/webapi/aftersaleapi/pay/payqueryasmodified", request, JstPayQueryAsModifiedAfterSaleResponse.class);
    }
}
