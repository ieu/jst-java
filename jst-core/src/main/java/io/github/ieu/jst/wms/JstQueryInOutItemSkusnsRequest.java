package io.github.ieu.jst.wms;

@lombok.Data
@lombok.Builder
public class JstQueryInOutItemSkusnsRequest {

    /**
     * 指定查询的仓储方
     */
    private Integer wmsCoId;

    /**
     * 页码，从1开始
     */
    private Integer pageIndex;

    /**
     * 每页查询条数，默认1000，最大1000
     */
    private Integer pageSize;

    /**
     * 进出仓单号数组
     */
    private java.util.List<Integer> ioIds;

    /**
     * 内部订单号数组
     */
    private java.util.List<Integer> oIds;

    /**
     * 唯一码数组
     */
    private java.util.List<String> skuSns;

    /**
     * 创建开始时间，io_ids、o_Ids、sku_sns有值时，时间不限，可不填，否则最多查30天
     */
    private String createTimeStart;

    /**
     * 创建结束时间
     */
    private String createTimeEnd;
}
