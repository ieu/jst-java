package io.github.ieu.jst.wms;

@lombok.Data
@lombok.Builder
public class JstAppendWorkloadRequest {

    /**
     * 批次号
     */
    private Number waveId;

    /**
     * 快递单号
     */
    private String lid;

    /**
     * 最后一个快递单号
     */
    private String lastLid;

    /**
     * 加工单号
     */
    private Number poId;

    /**
     * 快销采购单号
     */
    private Number skuSnPoId;

    /**
     * 内部订单号
     */
    private Number oid;

    /**
     * 操作人Id
     */
    private String packer;

    /**
     * 操作人名称
     */
    private String packerName;

    /**
     * 包材商品编码
     */
    private String packageSkuId;

    /**
     * 不限定快递
     */
    private Boolean isUnlimitedExpress;

    /**
     * 商品编码
     */
    private String skuId;

    /**
     * 唯一码
     */
    private String skuSn;

    /**
     * 按商品补入数量
     */
    private Number skuNum;

    /**
     * 是否组合装编码
     */
    private Boolean isCombine;

    /**
     * 补入类型  默认 为 0  打包登记（1：打包登记；2：拣货补入；3：验货补入；5：发货质检补入；大于5的 为 自定义补货）
     */
    private Number actionType;

    /**
     * 仓位区域
     */
    private String area;

    /**
     * 出库单号
     */
    private Number ioid;

    /**
     * 是否只补入该批次已出库的出库单的拣货工作量
     */
    private Boolean isOnlyCheckedInout;

    /**
     * 第三方仓选中的商家
     */
    private Number tpwSelectedCoId;

    /**
     * 是否允许发货前打包登记
     */
    private Boolean isAllowPackBeforeDeliver;

    /**
     * 是否跨境订单
     */
    private Boolean isCrossBorder;

    /**
     * 加工单补入是否按实际加工入库数量补入
     */
    private Boolean isWriteLogQtyByMachiningInQty;
}
