package io.github.ieu.jst.spring.boot.autoconfigure;

import io.github.ieu.jst.DefaultJstClient;
import io.github.ieu.jst.JstClient;
import io.github.ieu.jst.JstConfiguration;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(JstClient.class)
@EnableConfigurationProperties(JstConfigurationProperties.class)
@ConditionalOnProperty(prefix = JstConfigurationProperties.PROPERTY_PREFIX, name = "enabled", matchIfMissing = true)
public class JstAutoConfiguration {

    @Bean
    public JstConfiguration jstConfiguration(JstConfigurationProperties properties,
                                             ObjectProvider<JstConfigurationBuilderCustomizer> customizers) {
        JstConfiguration.Builder builder = JstConfiguration.builder();
        String endpoint = properties.getEndpoint();
        if (endpoint != null) {
            builder.endpoint(endpoint);
        }
        JstConfigurationProperties.Credential credential = properties.getCredential();
        if (credential != null) {
            builder.credential(credential.getAppKey(), credential.getAppSecret());
        }
        customizers.orderedStream().forEach(customizer -> customizer.customize(builder));
        return builder.build();
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnBean(JstConfiguration.class)
    public JstClient jstClient(JstConfiguration configuration) {
        return new DefaultJstClient(configuration);
    }
}
