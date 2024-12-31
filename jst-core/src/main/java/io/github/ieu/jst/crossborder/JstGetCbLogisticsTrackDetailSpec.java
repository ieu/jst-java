package io.github.ieu.jst.crossborder;

public class JstGetCbLogisticsTrackDetailSpec {

    private final JstCrossBorderClient client;

    private final JstGetCbLogisticsTrackDetailRequest.JstGetCbLogisticsTrackDetailRequestBuilder requestBuilder = JstGetCbLogisticsTrackDetailRequest.builder();

    public JstGetCbLogisticsTrackDetailSpec(JstCrossBorderClient client) {
        this.client = client;
    }

    /**
     * 国际运单号,批量查询,最多十个
     */
    public JstGetCbLogisticsTrackDetailSpec lId(java.util.List<String> lId) {
        requestBuilder.lId(lId);
        return this;
    }

    public JstGetCbLogisticsTrackDetailResponse response() {
        return this.client.getCbLogisticsTrackDetail(requestBuilder.build());
    }
}
