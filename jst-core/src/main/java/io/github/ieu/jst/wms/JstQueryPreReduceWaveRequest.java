package io.github.ieu.jst.wms;

@lombok.Data
@lombok.Builder
public class JstQueryPreReduceWaveRequest {

    /**
     * 批次号列表，最多50个
     */
    private java.util.List<Number> waveIds;
}
