package io.github.ieu.jst.http.okhttp3;

import io.github.ieu.jst.http.JstHttpResponse;
import lombok.AllArgsConstructor;
import lombok.Getter;
import okhttp3.Response;

import java.io.InputStream;

@Getter
@AllArgsConstructor
public class OkHttp3JstHttpResponse implements JstHttpResponse {
    private final Response response;

    @Override
    public InputStream getBody() {
        return response.body().source().inputStream();
    }
}
