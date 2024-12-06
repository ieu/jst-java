package io.github.ieu.jst.seed;

@lombok.Data
@lombok.Builder
public class JstGetJushuitanWaveRequest {

    /**
     * 批次号
     */
    private Integer waveId;

    /**
     * 分仓编码（如果是分仓的拣货批次需要传对应的分仓编码）
     */
    private Number wmsCoId;
}
