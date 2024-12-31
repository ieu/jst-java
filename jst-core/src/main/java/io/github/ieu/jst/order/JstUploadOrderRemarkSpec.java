package io.github.ieu.jst.order;

public class JstUploadOrderRemarkSpec {

    private final JstOrderClient client;

    private final JstUploadOrderRemarkRequest.JstUploadOrderRemarkRequestBuilder requestBuilder = JstUploadOrderRemarkRequest.builder();

    public JstUploadOrderRemarkSpec(JstOrderClient client) {
        this.client = client;
    }

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/deab32f3-191d-43c8-b213-343bb82070e1_2161_433.png" target="_blank">内部订单号</a></div>
     */
    public JstUploadOrderRemarkSpec oId(Integer oId) {
        requestBuilder.oId(oId);
        return this;
    }

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/94bf52e8-525c-46a6-be31-0e07a96380cb_1938_956.png" target="_blank">卖家备注</a></div>每次都是覆盖系统里的卖家备注，最大长度最大长度500
     */
    public JstUploadOrderRemarkSpec remark(String remark) {
        requestBuilder.remark(remark);
        return this;
    }

    /**
     * 是否追加备注，true=是，false=否，非必填，默认值false
     */
    public JstUploadOrderRemarkSpec isAppend(Boolean isAppend) {
        requestBuilder.isAppend(isAppend);
        return this;
    }

    public JstUploadOrderRemarkResponse response() {
        return this.client.uploadOrderRemark(requestBuilder.build());
    }
}
