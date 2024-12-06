package io.github.ieu.jst.warehouse;

@lombok.Data
@lombok.Builder
public class JstGetLwhAllocationListRequest {

    /**
     * 单据编号
     */
    private Number ioId;

    /**
     * 商品编码列表,多个逗号隔开，最多50个
     */
    private String skuId;

    /**
     * 调出虚拟仓编号
     */
    private Number outLwhId;

    /**
     * 时间类型（0,1）  0:创建时间，1：审核时间  默认：创建时间
     */
    private Number dateType;

    /**
     * 开始时间，开始时间,开始时间结束时间都不传默认查询3个月内
     */
    private String dateBegin;

    /**
     * 结束时间，开始时间,开始时间结束时间都不传默认查询3个月内
     */
    private String dateEnd;

    /**
     * 外部单号，保持唯一
     */
    private String soId;

    /**
     * 状态：Creating：草拟，WaitConfirm：待审核，Confirmed：已生效
     */
    private String status;

    /**
     * 分页
     */
    private Page page;

    /**
     * 分页
     */
    @lombok.Data
    public static class Page {

        /**
         * 页大小
         */
        private Integer pageSize;

        /**
         * 第几页
         */
        private Integer currentPage;
    }
}
