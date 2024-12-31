package io.github.ieu.jst.wms;

public class JstLoadWavesByFilterSpec {

    private final JstWmsClient client;

    private final JstLoadWavesByFilterRequest.JstLoadWavesByFilterRequestBuilder requestBuilder = JstLoadWavesByFilterRequest.builder();

    public JstLoadWavesByFilterSpec(JstWmsClient client) {
        this.client = client;
    }

    /**
     * 批次列表
     */
    public JstLoadWavesByFilterSpec waveIds(java.util.List<Number> waveIds) {
        requestBuilder.waveIds(waveIds);
        return this;
    }

    /**
     * 创建开始时间（时间请求跨度在三天以内）
     */
    public JstLoadWavesByFilterSpec createTimeBegin(String createTimeBegin) {
        requestBuilder.createTimeBegin(createTimeBegin);
        return this;
    }

    /**
     * 创建结束时间（时间请求跨度在三天以内）
     */
    public JstLoadWavesByFilterSpec createTimeEnd(String createTimeEnd) {
        requestBuilder.createTimeEnd(createTimeEnd);
        return this;
    }

    /**
     * 修改开始时间（时间请求跨度在三天以内）
     */
    public JstLoadWavesByFilterSpec modifiedBegin(String modifiedBegin) {
        requestBuilder.modifiedBegin(modifiedBegin);
        return this;
    }

    /**
     * 修改结束时间（时间请求跨度在三天以内）
     */
    public JstLoadWavesByFilterSpec modifiedEnd(String modifiedEnd) {
        requestBuilder.modifiedEnd(modifiedEnd);
        return this;
    }

    /**
     * None = 0,         WaitPurchase = 6,         WaitPick = 1,         Picking = 11,         WaitSeed = 2,         Seeding = 22,         WaitCheck = 3,         Checking = 33,         WaitFinish = 4,         Finished = 44,         Break = 5,         WaitToBin = 55。只传批次状态（wave_status ）或者批次类型（wave_types ）查询默认添加最近3天以内时间限制
     */
    public JstLoadWavesByFilterSpec waveStatus(java.util.List<String> waveStatus) {
        requestBuilder.waveStatus(waveStatus);
        return this;
    }

    /**
     * 1：单件批次 2：多件 6：大单 7：整箱 8：大单 9：组团 10：二次分拣 15：按批次。只传批次状态（wave_status ）或者批次类型（wave_types ）查询默认添加最近3天以内时间限制）
     */
    public JstLoadWavesByFilterSpec waveTypes(java.util.List<Number> waveTypes) {
        requestBuilder.waveTypes(waveTypes);
        return this;
    }

    /**
     * 批次绑定的播种车号（批次号最大查询数量控制在1000）
     */
    public JstLoadWavesByFilterSpec waveCarryIds(java.util.List<String> waveCarryIds) {
        requestBuilder.waveCarryIds(waveCarryIds);
        return this;
    }

    /**
     * 默认是true只能查主仓，传false可以查分仓的批次
     */
    public JstLoadWavesByFilterSpec checkWmsCoid(Boolean checkWmsCoid) {
        requestBuilder.checkWmsCoid(checkWmsCoid);
        return this;
    }

    public JstLoadWavesByFilterResponse response() {
        return this.client.loadWavesByFilter(requestBuilder.build());
    }
}
