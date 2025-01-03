package io.github.ieu.jst.spring.boot.autoconfigure;

import io.github.ieu.jst.*;
import io.github.ieu.jst.auth.JstTokenStore;
import io.github.ieu.jst.auth.JstTokenStoreFactory;
import io.github.ieu.jst.http.JstHttpClient;
import io.github.ieu.jst.http.JstHttpClientFactory;
import io.github.ieu.jst.http.JstRequestEntity;
import io.github.ieu.jst.http.JstResponseEntity;
import io.github.ieu.jst.type.TypeReference;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.AutoConfigurations;
import org.springframework.boot.test.context.runner.ApplicationContextRunner;

import java.lang.reflect.Type;
import java.net.URI;
import java.time.Duration;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

class JstAutoConfigurationTest {
    private final ApplicationContextRunner contextRunner = new ApplicationContextRunner()
            .withConfiguration(AutoConfigurations.of(JstAutoConfiguration.class));

    @Test
    void shouldBeDisabledWhenEnabledIsFalse() {
        contextRunner
                .withPropertyValues(JstConfigurationProperties.PROPERTY_PREFIX + ".enabled=false")
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
                            .isEqualTo(URI.create("https://dev-api.jushuitan.com"));
                    assertThat(context).getBean(JstConfiguration.class)
                            .extracting(JstConfiguration::getCredential)
                            .extracting(JstCredential::getAppKey, JstCredential::getAppSecret)
                            .contains("b0b7d1db226d4216a3d58df9ffa2dde5", "99c4cef262f34ca882975a7064de0b87");
                    assertThat(context).hasSingleBean(JstClient.class);
                });
    }

    @Test
    void shouldApplyCustomizerWhenThereIsAny() {
        contextRunner
                .withBean(JstConfigurationBuilderCustomizer.class, TestJstConfigurationBuilderCustomizer::new)
                .run(context -> {
                    assertThat(context).hasSingleBean(JstConfiguration.class);
                    assertThat(context).getBean(JstConfiguration.class)
                            .extracting(JstConfiguration::getEndpoint)
                            .isEqualTo(URI.create("https://dev-api.jushuitan.com"));
                    assertThat(context).getBean(JstConfiguration.class)
                            .extracting(JstConfiguration::getCredential)
                            .extracting(JstCredential::getAppKey, JstCredential::getAppSecret)
                            .contains("b0b7d1db226d4216a3d58df9ffa2dde5", "99c4cef262f34ca882975a7064de0b87");
                    assertThat(context).getBean(JstConfiguration.class)
                            .extracting(JstConfiguration::getHttpClient)
                            .isInstanceOf(TestJstConfigurationBuilderCustomizer.TestJstHttpClientFactory.TestJstHttpClient.class);
                    assertThat(context).getBean(JstConfiguration.class)
                            .extracting(JstConfiguration::getTokenStore)
                            .isInstanceOf(TestJstConfigurationBuilderCustomizer.TestJstTokenStoreFactory.TestJstTokenStore.class);
                    assertThat(context).getBean(JstConfiguration.class)
                            .extracting(JstConfiguration::getJsonSerializer)
                            .isInstanceOf(TestJstConfigurationBuilderCustomizer.TestJstJsonSerializerFactory.TestJstJsonSerializer.class);
                });
    }

    static class TestJstConfigurationBuilderCustomizer implements JstConfigurationBuilderCustomizer {

        @Override
        public void customize(JstConfiguration.Builder builder) {
            builder.endpoint("https://dev-api.jushuitan.com")
                    .credential("b0b7d1db226d4216a3d58df9ffa2dde5", "99c4cef262f34ca882975a7064de0b87")
                    .httpClientFactory(new TestJstHttpClientFactory())
                    .tokenStoreFactory(new TestJstTokenStoreFactory())
                    .jsonSerializerFactory(new TestJstJsonSerializerFactory());
        }

        static class TestJstHttpClientFactory implements JstHttpClientFactory {
            @Override
            public JstHttpClient create() {
                return new TestJstHttpClient();
            }

            static class TestJstHttpClient implements JstHttpClient {
                @Override
                public <T, U> JstResponseEntity<U> execute(JstRequestEntity<T> requestEntity, Type targetType) {
                    throw new UnsupportedOperationException("execute not implemented");
                }

                @Override
                public <T, U> JstResponseEntity<U> execute(JstRequestEntity<T> requestEntity, TypeReference<U> typeReference) {
                    throw new UnsupportedOperationException("execute not implemented");
                }
            }
        }

        static class TestJstTokenStoreFactory implements JstTokenStoreFactory {
            @Override
            public JstTokenStore create() {
                return new TestJstTokenStore();
            }

            static class TestJstTokenStore implements JstTokenStore {
                @Override
                public Optional<String> getAccessToken(String appKey) {
                    throw new UnsupportedOperationException("getAccessToken not implemented");
                }

                @Override
                public void setAccessToken(String appKey, String accessToken, Duration expiresIn) {
                    throw new UnsupportedOperationException("setAccessToken not implemented");
                }

                @Override
                public Optional<String> getRefreshToken(String appKey) {
                    throw new UnsupportedOperationException("getRefreshToken not implemented");
                }

                @Override
                public void setRefreshToken(String appKey, String refreshToken, Duration expiresIn) {
                    throw new UnsupportedOperationException("setRefreshToken not implemented");
                }
            }
        }

        static class TestJstJsonSerializerFactory implements JstJsonSerializerFactory {
            @Override
            public JstJsonSerializer create() {
                return new TestJstJsonSerializer();
            }

            static class TestJstJsonSerializer implements JstJsonSerializer {
                @Override
                public <T> String serialize(T value) {
                    throw new UnsupportedOperationException("serialize not implemented");
                }

                @Override
                public <T> T deserialize(String content, Class<T> targetType) {
                    throw new UnsupportedOperationException("deserialize not implemented");
                }
            }
        }
    }
}