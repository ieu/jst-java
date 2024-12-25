package io.github.ieu.jst.http.httpurlconnection;

import io.github.ieu.jst.http.JstHttpHeaders;
import io.github.ieu.jst.http.JstHttpResponse;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.SneakyThrows;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.List;
import java.util.Map;

@Getter
@AllArgsConstructor
public class HttpURLConnectionJstHttpResponse implements JstHttpResponse {

    private final HttpURLConnection connection;

    @Override
    @SneakyThrows
    public int getStatusCode() {
        return connection.getResponseCode();
    }

    @Override
    public JstHttpHeaders getHeaders() {
        JstHttpHeaders headers = new JstHttpHeaders();
        for (Map.Entry<String, List<String>> fields : connection.getHeaderFields().entrySet()) {
            String name = fields.getKey();
            if (name != null) {
                name = name.toLowerCase();
                List<String> values = fields.getValue();
                for (String value : values) {
                    headers.addHeader(name, value);
                }
            }
        }
        return headers;
    }

    @Override
    @SneakyThrows
    public InputStream getBody() {
        InputStream inputStream = connection.getInputStream();
        if (inputStream == null) {
            return new InputStream() {
                @Override
                public int read() throws IOException {
                    return -1;
                }
            };
        }
        return inputStream;
    }

    @Override
    public void close() throws IOException {
        InputStream inputStream = connection.getInputStream();
        if (inputStream != null) {
            inputStream.close();
        }
    }
}
