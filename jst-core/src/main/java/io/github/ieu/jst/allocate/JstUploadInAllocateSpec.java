package io.github.ieu.jst.allocate;

public class JstUploadInAllocateSpec {

    private final JstAllocateClient client;

    private final JstUploadInAllocateRequest.JstUploadInAllocateRequestBuilder requestBuilder = JstUploadInAllocateRequest.builder();

    public JstUploadInAllocateSpec(JstAllocateClient client) {
        this.client = client;
    }

    /**
     * 调拨时间
     */
    public JstUploadInAllocateSpec ioDate(String ioDate) {
        requestBuilder.ioDate(ioDate);
        return this;
    }

    /**
     * 调入仓  1是主仓，2是销退仓，3是进货仓，4是次品仓，自定义1仓=6，自定义2仓=7，自定义3仓=8，自定义4仓=9，自定义5仓=10，自定义6仓=11，自定义7仓=12，自定义8仓=13，自定义9仓=14，自定义10仓=15（对应ERP仓库资料设定页面）
     */
    public JstUploadInAllocateSpec linkWarehouse(Integer linkWarehouse) {
        requestBuilder.linkWarehouse(linkWarehouse);
        return this;
    }

    /**
     * 备注
     */
    public JstUploadInAllocateSpec remark(String remark) {
        requestBuilder.remark(remark);
        return this;
    }

    /**
     * 外部调拨单号，最长不超过50;唯一（单据上传成功之后对应页面线上订单号）
     */
    public JstUploadInAllocateSpec soId(String soId) {
        requestBuilder.soId(soId);
        return this;
    }

    /**
     * 调出仓公司内仓库id：1是主仓，2是销退仓，3是进货仓，4是次品仓，自定义1仓=6，自定义2仓=7，自定义3仓=8，自定义4仓=9，自定义5仓=10，自定义6仓=11，自定义7仓=12，自定义8仓=13，自定义9仓=14，自定义10仓=15（对应ERP仓库资料设定页面）
     */
    public JstUploadInAllocateSpec warehouse(Integer warehouse) {
        requestBuilder.warehouse(warehouse);
        return this;
    }

    /**
     * 分仓编号（对应ERP需要第三方物流或分仓页面,编码查询：https://openweb.jushuitan.com/dev-doc?docType=1&docId=3）
     */
    public JstUploadInAllocateSpec wmsCoId(Integer wmsCoId) {
        requestBuilder.wmsCoId(wmsCoId);
        return this;
    }

    /**
     * 商品集合
     */
    public JstUploadInAllocateSpec items(java.util.List<JstUploadInAllocateRequest.Item> items) {
        requestBuilder.items(items);
        return this;
    }

    /**
     * 标记｜多标签
     */
    public JstUploadInAllocateSpec labels(java.util.List<String> labels) {
        requestBuilder.labels(labels);
        return this;
    }

    /**
     * 是否自动确认单据
     */
    public JstUploadInAllocateSpec isConfirm(Boolean isConfirm) {
        requestBuilder.isConfirm(isConfirm);
        return this;
    }

    public JstUploadInAllocateResponse response() {
        return this.client.uploadInAllocate(requestBuilder.build());
    }
}
