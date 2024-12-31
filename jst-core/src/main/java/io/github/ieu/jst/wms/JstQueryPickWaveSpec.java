package io.github.ieu.jst.wms;

public class JstQueryPickWaveSpec {

    private final JstWmsClient client;

    private final JstQueryPickWaveRequest.JstQueryPickWaveRequestBuilder requestBuilder = JstQueryPickWaveRequest.builder();

    public JstQueryPickWaveSpec(JstWmsClient client) {
        this.client = client;
    }

    /**
     * 机器人编号
     */
    public JstQueryPickWaveSpec robotId(String robotId) {
        requestBuilder.robotId(robotId);
        return this;
    }

    /**
     * 分仓编号，0 代表主仓本仓
     */
    public JstQueryPickWaveSpec wmsCoId(Number wmsCoId) {
        requestBuilder.wmsCoId(wmsCoId);
        return this;
    }

    /**
     * 仓位
     */
    public JstQueryPickWaveSpec bin(String bin) {
        requestBuilder.bin(bin);
        return this;
    }

    /**
     * 批次号
     */
    public JstQueryPickWaveSpec waveId(Number waveId) {
        requestBuilder.waveId(waveId);
        return this;
    }

    public JstQueryPickWaveResponse response() {
        return this.client.queryPickWave(requestBuilder.build());
    }
}
