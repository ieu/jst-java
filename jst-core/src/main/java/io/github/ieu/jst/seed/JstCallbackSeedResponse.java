package io.github.ieu.jst.seed;

@lombok.Data
public class JstCallbackSeedResponse {

    private Integer code;

    private Boolean issuccess;

    private String msg;

    private java.util.List<Data> data;

    @lombok.Data
    public static class Data {

        /**
         * 批次号
         */
        private String waveId;

        /**
         * 出库单号
         */
        private Integer ioId;

        private Integer ioiId;

        private String issuccess;

        private String msg;
    }
}
