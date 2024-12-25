package io.github.ieu.jst.http.httpurlconnection;

import io.github.ieu.jst.http.*;
import lombok.Getter;
import lombok.Setter;

import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.util.List;

@Getter
public class HttpURLConnectionJstHttpRequest extends BufferingJstHttpRequest implements JstHttpRequest {

    private final HttpURLConnection connection;

    @Setter
    private URI uri;

    @Setter
    private JstHttpMethod method;

    public HttpURLConnectionJstHttpRequest(HttpURLConnection connection) {
        this.connection = connection;
    }

    @Override
    protected JstHttpResponse executeInternal(byte[] body) throws IOException {
        connection.setRequestMethod(method.name());
        connection.setDoInput(true);
        connection.setDoOutput(true);
        for (JstHttpHeaders.Entry header : getHeaders()) {
            String name = header.getName();
            List<String> values = header.getValues();
            if (!values.isEmpty()) {
                connection.setRequestProperty(name, String.join(",", values));
            }
        }
        OutputStream outputStream = connection.getOutputStream();
        outputStream.write(body);
        outputStream.close();
        return new HttpURLConnectionJstHttpResponse(connection);
    }
}
