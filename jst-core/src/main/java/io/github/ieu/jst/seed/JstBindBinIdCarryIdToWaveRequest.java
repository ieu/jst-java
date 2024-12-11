package io.github.ieu.jst.seed;

@lombok.Data
@lombok.Builder
public class JstBindBinIdCarryIdToWaveRequest {

    /**
     * 出库单信息
     */
    private java.util.List<IoId> ioIds;

    /**
     * 批次编码
     */
    private String waveId;

    /**
     * 车号
     */
    private String carryId;

    @lombok.Data
    public static class IoId {

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
