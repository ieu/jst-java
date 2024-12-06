package io.github.ieu.jst.wms;

@lombok.Data
@lombok.Builder
public class JstUploadWaveStatusRequest {

    /**
     * 拣货批次号
     */
    private Number waveId;
}
