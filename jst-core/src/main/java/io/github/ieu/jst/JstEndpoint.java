package io.github.ieu.jst;

import java.util.EnumMap;
import java.util.Map;

public class JstEndpoint {
    private final Map<JstEnvironment, String> ENDPOINTS;

    {
        ENDPOINTS = new EnumMap<>(JstEnvironment.class);
        ENDPOINTS.put(JstEnvironment.PRODUCTION, "https://open.erp321.com/api/open/query.aspx");
        ENDPOINTS.put(JstEnvironment.SANDBOX, "https://c.jushuitan.com/api/open/query.aspx");
    }

    public String get(JstEnvironment key) {
        return ENDPOINTS.get(key);
    }

    public String getOrDefault(JstEnvironment key, String defaultValue) {
        return ENDPOINTS.getOrDefault(key, defaultValue);
    }
}
