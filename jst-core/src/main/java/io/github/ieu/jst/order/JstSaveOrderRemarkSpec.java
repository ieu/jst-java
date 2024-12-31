package io.github.ieu.jst.order;

public class JstSaveOrderRemarkSpec {

    private final JstOrderClient client;

    private final JstSaveOrderRemarkRequest.JstSaveOrderRemarkRequestBuilder requestBuilder = JstSaveOrderRemarkRequest.builder();

    public JstSaveOrderRemarkSpec(JstOrderClient client) {
        this.client = client;
    }

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/e457dae3-e441-4644-860e-e070d05929df_1924_284.png" target="_blank">线上单号</a></div>
     */
    public JstSaveOrderRemarkSpec soId(String soId) {
        requestBuilder.soId(soId);
        return this;
    }

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/94bf52e8-525c-46a6-be31-0e07a96380cb_1938_956.png" target="_blank">备注</a></div>
     */
    public JstSaveOrderRemarkSpec remark(String remark) {
        requestBuilder.remark(remark);
        return this;
    }

    /**
     * 是否追加
     */
    public JstSaveOrderRemarkSpec isAppend(Boolean isAppend) {
        requestBuilder.isAppend(isAppend);
        return this;
    }

    public JstSaveOrderRemarkResponse response() {
        return this.client.saveOrderRemark(requestBuilder.build());
    }
}
