package io.github.ieu.jst.seed;

public class JstUnbindInOutByCarryIdSpec {

    private final JstSeedClient client;

    private final JstUnbindInOutByCarryIdRequest.JstUnbindInOutByCarryIdRequestBuilder requestBuilder = JstUnbindInOutByCarryIdRequest.builder();

    public JstUnbindInOutByCarryIdSpec(JstSeedClient client) {
        this.client = client;
    }

    /**
     * 车号
     */
    public JstUnbindInOutByCarryIdSpec carryId(String carryId) {
        requestBuilder.carryId(carryId);
        return this;
    }

    /**
     * 传true
     */
    public JstUnbindInOutByCarryIdSpec isAppendJbCc(Boolean isAppendJbCc) {
        requestBuilder.isAppendJbCc(isAppendJbCc);
        return this;
    }

    public JstUnbindInOutByCarryIdResponse response() {
        return this.client.unbindInOutByCarryId(requestBuilder.build());
    }
}
