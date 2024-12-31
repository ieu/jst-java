package io.github.ieu.jst.seed;

public class JstBindBinIdCarryIdSpec {

    private final JstSeedClient client;

    private final JstBindBinIdCarryIdRequest.JstBindBinIdCarryIdRequestBuilder requestBuilder = JstBindBinIdCarryIdRequest.builder();

    public JstBindBinIdCarryIdSpec(JstSeedClient client) {
        this.client = client;
    }

    /**
     * 批次号
     */
    public JstBindBinIdCarryIdSpec waveId(String waveId) {
        requestBuilder.waveId(waveId);
        return this;
    }

    /**
     * 播种车号
     */
    public JstBindBinIdCarryIdSpec carryId(String carryId) {
        requestBuilder.carryId(carryId);
        return this;
    }

    /**
     * 分仓编号
     */
    public JstBindBinIdCarryIdSpec wmsCoId(String wmsCoId) {
        requestBuilder.wmsCoId(wmsCoId);
        return this;
    }

    /**
     * 出库单播种柜号
     */
    public JstBindBinIdCarryIdSpec bindBinIdCarryIds(java.util.List<JstBindBinIdCarryIdRequest.BindBinIdCarryId> bindBinIdCarryIds) {
        requestBuilder.bindBinIdCarryIds(bindBinIdCarryIds);
        return this;
    }

    public JstBindBinIdCarryIdResponse response() {
        return this.client.bindBinIdCarryId(requestBuilder.build());
    }
}
