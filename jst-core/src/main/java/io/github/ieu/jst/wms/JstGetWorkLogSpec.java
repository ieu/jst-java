package io.github.ieu.jst.wms;

public class JstGetWorkLogSpec {

    private final JstWmsClient client;

    private final JstGetWorkLogRequest.JstGetWorkLogRequestBuilder requestBuilder = JstGetWorkLogRequest.builder();

    public JstGetWorkLogSpec(JstWmsClient client) {
        this.client = client;
    }

    /**
     * 商品编码
     */
    public JstGetWorkLogSpec skuIds(java.util.List<String> skuIds) {
        requestBuilder.skuIds(skuIds);
        return this;
    }

    /**
     * 操作类型;InitToPack:初始化装箱,InitShelve:初始化上架,In:采购进仓,InShelve:快速上架,OtherIn:其他进仓,PurchaseOut:采购退货,Shelve:上架,OffShelve:下架,Pack:装箱,pick:拣货,seed:播种,checkout:出库验货,PrintExpess:打印快递单,aftersale:售后,PackStocktaking:箱盘点,ShippingPack:发货装箱,Move:移货,MoveSku:移货,MovePackBin:移箱,OpenPack:开箱,Stocktaking:盘点
     */
    public JstGetWorkLogSpec types(java.util.List<String> types) {
        requestBuilder.types(types);
        return this;
    }

    /**
     * 第几页；从0页开始
     */
    public JstGetWorkLogSpec pageNum(Number pageNum) {
        requestBuilder.pageNum(pageNum);
        return this;
    }

    /**
     * 分页大小；一页最大50条
     */
    public JstGetWorkLogSpec pageSize(Number pageSize) {
        requestBuilder.pageSize(pageSize);
        return this;
    }

    /**
     * 日志开始时间
     */
    public JstGetWorkLogSpec createdDateStart(String createdDateStart) {
        requestBuilder.createdDateStart(createdDateStart);
        return this;
    }

    /**
     * 日志结束时间；默认查询前一天数据
     */
    public JstGetWorkLogSpec createdDateEnd(String createdDateEnd) {
        requestBuilder.createdDateEnd(createdDateEnd);
        return this;
    }

    /**
     * 货主编码
     */
    public JstGetWorkLogSpec ownerCoId(Number ownerCoId) {
        requestBuilder.ownerCoId(ownerCoId);
        return this;
    }

    public JstGetWorkLogResponse response() {
        return this.client.getWorkLog(requestBuilder.build());
    }
}
