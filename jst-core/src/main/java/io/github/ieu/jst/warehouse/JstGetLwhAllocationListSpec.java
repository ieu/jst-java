package io.github.ieu.jst.warehouse;

public class JstGetLwhAllocationListSpec {

    private final JstWarehouseClient client;

    private final JstGetLwhAllocationListRequest.JstGetLwhAllocationListRequestBuilder requestBuilder = JstGetLwhAllocationListRequest.builder();

    public JstGetLwhAllocationListSpec(JstWarehouseClient client) {
        this.client = client;
    }

    /**
     * 单据编号
     */
    public JstGetLwhAllocationListSpec ioId(Number ioId) {
        requestBuilder.ioId(ioId);
        return this;
    }

    /**
     * 商品编码列表,多个逗号隔开，最多50个
     */
    public JstGetLwhAllocationListSpec skuId(String skuId) {
        requestBuilder.skuId(skuId);
        return this;
    }

    /**
     * 调出虚拟仓编号
     */
    public JstGetLwhAllocationListSpec outLwhId(Number outLwhId) {
        requestBuilder.outLwhId(outLwhId);
        return this;
    }

    /**
     * 时间类型（0,1）  0:创建时间，1：审核时间  默认：创建时间
     */
    public JstGetLwhAllocationListSpec dateType(Number dateType) {
        requestBuilder.dateType(dateType);
        return this;
    }

    /**
     * 开始时间，开始时间,开始时间结束时间都不传默认查询3个月内
     */
    public JstGetLwhAllocationListSpec dateBegin(String dateBegin) {
        requestBuilder.dateBegin(dateBegin);
        return this;
    }

    /**
     * 结束时间，开始时间,开始时间结束时间都不传默认查询3个月内
     */
    public JstGetLwhAllocationListSpec dateEnd(String dateEnd) {
        requestBuilder.dateEnd(dateEnd);
        return this;
    }

    /**
     * 外部单号，保持唯一
     */
    public JstGetLwhAllocationListSpec soId(String soId) {
        requestBuilder.soId(soId);
        return this;
    }

    /**
     * 状态：Creating：草拟，WaitConfirm：待审核，Confirmed：已生效
     */
    public JstGetLwhAllocationListSpec status(String status) {
        requestBuilder.status(status);
        return this;
    }

    /**
     * 分页
     */
    public JstGetLwhAllocationListSpec page(JstGetLwhAllocationListRequest.Page page) {
        requestBuilder.page(page);
        return this;
    }

    public JstGetLwhAllocationListResponse response() {
        return this.client.getLwhAllocationList(requestBuilder.build());
    }
}
