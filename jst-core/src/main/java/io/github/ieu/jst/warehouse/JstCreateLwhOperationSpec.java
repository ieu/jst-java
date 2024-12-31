package io.github.ieu.jst.warehouse;

public class JstCreateLwhOperationSpec {

    private final JstWarehouseClient client;

    private final JstCreateLwhOperationRequest.JstCreateLwhOperationRequestBuilder requestBuilder = JstCreateLwhOperationRequest.builder();

    public JstCreateLwhOperationSpec(JstWarehouseClient client) {
        this.client = client;
    }

    /**
     * 虚拟仓编码
     */
    public JstCreateLwhOperationSpec lwhId(Number lwhId) {
        requestBuilder.lwhId(lwhId);
        return this;
    }

    /**
     * 是否审核生效 默认false
     */
    public JstCreateLwhOperationSpec examine(Boolean examine) {
        requestBuilder.examine(examine);
        return this;
    }

    /**
     * 仓储编码 若使用虚拟仓分仓则必填
     */
    public JstCreateLwhOperationSpec wmsCoId(Number wmsCoId) {
        requestBuilder.wmsCoId(wmsCoId);
        return this;
    }

    /**
     * 外部单号 唯一
     */
    public JstCreateLwhOperationSpec soId(String soId) {
        requestBuilder.soId(soId);
        return this;
    }

    /**
     * 类型 虚拟仓分配 虚拟仓归还
     */
    public JstCreateLwhOperationSpec type(String type) {
        requestBuilder.type(type);
        return this;
    }

    public JstCreateLwhOperationSpec items(java.util.List<JstCreateLwhOperationRequest.Item> items) {
        requestBuilder.items(items);
        return this;
    }

    /**
     * 是否超锁，examine = true 的时候这个入参才有效（true：允许超锁，false：不允许超锁）不传为默认值 false
     */
    public JstCreateLwhOperationSpec isIgnoreCheckStock(Boolean isIgnoreCheckStock) {
        requestBuilder.isIgnoreCheckStock(isIgnoreCheckStock);
        return this;
    }

    public JstCreateLwhOperationResponse response() {
        return this.client.createLwhOperation(requestBuilder.build());
    }
}
