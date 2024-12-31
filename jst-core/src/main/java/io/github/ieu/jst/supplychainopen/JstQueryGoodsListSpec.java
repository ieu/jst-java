package io.github.ieu.jst.supplychainopen;

public class JstQueryGoodsListSpec {

    private final JstSupplyChainOpenClient client;

    private final JstQueryGoodsListRequest.JstQueryGoodsListRequestBuilder requestBuilder = JstQueryGoodsListRequest.builder();

    public JstQueryGoodsListSpec(JstSupplyChainOpenClient client) {
        this.client = client;
    }

    /**
     * 页码 1开始
     */
    public JstQueryGoodsListSpec pageNum(Number pageNum) {
        requestBuilder.pageNum(pageNum);
        return this;
    }

    /**
     * 每页条数 最多100
     */
    public JstQueryGoodsListSpec pageSize(Number pageSize) {
        requestBuilder.pageSize(pageSize);
        return this;
    }

    /**
     * 排序 ASC:创建时间正序,DESC:创建时间倒序
     */
    public JstQueryGoodsListSpec sort(String sort) {
        requestBuilder.sort(sort);
        return this;
    }

    /**
     * 商品来源 ADD:手工新增
     */
    public JstQueryGoodsListSpec itemSource(String itemSource) {
        requestBuilder.itemSource(itemSource);
        return this;
    }

    /**
     * 创建人
     */
    public JstQueryGoodsListSpec creator(String creator) {
        requestBuilder.creator(creator);
        return this;
    }

    /**
     * 创建时间开区间
     */
    public JstQueryGoodsListSpec createdStartTime(String createdStartTime) {
        requestBuilder.createdStartTime(createdStartTime);
        return this;
    }

    /**
     * 创建时间闭区间
     */
    public JstQueryGoodsListSpec createdEndTime(String createdEndTime) {
        requestBuilder.createdEndTime(createdEndTime);
        return this;
    }

    /**
     * 款号列表 精确搜索,一次最多20个
     */
    public JstQueryGoodsListSpec styleCodeList(java.util.List<String> styleCodeList) {
        requestBuilder.styleCodeList(styleCodeList);
        return this;
    }

    /**
     * 商品编码 精确搜索,一次最多20个
     */
    public JstQueryGoodsListSpec itemCodeList(java.util.List<String> itemCodeList) {
        requestBuilder.itemCodeList(itemCodeList);
        return this;
    }

    /**
     * 商品名称 模糊搜索
     */
    public JstQueryGoodsListSpec itemName(String itemName) {
        requestBuilder.itemName(itemName);
        return this;
    }

    /**
     * 更新时间开始时间
     */
    public JstQueryGoodsListSpec updateStartTime(String updateStartTime) {
        requestBuilder.updateStartTime(updateStartTime);
        return this;
    }

    /**
     * 更新时间结束时间
     */
    public JstQueryGoodsListSpec updateEndTime(String updateEndTime) {
        requestBuilder.updateEndTime(updateEndTime);
        return this;
    }

    /**
     * 排序字段；需要排序的字段结合sort使用CREATED创建时间，UPDATED更新时间，不传默认创建时间
     */
    public JstQueryGoodsListSpec sortField(String sortField) {
        requestBuilder.sortField(sortField);
        return this;
    }

    /**
     * 代发供应商名称
     */
    public JstQueryGoodsListSpec distributorSupplierName(String distributorSupplierName) {
        requestBuilder.distributorSupplierName(distributorSupplierName);
        return this;
    }

    public JstQueryGoodsListResponse response() {
        return this.client.queryGoodsList(requestBuilder.build());
    }
}
