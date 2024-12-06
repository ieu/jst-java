package io.github.ieu.jst.warehouse;

@lombok.Data
@lombok.Builder
public class JstGetVirtualStockRequest {

    /**
     * 分仓编码
     */
    private String wmsCoId;

    /**
     * 商品编码；与修改时间查询条件不能同时为空
     */
    private java.util.List<String> skuIds;

    /**
     * 修改起始时间；与商品编码查询条件不能同时为空
     */
    private String modifiedBegin;

    /**
     * 修改结束时间；与商品编码查询条件不能同时为空
     */
    private String modifiedEnd;

    private Page page;

    @lombok.Data
    public static class Page {

        /**
         * 当前页
         */
        private String currentPage;

        /**
         * 页大小
         */
        private String pageSize;
    }
}
