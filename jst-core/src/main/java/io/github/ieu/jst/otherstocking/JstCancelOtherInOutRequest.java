package io.github.ieu.jst.otherstocking;

@lombok.Data
@lombok.Builder
public class JstCancelOtherInOutRequest {

    /**
     * 出仓单号，与线上单号不能同时为空，两者都存在时取io_ids，最多20个
     */
    private java.util.List<String> ioIds;

    /**
     * 线上单号，与出仓单号不能同时为空，两者都存在时取io_ids，最多20个
     */
    private java.util.List<String> soIds;

    /**
     * 分仓单据需传入分仓编号
     */
    private String wmsCoId;

    /**
     * 操作  1:审核 2:取消审核 3:作废 4:确认生效（如果不传默认3作废操作）
     */
    private String operateType;
}
