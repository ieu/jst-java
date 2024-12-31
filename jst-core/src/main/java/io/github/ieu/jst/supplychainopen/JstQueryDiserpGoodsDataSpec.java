package io.github.ieu.jst.supplychainopen;

public class JstQueryDiserpGoodsDataSpec {

    private final JstSupplyChainOpenClient client;

    private final JstQueryDiserpGoodsDataRequest.JstQueryDiserpGoodsDataRequestBuilder requestBuilder = JstQueryDiserpGoodsDataRequest.builder();

    public JstQueryDiserpGoodsDataSpec(JstSupplyChainOpenClient client) {
        this.client = client;
    }

    /**
     * 供应商商家ID
     */
    public JstQueryDiserpGoodsDataSpec supplierCoId(String supplierCoId) {
        requestBuilder.supplierCoId(supplierCoId);
        return this;
    }

    /**
     * 款式编码，多个使用逗号分隔，最多500个
     */
    public JstQueryDiserpGoodsDataSpec styleCodes(String styleCodes) {
        requestBuilder.styleCodes(styleCodes);
        return this;
    }

    /**
     * 商品编码，多个使用逗号分隔，最多500个
     */
    public JstQueryDiserpGoodsDataSpec itemCodes(String itemCodes) {
        requestBuilder.itemCodes(itemCodes);
        return this;
    }

    /**
     * 商品名称
     */
    public JstQueryDiserpGoodsDataSpec itemName(String itemName) {
        requestBuilder.itemName(itemName);
        return this;
    }

    /**
     * 条形码
     */
    public JstQueryDiserpGoodsDataSpec skuCode(String skuCode) {
        requestBuilder.skuCode(skuCode);
        return this;
    }

    /**
     * 品牌
     */
    public JstQueryDiserpGoodsDataSpec brandName(String brandName) {
        requestBuilder.brandName(brandName);
        return this;
    }

    /**
     * 创建开始时间，yyyy-MM-dd HH:mm:ss
     */
    public JstQueryDiserpGoodsDataSpec startTime(String startTime) {
        requestBuilder.startTime(startTime);
        return this;
    }

    /**
     * 创建结束时间，yyyy-MM-dd HH:mm:ss
     */
    public JstQueryDiserpGoodsDataSpec endTime(String endTime) {
        requestBuilder.endTime(endTime);
        return this;
    }

    /**
     * 商品类型（normal 普通商品，combine 组合装商品）
     */
    public JstQueryDiserpGoodsDataSpec skuType(String skuType) {
        requestBuilder.skuType(skuType);
        return this;
    }

    /**
     * 子商品编码，多个使用逗号分隔，最多500个
     */
    public JstQueryDiserpGoodsDataSpec childItemCodes(String childItemCodes) {
        requestBuilder.childItemCodes(childItemCodes);
        return this;
    }

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/4f769d08-d119-4523-9fb5-f31533db3e8d_1908_532.png" target="_blank">库存搜索开始</a></div>
     */
    public JstQueryDiserpGoodsDataSpec stockStart(Integer stockStart) {
        requestBuilder.stockStart(stockStart);
        return this;
    }

    /**
     * 库存搜索结束
     */
    public JstQueryDiserpGoodsDataSpec stockEnd(Integer stockEnd) {
        requestBuilder.stockEnd(stockEnd);
        return this;
    }

    /**
     * 页码
     */
    public JstQueryDiserpGoodsDataSpec pageNum(Integer pageNum) {
        requestBuilder.pageNum(pageNum);
        return this;
    }

    /**
     * 分页大小
     */
    public JstQueryDiserpGoodsDataSpec pageSize(String pageSize) {
        requestBuilder.pageSize(pageSize);
        return this;
    }

    /**
     * 排序字段： 0:默认按skuId; 1:按款式编码; 2:创建时间
     */
    public JstQueryDiserpGoodsDataSpec orderByKey(Integer orderByKey) {
        requestBuilder.orderByKey(orderByKey);
        return this;
    }

    /**
     * 排序，true为正序，false为倒序
     */
    public JstQueryDiserpGoodsDataSpec ascOrDesc(Boolean ascOrDesc) {
        requestBuilder.ascOrDesc(ascOrDesc);
        return this;
    }

    public JstQueryDiserpGoodsDataResponse response() {
        return this.client.queryDiserpGoodsData(requestBuilder.build());
    }
}
