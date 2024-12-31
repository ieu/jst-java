package io.github.ieu.jst.warehouse;

public class JstCreateLwhAllocationSpec {

    private final JstWarehouseClient client;

    private final JstCreateLwhAllocationRequest.JstCreateLwhAllocationRequestBuilder requestBuilder = JstCreateLwhAllocationRequest.builder();

    public JstCreateLwhAllocationSpec(JstWarehouseClient client) {
        this.client = client;
    }

    /**
     * 调出虚拟仓
     */
    public JstCreateLwhAllocationSpec outLwhId(Number outLwhId) {
        requestBuilder.outLwhId(outLwhId);
        return this;
    }

    /**
     * 是否审核生效
     */
    public JstCreateLwhAllocationSpec examine(Boolean examine) {
        requestBuilder.examine(examine);
        return this;
    }

    /**
     * 调入虚拟仓
     */
    public JstCreateLwhAllocationSpec inLwhId(Number inLwhId) {
        requestBuilder.inLwhId(inLwhId);
        return this;
    }

    /**
     * 实体仓编码
     */
    public JstCreateLwhAllocationSpec wmsCoId(Number wmsCoId) {
        requestBuilder.wmsCoId(wmsCoId);
        return this;
    }

    /**
     * 外部单号,保持
     */
    public JstCreateLwhAllocationSpec soId(String soId) {
        requestBuilder.soId(soId);
        return this;
    }

    /**
     * 备注
     */
    public JstCreateLwhAllocationSpec remark(String remark) {
        requestBuilder.remark(remark);
        return this;
    }

    public JstCreateLwhAllocationSpec items(java.util.List<JstCreateLwhAllocationRequest.Item> items) {
        requestBuilder.items(items);
        return this;
    }

    public JstCreateLwhAllocationResponse response() {
        return this.client.createLwhAllocation(requestBuilder.build());
    }
}
