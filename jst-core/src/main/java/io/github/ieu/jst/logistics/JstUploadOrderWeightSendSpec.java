package io.github.ieu.jst.logistics;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

public class JstUploadOrderWeightSendSpec {

    private final JstLogisticsClient client;

    @Getter
    @Setter
    @Accessors(fluent = true, chain = true)
    private java.util.List<JstUploadOrderWeightSendRequest> requests;

    public JstUploadOrderWeightSendSpec(JstLogisticsClient client) {
        this.client = client;
    }

    public JstUploadOrderWeightSendResponse response() {
        return this.client.uploadOrderWeightSend(requests);
    }
}
