package io.github.ieu.jst.logistics;

@lombok.Data
@lombok.Builder
public class JstQueryLogisticRequest {

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/ccaa4f9d-b986-4c48-b2d2-1e8b20177658_2166_836.png" target="_blank">店铺编号</a></div>
     */
    private Integer shopId;

    /**
     * 第几页，从1开始
     */
    private Integer pageIndex;

    /**
     * 默认30，最大不超过50
     */
    private Integer pageSize;

    /**
     * 修改起始时间，和结束时间必须同时存在，时间间隔不能超过七天
     */
    private String modifiedBegin;

    /**
     * 修改起始时间，和结束时间必须同时存在，时间间隔不能超过七天
     */
    private String modifiedEnd;

    /**
     * 日期类型，默认发货时间，0=修改时间，1=制单日期，2=订单日期，3=发货时间
     */
    private Integer dateType;

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/e457dae3-e441-4644-860e-e070d05929df_1924_284.png" target="_blank">平台订单编号</a></div>最多20（如果通过线上单号查询除时间条件外不受其它查询条件限制）
     */
    private java.util.List<String> soIds;
}
