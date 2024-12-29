package io.github.ieu.jst.spring.boot.autoconfigure;

import io.github.ieu.jst.JstConfiguration;

@FunctionalInterface
public interface JstConfigurationBuilderCustomizer {
    void customize(JstConfiguration.Builder builder);
}
