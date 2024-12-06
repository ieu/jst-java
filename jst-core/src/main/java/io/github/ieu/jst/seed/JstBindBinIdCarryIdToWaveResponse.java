package io.github.ieu.jst.seed;

@lombok.Data
public class JstBindBinIdCarryIdToWaveResponse {

    /**
     * 是否成功
     */
    private Boolean data;

    /**
     * 返回编码
     */
    private Number code;

    /**
     * 返回信息
     */
    private String msg;

    /**
     * 请求id
     */
    private String requestId;
}
