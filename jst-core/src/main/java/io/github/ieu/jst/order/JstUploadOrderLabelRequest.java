package io.github.ieu.jst.order;

@lombok.Data
@lombok.Builder
public class JstUploadOrderLabelRequest {

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/deab32f3-191d-43c8-b213-343bb82070e1_2161_433.png" target="_blank">内部订单号</a></div>o_id 和 (shop_id, so_id)组合 不能同时为空
     */
    private Integer oId;

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/ccaa4f9d-b986-4c48-b2d2-1e8b20177658_2166_836.png" target="_blank">店铺编号</a></div>
     */
    private Integer shopId;

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/e457dae3-e441-4644-860e-e070d05929df_1924_284.png" target="_blank">线上单号</a></div>
     */
    private String soId;

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/9d7e9208-cd27-4c4d-9e07-b65033c40295_1997_1089.png" target="_blank">标签列表</a></div>数量大于0且小于20，单个标签长度10，不可重复
     */
    private java.util.List<String> labels;

    /**
     * 操作类型，1=新增，2=移除
     */
    private Integer actionType;
}
