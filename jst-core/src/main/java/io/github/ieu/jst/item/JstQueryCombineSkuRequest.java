package io.github.ieu.jst.item;

@lombok.Data
@lombok.Builder
public class JstQueryCombineSkuRequest {

    /**
     * 第几页，从第一页开始，默认1
     */
    private Integer pageIndex;

    /**
     * 每页多少条，默认30，最大50
     */
    private Integer pageSize;

    /**
     * 修改起始时间,起始时间和结束时间必须同时存在，时间间隔不能超过七天
     */
    private String modifiedBegin;

    /**
     * 修改结束时间,起始时间和结束时间必须同时存在，时间间隔不能超过七天
     */
    private String modifiedEnd;

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/c73eef94-c221-404c-a0d8-f5f666a9f943_2002_402.png" target="_blank">组合装商品编码</a></div>与修改时间不能同时为空，最多20
     */
    private String skuIds;

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/c5aff92b-99d9-48cc-95ab-bb4a46c986d2_2068_418.png" target="_blank">组合装款式编码</a></div>
     */
    private java.util.List<String> iIds;

    /**
     * 自定义返回参数数组，传入传入想要获取的返回参数中的字段名称
     */
    private java.util.List<String> combineItemskuFlds;
}
