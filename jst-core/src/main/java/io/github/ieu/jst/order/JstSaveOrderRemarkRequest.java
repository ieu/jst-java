package io.github.ieu.jst.order;

@lombok.Data
@lombok.Builder
public class JstSaveOrderRemarkRequest {

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/e457dae3-e441-4644-860e-e070d05929df_1924_284.png" target="_blank">线上单号</a></div>
     */
    private String soId;

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/94bf52e8-525c-46a6-be31-0e07a96380cb_1938_956.png" target="_blank">备注</a></div>
     */
    private String remark;

    /**
     * 是否追加
     */
    private Boolean isAppend;
}
