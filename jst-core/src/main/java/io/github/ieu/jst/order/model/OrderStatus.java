package io.github.ieu.jst.order.model;

public enum OrderStatus {
    /**
     * 待付款
     */
    WaitPay,

    /**
     * 发货中
     */
    Delivering,

    /**
     * 被合并
     */
    Merged,

    /**
     * 异常
     */
    Question,

    /**
     * 被拆分
     */
    Split,

    /**
     * 等供销商|外仓发货
     */
    WaitOuterSent,

    /**
     * 已付款待审核
     */
    WaitConfirm,

    /**
     * 已客审待财审
     */
    WaitFConfirm,

    /**
     * 已发货
     */
    Sent,

    /**
     * 取消
     */
    Cancelled,
}
