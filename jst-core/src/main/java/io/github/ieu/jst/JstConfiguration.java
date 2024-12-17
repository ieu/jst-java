package io.github.ieu.jst;

import io.github.ieu.jst.auth.DefaultJstAuthDigest;
import io.github.ieu.jst.auth.JstAuthDigest;
import io.github.ieu.jst.auth.JstTokenStore;
import io.github.ieu.jst.auth.JstTokenStoreFactory;
import io.github.ieu.jst.auth.caffeine.CaffeineJstTokenStoreFactory;
import io.github.ieu.jst.http.DefaultJstHttpClientFactory;
import io.github.ieu.jst.http.JstHttpClient;
import io.github.ieu.jst.http.JstHttpClientFactory;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.net.URI;

@Getter
@Setter(AccessLevel.PRIVATE)
public class JstConfiguration {
    private URI endpoint;
    private JstCredential credential;
    private JstAuthDigest authDigest;
    private JstBizDigest bizDigest;
    private JstHttpClient httpClient;
    private JstTokenStore tokenStore;
    private JstJsonSerializer jsonSerializer;

    public static Builder builder() {
        return new Builder();
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = URI.create(endpoint);
    }

    @Getter
    @Setter
    @Accessors(fluent = true, chain = true)
    public static class Builder {
        private String endpoint;
        private JstCredential credential;
        private JstAuthDigest authDigest;
        private JstBizDigest bizDigest;
        private JstHttpClientFactory httpClientFactory;
        private JstTokenStoreFactory tokenStoreFactory;
        private JstJsonSerializerFactory jsonSerializerFactory;

        public Builder credential(String appKey, String appSecret) {
            return this.credential(new JstCredential(appKey, appSecret));
        }

        public Builder httpClient(JstHttpClient httpClient) {
            return httpClientFactory(() -> httpClient);
        }

        public Builder tokenStore(JstTokenStore tokenStore) {
            return tokenStoreFactory(() -> tokenStore);
        }

        public Builder jsonSerializer(JstJsonSerializer jsonSerializer) {
            return jsonSerializerFactory(() -> jsonSerializer);
        }

        public JstConfiguration build() {
            JstConfiguration configuration = new JstConfiguration();
            String endpoint = this.endpoint;
            if (endpoint == null) {
                throw new NullPointerException("endpoint is null");
            }
            configuration.setEndpoint(endpoint);

            JstCredential credential = this.credential;
            if (credential == null) {
                throw new NullPointerException("Credential is null");
            }
            configuration.setCredential(credential);

            JstAuthDigest authDigest = this.authDigest;
            if (authDigest == null) {
                authDigest = new DefaultJstAuthDigest(credential);
            }
            configuration.setAuthDigest(authDigest);

            JstBizDigest bizDigest = this.bizDigest;
            if (bizDigest == null) {
                bizDigest = new DefaultJstBizDigest(credential);
            }
            configuration.setBizDigest(bizDigest);

            JstHttpClientFactory httpClientFactory = this.httpClientFactory;
            if (httpClientFactory == null) {
                httpClientFactory = new DefaultJstHttpClientFactory();
            }
            configuration.setHttpClient(httpClientFactory.create());

            JstTokenStoreFactory tokenStoreFactory = this.tokenStoreFactory;
            if (tokenStoreFactory == null) {
                tokenStoreFactory = new CaffeineJstTokenStoreFactory();
            }
            configuration.setTokenStore(tokenStoreFactory.create());

            JstJsonSerializerFactory jsonSerializerFactory = this.jsonSerializerFactory;
            if (jsonSerializerFactory == null) {
                jsonSerializerFactory = new Jackson2JstJsonSerializerFactory();
            }
            configuration.setJsonSerializer(jsonSerializerFactory.create());

            return configuration;
        }
    }
}
