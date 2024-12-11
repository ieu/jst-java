package io.github.ieu.jst;

import io.github.ieu.jst.auth.DefaultJstAuthDigest;
import io.github.ieu.jst.auth.JstAuthDigest;
import io.github.ieu.jst.auth.JstTokenStore;
import io.github.ieu.jst.auth.caffeine.CaffeineJstTokenStore;
import io.github.ieu.jst.http.DefaultJstHttpClientFactory;
import io.github.ieu.jst.http.JstHttpClient;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
public class JstConfiguration {
    private String endpoint;
    private JstCredential credential;
    private JstAuthDigest authDigest;
    private JstBizDigest bizDigest;
    private JstHttpClient httpClient;
    private JstTokenStore tokenStore;
    private JstJsonSerializer jsonSerializer;

    public static Builder builder() {
        return new Builder();
    }

    @Getter
    @Setter
    @Accessors(fluent = true, chain = true)
    public static class Builder {
        private String endpoint;
        private JstCredential credential;
        private JstAuthDigest authDigest;
        private JstBizDigest bizDigest;
        private JstHttpClient httpClient;
        private JstTokenStore tokenStore;
        private JstJsonSerializer jsonSerializer;

        public Builder credential(String appKey, String appSecret) {
            return this.credential(new JstCredential(appKey, appSecret));
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

            JstHttpClient httpClient = this.httpClient;
            if (httpClient == null) {
                httpClient = DefaultJstHttpClientFactory.create(endpoint);
            }
            configuration.setHttpClient(httpClient);

            JstTokenStore tokenStore = this.tokenStore;
            if (tokenStore == null) {
                tokenStore = new CaffeineJstTokenStore();
            }
            configuration.setTokenStore(tokenStore);

            JstJsonSerializer jsonSerializer = this.jsonSerializer;
            if (jsonSerializer == null) {
                jsonSerializer = Jackson2JstJsonSerializerFactory.create();
            }
            configuration.setJsonSerializer(jsonSerializer);

            return configuration;
        }
    }
}
