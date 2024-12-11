package io.github.ieu.jst.wms;

@lombok.Data
public class JstQueryPreReduceWaveResponse {

    private java.util.List<Data> data;

    /**
     * 0代码成功
     */
    private Integer code;

    /**
     * 是否成功描述
     */
    private String issuccess;

    /**
     * 执行结果描述
     */
    private String msg;

    @lombok.Data
    public static class Data {

        /**
         * 批次号
         */
        private Number waveId;

        /**
         * 仓位
         */
        private String bin;

        /**
         * 状态
         */
        private String status;
    }
}
