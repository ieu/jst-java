package io.github.ieu.jst.crossborder;

@lombok.Data
public class JstSaveCbExpressStatementFeeResponse {

    private Integer code;

    /**
     * 返回结果
     */
    private Boolean data;

    private String msg;

    private String requestId;
}
