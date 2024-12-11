package io.github.ieu.jst.item;

@lombok.Data
@lombok.Builder
public class JstUploadItemSkuCostPriceRequest {

    private java.util.List<Data> datas;

    @lombok.Data
    public static class Data {

        /**
         * <div><a href="https://cdn.erp321.cn/jst-fed/ea2950e9-248e-494b-bb6a-68ac71140602_1822_674.png" target="_blank">商品编码</a></div>
         */
        private String skuId;

        /**
         * <div><a href="https://cdn.erp321.cn/jst-fed/d45ac881-2587-493a-bdeb-48d707c2f3aa_2050_908.png" target="_blank">截止时间</a></div>
         */
        private String endDate;

        /**
         * <div><a href="https://cdn.erp321.cn/jst-fed/a998f388-09c9-43ba-8e04-146f5e4f30c6_2170_939.png" target="_blank">历史成本价</a></div>
         */
        private String costPrice;
    }
}
