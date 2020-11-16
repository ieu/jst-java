package io.github.ieu.jst.spring.boot.autoconfigure;

import io.github.ieu.jst.DefaultJstClient;
import io.github.ieu.jst.JstClient;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(JstClient.class)
@EnableConfigurationProperties(JstProperties.class)
public class JstAutoConfiguration {
    private final JstProperties properties;

    public JstAutoConfiguration(JstProperties properties) {
        this.properties = properties;
    }

    @Bean
    @ConditionalOnMissingBean
    public JstClient jstClient() {
        return new DefaultJstClient(
                properties.getPartnerId(),
                properties.getPartnerKey(),
                properties.getToken(),
                properties.getEnv()
        );
    }
}
