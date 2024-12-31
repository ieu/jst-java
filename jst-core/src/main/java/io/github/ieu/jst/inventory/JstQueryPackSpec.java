package io.github.ieu.jst.inventory;

public class JstQueryPackSpec {

    private final JstInventoryClient client;

    private final JstQueryPackRequest.JstQueryPackRequestBuilder requestBuilder = JstQueryPackRequest.builder();

    public JstQueryPackSpec(JstInventoryClient client) {
        this.client = client;
    }

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/0fe8c944-1a07-4357-9f67-e2a4efe7a618_2207_745.png" target="_blank">商品编码</a></div>列表，最多20个sku
     */
    public JstQueryPackSpec skuIds(java.util.List<String> skuIds) {
        requestBuilder.skuIds(skuIds);
        return this;
    }

    /**
     * 仓库编号
     */
    public JstQueryPackSpec wmsCoId(Integer wmsCoId) {
        requestBuilder.wmsCoId(wmsCoId);
        return this;
    }

    /**
     * 类型，Bin=仓位库存，DefaultPack=暂存位 Pack=装箱库存
     */
    public JstQueryPackSpec packType(String packType) {
        requestBuilder.packType(packType);
        return this;
    }

    /**
     * 每页多少条（最大200）
     */
    public JstQueryPackSpec pageSize(Integer pageSize) {
        requestBuilder.pageSize(pageSize);
        return this;
    }

    /**
     * 第几页
     */
    public JstQueryPackSpec pageIndex(Integer pageIndex) {
        requestBuilder.pageIndex(pageIndex);
        return this;
    }

    /**
     * 货主编号
     */
    public JstQueryPackSpec ownerCoId(Integer ownerCoId) {
        requestBuilder.ownerCoId(ownerCoId);
        return this;
    }

    /**
     * 修改开始时间
     */
    public JstQueryPackSpec startTime(String startTime) {
        requestBuilder.startTime(startTime);
        return this;
    }

    /**
     * 修改结束时间（开始结束范围不超过1天）与商品编码条件不能同时为空。需要用修改时间条件查询的需要联系我们开开关，用修改时间查询不会返回总条数总页数的值返回格式不同需要注意
     */
    public JstQueryPackSpec endTime(String endTime) {
        requestBuilder.endTime(endTime);
        return this;
    }

    public JstQueryPackResponse response() {
        return this.client.queryPack(requestBuilder.build());
    }
}
