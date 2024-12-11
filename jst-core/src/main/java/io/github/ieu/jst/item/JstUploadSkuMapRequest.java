package io.github.ieu.jst.item;

@lombok.Data
@lombok.Builder
public class JstUploadSkuMapRequest {

    /**
     * 商品列表
     */
    private java.util.List<Item> items;

    @lombok.Data
    public static class Item {

        /**
         * <div><a href="https://cdn.erp321.cn/jst-fed/af0e3965-d4ac-43cb-a3b6-04c2122b2376_2384_529.png" target="_blank">商品编码</a></div>可更新（线上商品编码）
         */
        private String skuId;

        /**
         * <div><a href="https://cdn.erp321.cn/jst-fed/48dab516-860c-4386-926d-70b3aea15f35_2047_652.png" target="_blank">款式编码</a></div>可更新（线上款式编码）
         */
        private String iId;

        /**
         * <div><a href="https://cdn.erp321.cn/jst-fed/5359e0c9-fc4d-4840-b153-31c35c644048_2257_574.png" target="_blank">国标码</a></div>可更新
         */
        private String skuCode;

        /**
         * <div><a href="https://cdn.erp321.cn/jst-fed/d756b4bb-9f54-4951-9253-37896a282ebb_1862_642.png" target="_blank">店铺商品款式</a></div>（平台店铺款式编码）
         */
        private String shopIId;

        /**
         * <div><a href="https://cdn.erp321.cn/jst-fed/6780aa9d-f9b8-49e9-876f-e1c9adfa1104_2187_518.png" target="_blank">店铺商品编码</a></div>（平台店铺商品编码）
         */
        private String shopSkuId;

        /**
         * <div><a href="https://cdn.erp321.cn/jst-fed/28db4409-2042-488b-88bd-a2a360f967b9_2426_619.png" target="_blank">原始商品编码</a></div>可更新
         */
        private String originalSkuId;

        /**
         * 商品名称，可更新
         */
        private String name;

        /**
         * 店铺颜色规格，可更新（线上颜色规格）
         */
        private String shopPropertiesValue;

        /**
         * 商品标识(线上商品的特殊属性，比如零售，阶梯)，可更新，可为空字符串
         */
        private String skuSign;

        /**
         * <div><a href="https://cdn.erp321.cn/jst-fed/ccaa4f9d-b986-4c48-b2d2-1e8b20177658_2166_836.png" target="_blank">店铺编号</a></div>
         */
        private Integer shopId;

        /**
         * 线上链接
         */
        private String shopSkuUrl;
    }
}
