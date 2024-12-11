package io.github.ieu.jst.warehouse;

/**
 * 根目录
 */
@lombok.Data
public class JstCreateOrUpdateLockPurchaseResponse {

    /**
     * 0表示正常
     */
    private Integer code;

    /**
     * 错误提示文案
     */
    private String msg;

    private Data data;

    @lombok.Data
    public static class Data {

        /**
         * 采购申请单id
         */
        private String lpId;

        /**
         * 是否执行成功
         */
        private Boolean isSuccess;

        /**
         * 返回信息
         */
        private String msg;
    }
}
