package io.github.ieu.jst.purchase;

@lombok.Data
@lombok.Builder
public class JstCancelPurchaseRequest {

    /**
     * 采购单/加工单/预约入库单内部号（与so_ids二选一必填一项都填写以po_ids为准）
     */
    private java.util.List<Integer> poIds;

    /**
     * 类型（ po：采购单； mo ：加工单；bio：预约入库单 ）
     */
    private String type;

    /**
     * 采购单/加工单/预约入库单线上单号
     */
    private java.util.List<String> soIds;
}
