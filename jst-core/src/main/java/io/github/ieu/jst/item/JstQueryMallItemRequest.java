package io.github.ieu.jst.item;

@lombok.Data
@lombok.Builder
public class JstQueryMallItemRequest {

    /**
     * 修改起始时间，和结束时间必须同时存在，时间间隔不能超过七天，与款式编码不能同时为空
     */
    private String modifiedBegin;

    /**
     * 修改结束时间，和起始时间必须同时存在，时间间隔不能超过七天，与款式编码不能同时为空
     */
    private String modifiedEnd;

    /**
     * 是否只查询款式信息不返回商品明细
     */
    private Boolean onlyItem;

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/d88845e1-d58d-4b4f-be92-d009aa546bd4_1982_679.png" target="_blank">款式编码</a></div>与修改时间不能同时为空，最多20
     */
    private java.util.List<String> iIds;

    /**
     * 第几页，从第一页开始，默认1
     */
    private Integer pageIndex;

    /**
     * 每页多少条，默认30，最大50
     */
    private Integer pageSize;

    /**
     * 查询款字段，用于查询指定需要的字段,传f_json可查询款式的多图
     */
    private java.util.List<String> itemFlds;

    /**
     * 查询商品字段，用于查询指定需要的字段
     */
    private java.util.List<String> itemskuFlds;

    /**
     * 可传created,modified。默认按照modified查询
     */
    private String dateField;
}
