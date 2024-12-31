package io.github.ieu.jst.wms;

public class JstQuerySkusnSpec {

    private final JstWmsClient client;

    private final JstQuerySkusnRequest.JstQuerySkusnRequestBuilder requestBuilder = JstQuerySkusnRequest.builder();

    public JstQuerySkusnSpec(JstWmsClient client) {
        this.client = client;
    }

    /**
     * 唯一码列表
     */
    public JstQuerySkusnSpec skuSns(java.util.List<String> skuSns) {
        requestBuilder.skuSns(skuSns);
        return this;
    }

    /**
     * 出库单Id列表
     */
    public JstQuerySkusnSpec ioIds(java.util.List<String> ioIds) {
        requestBuilder.ioIds(ioIds);
        return this;
    }

    /**
     * 批次Id列表
     */
    public JstQuerySkusnSpec waveIds(java.util.List<String> waveIds) {
        requestBuilder.waveIds(waveIds);
        return this;
    }

    /**
     * 箱号列表
     */
    public JstQuerySkusnSpec packIds(java.util.List<String> packIds) {
        requestBuilder.packIds(packIds);
        return this;
    }

    /**
     * 仓位列表
     */
    public JstQuerySkusnSpec bins(java.util.List<String> bins) {
        requestBuilder.bins(bins);
        return this;
    }

    /**
     * Pack:入库;Out:出库;Pick:拣货;Checkout:验货出库;Seed:播种;PickReturn:拣货归还;Pick1:一单一件拣货;Pick2:一单多件拣货; PaperPick:纸质拣货;WaitConfirm:待出库;WaitPack:待入库;
     */
    public JstQuerySkusnSpec status(java.util.List<String> status) {
        requestBuilder.status(status);
        return this;
    }

    /**
     * 排除状态
     */
    public JstQuerySkusnSpec exceptStatuses(java.util.List<String> exceptStatuses) {
        requestBuilder.exceptStatuses(exceptStatuses);
        return this;
    }

    /**
     * 是否排除没有生产批次的记录
     */
    public JstQuerySkusnSpec isExceptNoBatch(Boolean isExceptNoBatch) {
        requestBuilder.isExceptNoBatch(isExceptNoBatch);
        return this;
    }

    /**
     * array	查询属性(返回数据属性)
     */
    public JstQuerySkusnSpec flds(java.util.List<String> flds) {
        requestBuilder.flds(flds);
        return this;
    }

    /**
     * 第几页
     */
    public JstQuerySkusnSpec pageIndex(Number pageIndex) {
        requestBuilder.pageIndex(pageIndex);
        return this;
    }

    /**
     * 每页多少条
     */
    public JstQuerySkusnSpec pageSize(Number pageSize) {
        requestBuilder.pageSize(pageSize);
        return this;
    }

    /**
     * 修改时间起始值;当sku_sns、io_ids、wave_ids、pack_ids、bins都没值时，修改时间必填且时间范围不超过7天
     */
    public JstQuerySkusnSpec modifiedBegin(String modifiedBegin) {
        requestBuilder.modifiedBegin(modifiedBegin);
        return this;
    }

    /**
     * 修改时间截止值;起始时间和结束时间不能同时为空
     */
    public JstQuerySkusnSpec modifiedEnd(String modifiedEnd) {
        requestBuilder.modifiedEnd(modifiedEnd);
        return this;
    }

    /**
     * 时间类型；默认0：修改时间
     */
    public JstQuerySkusnSpec dateTime(Number dateTime) {
        requestBuilder.dateTime(dateTime);
        return this;
    }

    /**
     * 唯一码类型（psd类型默认不返回，如需返回请传该字段），1:唯一码/序列号,  3:生产批次, 4:快销
     */
    public JstQuerySkusnSpec types(java.util.List<String> types) {
        requestBuilder.types(types);
        return this;
    }

    public JstQuerySkusnResponse response() {
        return this.client.querySkusn(requestBuilder.build());
    }
}
