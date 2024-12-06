package io.github.ieu.jst.item;

@lombok.Data
@lombok.Builder
public class JstGetSkuBomPageListRequest {

    /**
     * 修改开始时间
     */
    private String modifiedStart;

    /**
     * 修改结束时间
     */
    private String modifiedEnd;

    /**
     * 商品编码；与修改时间不能同时为空
     */
    private java.util.List<String> skuIds;

    private Page page;

    @lombok.Data
    public static class Page {

        /**
         * 当前页
         */
        private Number currentPage;

        /**
         * 页大小
         */
        private Number pageSize;
    }
}
