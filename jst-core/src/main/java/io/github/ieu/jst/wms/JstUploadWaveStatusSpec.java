package io.github.ieu.jst.wms;

public class JstUploadWaveStatusSpec {

    private final JstWmsClient client;

    private final JstUploadWaveStatusRequest.JstUploadWaveStatusRequestBuilder requestBuilder = JstUploadWaveStatusRequest.builder();

    public JstUploadWaveStatusSpec(JstWmsClient client) {
        this.client = client;
    }

    /**
     * 拣货批次号
     */
    public JstUploadWaveStatusSpec waveId(Number waveId) {
        requestBuilder.waveId(waveId);
        return this;
    }

    public JstUploadWaveStatusResponse response() {
        return this.client.uploadWaveStatus(requestBuilder.build());
    }
}
