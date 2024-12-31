package io.github.ieu.jst.wms;

public class JstAppendWorkloadSpec {

    private final JstWmsClient client;

    private final JstAppendWorkloadRequest.JstAppendWorkloadRequestBuilder requestBuilder = JstAppendWorkloadRequest.builder();

    public JstAppendWorkloadSpec(JstWmsClient client) {
        this.client = client;
    }

    /**
     * 批次号
     */
    public JstAppendWorkloadSpec waveId(Number waveId) {
        requestBuilder.waveId(waveId);
        return this;
    }

    /**
     * 快递单号
     */
    public JstAppendWorkloadSpec lid(String lid) {
        requestBuilder.lid(lid);
        return this;
    }

    /**
     * 最后一个快递单号
     */
    public JstAppendWorkloadSpec lastLid(String lastLid) {
        requestBuilder.lastLid(lastLid);
        return this;
    }

    /**
     * 加工单号
     */
    public JstAppendWorkloadSpec poId(Number poId) {
        requestBuilder.poId(poId);
        return this;
    }

    /**
     * 快销采购单号
     */
    public JstAppendWorkloadSpec skuSnPoId(Number skuSnPoId) {
        requestBuilder.skuSnPoId(skuSnPoId);
        return this;
    }

    /**
     * 内部订单号
     */
    public JstAppendWorkloadSpec oid(Number oid) {
        requestBuilder.oid(oid);
        return this;
    }

    /**
     * 操作人Id
     */
    public JstAppendWorkloadSpec packer(String packer) {
        requestBuilder.packer(packer);
        return this;
    }

    /**
     * 操作人名称
     */
    public JstAppendWorkloadSpec packerName(String packerName) {
        requestBuilder.packerName(packerName);
        return this;
    }

    /**
     * 包材商品编码
     */
    public JstAppendWorkloadSpec packageSkuId(String packageSkuId) {
        requestBuilder.packageSkuId(packageSkuId);
        return this;
    }

    /**
     * 不限定快递
     */
    public JstAppendWorkloadSpec isUnlimitedExpress(Boolean isUnlimitedExpress) {
        requestBuilder.isUnlimitedExpress(isUnlimitedExpress);
        return this;
    }

    /**
     * 商品编码
     */
    public JstAppendWorkloadSpec skuId(String skuId) {
        requestBuilder.skuId(skuId);
        return this;
    }

    /**
     * 唯一码
     */
    public JstAppendWorkloadSpec skuSn(String skuSn) {
        requestBuilder.skuSn(skuSn);
        return this;
    }

    /**
     * 按商品补入数量
     */
    public JstAppendWorkloadSpec skuNum(Number skuNum) {
        requestBuilder.skuNum(skuNum);
        return this;
    }

    /**
     * 是否组合装编码
     */
    public JstAppendWorkloadSpec isCombine(Boolean isCombine) {
        requestBuilder.isCombine(isCombine);
        return this;
    }

    /**
     * 补入类型  默认 为 0  打包登记（1：打包登记；2：拣货补入；3：验货补入；5：发货质检补入；大于5的 为 自定义补货）
     */
    public JstAppendWorkloadSpec actionType(Number actionType) {
        requestBuilder.actionType(actionType);
        return this;
    }

    /**
     * 仓位区域
     */
    public JstAppendWorkloadSpec area(String area) {
        requestBuilder.area(area);
        return this;
    }

    /**
     * 出库单号
     */
    public JstAppendWorkloadSpec ioid(Number ioid) {
        requestBuilder.ioid(ioid);
        return this;
    }

    /**
     * 是否只补入该批次已出库的出库单的拣货工作量
     */
    public JstAppendWorkloadSpec isOnlyCheckedInout(Boolean isOnlyCheckedInout) {
        requestBuilder.isOnlyCheckedInout(isOnlyCheckedInout);
        return this;
    }

    /**
     * 第三方仓选中的商家
     */
    public JstAppendWorkloadSpec tpwSelectedCoId(Number tpwSelectedCoId) {
        requestBuilder.tpwSelectedCoId(tpwSelectedCoId);
        return this;
    }

    /**
     * 是否允许发货前打包登记
     */
    public JstAppendWorkloadSpec isAllowPackBeforeDeliver(Boolean isAllowPackBeforeDeliver) {
        requestBuilder.isAllowPackBeforeDeliver(isAllowPackBeforeDeliver);
        return this;
    }

    /**
     * 是否跨境订单
     */
    public JstAppendWorkloadSpec isCrossBorder(Boolean isCrossBorder) {
        requestBuilder.isCrossBorder(isCrossBorder);
        return this;
    }

    /**
     * 加工单补入是否按实际加工入库数量补入
     */
    public JstAppendWorkloadSpec isWriteLogQtyByMachiningInQty(Boolean isWriteLogQtyByMachiningInQty) {
        requestBuilder.isWriteLogQtyByMachiningInQty(isWriteLogQtyByMachiningInQty);
        return this;
    }

    public JstAppendWorkloadResponse response() {
        return this.client.appendWorkload(requestBuilder.build());
    }
}
