package io.github.ieu.jst.aftersale;

@lombok.Data
@lombok.Builder
public class JstConfirmGoodsBySkusnsRequest {

    /**
     * 唯一码
     */
    private String skuSn;

    /**
     * 追加备注
     */
    private String remark;

    /**
     * 分仓编码
     */
    private Number wmsCoId;
}
