package io.github.ieu.jst.item;

@lombok.Data
@lombok.Builder
public class JstQuerySkuMapRequest {

    /**
     * 第几页，从第一页开始，默认1
     */
    private Integer pageIndex;

    /**
     * 每页多少条，默认30，最大50
     */
    private Integer pageSize;

    /**
     * 修改起始时间，和结束时间必须同时存在，时间间隔不能超过七天，与商品编码不能同时为空
     */
    private String modifiedBegin;

    /**
     * 修改结束时间，和起始时间必须同时存在，时间间隔不能超过七天，与商品编码不能同时为空
     */
    private String modifiedEnd;

    /**
     * 商品对应关系修改起始时间
     */
    private String linkModifiedBegin;

    /**
     * 商品对应关系修改结束时间
     */
    private String linkModifiedEnd;

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/af0e3965-d4ac-43cb-a3b6-04c2122b2376_2384_529.png" target="_blank">商品编码</a></div>（线上商品编码），与修改时间不能同时为空，最多20
     */
    private String skuIds;

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/ccaa4f9d-b986-4c48-b2d2-1e8b20177658_2166_836.png" target="_blank">店铺编号</a></div>
     */
    private Integer shopId;

    /**
     * 创建开始时间，与结束时间不能同时为空
     */
    private String createdBegin;

    /**
     * 创建结束时间，和开始时间不能同时为空
     */
    private String createdEnd;
}
