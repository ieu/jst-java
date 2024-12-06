package io.github.ieu.jst.wms;

@lombok.Data
@lombok.Builder
public class JstAssignAgvWaveRequest {

    /**
     * 批次Id
     */
    private Number waveId;

    /**
     * 机器人名称（用户及权限的用户名）
     */
    private String robotName;

    /**
     * 仓位
     */
    private String bin;
}
