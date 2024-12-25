package io.github.ieu.jst.http.httpurlconnection;

import io.github.ieu.jst.http.JstHttpRequest;
import io.github.ieu.jst.http.JstHttpRequestFactory;
import io.github.ieu.jst.http.JstRequestEntity;
import lombok.SneakyThrows;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;

public class HttpURLConnectionJstHttpRequestFactory implements JstHttpRequestFactory {

    @Override
    @SneakyThrows
    public JstHttpRequest create(JstRequestEntity<?> requestEntity) {
        URI uri = requestEntity.getUri();
        URL url = uri.toURL();
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        HttpURLConnectionJstHttpRequest request = new HttpURLConnectionJstHttpRequest(connection);
        request.setUri(uri);
        request.setMethod(requestEntity.getMethod());
        request.setHeaders(requestEntity.getHeaders());
        return request;
    }
}
