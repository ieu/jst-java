package io.github.ieu.jst.supplychainopen;

@lombok.Data
public class JstQueryCategoryByPidResponse {

    private Integer code;

    private String msg;

    private String requestId;

    /**
     * 子类目列表,可能为空
     */
    private java.util.List<Data> data;

    /**
     * 子类名信息
     */
    @lombok.Data
    public static class Data {

        /**
         * 类目ID
         */
        private String categoryId;

        /**
         * 类目名称
         */
        private String categoryName;

        /**
         * 父类目ID
         */
        private String pid;

        /**
         * 是否叶子节点
         */
        private Boolean isLeaf;
    }
}
