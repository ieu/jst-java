package io.github.ieu.jst.inventory;

public class JstUploadInventoryV2Spec {

    private final JstInventoryClient client;

    private final JstUploadInventoryV2Request.JstUploadInventoryV2RequestBuilder requestBuilder = JstUploadInventoryV2Request.builder();

    public JstUploadInventoryV2Spec(JstInventoryClient client) {
        this.client = client;
    }

    /**
     * 仓库编码，不填写默认主仓
     */
    public JstUploadInventoryV2Spec wmsCoId(Integer wmsCoId) {
        requestBuilder.wmsCoId(wmsCoId);
        return this;
    }

    /**
     * 盘点类型 :非精细化盘点 ，全量:check （覆盖，传哪个商品覆盖哪个商品库存，没有传的商品库存不变）;增量:adjust(默认adjust，在原基础数量上增加) ；精细化仓位盘点，type=check，为全量盘点，仓位上未传的商品库存盘为0；type=adjust，为增量盘点，未传的商品库存不盘点，传的数量做增量盘点，如盘前库存=10，传参数量=2，则盘点后库存为10+2=12
     */
    public JstUploadInventoryV2Spec type(String type) {
        requestBuilder.type(type);
        return this;
    }

    /**
     * 是否自动确认单据；默认false
     */
    public JstUploadInventoryV2Spec isConfirm(Boolean isConfirm) {
        requestBuilder.isConfirm(isConfirm);
        return this;
    }

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/d5c28299-18a0-4bd7-82e4-6854444e0a6c_2438_434.png" target="_blank">外部单号</a></div>（自定义传唯一值不可重复传，以第一次传成功的结果为准）
     */
    public JstUploadInventoryV2Spec soId(String soId) {
        requestBuilder.soId(soId);
        return this;
    }

    /**
     * 仓库;主仓=1，销退仓=2， 进货仓=3，次品仓 = 4,自定义1仓=6，自定义2仓=7，自定义3仓=8
     */
    public JstUploadInventoryV2Spec warehouse(String warehouse) {
        requestBuilder.warehouse(warehouse);
        return this;
    }

    /**
     * 备注
     */
    public JstUploadInventoryV2Spec remark(String remark) {
        requestBuilder.remark(remark);
        return this;
    }

    /**
     * 仓位(开启精细化管理有效且必填）
     */
    public JstUploadInventoryV2Spec bin(String bin) {
        requestBuilder.bin(bin);
        return this;
    }

    /**
     * 暂存位类型（开启精细化管理有效且必填可传值Default（暂存位），Pick（拣货暂存位）,None）
     */
    public JstUploadInventoryV2Spec defaultType(String defaultType) {
        requestBuilder.defaultType(defaultType);
        return this;
    }

    /**
     * 商品明细，最大500
     */
    public JstUploadInventoryV2Spec items(java.util.List<JstUploadInventoryV2Request.Item> items) {
        requestBuilder.items(items);
        return this;
    }

    public JstUploadInventoryV2Response response() {
        return this.client.uploadInventoryV2(requestBuilder.build());
    }
}
