package io.github.ieu.jst.aftersale;

import io.github.ieu.jst.AbstractJstBizClient;
import io.github.ieu.jst.JstConfiguration;
import io.github.ieu.jst.JstErrorCode;
import io.github.ieu.jst.JstServerException;

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
        JstQuerySingleRefundResponse response = execute("/open/refund/single/query", request, JstQuerySingleRefundResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=9&docId=38">退货退款查询</a>
     */
    @Override
    public JstQuerySingleRefundSpec querySingleRefund() {
        return new JstQuerySingleRefundSpec(this);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=9&docId=40">实际收货查询</a>
     */
    @Override
    public JstQueryAfterSaleReceivedResponse queryAfterSaleReceived(JstQueryAfterSaleReceivedRequest request) {
        JstQueryAfterSaleReceivedResponse response = execute("/open/aftersale/received/query", request, JstQueryAfterSaleReceivedResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=9&docId=40">实际收货查询</a>
     */
    @Override
    public JstQueryAfterSaleReceivedSpec queryAfterSaleReceived() {
        return new JstQueryAfterSaleReceivedSpec(this);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=9&docId=41">售后上传</a>
     */
    @Override
    public JstUploadAfterSaleResponse uploadAfterSale(java.util.List<JstUploadAfterSaleRequest> request) {
        JstUploadAfterSaleResponse response = execute("/open/aftersale/upload", request, JstUploadAfterSaleResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=9&docId=41">售后上传</a>
     */
    @Override
    public JstUploadAfterSaleSpec uploadAfterSale() {
        return new JstUploadAfterSaleSpec(this);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=9&docId=124">售后上传（无信息件)</a>
     */
    @Override
    public JstUploadNoInfoAfterSaleResponse uploadNoInfoAfterSale(JstUploadNoInfoAfterSaleRequest request) {
        JstUploadNoInfoAfterSaleResponse response = execute("/open/aftersale/noinfo/upload", request, JstUploadNoInfoAfterSaleResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=9&docId=124">售后上传（无信息件)</a>
     */
    @Override
    public JstUploadNoInfoAfterSaleSpec uploadNoInfoAfterSale() {
        return new JstUploadNoInfoAfterSaleSpec(this);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=9&docId=272">售后-确认收到货物（可分批确认）</a>
     */
    @Override
    public JstConfirmAfterSaleGoodsResponse confirmAfterSaleGoods(java.util.List<JstConfirmAfterSaleGoodsRequest> request) {
        JstConfirmAfterSaleGoodsResponse response = execute("/open/webapi/aftersaleapi/confirmgoods", request, JstConfirmAfterSaleGoodsResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=9&docId=272">售后-确认收到货物（可分批确认）</a>
     */
    @Override
    public JstConfirmAfterSaleGoodsSpec confirmAfterSaleGoods() {
        return new JstConfirmAfterSaleGoodsSpec(this);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=9&docId=579">售后单反确认</a>
     */
    @Override
    public JstUnconfirmAfterSaleResponse unconfirmAfterSale(JstUnconfirmAfterSaleRequest request) {
        JstUnconfirmAfterSaleResponse response = execute("/open/webapi/aftersaleapi/open/unconfirm", request, JstUnconfirmAfterSaleResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=9&docId=579">售后单反确认</a>
     */
    @Override
    public JstUnconfirmAfterSaleSpec unconfirmAfterSale() {
        return new JstUnconfirmAfterSaleSpec(this);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=9&docId=581">售后单确认</a>
     */
    @Override
    public JstConfirmAfterSaleResponse confirmAfterSale(JstConfirmAfterSaleRequest request) {
        JstConfirmAfterSaleResponse response = execute("/open/webapi/aftersaleapi/open/confirm", request, JstConfirmAfterSaleResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=9&docId=581">售后单确认</a>
     */
    @Override
    public JstConfirmAfterSaleSpec confirmAfterSale() {
        return new JstConfirmAfterSaleSpec(this);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=9&docId=743">唯一码批量确认收货</a>
     */
    @Override
    public JstConfirmGoodsBySkusnsResponse confirmGoodsBySkusns(java.util.List<JstConfirmGoodsBySkusnsRequest> request) {
        JstConfirmGoodsBySkusnsResponse response = execute("/open/webapi/aftersaleapi/confirmgoodsbyskusns", request, JstConfirmGoodsBySkusnsResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=9&docId=743">唯一码批量确认收货</a>
     */
    @Override
    public JstConfirmGoodsBySkusnsSpec confirmGoodsBySkusns() {
        return new JstConfirmGoodsBySkusnsSpec(this);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=9&docId=982">退款单查询</a>
     */
    @Override
    public JstPayQueryAsModifiedAfterSaleResponse payQueryAsModifiedAfterSale(JstPayQueryAsModifiedAfterSaleRequest request) {
        JstPayQueryAsModifiedAfterSaleResponse response = execute("/open/webapi/aftersaleapi/pay/payqueryasmodified", request, JstPayQueryAsModifiedAfterSaleResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=9&docId=982">退款单查询</a>
     */
    @Override
    public JstPayQueryAsModifiedAfterSaleSpec payQueryAsModifiedAfterSale() {
        return new JstPayQueryAsModifiedAfterSaleSpec(this);
    }
}
