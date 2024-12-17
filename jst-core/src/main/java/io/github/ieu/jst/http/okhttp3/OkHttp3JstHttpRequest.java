package io.github.ieu.jst.http.okhttp3;

import io.github.ieu.jst.http.*;
import lombok.Getter;
import lombok.Setter;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;

import java.io.IOException;
import java.net.URI;
import java.util.List;

@Getter
public class OkHttp3JstHttpRequest extends BufferingJstHttpRequest implements JstHttpRequest {

    private final OkHttpClient client;

    @Setter
    private URI uri;

    @Setter
    private JstHttpMethod method;

    public OkHttp3JstHttpRequest(OkHttpClient client) {
        this.client = client;
    }

    @Override
    protected JstHttpResponse executeInternal(byte[] body) throws IOException {
        RequestBody requestBody = RequestBody.create(
                body,
                MediaType.get(getHeaders().getContentType().toString())
        );
        Request.Builder requestBuilder = new Request.Builder();
        requestBuilder.url(uri.toURL());
        requestBuilder.method(method.name(), requestBody);
        for (JstHttpHeaders.Entry header : getHeaders()) {
            String name = header.getName();
            List<String> values = header.getValues();
            for (String value : values) {
                requestBuilder.header(name, value);
            }
        }
        Request request = requestBuilder.build();
        return new OkHttp3JstHttpResponse(client.newCall(request).execute());
    }
}
