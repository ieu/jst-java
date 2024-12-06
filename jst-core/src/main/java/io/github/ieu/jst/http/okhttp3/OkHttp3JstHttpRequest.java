package io.github.ieu.jst.http.okhttp3;

import io.github.ieu.jst.http.BufferingJstHttpRequest;
import io.github.ieu.jst.http.JstHttpMethod;
import io.github.ieu.jst.http.JstHttpRequest;
import io.github.ieu.jst.http.JstHttpResponse;
import lombok.AllArgsConstructor;
import lombok.Getter;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;

import java.io.IOException;
import java.net.URI;

@Getter
@AllArgsConstructor
public class OkHttp3JstHttpRequest extends BufferingJstHttpRequest implements JstHttpRequest {
    private final OkHttpClient client;
    private final URI uri;
    private final JstHttpMethod method;

    @Override
    protected JstHttpResponse executeInternal(byte[] body) throws IOException {
        RequestBody requestBody = RequestBody.create(
                body,
                MediaType.get(getContentType().toString())
        );
        Request request = new Request.Builder()
                .url(uri.toURL())
                .method(method.name(), requestBody)
                .build();
        return new OkHttp3JstHttpResponse(client.newCall(request).execute());
    }
}
