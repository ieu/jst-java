package io.github.ieu.jst.wms;

public class JstQueryInOutWaterSpec {

    private final JstWmsClient client;

    private final JstQueryInOutWaterRequest.JstQueryInOutWaterRequestBuilder requestBuilder = JstQueryInOutWaterRequest.builder();

    public JstQueryInOutWaterSpec(JstWmsClient client) {
        this.client = client;
    }

    /**
     * 页码 最大查询800页
     */
    public JstQueryInOutWaterSpec pageIndex(Integer pageIndex) {
        requestBuilder.pageIndex(pageIndex);
        return this;
    }

    /**
     * 每页数据条数最多50
     */
    public JstQueryInOutWaterSpec pageSize(Integer pageSize) {
        requestBuilder.pageSize(pageSize);
        return this;
    }

    /**
     * 开始时间
     */
    public JstQueryInOutWaterSpec startTime(String startTime) {
        requestBuilder.startTime(startTime);
        return this;
    }

    /**
     * 结束时间
     */
    public JstQueryInOutWaterSpec endTime(String endTime) {
        requestBuilder.endTime(endTime);
        return this;
    }

    /**
     * 默认0,0=修改时间;1=制单日期;2=出入库时间
     */
    public JstQueryInOutWaterSpec dateType(Integer dateType) {
        requestBuilder.dateType(dateType);
        return this;
    }

    /**
     * 单据类型，采购进仓，采购退货，调拨出，调拨入，加工出仓，加工进仓，盘点，销售出仓，销售退货，其它出库，其它进仓，其它退货，结算，差异
     */
    public JstQueryInOutWaterSpec type(String type) {
        requestBuilder.type(type);
        return this;
    }

    /**
     * 分仓编号
     */
    public JstQueryInOutWaterSpec wmsCoId(Integer wmsCoId) {
        requestBuilder.wmsCoId(wmsCoId);
        return this;
    }

    public JstQueryInOutWaterResponse response() {
        return this.client.queryInOutWater(requestBuilder.build());
    }
}
