package io.github.ieu.jst.seed;

public class JstCheckCarryIdSpec {

    private final JstSeedClient client;

    private final JstCheckCarryIdRequest.JstCheckCarryIdRequestBuilder requestBuilder = JstCheckCarryIdRequest.builder();

    public JstCheckCarryIdSpec(JstSeedClient client) {
        this.client = client;
    }

    /**
     * 播种车号
     */
    public JstCheckCarryIdSpec carryIds(java.util.List<String> carryIds) {
        requestBuilder.carryIds(carryIds);
        return this;
    }

    /**
     * 仓库编码
     */
    public JstCheckCarryIdSpec wmsCoId(Number wmsCoId) {
        requestBuilder.wmsCoId(wmsCoId);
        return this;
    }

    public JstCheckCarryIdResponse response() {
        return this.client.checkCarryId(requestBuilder.build());
    }
}
