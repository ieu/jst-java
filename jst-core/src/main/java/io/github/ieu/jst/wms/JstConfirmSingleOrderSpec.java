package io.github.ieu.jst.wms;

public class JstConfirmSingleOrderSpec {

    private final JstWmsClient client;

    private final JstConfirmSingleOrderRequest.JstConfirmSingleOrderRequestBuilder requestBuilder = JstConfirmSingleOrderRequest.builder();

    public JstConfirmSingleOrderSpec(JstWmsClient client) {
        this.client = client;
    }

    /**
     * ERP内部供应商编号
     */
    public JstConfirmSingleOrderSpec supplierId(Number supplierId) {
        requestBuilder.supplierId(supplierId);
        return this;
    }

    /**
     * 外部采购入库单号，唯一
     */
    public JstConfirmSingleOrderSpec externalId(String externalId) {
        requestBuilder.externalId(externalId);
        return this;
    }

    /**
     * 分仓编码
     */
    public JstConfirmSingleOrderSpec wmsCoId(Number wmsCoId) {
        requestBuilder.wmsCoId(wmsCoId);
        return this;
    }

    /**
     * ERP内部采购单号
     */
    public JstConfirmSingleOrderSpec poId(Number poId) {
        requestBuilder.poId(poId);
        return this;
    }

    /**
     * 备注
     */
    public JstConfirmSingleOrderSpec remark(String remark) {
        requestBuilder.remark(remark);
        return this;
    }

    /**
     * 税率
     */
    public JstConfirmSingleOrderSpec taxRate(Number taxRate) {
        requestBuilder.taxRate(taxRate);
        return this;
    }

    /**
     * 货主仓库编码
     */
    public JstConfirmSingleOrderSpec coId(Number coId) {
        requestBuilder.coId(coId);
        return this;
    }

    /**
     * 快递公司代码
     */
    public JstConfirmSingleOrderSpec lcId(String lcId) {
        requestBuilder.lcId(lcId);
        return this;
    }

    /**
     * 商品信息
     */
    public JstConfirmSingleOrderSpec items(java.util.List<JstConfirmSingleOrderRequest.Item> items) {
        requestBuilder.items(items);
        return this;
    }

    public JstConfirmSingleOrderResponse response() {
        return this.client.confirmSingleOrder(requestBuilder.build());
    }
}
