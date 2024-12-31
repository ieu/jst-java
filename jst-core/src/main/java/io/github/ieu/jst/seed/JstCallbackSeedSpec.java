package io.github.ieu.jst.seed;

public class JstCallbackSeedSpec {

    private final JstSeedClient client;

    private final JstCallbackSeedRequest.JstCallbackSeedRequestBuilder requestBuilder = JstCallbackSeedRequest.builder();

    public JstCallbackSeedSpec(JstSeedClient client) {
        this.client = client;
    }

    public JstCallbackSeedSpec waveId(String waveId) {
        requestBuilder.waveId(waveId);
        return this;
    }

    public JstCallbackSeedSpec datas(java.util.List<JstCallbackSeedRequest.Data> datas) {
        requestBuilder.datas(datas);
        return this;
    }

    public JstCallbackSeedResponse response() {
        return this.client.callbackSeed(requestBuilder.build());
    }
}
