package io.github.ieu.jst.wms;

@lombok.Data
@lombok.Builder
public class JstQueryInOutWaterRequest {

    /**
     * 页码 最大查询800页
     */
    private Integer pageIndex;

    /**
     * 每页数据条数最多50
     */
    private Integer pageSize;

    /**
     * 开始时间
     */
    private String startTime;

    /**
     * 结束时间
     */
    private String endTime;

    /**
     * 默认0,0=修改时间;1=制单日期;2=出入库时间
     */
    private Integer dateType;

    /**
     * 单据类型，采购进仓，采购退货，调拨出，调拨入，加工出仓，加工进仓，盘点，销售出仓，销售退货，其它出库，其它进仓，其它退货，结算，差异
     */
    private String type;

    /**
     * 分仓编号
     */
    private Integer wmsCoId;
}
