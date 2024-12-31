package io.github.ieu.jst.warehouse;

public class JstGetLwhOperationListSpec {

    private final JstWarehouseClient client;

    private final JstGetLwhOperationListRequest.JstGetLwhOperationListRequestBuilder requestBuilder = JstGetLwhOperationListRequest.builder();

    public JstGetLwhOperationListSpec(JstWarehouseClient client) {
        this.client = client;
    }

    /**
     * 单据编号
     */
    public JstGetLwhOperationListSpec ioId(Number ioId) {
        requestBuilder.ioId(ioId);
        return this;
    }

    /**
     * 商品编码列表,多个逗号隔开，最多50个
     */
    public JstGetLwhOperationListSpec skuId(String skuId) {
        requestBuilder.skuId(skuId);
        return this;
    }

    /**
     * 虚拟仓编号
     */
    public JstGetLwhOperationListSpec lwhId(Number lwhId) {
        requestBuilder.lwhId(lwhId);
        return this;
    }

    /**
     * 时间类型（0,1）  0:创建时间，1：审核时间  默认：创建时间
     */
    public JstGetLwhOperationListSpec dateType(Number dateType) {
        requestBuilder.dateType(dateType);
        return this;
    }

    /**
     * 开始时间，开始时间,开始时间结束时间都不传默认查询3个月内
     */
    public JstGetLwhOperationListSpec dateBegin(String dateBegin) {
        requestBuilder.dateBegin(dateBegin);
        return this;
    }

    /**
     * 结束时间，开始时间,开始时间结束时间都不传默认查询3个月内
     */
    public JstGetLwhOperationListSpec dateEnd(String dateEnd) {
        requestBuilder.dateEnd(dateEnd);
        return this;
    }

    /**
     * 外部单号
     */
    public JstGetLwhOperationListSpec soId(String soId) {
        requestBuilder.soId(soId);
        return this;
    }

    /**
     * 状态：Creating：草拟，WaitConfirm：待审核，Confirmed：已生效
     */
    public JstGetLwhOperationListSpec status(String status) {
        requestBuilder.status(status);
        return this;
    }

    /**
     * 单据类型：虚拟仓分配，虚拟仓归还
     */
    public JstGetLwhOperationListSpec type(String type) {
        requestBuilder.type(type);
        return this;
    }

    /**
     * 分页
     */
    public JstGetLwhOperationListSpec page(JstGetLwhOperationListRequest.Page page) {
        requestBuilder.page(page);
        return this;
    }

    public JstGetLwhOperationListResponse response() {
        return this.client.getLwhOperationList(requestBuilder.build());
    }
}
