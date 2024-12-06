package io.github.ieu.jst.warehouse;

/**
 * 根目录
 */
@lombok.Data
public class JstGetWarehouseListResponse {

    /**
     * 0表示正常
     */
    private Number code;

    /**
     * 错误提示文案
     */
    private String msg;

    private java.util.List<Data> data;

    @lombok.Data
    public static class Data {

        /**
         * 虚拟仓编号
         */
        private Integer lwhId;

        /**
         * 虚拟仓名称
         */
        private String name;

        /**
         * 类首字全拼
         */
        private String mnemonic;

        /**
         * 首字分类
         */
        private String flag;
    }
}
