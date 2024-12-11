package io.github.ieu.jst.item;

@lombok.Data
public class JstAddOrUpdateCategoryResponse {

    private Integer code;

    private String msg;

    private Data data;

    private String requestId;

    @lombok.Data
    public static class Data {

        /**
         * 类目id
         */
        private Number cId;

        /**
         * 父级类目id
         */
        private Number parentCId;
    }
}
