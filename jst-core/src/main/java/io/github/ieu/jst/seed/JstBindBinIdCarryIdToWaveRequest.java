package io.github.ieu.jst.seed;

@lombok.Data
@lombok.Builder
public class JstBindBinIdCarryIdToWaveRequest {

    /**
     * 出库单信息
     */
    private java.util.List<IoIds> ioIds;

    /**
     * 批次编码
     */
    private String waveId;

    /**
     * 车号
     */
    private String carryId;

    @lombok.Data
    public static class IoIds {

        /**
         * 出库明细号
         */
        private String ioId;

        /**
         * 仓位编码
         */
        private String binId;
    }
}
