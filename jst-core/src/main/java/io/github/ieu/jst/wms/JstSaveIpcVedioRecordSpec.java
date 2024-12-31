package io.github.ieu.jst.wms;

public class JstSaveIpcVedioRecordSpec {

    private final JstWmsClient client;

    private final JstSaveIpcVedioRecordRequest.JstSaveIpcVedioRecordRequestBuilder requestBuilder = JstSaveIpcVedioRecordRequest.builder();

    public JstSaveIpcVedioRecordSpec(JstWmsClient client) {
        this.client = client;
    }

    /**
     * 出库单号（与快递单号不能同时为空）
     */
    public JstSaveIpcVedioRecordSpec ioIds(String ioIds) {
        requestBuilder.ioIds(ioIds);
        return this;
    }

    /**
     * 快递单号（与出库单号不能同时为空）
     */
    public JstSaveIpcVedioRecordSpec lIds(String lIds) {
        requestBuilder.lIds(lIds);
        return this;
    }

    /**
     * 视频时长
     */
    public JstSaveIpcVedioRecordSpec vedioDuration(Number vedioDuration) {
        requestBuilder.vedioDuration(vedioDuration);
        return this;
    }

    /**
     * 监控设备号
     */
    public JstSaveIpcVedioRecordSpec dIds(String dIds) {
        requestBuilder.dIds(dIds);
        return this;
    }

    /**
     * 操作枚举值：一单一货验货、一单一货连打验货、一单多货验货、发货装箱、称重、快销发货、打包登记
     */
    public JstSaveIpcVedioRecordSpec operation(String operation) {
        requestBuilder.operation(operation);
        return this;
    }

    public JstSaveIpcVedioRecordResponse response() {
        return this.client.saveIpcVedioRecord(requestBuilder.build());
    }
}
