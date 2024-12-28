package io.github.ieu.jst.item;

@lombok.Data
@lombok.Builder
public class JstUploadItemSkuRequest {

    /**
     * 商品列表
     */
    private java.util.List<Item> items;

    /**
     * 校验是否已经有了组合装商品编码，默认为false,入参为 true 则校验修改的sku 类型不得为组合装，否则跳过不处理并输出错误信息
     */
    private Boolean isNormal;

    @lombok.Data
    public static class Item {

        /**
         * <div><a href="https://cdn.erp321.cn/jst-fed/ea2950e9-248e-494b-bb6a-68ac71140602_1822_674.png" target="_blank">商品编码</a></div>
         */
        private String skuId;

        /**
         * <div><a href="https://cdn.erp321.cn/jst-fed/5c9139b0-d0b1-404c-a55b-260fef4e4054_2254_763.png" target="_blank">款式编码</a></div>可更新
         */
        private String iId;

        /**
         * <div><a href="https://cdn.erp321.cn/jst-fed/2ee6ee3d-b7ba-4251-a7fc-d129815f4c89_2085_709.png" target="_blank">品牌</a></div>可更新
         */
        private String brand;

        /**
         * <div><a href="https://cdn.erp321.cn/jst-fed/608669e5-82da-4864-b80c-1d267a77d76e_2293_749.png" target="_blank">虚拟分类</a></div>可更新
         */
        private String vcName;

        /**
         * <div><a href="https://cdn.erp321.cn/jst-fed/dd4e4966-a6aa-4086-83a8-f778997aec0a_1390_429.png" target="_blank">商品分类</a></div>必须是[商品类目管理]中的叶子节点，可更新
         */
        private String cName;

        /**
         * <div><a href="https://cdn.erp321.cn/jst-fed/58b7abbe-340d-4720-aa26-eeae069b4a0c_1998_779.png" target="_blank">基本售价</a></div>可更新
         */
        private Number sPrice;

        /**
         * 商品属性，可选值["成品","半成品","原材料","包材"]，可更新
         */
        private String itemType;

        /**
         * <div><a href="https://cdn.erp321.cn/jst-fed/f634f905-52aa-48dc-91a2-26a5611437d2_1598_768.png" target="_blank">长</a></div>可更新
         */
        private Number l;

        /**
         * <div><a href="https://cdn.erp321.cn/jst-fed/f634f905-52aa-48dc-91a2-26a5611437d2_1598_768.png" target="_blank">宽</a></div>可更新
         */
        private Number w;

        /**
         * <div><a href="https://cdn.erp321.cn/jst-fed/f634f905-52aa-48dc-91a2-26a5611437d2_1598_768.png" target="_blank">高</a></div>可更新
         */
        private Number h;

        /**
         * <div><a href="https://cdn.erp321.cn/jst-fed/99c1affc-bcac-44e2-b2ff-dd507060fdf4_1782_839.png" target="_blank">图片地址（款图片）</a></div>可更新，varchar(300)
         */
        private String pic;

        /**
         * <div><a href="https://cdn.erp321.cn/jst-fed/8417b465-5a6e-4bf3-a60c-6d8e12c9a3f7_2335_953.png" target="_blank">大图地址</a></div>可更新，varchar(300)
         */
        private String picBig;

        /**
         * <div><a href="https://cdn.erp321.cn/jst-fed/7b0f7ef6-086b-4fe8-a098-09a2a4913c3c_2100_903.png" target="_blank">商品图片（sku图片）</a></div>可更新，varchar(300)
         */
        private String skuPic;

        /**
         * <div><a href="https://cdn.erp321.cn/jst-fed/e5046b96-a4ad-44a7-95ff-d492d321b8c1_2195_491.png" target="_blank">名称</a></div>可更新
         */
        private String name;

        /**
         * 备注，可更新
         */
        private String remark;

        /**
         * <div><a href="https://cdn.erp321.cn/jst-fed/08c04e22-5667-4530-8cff-d7dfa6c4fd69_2396_689.png" target="_blank">颜色及规格</a></div>可更新（最多100个字符，1个汉字等于1个字符）
         */
        private String propertiesValue;

        /**
         * <div><a href="https://cdn.erp321.cn/jst-fed/c4eadddb-d97e-49c8-8c06-1bfe79469e31_2212_726.png" target="_blank">简称</a></div>可更新
         */
        private String shortName;

        /**
         * <div><a href="https://cdn.erp321.cn/jst-fed/6342ed10-9e0b-47a0-bfcf-0729325d8d5a_2409_643.png" target="_blank">重量</a></div>可更新
         */
        private Number weight;

        /**
         * 是否启用，默认值1,可选值:-1=禁用,0=备用,1=启用，可更新
         */
        private Integer enabled;

