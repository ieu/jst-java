package io.github.ieu.jst.http.okhttp3;

import io.github.ieu.jst.http.JstHttpHeaders;
import io.github.ieu.jst.http.JstHttpResponse;
import kotlin.Pair;
import lombok.AllArgsConstructor;
import lombok.Getter;
import okhttp3.Response;
import okhttp3.ResponseBody;

import java.io.IOException;
import java.io.InputStream;

@Getter
@AllArgsConstructor
public class OkHttp3JstHttpResponse implements JstHttpResponse {

    private final Response response;

    @Override
    public int getStatusCode() {
        return response.code();
    }

    @Override
    public JstHttpHeaders getHeaders() {
        JstHttpHeaders headers = new JstHttpHeaders();
        for (Pair<? extends String, ? extends String> header : response.headers()) {
            String name = header.getFirst();
            String value = header.getSecond();
            headers.addHeader(name, value);
        }
        return headers;
    }

    @Override
    public InputStream getBody() {
        ResponseBody body = response.body();
        if (body == null) {
            return new InputStream() {
                @Override
                public int read() throws IOException {
                    return -1;
                }
            };
        }
        return body.source().inputStream();
    }
}
