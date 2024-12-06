package io.github.ieu.jst.crossborder;

@lombok.Data
@lombok.Builder
public class JstGetCbLogisticsTrackDetailRequest {

    /**
     * 国际运单号,批量查询,最多十个
     */
    private java.util.List<String> lId;
}
