package io.github.ieu.jst.logistics;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

public class JstUploadExpressRegisterSpec {

    private final JstLogisticsClient client;

    @Getter
    @Setter
    @Accessors(fluent = true, chain = true)
    private java.util.List<JstUploadExpressRegisterRequest> requests;

    public JstUploadExpressRegisterSpec(JstLogisticsClient client) {
        this.client = client;
    }

    public JstUploadExpressRegisterResponse response() {
        return this.client.uploadExpressRegister(requests);
    }
}
