package io.github.ieu.jst.seed;

public class JstUnbindWaveCarryIdSpec {

    private final JstSeedClient client;

    private final JstUnbindWaveCarryIdRequest.JstUnbindWaveCarryIdRequestBuilder requestBuilder = JstUnbindWaveCarryIdRequest.builder();

    public JstUnbindWaveCarryIdSpec(JstSeedClient client) {
        this.client = client;
    }

    public JstUnbindWaveCarryIdSpec carryIds(java.util.List<String> carryIds) {
        requestBuilder.carryIds(carryIds);
        return this;
    }

    public JstUnbindWaveCarryIdResponse response() {
        return this.client.unbindWaveCarryId(requestBuilder.build());
    }
}
