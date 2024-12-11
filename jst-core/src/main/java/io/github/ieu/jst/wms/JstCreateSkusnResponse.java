package io.github.ieu.jst.wms;

@lombok.Data
public class JstCreateSkusnResponse {

    private Integer code;

    private String msg;

    private Data data;

    @lombok.Data
    public static class Data {

        /**
         * 默认0 生成中  1：生成完成且成功  -1：生成失败中断提示
         */
        private Number status;

        /**
         * 当前已生成的标签数
         */
        private Number skuSnNum;

        /**
         * 结果提示
         */
        private String messages;
    }
}
