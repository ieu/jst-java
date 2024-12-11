package io.github.ieu.jst.allocate;

@lombok.Data
public class JstCreateDiffAllocateResponse {

    /**
     * 状态码，0 代表成功
     */
    private Integer code;

    /**
     * 是否调用成功，true是；false否
     */
    private Boolean issuccess;

    /**
     * 返回描述
     */
    private String msg;

    private java.util.List<Data> data;

    @lombok.Data
    public static class Data {

        /**
         * 创建的差异调拨单号
         */
        private Number ioId;
    }
}
