package io.github.ieu.jst.order;

@lombok.Data
@lombok.Builder
public class JstUploadOrderRemarkRequest {

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/deab32f3-191d-43c8-b213-343bb82070e1_2161_433.png" target="_blank">内部订单号</a></div>
     */
    private Integer oId;

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/94bf52e8-525c-46a6-be31-0e07a96380cb_1938_956.png" target="_blank">卖家备注</a></div>每次都是覆盖系统里的卖家备注，最大长度最大长度500
     */
    private String remark;

    /**
     * 是否追加备注，true=是，false=否，非必填，默认值false
     */
    private Boolean isAppend;
}
