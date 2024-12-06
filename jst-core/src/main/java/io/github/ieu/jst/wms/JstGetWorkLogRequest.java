package io.github.ieu.jst.wms;

@lombok.Data
@lombok.Builder
public class JstGetWorkLogRequest {

    /**
     * 商品编码
     */
    private java.util.List<String> skuIds;

    /**
     * 操作类型;InitToPack:初始化装箱,InitShelve:初始化上架,In:采购进仓,InShelve:快速上架,OtherIn:其他进仓,PurchaseOut:采购退货,Shelve:上架,OffShelve:下架,Pack:装箱,pick:拣货,seed:播种,checkout:出库验货,PrintExpess:打印快递单,aftersale:售后,PackStocktaking:箱盘点,ShippingPack:发货装箱,Move:移货,MoveSku:移货,MovePackBin:移箱,OpenPack:开箱,Stocktaking:盘点
     */
    private java.util.List<String> types;

    /**
     * 第几页；从0页开始
     */
    private Number pageNum;

    /**
     * 分页大小；一页最大50条
     */
    private Number pageSize;

    /**
     * 日志开始时间
     */
    private String createdDateStart;

    /**
     * 日志结束时间；默认查询前一天数据
     */
    private String createdDateEnd;

    /**
     * 货主编码
     */
    private Number ownerCoId;
}
