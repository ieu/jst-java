package io.github.ieu.jst.wms;

@lombok.Data
public class JstUploadWaveStatusResponse {

    /**
     * 状态码 0表示成功
     */
    private Number code;

    /**
     * 执行结果
     */
    private Boolean issuccess;

    /**
     * 提示信息
     */
    private String msg;
}
