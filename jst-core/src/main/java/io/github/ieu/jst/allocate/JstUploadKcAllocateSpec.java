package io.github.ieu.jst.allocate;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

public class JstUploadKcAllocateSpec {

    private final JstAllocateClient client;

    @Getter
    @Setter
    @Accessors(fluent = true, chain = true)
    private java.util.List<JstUploadKcAllocateRequest> requests;

    public JstUploadKcAllocateSpec(JstAllocateClient client) {
        this.client = client;
    }

    public JstUploadKcAllocateResponse response() {
        return this.client.uploadKcAllocate(requests);
    }
}
