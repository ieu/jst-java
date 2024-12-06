package io.github.ieu.jst.supplychainopen;

/**
 * 查询参数
 */
@lombok.Data
@lombok.Builder
public class JstQueryDiserpGoodsDataRequest {

    /**
     * 供应商商家ID
     */
    private String supplierCoId;

    /**
     * 款式编码，多个使用逗号分隔，最多500个
     */
    private String styleCodes;

    /**
     * 商品编码，多个使用逗号分隔，最多500个
     */
    private String itemCodes;

    /**
     * 商品名称
     */
    private String itemName;

    /**
     * 条形码
     */
    private String skuCode;

    /**
     * 品牌
     */
    private String brandName;

    /**
     * 创建开始时间，yyyy-MM-dd HH:mm:ss
     */
    private String startTime;

    /**
     * 创建结束时间，yyyy-MM-dd HH:mm:ss
     */
    private String endTime;

    /**
     * 商品类型（normal 普通商品，combine 组合装商品）
     */
    private String skuType;

    /**
     * 子商品编码，多个使用逗号分隔，最多500个
     */
    private String childItemCodes;

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/4f769d08-d119-4523-9fb5-f31533db3e8d_1908_532.png" target="_blank">库存搜索开始</a></div>
     */
    private Integer stockStart;

    /**
     * 库存搜索结束
     */
    private Integer stockEnd;

    /**
     * 页码
     */
    private Integer pageNum;

    /**
     * 分页大小
     */
    private String pageSize;

    /**
     * 排序字段： 0:默认按skuId; 1:按款式编码; 2:创建时间
     */
    private Integer orderByKey;

    /**
     * 排序，true为正序，false为倒序
     */
    private Boolean ascOrDesc;
}
