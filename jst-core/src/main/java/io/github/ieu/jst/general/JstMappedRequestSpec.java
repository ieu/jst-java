package io.github.ieu.jst.general;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.HashMap;
import java.util.Map;

public class JstMappedRequestSpec {

    private final JstGeneralClient client;

    @Getter
    @Setter
    @Accessors(fluent = true, chain = true)
    private String path;

    @Getter
    @Accessors(fluent = true, chain = true)
    private final Map<String, Object> params = new HashMap<>();

    public JstMappedRequestSpec(JstGeneralClient client) {
        this.client = client;
    }

    public JstMappedRequestSpec params(Map<? extends String, ?> params) {
        this.params.putAll(params);
        return this;
    }

    public JstMappedRequestSpec param(String name, Object value) {
        this.params.put(name, value);
        return this;
    }

    public Map<String, Object> response() {
        return this.client.request(path, params);
    }
}
