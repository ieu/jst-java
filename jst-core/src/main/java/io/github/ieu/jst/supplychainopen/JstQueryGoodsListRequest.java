package io.github.ieu.jst.supplychainopen;

@lombok.Data
@lombok.Builder
public class JstQueryGoodsListRequest {

    /**
     * 页码 1开始
     */
    private Number pageNum;

    /**
     * 每页条数 最多100
     */
    private Number pageSize;

    /**
     * 排序 ASC:创建时间正序,DESC:创建时间倒序
     */
    private String sort;

    /**
     * 商品来源 ADD:手工新增
     */
    private String itemSource;

    /**
     * 创建人
     */
    private String creator;

    /**
     * 创建时间开区间
     */
    private String createdStartTime;

    /**
     * 创建时间闭区间
     */
    private String createdEndTime;

    /**
     * 款号列表 精确搜索,一次最多20个
     */
    private java.util.List<String> styleCodeList;

    /**
     * 商品编码 精确搜索,一次最多20个
     */
    private java.util.List<String> itemCodeList;

    /**
     * 商品名称 模糊搜索
     */
    private String itemName;

    /**
     * 更新时间开始时间
     */
    private String updateStartTime;

    /**
     * 更新时间结束时间
     */
    private String updateEndTime;

    /**
     * 排序字段；需要排序的字段结合sort使用CREATED创建时间，UPDATED更新时间，不传默认创建时间
     */
    private String sortField;

    /**
     * 代发供应商名称
     */
    private String distributorSupplierName;
}
