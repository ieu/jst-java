package io.github.ieu.jst.wms;

public class JstQueryPreReduceWaveSpec {

    private final JstWmsClient client;

    private final JstQueryPreReduceWaveRequest.JstQueryPreReduceWaveRequestBuilder requestBuilder = JstQueryPreReduceWaveRequest.builder();

    public JstQueryPreReduceWaveSpec(JstWmsClient client) {
        this.client = client;
    }

    /**
     * 批次号列表，最多50个
     */
    public JstQueryPreReduceWaveSpec waveIds(java.util.List<Number> waveIds) {
        requestBuilder.waveIds(waveIds);
        return this;
    }

    public JstQueryPreReduceWaveResponse response() {
        return this.client.queryPreReduceWave(requestBuilder.build());
    }
}
