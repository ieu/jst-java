package io.github.ieu.jst.seed;

public class JstReturnSeedSpec {

    private final JstSeedClient client;

    private final JstReturnSeedRequest.JstReturnSeedRequestBuilder requestBuilder = JstReturnSeedRequest.builder();

    public JstReturnSeedSpec(JstSeedClient client) {
        this.client = client;
    }

    /**
     * 批次号
     */
    public JstReturnSeedSpec waveId(Number waveId) {
        requestBuilder.waveId(waveId);
        return this;
    }

    /**
     * 出库信息集合
     */
    public JstReturnSeedSpec datas(java.util.List<JstReturnSeedRequest.Data> datas) {
        requestBuilder.datas(datas);
        return this;
    }

    public JstReturnSeedResponse response() {
        return this.client.returnSeed(requestBuilder.build());
    }
}
