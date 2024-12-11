package io.github.ieu.jst.wms;

@lombok.Data
public class JstQueryPickWaveResponse {

    private Data data;

    /**
     * 错误码，0代表成功
     */
    private Integer code;

    /**
     * true代表成功
     */
    private String issuccess;

    /**
     * 描述
     */
    private String msg;

    @lombok.Data
    public static class Data {

        /**
         * 批次号
         */
        private Number waveId;

        /**
         * 当前批次状态
         */
        private String status;

        /**
         * 类型
         */
        private String type;

        /**
         * 拣货的第一个仓位
         */
        private String bin;

        /**
         * 是否已拣完货
         */
        private Boolean pickFinish;

        /**
         * 标志(备注)
         */
        private String remark;

        private Boolean isAgvPick;

        private String filter;
    }
}
