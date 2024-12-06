package io.github.ieu.jst.aftersale;

@lombok.Data
@lombok.Builder
public class JstConfirmAfterSaleRequest {

    /**
     * 售后单id数组
     */
    private java.util.List<Number> asIds;

    /**
     * 换货售后单是否强制确认
     */
    private Boolean exchangeForce;

    /**
     * 是否同步确认退款单
     */
    private Boolean confirmRefund;
}
