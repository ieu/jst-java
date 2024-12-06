package io.github.ieu.jst.aftersale;

@lombok.Data
@lombok.Builder
public class JstPayQueryAsModifiedAfterSaleRequest {

    /**
     * 店铺编号
     */
    private Integer shopId;

    /**
     * 是否归档
     */
    private Boolean isArchive;

    /**
     * 修改起始时间
     */
    private String modifiedBegin;

    /**
     * 修改结束时间（时间跨度不超过6个月）
     */
    private String modifiedEnd;

    /**
     * 开始ts,用于辅助分页
     */
    private Integer startTs;

    /**
     * 第几页（默认1，最大800）
     */
    private Integer pageIndex;

    /**
     * 页大小（默认1，最大1000）
     */
    private Integer pageSize;
}
