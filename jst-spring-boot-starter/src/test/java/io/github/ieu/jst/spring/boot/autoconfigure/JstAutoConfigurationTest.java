package io.github.ieu.jst.spring.boot.autoconfigure;

import io.github.ieu.jst.JstClient;
import io.github.ieu.jst.JstConfiguration;
import io.github.ieu.jst.JstCredential;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.AutoConfigurations;
import org.springframework.boot.test.context.runner.ApplicationContextRunner;

import static org.assertj.core.api.Assertions.assertThat;

class JstAutoConfigurationTest {
    private final ApplicationContextRunner contextRunner = new ApplicationContextRunner()
            .withConfiguration(AutoConfigurations.of(JstAutoConfiguration.class));

    @Test
    void shouldNotConstructBeanWhenNotPropertiesSet() {
        contextRunner
                .run(context -> {
                    assertThat(context).doesNotHaveBean(JstConfiguration.class);
                    assertThat(context).doesNotHaveBean(JstClient.class);
                });
    }

    @Test
    void shouldConstructBeanWhenNotPropertiesSet() {
        contextRunner
                .withPropertyValues(
                        JstConfigurationProperties.PROPERTY_PREFIX + ".endpoint=https://dev-api.jushuitan.com",
                        JstConfigurationProperties.PROPERTY_PREFIX + ".credential.app-key=b0b7d1db226d4216a3d58df9ffa2dde5",
                        JstConfigurationProperties.PROPERTY_PREFIX + ".credential.app-secret=99c4cef262f34ca882975a7064de0b87"
                )
                .run(context -> {
                    assertThat(context).hasSingleBean(JstConfiguration.class);
                    assertThat(context).getBean(JstConfiguration.class)
                            .extracting(JstConfiguration::getEndpoint)
                            .isEqualTo("https://dev-api.jushuitan.com");
                    assertThat(context).getBean(JstConfiguration.class)
                            .extracting(JstConfiguration::getCredential)
                            .extracting(JstCredential::getAppKey, JstCredential::getAppSecret)
                            .contains("b0b7d1db226d4216a3d58df9ffa2dde5", "99c4cef262f34ca882975a7064de0b87");
                    assertThat(context).hasSingleBean(JstClient.class);
                });
    }
}