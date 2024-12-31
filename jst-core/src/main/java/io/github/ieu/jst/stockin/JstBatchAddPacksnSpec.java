package io.github.ieu.jst.stockin;

public class JstBatchAddPacksnSpec {

    private final JstStockInClient client;

    private final JstBatchAddPacksnRequest.JstBatchAddPacksnRequestBuilder requestBuilder = JstBatchAddPacksnRequest.builder();

    public JstBatchAddPacksnSpec(JstStockInClient client) {
        this.client = client;
    }

    public JstBatchAddPacksnSpec packSnList(java.util.List<JstBatchAddPacksnRequest.PackSn> packSnList) {
        requestBuilder.packSnList(packSnList);
        return this;
    }

    /**
     * 1:待入库 2:入库 3:出库，其它值：待入库（不传默认是查询待入库单据）
     */
    public JstBatchAddPacksnSpec status(Number status) {
        requestBuilder.status(status);
        return this;
    }

    public JstBatchAddPacksnResponse response() {
        return this.client.batchAddPacksn(requestBuilder.build());
    }
}
