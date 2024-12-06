package io.github.ieu.jst.warehouse;

@lombok.Data
@lombok.Builder
public class JstGetLwhOperationListRequest {

    /**
     * 单据编号
     */
    private Number ioId;

    /**
     * 商品编码列表,多个逗号隔开，最多50个
     */
    private String skuId;

    /**
     * 虚拟仓编号
     */
    private Number lwhId;

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
     * 外部单号
     */
    private String soId;

    /**
     * 状态：Creating：草拟，WaitConfirm：待审核，Confirmed：已生效
     */
    private String status;

    /**
     * 单据类型：虚拟仓分配，虚拟仓归还
     */
    private String type;

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
         * 每页最大条数，
         */
        private Integer pageSize;

        /**
         * 当前页数
         */
        private Integer currentPage;
    }
}
