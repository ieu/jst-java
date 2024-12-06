package io.github.ieu.jst.wms;

@lombok.Data
@lombok.Builder
public class JstLoadWavesByFilterRequest {

    /**
     * 批次列表
     */
    private java.util.List<Number> waveIds;

    /**
     * 创建开始时间（时间请求跨度在三天以内）
     */
    private String createTimeBegin;

    /**
     * 创建结束时间（时间请求跨度在三天以内）
     */
    private String createTimeEnd;

    /**
     * 修改开始时间（时间请求跨度在三天以内）
     */
    private String modifiedBegin;

    /**
     * 修改结束时间（时间请求跨度在三天以内）
     */
    private String modifiedEnd;

    /**
     * None = 0,         WaitPurchase = 6,         WaitPick = 1,         Picking = 11,         WaitSeed = 2,         Seeding = 22,         WaitCheck = 3,         Checking = 33,         WaitFinish = 4,         Finished = 44,         Break = 5,         WaitToBin = 55。只传批次状态（wave_status ）或者批次类型（wave_types ）查询默认添加最近3天以内时间限制
     */
    private java.util.List<String> waveStatus;

    /**
     * 1：单件批次 2：多件 6：大单 7：整箱 8：大单 9：组团 10：二次分拣 15：按批次。只传批次状态（wave_status ）或者批次类型（wave_types ）查询默认添加最近3天以内时间限制）
     */
    private java.util.List<Number> waveTypes;

    /**
     * 批次绑定的播种车号（批次号最大查询数量控制在1000）
     */
    private java.util.List<String> waveCarryIds;

    /**
     * 默认是true只能查主仓，传false可以查分仓的批次
     */
    private Boolean checkWmsCoid;
}
