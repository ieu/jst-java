package io.github.ieu.jst.warehouse;

@lombok.Data
@lombok.Builder
public class JstGetPageLockPurchasesRequest {

    /**
     * 申请号
     */
    private Integer autoId;

    /**
     * 虚拟仓编码
     */
    private Integer lwhId;

    /**
     * 分仓号
     */
    private Integer wmsCoId;

    /**
     * 状态
     */
    private String status;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建时间起始
     */
    private String createTimeBegin;

    /**
     * 创建时间结束
     */
    private String createTimeEnd;

    /**
     * 更新时间起始
     */
    private String modifiedBegin;

    /**
     * 更新时间结束
     */
    private String modifiedEnd;

    private Page page;

    @lombok.Data
    public static class Page {

        /**
         * 当前页
         */
        private Integer currentPage;

        /**
         * 每页多少条
         */
        private Integer pageSize;
    }
}
