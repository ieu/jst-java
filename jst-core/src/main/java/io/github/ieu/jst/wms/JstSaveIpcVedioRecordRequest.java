package io.github.ieu.jst.wms;

@lombok.Data
@lombok.Builder
public class JstSaveIpcVedioRecordRequest {

    /**
     * 出库单号（与快递单号不能同时为空）
     */
    private String ioIds;

    /**
     * 快递单号（与出库单号不能同时为空）
     */
    private String lIds;

    /**
     * 视频时长
     */
    private Number vedioDuration;

    /**
     * 监控设备号
     */
    private String dIds;

    /**
     * 操作枚举值：一单一货验货、一单一货连打验货、一单多货验货、发货装箱、称重、快销发货、打包登记
     */
    private String operation;
}
