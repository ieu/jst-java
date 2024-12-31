package io.github.ieu.jst.aftersale;

/**
 * 售后API
 */
public interface JstAfterSaleClient {

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=9&docId=38">退货退款查询</a>
     */
    JstQuerySingleRefundResponse querySingleRefund(JstQuerySingleRefundRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=9&docId=38">退货退款查询</a>
     */
    JstQuerySingleRefundSpec querySingleRefund();

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=9&docId=40">实际收货查询</a>
     */
    JstQueryAfterSaleReceivedResponse queryAfterSaleReceived(JstQueryAfterSaleReceivedRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=9&docId=40">实际收货查询</a>
     */
    JstQueryAfterSaleReceivedSpec queryAfterSaleReceived();

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=9&docId=41">售后上传</a>
     */
    JstUploadAfterSaleResponse uploadAfterSale(java.util.List<JstUploadAfterSaleRequest> request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=9&docId=41">售后上传</a>
     */
    JstUploadAfterSaleSpec uploadAfterSale();

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=9&docId=124">售后上传（无信息件)</a>
     */
    JstUploadNoInfoAfterSaleResponse uploadNoInfoAfterSale(JstUploadNoInfoAfterSaleRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=9&docId=124">售后上传（无信息件)</a>
     */
    JstUploadNoInfoAfterSaleSpec uploadNoInfoAfterSale();

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=9&docId=272">售后-确认收到货物（可分批确认）</a>
     */
    JstConfirmAfterSaleGoodsResponse confirmAfterSaleGoods(java.util.List<JstConfirmAfterSaleGoodsRequest> request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=9&docId=272">售后-确认收到货物（可分批确认）</a>
     */
    JstConfirmAfterSaleGoodsSpec confirmAfterSaleGoods();

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=9&docId=579">售后单反确认</a>
     */
    JstUnconfirmAfterSaleResponse unconfirmAfterSale(JstUnconfirmAfterSaleRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=9&docId=579">售后单反确认</a>
     */
    JstUnconfirmAfterSaleSpec unconfirmAfterSale();

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=9&docId=581">售后单确认</a>
     */
    JstConfirmAfterSaleResponse confirmAfterSale(JstConfirmAfterSaleRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=9&docId=581">售后单确认</a>
     */
    JstConfirmAfterSaleSpec confirmAfterSale();

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=9&docId=743">唯一码批量确认收货</a>
     */
    JstConfirmGoodsBySkusnsResponse confirmGoodsBySkusns(java.util.List<JstConfirmGoodsBySkusnsRequest> request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=9&docId=743">唯一码批量确认收货</a>
     */
    JstConfirmGoodsBySkusnsSpec confirmGoodsBySkusns();

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=9&docId=982">退款单查询</a>
     */
    JstPayQueryAsModifiedAfterSaleResponse payQueryAsModifiedAfterSale(JstPayQueryAsModifiedAfterSaleRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=9&docId=982">退款单查询</a>
     */
    JstPayQueryAsModifiedAfterSaleSpec payQueryAsModifiedAfterSale();
}
