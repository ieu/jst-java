package io.github.ieu.jst.warehouse;

public class JstGetPageLockPurchasesSpec {

    private final JstWarehouseClient client;

    private final JstGetPageLockPurchasesRequest.JstGetPageLockPurchasesRequestBuilder requestBuilder = JstGetPageLockPurchasesRequest.builder();

    public JstGetPageLockPurchasesSpec(JstWarehouseClient client) {
        this.client = client;
    }

    /**
     * 申请号
     */
    public JstGetPageLockPurchasesSpec autoId(Integer autoId) {
        requestBuilder.autoId(autoId);
        return this;
    }

    /**
     * 虚拟仓编码
     */
    public JstGetPageLockPurchasesSpec lwhId(Integer lwhId) {
        requestBuilder.lwhId(lwhId);
        return this;
    }

    /**
     * 分仓号
     */
    public JstGetPageLockPurchasesSpec wmsCoId(Integer wmsCoId) {
        requestBuilder.wmsCoId(wmsCoId);
        return this;
    }

    /**
     * 状态
     */
    public JstGetPageLockPurchasesSpec status(String status) {
        requestBuilder.status(status);
        return this;
    }

    /**
     * 备注
     */
    public JstGetPageLockPurchasesSpec remark(String remark) {
        requestBuilder.remark(remark);
        return this;
    }

    /**
     * 创建时间起始
     */
    public JstGetPageLockPurchasesSpec createTimeBegin(String createTimeBegin) {
        requestBuilder.createTimeBegin(createTimeBegin);
        return this;
    }

    /**
     * 创建时间结束
     */
    public JstGetPageLockPurchasesSpec createTimeEnd(String createTimeEnd) {
        requestBuilder.createTimeEnd(createTimeEnd);
        return this;
    }

    /**
     * 更新时间起始
     */
    public JstGetPageLockPurchasesSpec modifiedBegin(String modifiedBegin) {
        requestBuilder.modifiedBegin(modifiedBegin);
        return this;
    }

    /**
     * 更新时间结束
     */
    public JstGetPageLockPurchasesSpec modifiedEnd(String modifiedEnd) {
        requestBuilder.modifiedEnd(modifiedEnd);
        return this;
    }

    public JstGetPageLockPurchasesSpec page(JstGetPageLockPurchasesRequest.Page page) {
        requestBuilder.page(page);
        return this;
    }

    public JstGetPageLockPurchasesResponse response() {
        return this.client.getPageLockPurchases(requestBuilder.build());
    }
}
