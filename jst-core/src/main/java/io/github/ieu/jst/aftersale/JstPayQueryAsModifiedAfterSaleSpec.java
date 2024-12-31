package io.github.ieu.jst.aftersale;

public class JstPayQueryAsModifiedAfterSaleSpec {

    private final JstAfterSaleClient client;

    private final JstPayQueryAsModifiedAfterSaleRequest.JstPayQueryAsModifiedAfterSaleRequestBuilder requestBuilder = JstPayQueryAsModifiedAfterSaleRequest.builder();

    public JstPayQueryAsModifiedAfterSaleSpec(JstAfterSaleClient client) {
        this.client = client;
    }

    /**
     * 店铺编号
     */
    public JstPayQueryAsModifiedAfterSaleSpec shopId(Integer shopId) {
        requestBuilder.shopId(shopId);
        return this;
    }

    /**
     * 是否归档
     */
    public JstPayQueryAsModifiedAfterSaleSpec isArchive(Boolean isArchive) {
        requestBuilder.isArchive(isArchive);
        return this;
    }

    /**
     * 修改起始时间
     */
    public JstPayQueryAsModifiedAfterSaleSpec modifiedBegin(String modifiedBegin) {
        requestBuilder.modifiedBegin(modifiedBegin);
        return this;
    }

    /**
     * 修改结束时间（时间跨度不超过6个月）
     */
    public JstPayQueryAsModifiedAfterSaleSpec modifiedEnd(String modifiedEnd) {
        requestBuilder.modifiedEnd(modifiedEnd);
        return this;
    }

    /**
     * 开始ts,用于辅助分页
     */
    public JstPayQueryAsModifiedAfterSaleSpec startTs(Integer startTs) {
        requestBuilder.startTs(startTs);
        return this;
    }

    /**
     * 第几页（默认1，最大800）
     */
    public JstPayQueryAsModifiedAfterSaleSpec pageIndex(Integer pageIndex) {
        requestBuilder.pageIndex(pageIndex);
        return this;
    }

    /**
     * 页大小（默认1，最大1000）
     */
    public JstPayQueryAsModifiedAfterSaleSpec pageSize(Integer pageSize) {
        requestBuilder.pageSize(pageSize);
        return this;
    }

    public JstPayQueryAsModifiedAfterSaleResponse response() {
        return this.client.payQueryAsModifiedAfterSale(requestBuilder.build());
    }
}
