package io.github.ieu.jst.seed;

@lombok.Data
public class JstUnbindWaveCarryIdResponse {

    private Integer code;

    private Data data;

    private String msg;

    @lombok.Data
    public static class Data {

        /**
         * 是否成功
         */
        private Boolean isSuccess;

        private String msg;
    }
}
