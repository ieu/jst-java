package io.github.ieu.jst.wms;

@lombok.Data
public class JstAssignAgvWaveResponse {

    /**
     * 状态码
     */
    private Integer code;

    /**
     * 是否成功
     */
    private Boolean issuccess;

    /**
     * 描述信息
     */
    private String msg;

    /**
     * 数据集合
     */
    private Data data;

    /**
     * 数据集合
     */
    @lombok.Data
    public static class Data {

        /**
         * 批次号
         */
        private Number waveId;

        /**
         * 状态
         */
        private String status;

        /**
         * 类型
         */
        private String type;

        /**
         * 仓位
         */
        private String bin;

        /**
         * 是否拣货完成
         */
        private Boolean pickFinish;

        /**
         * 是否AGV拣货
         */
        private Boolean isAgvPick;

        /**
         * 备注
         */
        private String remark;

        /**
         * 过滤
         */
        private String filter;

        /**
         * 用户id
         */
        private Number userId;
    }
}
