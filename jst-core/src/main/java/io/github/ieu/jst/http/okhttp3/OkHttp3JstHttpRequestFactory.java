package io.github.ieu.jst.http.okhttp3;

import io.github.ieu.jst.http.JstHttpMethod;
import io.github.ieu.jst.http.JstHttpRequest;
import io.github.ieu.jst.http.JstHttpRequestFactory;
import okhttp3.OkHttpClient;

import java.net.URI;

public class OkHttp3JstHttpRequestFactory implements JstHttpRequestFactory {
    private final OkHttpClient client;

    public OkHttp3JstHttpRequestFactory() {
        this.client = new OkHttpClient();
    }

    @Override
    public JstHttpRequest create(URI uri, JstHttpMethod method) {
        return new OkHttp3JstHttpRequest(client, uri, method);
    }
}