        /**
         * <div><a href="https://cdn.erp321.cn/jst-fed/b0c3c9e6-a638-4038-bdd9-c64184e07b80_2547_689.png" target="_blank">供应商名称</a></div>可更新
         */
        private String supplierName;

        /**
         * <div><a href="https://cdn.erp321.cn/jst-fed/b54fddff-cc0d-442c-bd16-3d5cf3dd501c_2324_568.png" target="_blank">国标码</a></div>可更新
         */
        private String skuCode;

        /**
         * <div><a href="https://cdn.erp321.cn/jst-fed/6cc22a04-f130-43c6-bbb2-6a68951f2dfe_2541_765.png" target="_blank">供应商商品编码</a></div>可更新
         */
        private String supplierSkuId;

        /**
         * <div><a href="https://cdn.erp321.cn/jst-fed/6cc22a04-f130-43c6-bbb2-6a68951f2dfe_2541_765.png" target="_blank">供应商款式编码</a></div>可更新
         */
        private String supplierIId;

        /**
         * <div><a href="https://cdn.erp321.cn/jst-fed/9fc19b16-b616-4a48-a543-0c8848cb68d2_2455_1223.png" target="_blank">其它价格1</a></div>可更新
         */
        private Number otherPrice_1;

        /**
         * 其它价格2，可更新
         */
        private Number otherPrice_2;

        /**
         * 其它价格3，可更新
         */
        private Number otherPrice_3;

        /**
         * 其它价格4，可更新
         */
        private Number otherPrice_4;

        /**
         * 其它价格5，可更新
         */
        private Number otherPrice_5;

        /**
         * 其它属性1，可更新
         */
        private String other_1;

        /**
         * 其它属性2，可更新
         */
        private String other_2;

        /**
         * 其它属性3，可更新
         */
        private String other_3;

        /**
         * 其它属性4，可更新
         */
        private String other_4;

        /**
         * 其它属性5，可更新
         */
        private String other_5;

        /**
         * 禁止同步，true=禁止，false=允许，可更新
         */
        private Boolean stockDisabled;

        /**
         * <div><a href="https://cdn.erp321.cn/jst-fed/3122b798-4835-4067-bd24-fe5160a2a2d2_2418_566.png" target="_blank">成本价</a></div>可更新
         */
        private Number cPrice;

        /**
         * <div><a href="https://cdn.erp321.cn/jst-fed/ca93f9e7-fa79-47b7-9e1d-745663fbe388_2360_653.png" target="_blank">市场|吊牌价</a></div>可更新
         */
        private Number marketPrice;

        /**
         * <div><a href="https://cdn.erp321.cn/jst-fed/6825ae88-8e9e-4800-b7ca-0e64659baf6e_2405_1041.png" target="_blank">单位</a></div>
         */
        private String unit;

        /**
         * 增加标签
         */
        private java.util.List<String> labels;

        /**
         * <div><a href="https://cdn.erp321.cn/jst-fed/52bde89b-ba8e-4a13-a85b-b240c4bac704_2527_1278.png" target="_blank">是否启用生产批次</a></div>可更新
         */
        private Boolean batchEnabled;

        /**
         * <div><a href="https://cdn.erp321.cn/jst-fed/cc576f6f-06c1-4af5-85ea-e355bc7dfc75_2555_1288.png" target="_blank">是否启用序列号</a></div>可更新
         */
        private Boolean isSeriesNumber;

        /**
         * 辅助码；长度不超过500，系统中相关业务项需配置
         */
        private String otherCode;

        /**
         * 保质期天数；必须大于0
         */
        private Integer shelfLife;

        /**
         * 临期天数
         */
        private Integer handDay;

        /**
         * 保质期禁收天数
         */
        private Integer rejectLifecycle;

        /**
         * 保质期禁售天数
         */
        private Integer lockupLifecycle;

        /**
         * 保质期临期预警天数
         */
        private Integer adventLifecycle;

        /**
         * <div><a href="https://cdn.erp321.cn/jst-fed/75a54905-ff50-4f12-93d5-58235926f000_2524_1229.png" target="_blank">按款显示时商品列表里的属性</a></div>传值时商品类目需存在；字段名称及字段值都可自定义，可更新
         */
        private java.util.Map<String, Object> CategoryPropertys;

        /**
         * 移除标签
         */
        private java.util.List<String> deletedlabels;

        /**
         * <div><a href="https://cdn.erp321.cn/jst-fed/8893be23-d7da-461d-a951-a03d196d8512_2480_894.png" target="_blank">生产许可证</a></div>
         */
        private String productionLicence;

        /**
         * <div><a href="https://cdn.erp321.cn/jst-fed/f94fb7be-8bd6-4cda-9e5c-6ff991090118_2503_927.png" target="_blank">采购价</a></div>
         */
        private Number purchasePrice;
    }
}
