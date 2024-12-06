package io.github.ieu.jst.spring.boot.autoconfigure;

import io.github.ieu.jst.DefaultJstClient;
import io.github.ieu.jst.JstClient;
import io.github.ieu.jst.JstConfiguration;
import io.github.ieu.jst.JstCredential;
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
public class JstAutoConfiguration {
    @Bean
    @ConditionalOnProperty(prefix = JstConfigurationProperties.PROPERTY_PREFIX, name = "endpoint")
    public JstConfiguration jstConfiguration(JstConfigurationProperties properties) {
        JstCredential credential = new JstCredential(
                properties.getCredential().getAppKey(),
                properties.getCredential().getAppSecret()
        );

        return JstConfiguration.builder()
                .endpoint(properties.getEndpoint())
                .credential(credential)
                .build();
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnBean(JstConfiguration.class)
    public JstClient jstClient(JstConfiguration configuration) {
        return new DefaultJstClient(configuration);
    }
}
