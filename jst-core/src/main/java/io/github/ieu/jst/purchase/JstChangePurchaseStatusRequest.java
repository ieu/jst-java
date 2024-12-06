package io.github.ieu.jst.purchase;

@lombok.Data
@lombok.Builder
public class JstChangePurchaseStatusRequest {

    /**
     * 外部采购单号,与内部采购单号不能同时为空
     */
    private java.util.List<String> soIds;

    /**
     * 内部采购单号，与外部采购单号不能同时为空
     */
    private java.util.List<String> poIds;

    /**
     * 操作   1:审核生效  2:变更修改  3:作废  4:完成 5:取消已完成
     */
    private Number option;
}
