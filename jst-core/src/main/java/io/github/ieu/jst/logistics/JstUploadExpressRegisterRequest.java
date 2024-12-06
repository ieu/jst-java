package io.github.ieu.jst.logistics;

/**
 * 请求列表
 */
@lombok.Data
@lombok.Builder
public class JstUploadExpressRegisterRequest {

    /**
     * 快递单号
     */
    private String lId;

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/d56ce286-f850-42a1-a251-9c421758cfa9_1706_746.png" target="_blank">快递公司</a></div>（需要填写快递单号对应的快递公司名称）
     */
    private String lName;

    /**
     * 仓库备注
     */
    private String warehouseremark;
}
