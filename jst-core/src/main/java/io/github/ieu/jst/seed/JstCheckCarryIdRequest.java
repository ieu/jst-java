package io.github.ieu.jst.seed;

@lombok.Data
@lombok.Builder
public class JstCheckCarryIdRequest {

    /**
     * 播种车号
     */
    private java.util.List<String> carryIds;

    /**
     * 仓库编码
     */
    private Number wmsCoId;
}
