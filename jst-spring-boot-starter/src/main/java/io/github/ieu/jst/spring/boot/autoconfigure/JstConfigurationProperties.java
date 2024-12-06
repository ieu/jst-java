package io.github.ieu.jst.spring.boot.autoconfigure;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = JstConfigurationProperties.PROPERTY_PREFIX)
@Data
public class JstConfigurationProperties {
    public final static String PROPERTY_PREFIX = "jst";

    private String endpoint;
    private Credential credential;

    @Data
    public static class Credential {
        private String appKey;
        private String appSecret;
    }
}
