package io.github.ieu.jst.seed;

public class JstGetJushuitanWaveSpec {

    private final JstSeedClient client;

    private final JstGetJushuitanWaveRequest.JstGetJushuitanWaveRequestBuilder requestBuilder = JstGetJushuitanWaveRequest.builder();

    public JstGetJushuitanWaveSpec(JstSeedClient client) {
        this.client = client;
    }

    /**
     * 批次号
     */
    public JstGetJushuitanWaveSpec waveId(Integer waveId) {
        requestBuilder.waveId(waveId);
        return this;
    }

    /**
     * 分仓编码（如果是分仓的拣货批次需要传对应的分仓编码）
     */
    public JstGetJushuitanWaveSpec wmsCoId(Number wmsCoId) {
        requestBuilder.wmsCoId(wmsCoId);
        return this;
    }

    public JstGetJushuitanWaveResponse response() {
        return this.client.getJushuitanWave(requestBuilder.build());
    }
}
