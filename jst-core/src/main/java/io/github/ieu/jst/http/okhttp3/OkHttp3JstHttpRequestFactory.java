package io.github.ieu.jst.http.okhttp3;

import io.github.ieu.jst.http.JstHttpRequest;
import io.github.ieu.jst.http.JstHttpRequestFactory;
import io.github.ieu.jst.http.JstRequestEntity;
import okhttp3.OkHttpClient;

public class OkHttp3JstHttpRequestFactory implements JstHttpRequestFactory {
    private final OkHttpClient client;

    public OkHttp3JstHttpRequestFactory() {
        this.client = new OkHttpClient();
    }

    @Override
    public JstHttpRequest create(JstRequestEntity<?> requestEntity) {
        OkHttp3JstHttpRequest request = new OkHttp3JstHttpRequest(client);
        request.setUri(requestEntity.getUri());
        request.setMethod(requestEntity.getMethod());
        request.setHeaders(requestEntity.getHeaders());
        return request;
    }
}
