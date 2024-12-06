package io.github.ieu.jst.wms;

@lombok.Data
@lombok.Builder
public class JstQueryPickWaveRequest {

    /**
     * 机器人编号
     */
    private String robotId;

    /**
     * 分仓编号，0 代表主仓本仓
     */
    private Number wmsCoId;

    /**
     * 仓位
     */
    private String bin;

    /**
     * 批次号
     */
    private Number waveId;
}
