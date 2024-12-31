package io.github.ieu.jst.warehouse;

public class JstGetVirtualStockSpec {

    private final JstWarehouseClient client;

    private final JstGetVirtualStockRequest.JstGetVirtualStockRequestBuilder requestBuilder = JstGetVirtualStockRequest.builder();

    public JstGetVirtualStockSpec(JstWarehouseClient client) {
        this.client = client;
    }

    /**
     * 分仓编码
     */
    public JstGetVirtualStockSpec wmsCoId(String wmsCoId) {
        requestBuilder.wmsCoId(wmsCoId);
        return this;
    }

    /**
     * 商品编码；与修改时间查询条件不能同时为空
     */
    public JstGetVirtualStockSpec skuIds(java.util.List<String> skuIds) {
        requestBuilder.skuIds(skuIds);
        return this;
    }

    /**
     * 修改起始时间；与商品编码查询条件不能同时为空
     */
    public JstGetVirtualStockSpec modifiedBegin(String modifiedBegin) {
        requestBuilder.modifiedBegin(modifiedBegin);
        return this;
    }

    /**
     * 修改结束时间；与商品编码查询条件不能同时为空
     */
    public JstGetVirtualStockSpec modifiedEnd(String modifiedEnd) {
        requestBuilder.modifiedEnd(modifiedEnd);
        return this;
    }

    public JstGetVirtualStockSpec page(JstGetVirtualStockRequest.Page page) {
        requestBuilder.page(page);
        return this;
    }

    public JstGetVirtualStockResponse response() {
        return this.client.getVirtualStock(requestBuilder.build());
    }
}
