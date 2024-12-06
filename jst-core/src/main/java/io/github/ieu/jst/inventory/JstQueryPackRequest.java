package io.github.ieu.jst.inventory;

@lombok.Data
@lombok.Builder
public class JstQueryPackRequest {

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/0fe8c944-1a07-4357-9f67-e2a4efe7a618_2207_745.png" target="_blank">商品编码</a></div>列表，最多20个sku
     */
    private java.util.List<String> skuIds;

    /**
     * 仓库编号
     */
    private Integer wmsCoId;

    /**
     * 类型，Bin=仓位库存，DefaultPack=暂存位 Pack=装箱库存
     */
    private String packType;

    /**
     * 每页多少条（最大200）
     */
    private Integer pageSize;

    /**
     * 第几页
     */
    private Integer pageIndex;

    /**
     * 货主编号
     */
    private Integer ownerCoId;

    /**
     * 修改开始时间
     */
    private String startTime;

    /**
     * 修改结束时间（开始结束范围不超过1天）与商品编码条件不能同时为空。需要用修改时间条件查询的需要联系我们开开关，用修改时间查询不会返回总条数总页数的值返回格式不同需要注意
     */
    private String endTime;
}
