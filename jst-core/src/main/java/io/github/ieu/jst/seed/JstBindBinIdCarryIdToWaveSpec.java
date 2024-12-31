package io.github.ieu.jst.seed;

public class JstBindBinIdCarryIdToWaveSpec {

    private final JstSeedClient client;

    private final JstBindBinIdCarryIdToWaveRequest.JstBindBinIdCarryIdToWaveRequestBuilder requestBuilder = JstBindBinIdCarryIdToWaveRequest.builder();

    public JstBindBinIdCarryIdToWaveSpec(JstSeedClient client) {
        this.client = client;
    }

    /**
     * 出库单信息
     */
    public JstBindBinIdCarryIdToWaveSpec ioIds(java.util.List<JstBindBinIdCarryIdToWaveRequest.IoId> ioIds) {
        requestBuilder.ioIds(ioIds);
        return this;
    }

    /**
     * 批次编码
     */
    public JstBindBinIdCarryIdToWaveSpec waveId(String waveId) {
        requestBuilder.waveId(waveId);
        return this;
    }

    /**
     * 车号
     */
    public JstBindBinIdCarryIdToWaveSpec carryId(String carryId) {
        requestBuilder.carryId(carryId);
        return this;
    }

    public JstBindBinIdCarryIdToWaveResponse response() {
        return this.client.bindBinIdCarryIdToWave(requestBuilder.build());
    }
}
