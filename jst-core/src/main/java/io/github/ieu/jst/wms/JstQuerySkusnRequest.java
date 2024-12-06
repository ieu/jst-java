package io.github.ieu.jst.wms;

@lombok.Data
@lombok.Builder
public class JstQuerySkusnRequest {

    /**
     * 唯一码列表
     */
    private java.util.List<String> skuSns;

    /**
     * 出库单Id列表
     */
    private java.util.List<String> ioIds;

    /**
     * 批次Id列表
     */
    private java.util.List<String> waveIds;

    /**
     * 箱号列表
     */
    private java.util.List<String> packIds;

    /**
     * 仓位列表
     */
    private java.util.List<String> bins;

    /**
     * Pack:入库;Out:出库;Pick:拣货;Checkout:验货出库;Seed:播种;PickReturn:拣货归还;Pick1:一单一件拣货;Pick2:一单多件拣货; PaperPick:纸质拣货;WaitConfirm:待出库;WaitPack:待入库;
     */
    private java.util.List<String> status;

    /**
     * 排除状态
     */
    private java.util.List<String> exceptStatuses;

    /**
     * 是否排除没有生产批次的记录
     */
    private Boolean isExceptNoBatch;

    /**
     * array	查询属性(返回数据属性)
     */
    private java.util.List<String> flds;

    /**
     * 第几页
     */
    private Number pageIndex;

    /**
     * 每页多少条
     */
    private Number pageSize;

    /**
     * 修改时间起始值;当sku_sns、io_ids、wave_ids、pack_ids、bins都没值时，修改时间必填且时间范围不超过7天
     */
    private String modifiedBegin;

    /**
     * 修改时间截止值;起始时间和结束时间不能同时为空
     */
    private String modifiedEnd;

    /**
     * 时间类型；默认0：修改时间
     */
    private Number dateTime;

    /**
     * 唯一码类型（psd类型默认不返回，如需返回请传该字段），1:唯一码/序列号,  3:生产批次, 4:快销
     */
    private java.util.List<String> types;
}
