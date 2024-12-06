package io.github.ieu.jst.inventory;

@lombok.Data
@lombok.Builder
public class JstQueryInventoryRequest {

    /**
     * 分仓公司编号，值不传或为0查询所有仓的总库存，传值为指定仓的库存即为库存查询（分仓）界面的数据；编号查询：https://openweb.jushuitan.com/dev-doc?docType=1&docId=3
     */
    private Integer wmsCoId;

    /**
     * 第几页，从1开始
     */
    private Integer pageIndex;

    /**
     * 默认30，最大不超过100
     */
    private Integer pageSize;

    /**
     * 修改起始时间，和结束时间必须同时存在，时间间隔不能超过七天
     */
    private String modifiedBegin;

    /**
     * 修改结束时间，和结束时间必须同时存在，时间间隔不能超过七天
     */
    private String modifiedEnd;

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/83b57188-e283-4ca3-8456-830dd9255d7e_2175_728.png" target="_blank">商品编码</a></div>多个用逗号分隔，与修改时间不能同时为空,最大不超过100个
     */
    private String skuIds;

    /**
     * 是否查询库存锁定数
     */
    private Boolean hasLockQty;

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/355cdbcb-0e62-48be-a30d-ea786deb980e_1379_737.png" target="_blank">商品名称</a></div>最多100个，多个商品名称用逗号隔开
     */
    private String names;

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/208d1032-aa00-4a10-87f9-82982dda8140_1704_844.png" target="_blank">款式编码</a></div>
     */
    private String iIds;

    /**
     * 时间戳，防漏单，如果用ts查询不需要传时间查询条件
     */
    private Integer ts;
}
