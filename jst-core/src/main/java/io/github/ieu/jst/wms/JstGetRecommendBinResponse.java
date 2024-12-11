package io.github.ieu.jst.wms;

@lombok.Data
public class JstGetRecommendBinResponse {

    /**
     * 推荐仓位
     */
    private String data;

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 是否执行成功
     */
    private Boolean issuccess;

    /**
     * 执行描述
     */
    private String msg;
}
