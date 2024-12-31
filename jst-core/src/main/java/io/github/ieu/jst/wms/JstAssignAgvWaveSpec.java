package io.github.ieu.jst.wms;

public class JstAssignAgvWaveSpec {

    private final JstWmsClient client;

    private final JstAssignAgvWaveRequest.JstAssignAgvWaveRequestBuilder requestBuilder = JstAssignAgvWaveRequest.builder();

    public JstAssignAgvWaveSpec(JstWmsClient client) {
        this.client = client;
    }

    /**
     * 批次Id
     */
    public JstAssignAgvWaveSpec waveId(Number waveId) {
        requestBuilder.waveId(waveId);
        return this;
    }

    /**
     * 机器人名称（用户及权限的用户名）
     */
    public JstAssignAgvWaveSpec robotName(String robotName) {
        requestBuilder.robotName(robotName);
        return this;
    }

    /**
     * 仓位
     */
    public JstAssignAgvWaveSpec bin(String bin) {
        requestBuilder.bin(bin);
        return this;
    }

    public JstAssignAgvWaveResponse response() {
        return this.client.assignAgvWave(requestBuilder.build());
    }
}
